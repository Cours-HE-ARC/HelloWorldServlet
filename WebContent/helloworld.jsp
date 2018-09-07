<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands
</h1>
<%
	String hello = (String)request.getAttribute("hellomsg");
	
	out.println("<br>hello " + hello +"<br>");
	
%>
</body>
</html>