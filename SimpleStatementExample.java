import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SimpleStatementExample {
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", // Database name
                "root",                               // MySQL username
                "password"                            // MySQL password
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL query to insert data
            String sql = "INSERT INTO students (id, name) VALUES (2, 'Alice')";

            // Execute query
            int result = stmt.executeUpdate(sql);

            // Output the result
            System.out.println(result + " row inserted!");

            // Close connection
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
