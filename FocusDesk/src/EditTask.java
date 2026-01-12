import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EditTask extends JFrame {
    private JTextField titleField;
    private JComboBox<String> priorityBox;
    private JComboBox<String> statusBox;
    private JComboBox<String> categoryBox;
    private JButton saveButton, cancelButton;
    private int userId;
    private String oldTitle;

    public EditTask(int userId, String oldTitle) {
        this.userId = userId;
        this.oldTitle = oldTitle;

        setTitle("Edit Task");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 245, 250));

        JLabel heading = new JLabel("Edit Task", SwingConstants.CENTER);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 22));
        heading.setBounds(100, 20, 300, 30);
        add(heading);

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        titleLabel.setBounds(80, 100, 100, 25);
        add(titleLabel);

        titleField = new JTextField();
        titleField.setBounds(180, 100, 220, 30);
        add(titleField);

        JLabel priorityLabel = new JLabel("Priority:");
        priorityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        priorityLabel.setBounds(80, 150, 100, 25);
        add(priorityLabel);

        String[] priorities = {"High", "Medium", "Low"};
        priorityBox = new JComboBox<>(priorities);
        priorityBox.setBounds(180, 150, 150, 30);
        add(priorityBox);

        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        statusLabel.setBounds(80, 200, 100, 25);
        add(statusLabel);

        String[] statuses = {"Pending", "Completed"};
        statusBox = new JComboBox<>(statuses);
        statusBox.setBounds(180, 200, 150, 30);
        add(statusBox);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        categoryLabel.setBounds(80, 250, 100, 25);
        add(categoryLabel);

        String[] categories = {"Work", "Personal", "Study", "Health", "Other"};
        categoryBox = new JComboBox<>(categories);
        categoryBox.setBounds(180, 250, 150, 30);
        add(categoryBox);

        saveButton = new JButton("Save Changes");
        saveButton.setBackground(new Color(100, 180, 255));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        saveButton.setBounds(100, 310, 150, 40);
        add(saveButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cancelButton.setBounds(270, 310, 130, 40);
        add(cancelButton);

        loadTaskDetails();

        saveButton.addActionListener(e -> updateTask());
        cancelButton.addActionListener(e -> dispose());

        setVisible(true);
    }

    private void loadTaskDetails() {
        try {
            Connection con = GetConnection.getConnection();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM tasks WHERE user_id=? AND title=?");
            pst.setInt(1, userId);
            pst.setString(2, oldTitle);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                titleField.setText(rs.getString("title"));
                priorityBox.setSelectedItem(rs.getString("priority"));
                statusBox.setSelectedItem(rs.getString("status"));
                categoryBox.setSelectedItem(rs.getString("category"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void updateTask() {
        String newTitle = titleField.getText().trim();
        String newPriority = (String) priorityBox.getSelectedItem();
        String newStatus = (String) statusBox.getSelectedItem();
        String newCategory = (String) categoryBox.getSelectedItem();

        if (newTitle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter title!");
            return;
        }

        try {
            Connection con = GetConnection.getConnection();

            PreparedStatement pst = con.prepareStatement(
                "update tasks set title=?, priority=?, status=?, category=? where user_id=? and title=?"
            );
            pst.setString(1, newTitle);
            pst.setString(2, newPriority);
            pst.setString(3, newStatus);
            pst.setString(4, newCategory);
            pst.setInt(5, userId);
            pst.setString(6, oldTitle);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Task updated successfully!");
            con.close();
            dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }

//    public static void main(String[] args) {
//        new EditTask(1, "Sample Task");
//    }

}
