import java.sql.*;

public class JdbcInsertData {

    // Database connection details
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3307/studentdb";
    private static final String USER = "root";
    private static final String PASS = "re@per0833";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // SQL command to insert a new record
            String sql = "INSERT INTO employees (id, name, position) VALUES (101, 'Jane Doe', 'Analyst')";

            // Execute the SQL statement
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + " row(s) inserted successfully.");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
