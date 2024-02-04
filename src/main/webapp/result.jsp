<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Character Result</title>
</head>
<body>
	<h1 style="text-align:center">${unit.getName()}'s Stats</h1>
	
	<div style="display:flex;justify-content:space-around;">
		<h2>Strength</h2>
		<h3>${unit.getStrength()}</h3>
	</div>
	<div style="display:flex;justify-content:space-around;">
		<h2>Speed</h2>
		<h3>${unit.getSpeed()}</h3>
	</div>
	<div style="display:flex;justify-content:space-around;">
		<h2>Defense</h2>
		<h3>${unit.getDefense()}</h3>
	</div>
	
	<br/>
	
	<form action="editUnitServlet" method="get">
		<input name="name" type="text" value="${unit.getName()}" hidden>
		<input name="strength" type="number" value="${unit.getStrength()}" hidden>
		<input name="speed" type="number" value="${unit.getSpeed()}" hidden>
		<input name="defense" type="number" value="${unit.getDefense()}" hidden>
		<input type="submit" value="Edit Character" />
	</form>
	<a href="index.jsp">Generate Another Character</a>
</body>
</html>