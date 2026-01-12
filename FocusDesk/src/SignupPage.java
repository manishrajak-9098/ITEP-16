import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.*;
import java.util.*;

public class SignupPage extends JFrame {

    private JTextField usernameField, gmailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> genderBox;
    private JSpinner dobSpinner;
    private JButton signupButton, loginButton;

    public SignupPage() {
        setTitle("Focus Desk - Signup");
        setSize(900, 900);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(200, 235, 240));
        add(panel);

        JLabel title = new JLabel("Sign Up", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setBounds(550, 40, 200, 40);
        panel.add(title);

        // Username
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        userLabel.setBounds(500, 110, 100, 25);
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(650, 110, 200, 30);
        panel.add(usernameField);

        // ✅ Gmail
        JLabel gmailLabel = new JLabel("Gmail:");
        gmailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        gmailLabel.setBounds(500, 160, 100, 25);
        panel.add(gmailLabel);

        gmailField = new JTextField();
        gmailField.setBounds(650, 160, 200, 30);
        panel.add(gmailField);

        // Date of Birth
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        dobLabel.setBounds(500, 210, 120, 25);
        panel.add(dobLabel);

        // Future date ko rokne wali functionality
        java.util.Date today = new java.util.Date();
        SpinnerDateModel dateModel = new SpinnerDateModel(today, null, today, Calendar.DAY_OF_MONTH);
        dobSpinner = new JSpinner(dateModel);
        dobSpinner.setBounds(650, 210, 200, 30);

        // for correct date month and year...
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dobSpinner, "dd-MM-yyyy");
        dobSpinner.setEditor(dateEditor);
        panel.add(dobSpinner);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        genderLabel.setBounds(500, 260, 100, 25);
        panel.add(genderLabel);

        String[] genders = {"Select", "Male", "Female", "Others"};
        genderBox = new JComboBox<>(genders);
        genderBox.setBounds(650, 260, 200, 30);
        panel.add(genderBox);

        // Password
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passLabel.setBounds(500, 310, 100, 25);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(650, 310, 200, 30);
        panel.add(passwordField);

        // Confirm Password
        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        confirmLabel.setBounds(500, 360, 150, 25);
        panel.add(confirmLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(650, 360, 200, 30);
        panel.add(confirmPasswordField);

        // Signup Button
        signupButton = new JButton("Sign Up");
        signupButton.setBackground(new Color(100, 180, 255));
        signupButton.setForeground(Color.WHITE);
        signupButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signupButton.setFocusPainted(false);
        signupButton.setBounds(580, 420, 150, 40);
        panel.add(signupButton);

        // Login text + button
        JLabel loginText = new JLabel("Already have an account?");
        loginText.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        loginText.setBounds(540, 470, 180, 30);
        panel.add(loginText);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        loginButton.setBorderPainted(false);
        loginButton.setForeground(Color.BLUE);
        loginButton.setBounds(670, 470, 80, 30);
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(loginButton);

        // Button connect actions
        signupButton.addActionListener(e -> registerUser());
        loginButton.addActionListener(e -> {
            dispose();
            new Login().setVisible(true);
        });

        setVisible(true);
    }

    private void registerUser() {
        String username = usernameField.getText().trim();
        String gmail = gmailField.getText().trim();
        String gender = (String) genderBox.getSelectedItem();
        String password = new String(passwordField.getPassword());
        String confirm = new String(confirmPasswordField.getPassword());
        java.util.Date dobDate = (java.util.Date) dobSpinner.getValue();
        java.sql.Date dob = new java.sql.Date(dobDate.getTime());
        java.util.Date today = new java.util.Date();

        // Validation
        if (username.isEmpty() || gmail.isEmpty() || gender.equals("Select") || password.isEmpty() || confirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        if (!gmail.contains("@") || !gmail.endsWith(".com")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Gmail address");
            return;
        }

        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match");
            return;
        }

        if (dobDate.after(today)) {
            JOptionPane.showMessageDialog(this, "Date of Birth cannot be in the future");
            return;
        }

        try {
            Connection con = GetConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
                "insert into users(username, gmail, dob, gender, password) values (?,?,?,?,?)"
            );
            pst.setString(1, username);
            pst.setString(2, gmail);
            pst.setDate(3, dob);
            pst.setString(4, gender);
            pst.setString(5, password);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Signup Successfull, You can now login.");

            con.close();
            dispose();
            new Login().setVisible(true);

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(this, "Username already exists");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
