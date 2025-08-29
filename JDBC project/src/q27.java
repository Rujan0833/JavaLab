import java.sql.*;

public class q27 {

    // Database connection details
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3307/studentdb";
    private static final String USER = "root";
    private static final String PASS = "re@per0833";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // SQL command to insert a new record using placeholders (?)
            String sql = "INSERT INTO result (roll_no, course_name, marks_obtained) VALUES (?, ?, ?)";

            // Create a PreparedStatement object
            pstmt = conn.prepareStatement(sql);

            // Set the values for the placeholders
            pstmt.setInt(1, 101); // roll_no
            pstmt.setString(2, "Advanced Java"); // course_name
            pstmt.setInt(3, 85); // marks_obtained

            // Execute the SQL statement
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully.");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
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
