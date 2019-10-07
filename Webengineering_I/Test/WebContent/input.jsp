<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Übung</title>
</head>
<body>
	<form method="post" >
		<input type="text" name="name" placeholder="Wie ist dein Name?" />
		<input type="submit"/>
	</form>
	<jsp:element name="h1">
		<jsp:body>
			Hallo ${empty param.name ? 'Du Da' : param.name}
		</jsp:body>
	</jsp:element>
</body>
</html>