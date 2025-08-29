package Part4;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class q45 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // SESSION
        HttpSession s = req.getSession(true);
        int c = s.getAttribute("count")==null?1:(int)s.getAttribute("count")+1;
        s.setAttribute("count", c);
        out.println("Session count: "+c+"<br>");
        if(c>=5){ s.invalidate(); out.println("Session destroyed<br>"); }

        // COOKIE
        String u="Guest";
        if(req.getCookies()!=null) for(Cookie ck:req.getCookies()) if(ck.getName().equals("user")) u=ck.getValue();
        out.println("Hello, "+u+"<br>");
        res.addCookie(new Cookie("user","Rujan"));
    }
}
