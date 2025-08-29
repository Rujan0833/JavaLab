import java.sql.*;
import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        try {
            // Database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "re@per0833");

            Scanner sc = new Scanner(System.in);

            // Taking values from console
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();

            // SQL Insert
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students (id, name) VALUES (?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();
            System.out.println("Data inserted successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
