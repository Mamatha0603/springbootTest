<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html xmlns:th="https://thymeleaf.org"> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>User entered succefully.</p>

<b>UserName:</b>${user.username}
<b>email:</b><h4>${user.email}></h4>

</body>
</html>