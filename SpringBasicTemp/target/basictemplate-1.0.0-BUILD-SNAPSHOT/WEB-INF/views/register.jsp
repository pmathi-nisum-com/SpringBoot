<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>Registration page</h2>

			<spring:form commandName="customerData" action="${pageContext.request.contextPath}/register" method="post">
			<table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><spring:input path="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><spring:password path="password" /></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><spring:input path="firstname" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><spring:input path="lastname" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
</spring:form>
</body>
</html>