<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">


<div th:fragment="headerFragment">
<!-- Navigation -->
<nav class="w3-bar w3-black">
  <a href="/home" class="w3-button w3-bar-item">Home</a>
  <a href="/partorder" class="w3-button w3-bar-item">PartOrder</a>
  <a href="/Board" class="w3-button w3-bar-item">Board</a>
  <a href="#contact" class="w3-button w3-bar-item">NewPartOrder</a>
  <a href="#contact" class="w3-button w3-bar-item">OrderHistory</a>
  <a href="#contact" class="w3-button w3-bar-item">ShoppingBasket</a>

	<!--  로그인한 상태라면 이름과, logout 버튼 출력      -->
	<div th:if="${#authorization.expr('isAuthenticated()')}">
        <h2 th:text="${#authentication.name}" ></h2>
        <a href="/logout" th:href="@{/logout}" class="w3-button w3-bar-item" style="float: right;">Logout</a>
    </div>
	<!--  로그인한 상태가 아니라면 login 버튼 출력  -->
    <div th:unless="${#authorization.expr('isAuthenticated()')}">
        <a href="/member/login" th:href="@{/member/login}" class="w3-button w3-bar-item" style="float: right;">Login</a>
    </div>

</nav>
</div>


</html>