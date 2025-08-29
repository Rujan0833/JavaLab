import java.sql.*;
import java.util.*;

class InsertRecords {
    public static void main(String[] args)throws Exception {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","re@per0833");
        PreparedStatement ps=con.prepareStatement("INSERT INTO students(id,name) VALUES(?,?)");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter id: "); int id=sc.nextInt();
            System.out.print("Enter name: "); String name=sc.next();
            ps.setInt(1,id); ps.setString(2,name); ps.executeUpdate();
            System.out.print("Add more? (y/n): ");
            if(sc.next().equalsIgnoreCase("n")) break;
        }
        con.close();
    }
}
