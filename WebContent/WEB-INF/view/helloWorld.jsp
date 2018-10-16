<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hello World</title>
	</head>
	<body>
	
		<h1>Hello World of Spring</h1>
		
		<hr>
		
		Student Name: ${param.studentName}
		
		<br><br>
		
		The shoot message : ${ShootOutMessage}
		
		<br><br>
		
		<a href="${pageContext.request.contextPath}">Menu</a>
		
	</body>
</html>