import java.sql.*;

class InsertRow {
    public static void main(String args[]) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database (change "testdb" to your database name)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/studentdb", "root", "re@per0833"
            );

            // Create statement
            Statement stmt = con.createStatement();

            // Insert query (change "student" and column names as per your table)
            String sql = "INSERT INTO student(id, name) VALUES(1, 'Rujan')";
            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " row(s) inserted successfully!");

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
