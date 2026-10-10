<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" cellpadding="6px">
	
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.name }</td>
				<td>${emp.salary }</td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>