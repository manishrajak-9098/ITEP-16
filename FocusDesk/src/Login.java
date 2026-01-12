import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login extends JFrame {

    private JTextField gmailField;
    private JPasswordField passwordField;
    private JButton loginButton, signupButton;

    public Login() {
        setTitle("Focus Desk - Login");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 235, 240));
        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Welcome to Focus Desk", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setBounds(500, 30, 400, 30);
        panel.add(title);

        JLabel subtitle = new JLabel("To get started, Login & enjoy all of our cool features", SwingConstants.CENTER);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitle.setBounds(470, 60, 460, 25);
        panel.add(subtitle);

        // Gmail Label
        JLabel gmailLabel = new JLabel("Gmail");
        gmailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        gmailLabel.setBounds(550, 120, 100, 25);
        panel.add(gmailLabel);

        gmailField = new JTextField();
        gmailField.setBounds(650, 120, 200, 30);
        gmailField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        panel.add(gmailField);

        // Password Label
        JLabel passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passLabel.setBounds(550, 170, 100, 25);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(650, 170, 200, 30);
        panel.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(100, 180, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        loginButton.setFocusPainted(false);
        loginButton.setBounds(600, 230, 150, 40);
        panel.add(loginButton);

        JLabel signupText = new JLabel("Don't have an account?");
        signupText.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        signupText.setBounds(580, 290, 150, 30);
        panel.add(signupText);

        signupButton = new JButton("Signup");
        signupButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        signupButton.setBorderPainted(false);
        signupButton.setForeground(Color.BLUE);
        signupButton.setBounds(700, 290, 80, 30);
        signupButton.setContentAreaFilled(false);
        signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(signupButton);

        // Button actions
        loginButton.addActionListener(e -> checkLogin());
        signupButton.addActionListener(e -> {
            new SignupPage().setVisible(true);
            dispose();
        });

        setVisible(true);
    }

    // ✅ Login check using Gmail + Password
    private void checkLogin() {
        String gmail = gmailField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (gmail.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        if (!gmail.contains("@") || !gmail.endsWith(".com")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Gmail address");
            return;
        }

        try {
            // Database connection
            Connection con = GetConnection.getConnection();

            // Query for checking Gmail & Password
            PreparedStatement pst = con.prepareStatement("select * from users where gmail=? and password=?");
            pst.setString(1, gmail);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            // If user found
            if (rs.next()) {
                int userId = rs.getInt("id"); // fetch user id from database
                JOptionPane.showMessageDialog(this, "Login Successfull ");
                new Dashboard(userId).setVisible(true); // pass id to dashboard
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Gmail or Password");
            }

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }

     public static void main(String[] args) {
         new Login();
     }
}
