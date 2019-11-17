<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rechner</title>
</head>

<body>
	<h1>Rechner</h1>
	<form:form modelAttribute="calculatorBean">
		<p>Geben Sie bitte folgende Daten ein:</p>
		<p>
			<label for="Zahl1">Zahl1</label> 
			<form:input path="Zahl1" /> 
			<span style="color: red"> 
				<c:out value="${bean.errorMessageZahl1}" />
			</span>
		</p>
		<p>
			<label for="Zahl2">Zahl2</label> 
			<form:input path="Zahl2"/>
			<span style="color: red">
				<c:out value="${bean.errorMessageZahl2}" />
			</span>
		</p>
		<p>
			<label for="Operation">Rechenoperation</label> 
			<form:input path="Operation" />
			<span style="color: red"> 
				<c:out value="${bean.errorMessageOperation}" />
			</span>
		</p>
		<p>
			<button name="calculate" type="submit">Berechnen</button>
		</p>
	</form:form>
</body>
</html>