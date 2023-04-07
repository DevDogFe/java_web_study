<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Join</h1>
	<form action="joinProc.jsp" method="post">
		<div>
		<label for="username">Username: </label>
		<input type="text" id="username" name="username" value="abc">
		</div>
		<div>
		<label for="password">Password: </label>
		<input type="password" id="password" name="password" value="123">
		</div>
		<div>
		<label for="email">email: </label>
		<input type="text" id="email" name="email" value="a@test.com">
		</div>
		<div>
		<input type="submit" value="회원가입">
		</div>
	</form>

</body>
</html>