
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

public class QuoteFrame extends JFrame {
    private JLabel quoteLabel;

    public QuoteFrame() {
        setTitle("Motivational Quote");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 245, 250));
        setLayout(new BorderLayout(10, 10));

        JLabel heading = new JLabel(" Your Motivation ", SwingConstants.CENTER);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(heading, BorderLayout.NORTH);

        quoteLabel = new JLabel("", SwingConstants.CENTER);
        quoteLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        quoteLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(quoteLabel, BorderLayout.CENTER);

        loadRandomQuote();

        setVisible(true);
    }

    private void loadRandomQuote() {
        try {
            Connection con = GetConnection.getConnection();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT quote FROM quotes");

            java.util.List<String> quotes = new java.util.ArrayList<>();
            while (rs.next()) {
                quotes.add(rs.getString("quote"));
            }

            if (!quotes.isEmpty()) {
                Random rand = new Random();
                String randomQuote = quotes.get(rand.nextInt(quotes.size()));
                quoteLabel.setText("<html><center>" + randomQuote + "</center></html>");
            } else {
                quoteLabel.setText("No quotes found in database.");
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            quoteLabel.setText("Error loading quote: " + ex.getMessage());
        }
    }

//    public static void main(String[] args) {
//        new QuoteFrame();
//    }
}
