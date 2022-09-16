<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${SPRING_SECURITY_LAST_EXCEPTION.message}
<h1>Login Page</h1>

<form action="/authenticateTheUser" method="post">
<input type="text" placeholder="Enter Username" name="username"> <br>
<input type="password" placeholder="Enter Password" name="password"> <br>

<input type="submit">
</form>
</body>
</html>