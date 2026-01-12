import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnection {  
    private static Connection con = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 1: Connect to MySQL 
            Connection tempCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            Statement st = tempCon.createStatement();
            
            // Step 2: Create database if not exists
            st.executeUpdate("create database if not  exists focusdesk_fb");
            tempCon.close();
            
            // Step 3: Connect to created database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/focusdesk_fb", "root", "root");
            
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error in db connection");
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connection test = GetConnection.getConnection();
        if (test != null) {
            System.out.println(" Database connected successfully");
        } else {
            System.out.println(" Connection failed");
        }
    }
}
