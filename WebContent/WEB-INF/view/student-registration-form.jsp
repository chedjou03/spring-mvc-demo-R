<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Registration Form</title>
	</head>
	<body>
	
		<form:form action = "processStudentRegistrationForm" modelAttribute = "student">
			
				First Name : <form:input path = "firstName" placeholder = "Enter First Name" />
				
				<br><br>
				
				Last Name : <form:input path = "lastName" placeholder = "Enter First Name"/>
							<form:errors path = "lastName"/>
				
				<br><br>
				
				Country : 	<form:select path = "country">
				
								<form:options items = "${student.countryOptions}" />
								
							</form:select>
				
				<br><br>
				
				Programming Language : <form:radiobuttons path = "favoriteLanguage" items = "${student.favoriteLanguageOptions}"/>
				
				<br><br>
				
				Operation system : <form:checkboxes path = "operatingSystem" items = "${student.operatingSystemsOptions}" />
				
				<br><br>
				
				<input type = "submit" value = "Submit"/>
		
		</form:form>

	</body>
</html>