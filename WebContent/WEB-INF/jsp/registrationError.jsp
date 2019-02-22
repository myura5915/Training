<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registrationError</title>
<link rel="stylesheet" type="text/css" href="/Lesson/css/style.css">

</head>
<body>
	<header>
	</header><br><br>
	<main>
		<div class="frame">
		<h2>ユーザー登録に失敗しました</h2>
		<font color="#FF0000"><c:out value="${error_message}" /></font>
		</div><br>
		<p><a href="/Lesson/RegistrationServlet">ユーザー登録画面に戻る</a></p>
	</main>
</body>
</html>