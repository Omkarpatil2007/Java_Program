import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleConnection {
    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC driver (optional in newer Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",  // database URL
                "root",                                 // username
                "password"                              // password
            );

            // Step 3: Print success message
            System.out.println("Connected to the database!");

            // Step 4: Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
