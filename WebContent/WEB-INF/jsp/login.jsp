<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="/Lesson/css/style.css">

</head>
<body>
	<header>
	</header><br><br>
	<main>
		<div class="frame">Login</div><br>
		<form method="post" action="/Lesson/LoginServlet">
			<table>
				<tr>
					<td>ユーザー名</td><td><input type="text" name="user_name" style="width:150px;"></td>
				</tr>
				<tr>
					<td>パスワード</td><td><input type="password" name="password" style="width:150px;"></td>
				</tr>
			</table><br>
			<input type="submit" value="ログイン">
		</form><br>
		<p>新規ユーザー登録は<a href="/Lesson/RegistrationServlet">こちら</a></p>
	</main>
</body>
</html>