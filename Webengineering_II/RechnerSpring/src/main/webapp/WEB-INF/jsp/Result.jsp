<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rechner</title>
</head>
<body>
	<h1>Rechner</h1>
	<span id="ergebnis"> Das Ergebnis von <c:out
			value="${bean.zahl1 }" /> <c:out
			value="${bean.operation }" /> <c:out
			value="${bean.zahl2 }" /> ist <c:out
			value="${bean.result }" />
	</span>
</body>
</html>