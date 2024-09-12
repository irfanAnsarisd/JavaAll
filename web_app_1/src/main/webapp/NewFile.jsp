<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Date" %>
<%@ include file="test1.txt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%
      out.print("100");
    %>
	<%!
		public static int x = 10;
	public int y = 20;
	public int test(){
		return 100;
	}   
	%>
	
	<%= x %>
	<%= y %>
	<%= test() %>
	<%= new Date() %>
</body>
</html>