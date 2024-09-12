<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 
	 <h2>Welcome</h2>
	<form action="first1" method="post">
		Name <input type="text" name="name">
		<input type="submit" value ="click">
	</form>
	<%
		if(request.getAttribute("name") != null ) {
			out.println("your name is : "+request.getAttribute("name"));
		}
	%>
	
</body>
</html>