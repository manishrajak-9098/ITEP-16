import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;

public class AddTask extends JFrame {

    private JTextField titleField;
    private JComboBox<String> categoryBox, priorityBox;
    private JSpinner deadlineSpinner;
    private JButton saveButton, cancelButton;
    private int userId;

    public AddTask(int userId) {
        this.userId = userId;

        setTitle("Add New Task");
        setSize(520, 480);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 245, 250));

        JLabel heading = new JLabel(" Add New Task", SwingConstants.CENTER);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 22));
        heading.setBounds(100, 20, 300, 30);
        add(heading);

        // ----- Title -----
        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        titleLabel.setBounds(80, 100, 100, 25);
        add(titleLabel);

        titleField = new JTextField();
        titleField.setBounds(180, 100, 230, 30);
        add(titleField);

        // ----- Category -----
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        categoryLabel.setBounds(80, 150, 100, 25);
        add(categoryLabel);

        String[] categories = {"Work", "Personal", "Study", "Health", "Other"};
        categoryBox = new JComboBox<>(categories);
        categoryBox.setBounds(180, 150, 180, 30);
        add(categoryBox);

        // ----- Priority -----
        JLabel priorityLabel = new JLabel("Priority:");
        priorityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        priorityLabel.setBounds(80, 200, 100, 25);
        add(priorityLabel);

        String[] priorities = {"High", "Medium", "Low"};
        priorityBox = new JComboBox<>(priorities);
        priorityBox.setBounds(180, 200, 150, 30);
        add(priorityBox);

        // ----- Deadline -----
        JLabel deadlineLabel = new JLabel("Deadline:");
        deadlineLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        deadlineLabel.setBounds(80, 250, 100, 25);
        add(deadlineLabel);

        // Date spinner (default: today)
        SpinnerDateModel dateModel = new SpinnerDateModel();
        deadlineSpinner = new JSpinner(dateModel);
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(deadlineSpinner, "dd-MM-yyyy");
        deadlineSpinner.setEditor(dateEditor);
        deadlineSpinner.setBounds(180, 250, 150, 30);
        add(deadlineSpinner);

        // Buttons 
        saveButton = new JButton("Save Task");
        saveButton.setBackground(new Color(30, 136, 229));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        saveButton.setBounds(100, 340, 150, 40);
        add(saveButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cancelButton.setBounds(270, 340, 150, 40);
        add(cancelButton);

        //  Button Actions
        saveButton.addActionListener(e -> saveTask());
        cancelButton.addActionListener(e -> dispose());

        setVisible(true);
    }

    private void saveTask() {
        String title = titleField.getText().trim();
        String category = (String) categoryBox.getSelectedItem();
        String priority = (String) priorityBox.getSelectedItem();
        java.util.Date date = (java.util.Date) deadlineSpinner.getValue();
        java.sql.Date deadline = new java.sql.Date(date.getTime());
        String status = "Pending";

        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a task title!");
            return;
        }

        // Check for past date
        LocalDate today = LocalDate.now();
        if (deadline.toLocalDate().isBefore(today)) {
            JOptionPane.showMessageDialog(this, "Deadline must be today or a future date!");
            return;
        }

        try {
            Connection con = GetConnection.getConnection();
            String query = "insert into tasks (user_id, title, category, priority, status, deadline) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);
            pst.setString(2, title);
            pst.setString(3, category);
            pst.setString(4, priority);
            pst.setString(5, status);
            pst.setDate(6, deadline);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Task added successfully!");
            con.close();
            dispose();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new AddTask(1); // for testing
    }
}
