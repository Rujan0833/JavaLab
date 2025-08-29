import java.sql.*;

public class q31 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb"; // your DB
        String user = "root"; // your username
        String pass = "";     // your password

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // 1. Insert Record
            String insertSQL = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertSQL);
            psInsert.setInt(1, 1);
            psInsert.setString(2, "Ramesh");
            psInsert.setInt(3, 21);
            psInsert.executeUpdate();
            System.out.println("Record Inserted!");

            // 2. Retrieve Records
            String selectSQL = "SELECT * FROM student";
            PreparedStatement psSelect = con.prepareStatement(selectSQL);
            ResultSet rs = psSelect.executeQuery();
            System.out.println("\nRecords in Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " +
                                   rs.getString("name") + "  " +
                                   rs.getInt("age"));
            }

            // 3. Update Record
            String updateSQL = "UPDATE student SET age=? WHERE id=?";
            PreparedStatement psUpdate = con.prepareStatement(updateSQL);
            psUpdate.setInt(1, 22);
            psUpdate.setInt(2, 1);
            psUpdate.executeUpdate();
            System.out.println("\nRecord Updated!");

            // 4. Delete Record
            String deleteSQL = "DELETE FROM student WHERE id=?";
            PreparedStatement psDelete = con.prepareStatement(deleteSQL);
            psDelete.setInt(1, 1);
            psDelete.executeUpdate();
            System.out.println("Record Deleted!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
