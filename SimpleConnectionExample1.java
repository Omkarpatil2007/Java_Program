import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleConnectionExample1 
{
    public static void main(String[] args) 
   {
        try
       {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // 3. Print a success message
            System.out.println("Connected to the database!");

            // 4. Close the connection
            conn.close();
        } 
      catch (Exception e) 
       {
            e.printStackTrace();
        }
    }
}