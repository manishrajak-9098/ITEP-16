
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class Dashboard extends JFrame {

    private JTable taskTable;
    private JButton btnAddTask, btnEdit, btnDelete, btnLogout, btnViewQuote, btnStartTimer, btnFilter;
    private JLabel lblTitle, lblQuote, lblTimer;
    private JProgressBar progressBar;
    private JComboBox<String> filterPriority, filterStatus, filterDate;
    private int userId;

    public Dashboard(int userId) {
        this.userId = userId;

        setTitle("Focus Desk");
        setSize(1150, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // header 
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(240, 248, 255));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        lblTitle = new JLabel("Focus Desk Dashboard");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        // logout button
        btnLogout = new JButton("Logout");
        btnLogout.setFocusPainted(false);
        btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnLogout.setBackground(Color.RED);
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setOpaque(true);
        btnLogout.setBorderPainted(false);


        headerPanel.add(lblTitle, BorderLayout.WEST);
        headerPanel.add(btnLogout, BorderLayout.EAST);

        // filter
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 5));
        filterPanel.setBorder(BorderFactory.createTitledBorder("Filter Tasks"));

        filterPriority = new JComboBox<>(new String[]{"All Priorities", "High", "Medium", "Low"});
        filterStatus = new JComboBox<>(new String[]{"All Status", "Pending", "Completed"});
        filterDate = new JComboBox<>(new String[]{"All Dates", "Today", "Future"});
        btnFilter = new JButton("Apply Filter");

        filterPanel.add(new JLabel("Priority:"));
        filterPanel.add(filterPriority);
        filterPanel.add(new JLabel("Status:"));
        filterPanel.add(filterStatus);
        filterPanel.add(new JLabel("Deadline:"));
        filterPanel.add(filterDate);
        filterPanel.add(btnFilter);

        // left side panel
        JPanel leftPanel = new JPanel(new BorderLayout(10, 10));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        // top buttons
        JPanel topLeftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JLabel lblYourTasks = new JLabel("Your Tasks");
        lblYourTasks.setFont(new Font("Segoe UI", Font.BOLD, 20));

        btnAddTask = new JButton("Add");
        btnEdit = new JButton("Edit");
        btnDelete = new JButton("Delete");

        topLeftPanel.add(lblYourTasks);
        topLeftPanel.add(btnAddTask);
        topLeftPanel.add(btnEdit);
        topLeftPanel.add(btnDelete);

        // Task Table
        String[] columns = {"Task", "Category", "Priority", "Status", "Deadline"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        taskTable = new JTable(model);
        taskTable.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        taskTable.setRowHeight(28);
        JScrollPane scrollPane = new JScrollPane(taskTable);

        // Progress Bar
        JLabel lblProgress = new JLabel("Overall Progress");
        lblProgress.setFont(new Font("Segoe UI", Font.BOLD, 16));
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(100, 25));

        JPanel progressPanel = new JPanel(new BorderLayout(5, 5));
        progressPanel.add(lblProgress, BorderLayout.NORTH);
        progressPanel.add(progressBar, BorderLayout.CENTER);

        leftPanel.add(topLeftPanel, BorderLayout.NORTH);
        leftPanel.add(scrollPane, BorderLayout.CENTER);
        leftPanel.add(progressPanel, BorderLayout.SOUTH);

        // right side(Timer + Quote) 
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        rightPanel.setBackground(new Color(250, 250, 255));

        JLabel lblMotivation = new JLabel("Motivational Quote");
        lblMotivation.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblMotivation.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblQuote = new JLabel("“The only way to do great work is to love what you do.");
        lblQuote.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblQuote.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        lblQuote.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnViewQuote = new JButton("New Quote");
        btnViewQuote.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblTimerTitle = new JLabel("Pomodoro Timer");
        lblTimerTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTimerTitle.setBorder(BorderFactory.createEmptyBorder(30, 0, 10, 0));
        lblTimerTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblTimer = new JLabel("25:00");
        lblTimer.setFont(new Font("Segoe UI", Font.BOLD, 36));
        lblTimer.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnStartTimer = new JButton("Start Timer");
        btnStartTimer.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add to right panel
        rightPanel.add(lblMotivation);
        rightPanel.add(lblQuote);
        rightPanel.add(btnViewQuote);
        rightPanel.add(lblTimerTitle);
        rightPanel.add(lblTimer);
        rightPanel.add(btnStartTimer);

        //add all things
        JPanel topSection = new JPanel(new BorderLayout());
        topSection.add(headerPanel, BorderLayout.NORTH);
        topSection.add(filterPanel, BorderLayout.CENTER);

        add(topSection, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);

        // add actions of buttion
        btnAddTask.addActionListener(e -> {
            AddTask add = new AddTask(userId);
            add.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent e2) {
                    loadTasks();
                }
            });
        });

        btnEdit.addActionListener(e -> {
            int selectedRow = taskTable.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a task to edit!");
                return;
            }
            String title = (String) taskTable.getValueAt(selectedRow, 0);
            EditTask edit = new EditTask(userId, title);
            edit.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent e2) {
                    loadTasks();
                }
            });
        });

        btnDelete.addActionListener(e -> deleteTask());
        btnLogout.addActionListener(e -> { dispose(); new Login().setVisible(true); });
        btnViewQuote.addActionListener(e -> new QuoteFrame());
        btnStartTimer.addActionListener(e -> new PomodoroTimer());
        btnFilter.addActionListener(e -> loadTasks());

        // Load tasks initially
        loadTasks();
        setVisible(true);
    }

    // delete tasks
    private void deleteTask() {
        int selectedRow = taskTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a task to delete!");
            return;
        }
        String title = (String) taskTable.getValueAt(selectedRow, 0);
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete \"" + title + "\" ?",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection con = GetConnection.getConnection()) {
                PreparedStatement pst = con.prepareStatement("delete from tasks where user_id=? and title=?");
                pst.setInt(1, userId);
                pst.setString(2, title);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Task deleted successfully!");
                loadTasks();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    // load tasks
    private void loadTasks() {
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        model.setRowCount(0);
        try (Connection con = GetConnection.getConnection()) {
            String query = "select title, category, priority, status, deadline from tasks where user_id=?";
            String priority = filterPriority.getSelectedItem().toString();
            String status = filterStatus.getSelectedItem().toString();
            String dateFilter = filterDate.getSelectedItem().toString();

            StringBuilder sb = new StringBuilder(query);

            if (!priority.equals("All Priorities"))
                sb.append(" AND priority='" + priority + "'");
            if (!status.equals("All Status"))
                sb.append(" AND status='" + status + "'");
            if (dateFilter.equals("Today"))
                sb.append(" AND deadline=CURDATE()");
            else if (dateFilter.equals("Future"))
                sb.append(" AND deadline>CURDATE()");

            PreparedStatement pst = con.prepareStatement(sb.toString());
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            int completed = 0, total = 0;
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("title"));
                row.add(rs.getString("category"));
                row.add(rs.getString("priority"));
                row.add(rs.getString("status"));
                row.add(rs.getString("deadline"));
                model.addRow(row);
                total++;
                if (rs.getString("status").equalsIgnoreCase("Completed")) completed++;
            }

            if (total > 0) {
                int progress = (completed * 100) / total;
                progressBar.setValue(progress);
                progressBar.setString(progress + "% Completed");
            } else {
                progressBar.setValue(0);
                progressBar.setString("No tasks yet");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        new Dashboard(1);
    }
}
