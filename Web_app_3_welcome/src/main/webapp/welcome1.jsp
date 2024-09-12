<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
	<h2>Welcome page</h2>
	<form action= "firstF" method="post">
		Name <input type="text" name="Name">
		<input type="submit" value = "click">
	</form>
	<%
		if(request.getAttribute("name") != null){
			out.println(request.getAttribute("name"));
		}
	%>
</body>
</html>