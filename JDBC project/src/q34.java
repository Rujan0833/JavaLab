import java.sql.*;

public class q34 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

        // Scrollable
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        rs.last();
        System.out.println("Last student: " + rs.getString("name"));
        rs.first();
        System.out.println("First student: " + rs.getString("name"));

        // Updatable
        Statement stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs2 = stmt2.executeQuery("SELECT * FROM student");
        if(rs2.first()){
            rs2.updateInt("marks", 95);
            rs2.updateRow();
            System.out.println("Updated first student's marks to 95");
        }

        // Multiple ResultSets
        Statement stmt3 = con.createStatement();
        ResultSet rs3 = stmt3.executeQuery("SELECT * FROM student WHERE id<=2");
        System.out.println("First ResultSet:");
        while(rs3.next()){
            System.out.println(rs3.getString("name") + " - " + rs3.getInt("marks"));
        }

        ResultSet rs4 = stmt3.executeQuery("SELECT * FROM student WHERE id>2");
        System.out.println("Second ResultSet:");
        while(rs4.next()){
            System.out.println(rs4.getString("name") + " - " + rs4.getInt("marks"));
        }

        con.close();
    }
}
