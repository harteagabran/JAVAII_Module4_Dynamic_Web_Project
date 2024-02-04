<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Module 4 Assesment</title>
</head>
<body>
	<h1>Character Stat Generator</h1>
	<form action="randomGenerateServlet" method="post">
		Enter the name of the character to be generated: 
		<input type="text" name="charaName" size="10">
		<button type="submit">Generate</button>
	</form>
</body>
</html>