<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<base>
<title>Register User</title>
</head>
<body>

	<form action="registerUser" method="post">
	
		FirstName:<input type="text" name="firstname" /><br> LastName:<input
			type="text" name="lastname" /><br> UserName:<input type="text"
			name="email" /><br> Password:<input type="password"
			name="password" /><br> re-Password:<input type="password"
			name="re-password" /><br> <input type="submit" value="Register" />
			
	</form>

</body>
</html>