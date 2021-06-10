<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<%
		
		response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
	
	
	
		if(session.getAttribute("username") == null){
			 response.sendRedirect("login.jsp");
		}
	%>

	
	<h1>YOU HAVE LOGGED IN</h1> ${username}!! <br>
	 <a href="videos.jsp">Videos here</a> <br>
	
	
	<form action="Logout" method="post">
	<input type="submit" value="Logout">
	
	</form>
	
</body>
</html>