<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit ${edit.getName()}</title>
</head>
<body>
	<h1>Character Edit</h1>
	<form action="editUnitServlet" method="post">
		<label for="name">Name: </label>
		<input name="name" type="text" value="${edit.getName()}" required>
		<label for="strength">Strength: </label>
		<input name="strength" type="number" value="${edit.getStrength()}" max="20" min="1" required>
		<label for="speed">Speed: </label>
		<input name="speed" type="number" value="${edit.getSpeed()}" max="20" min="1" required>
		<label for="defense">Defense: </label>
		<input name="defense" type="number" value="${edit.getDefense()}" max="20" min="1" required>
		<button type="submit">All Done!</button>
	</form>
</body>
</html>