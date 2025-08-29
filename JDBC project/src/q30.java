import java.sql.*;
import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database (adjust DB name, username, password)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "re@per0833"
            );

            // Prepare SQL query
            String sql = "SELECT * FROM result WHERE roll_no = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, roll);

            // Execute query
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("roll_no"));
                System.out.println("Course Name: " + rs.getString("course_name"));
                System.out.println("Marks Obtained: " + rs.getInt("marks_obtained"));
            } else {
                System.out.println("No record found for Roll No: " + roll);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
