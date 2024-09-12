<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Welcome</h2>
	<form action="first" method="post">
		Name <input type="text" name="name">
		 <input type="submit" value="click">
	</form>
	<%
		if(request.getAttribute("name") != null){
			out.println("Name entered is " + request.getAttribute("name"));
		}
	%>
</body>
</html>