<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>  
        .error {color:red}  
    </style>  
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="details.*" cssClass="error"/>
	<form:form action="/SpringMvcAssignment6/fillForm.html">
	<table>
		<tr>
			<td>Username</td>
			<td><input type="text" name = "username"/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name = "password"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name = "email"></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><input type="text" name="contact"/></td>
		</tr>
		<tr>
			<td>City</td>
			<td><select name="city" id="cit">
		    <option value="null">Select</option>
		    <option value="Lucknow">Lucknow</option>
		    <option value="Noida">Noida</option>
		    <option value="Bangalore">Bangalore</option>
		</select></td>
		</tr>
		<tr>
			<td>Zipcode</td>
			<td><input type="number" name="zipcode"/></td>
		</tr>
		
		<tr><td><button type="submit">Submit</button></td></tr>
	</table>
	</form:form>

</body>
</html>
