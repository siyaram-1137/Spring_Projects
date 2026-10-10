	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Update Employee</h1>

	<form action="selectUser">
		<input type="text" name="id" placeholder="Enter Id Here"><br><br>
		<input type="submit" value="Get User"><br><br>
	</form>
	
	<h1>Employee Id : ${emp.id }</h1>
	<h1>Employee Name : ${emp.name }</h1>
	<h1>Employee Salary : ${emp.salary }</h1>
	
	
</body>
</html>