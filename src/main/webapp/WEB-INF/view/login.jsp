<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>

<form action="login" method="post">
<pre>
UserName:<input type="text" name="email"/><br>
Password:<input type="password" name="password"/><br>
<input type="submit" value="Login"/>
${msg}

</pre>


</form>

</body>
</html>