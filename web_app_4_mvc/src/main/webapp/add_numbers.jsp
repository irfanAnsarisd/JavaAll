<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add</title>
</head>
<body>
	<form action= "add" method="post" id = "form1">
	Number 1: <input type= "text" name ="num1" />
	Number 2: <input type= "text" name ="num2" />
	 <!-- <input type= "submit" value ="add" /> -->
	</form>
	<form action= "subtract" method="post" id = "form2">
	Number 1: <input type= "text" name ="num1" />
	Number 2: <input type= "text" name ="num2" />
	 <!-- <input type= "submit" value ="add" /> -->
	</form>
	<button type= "submit" form = "form1" value = "submit">ADD</button>
	<button type= "submit" form = "form2" value = "submit">SUBTRACT</button>
	
	<%
	if(request.getAttribute("res") != null) {
	out.println("the result is : "+request.getAttribute("res"));
	}
	%>
</body>
</html>