<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	  xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div th:inline="text">
<h1 th:text="${greeting}"> Thymeleaf Test Page</h1>
<h3 sec:authentication="name">Spring security</h3>
<h3>[[${#authentication.principal.username}]]</h3>
</div>
</body>
</html>