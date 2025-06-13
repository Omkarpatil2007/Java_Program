import java.sql.*;

public class SimpleConnectionExample 
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String username = "root"; 
        String password = "password"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            Statement stmt = con.createStatement();
            String sql = "INSERT INTO students (id, name) VALUES (1, 'John')";

            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully!");

            con.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
