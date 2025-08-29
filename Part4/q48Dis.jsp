<%
  // a) Get form values
  String name = request.getParameter("name");
  String age = request.getParameter("age");
  out.println("Name: "+name+"<br>Age: "+age+"<br>");

  // b) Demonstrate implicit object scopes
  session.setAttribute("sval","SessionValue");
  application.setAttribute("aval","AppValue");
  pageContext.setAttribute("pval","PageContextValue");

  out.println("Request object exists<br>");
  out.println("Session attribute: "+session.getAttribute("sval")+"<br>");
  out.println("Application attribute: "+application.getAttribute("aval")+"<br>");
  out.println("PageContext attribute: "+pageContext.getAttribute("pval")+"<br>");
  out.println("Page object: "+page+"<br>");
%>
