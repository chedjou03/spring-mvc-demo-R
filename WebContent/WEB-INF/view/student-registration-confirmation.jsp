<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Registration Confirmation</title>
	</head>
	
	<body>
	
			<b>The student is confirmed :</b> ${student.firstName} ${student.lastName} 
			
			<br><br>
			
			<b>Country :</b> ${student.country}
			
			<br><br>
			
			<b>Favorite Language :</b> ${student.favoriteLanguage}
			
			<br><br>
			
			<b>Favorite Operation system :</b> ${student.operatingSystem}
			
			<br><br>
			
			<a href = "${pageContext.request.contextPath}" >main menu</a>

	</body>
	
</html>