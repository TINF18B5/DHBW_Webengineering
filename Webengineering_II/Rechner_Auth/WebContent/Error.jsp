<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rechner</title>
</head>
<body>
	<h1>Fehler!</h1>
	Bei der Berechnung ist ein Fehler aufgetreten:
	<br>
	<%=exception.getMessage()%>
</body>
</html>