<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginOK</title>
<link rel="stylesheet" type="text/css" href="/Lesson/css/style.css">

</head>
<body>
	<header>
	</header><br><br>
	<main>
		<div class="frame">
		<h2>Hello! <c:out value="${user_name}" />さん</h2>
		<p>Loginに成功しました!</p>
		</div><br>
		<p>Logoutは<a href="/Lesson/LogoutServlet">こちら</a></p>
	</main>
</body>
</html>