import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Focus_Desk {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection.getConnection();
            Statement st = con.createStatement();
            

            // users tables
            String userTable = "create table if not exists users ("
                    + "id int auto_increment primary key, "
                    + "username varchar(50) not null unique, "
                    + "password varchar(50) not null"
                    + ")";
            st.executeUpdate(userTable);

            // alter user colunms
            try {
                st.executeUpdate("alter table users add column gender varchar(10)");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }

            try {
                st.executeUpdate("alter table users add column dob date");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }
              try {
                st.executeUpdate("alter table users add column gmail varchar(100)");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }

            // Tasks table
            String taskTable = "create table if not exists tasks ("
                    + "id int auto_increment primary key, "
                    + "user_id int not null, "
                    + "title varchar(100), "
                    + "priority varchar(10), "
                    + "status varchar(15), "
                    + "category varchar(50), "
                    + "deadline date, "
                    + "created_at datetime default current_timestamp, "
                    + "foreign key (user_id) references users(id)"
                    + ")";
            st.executeUpdate(taskTable);
            
            // Alter tables
            try {
                st.executeUpdate("alter table tasks add column category varchar(50)");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }
            try {
                st.executeUpdate("alter table tasks add column deadline date");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }
            try {
                st.executeUpdate("alter table tasks add column created_at datetime default current_timestamp");
            } catch (SQLException e) {
                if (!e.getMessage().contains("Duplicate column name")) e.printStackTrace();
            }

            // Quote table
            String quoteTable = "create table if not exists quotes ("
                    + "id int auto_increment primary key, "
                    + "quote varchar(500) not null"
                    + ")";
            st.executeUpdate(quoteTable);

            System.out.println(" Tables  updated successfully.");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Error occured");
        }
     
        //start signup
        SignupPage sp = new SignupPage();
        sp.setVisible(true);
        
    }
}
