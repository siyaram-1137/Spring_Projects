	
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

	<p style="color:green">${successMsg }</p>
	<p style="color:red">${errMsg }</p>

	<form action="updateUser">
		<input type="text" name="id" placeholder="Enter Id Here"><br><br>
		<input type="text" name="name" placeholder="Enter Name Here"><br><br>
		<input type="text" name="salary" placeholder="Enter Salary Here"><br><br>
		<input type="submit"  value="Update Here"><br><br>
	</form>
	
	
</body>
</html>