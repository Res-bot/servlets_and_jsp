<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="StudentRegistrationController" method= "post">
Registration Number: <input type="text" name="regdNo" /> <br />
Name: <input type="text" name="name" /> <br />
EMail: <input type="email" name="email" /> <br />
Pancard: <input type="text" name="pan" /> <br />
Username:  <input type="text" name="username" /> <br />
Password: <input type="password" name="password" /> <br />

<input type="submit" value="save" />
</form>

</body>
</html>