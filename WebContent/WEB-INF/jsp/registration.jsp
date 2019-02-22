<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="/Lesson/css/style.css">

</head>
<body>
	<header>
	</header><br><br>
	<main>
		<div class="frame">ユーザー登録</div><br>
		<form method="post" action="/Lesson/RegistrationServlet">
			<table>
				<tr>
					<td>ユーザー名</td><td><input type="text" name="user_name" style="width:150px;"></td>
				</tr>
				<tr>
					<td>パスワード</td><td><input type="password" name="password" style="width:150px;"></td>
				</tr>
			</table><br>
			<input type="submit" value="登録">
		</form><br>
	</main>
</body>
</html>