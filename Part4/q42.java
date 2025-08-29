package Part4;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.Date;

public class q42 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        for(int i=0;i<10;i++) out.println("Java is one of the powerful programming languages!<br>");
        out.println("Current Date and Time: " + new Date());
    }
}
