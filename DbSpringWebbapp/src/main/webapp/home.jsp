<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label>Add</label>
	<form action="addEmp">
		<input type="text" name=name><br>
		<input type="text" name=tech><br>
		<input type="submit"><br>
	</form>
	<label>Delete</label>
	<form action="deleteEmp">
		<input type="text" name=name><br>
		<input type="text" name=tech><br>
		<input type="submit"><br>
	</form>
	<label>Show Details</label>
	<form action="showDetails">
		<input type="text" name=name><br>
		<input type="submit"><br>
	</form>
	
</body>
</html>