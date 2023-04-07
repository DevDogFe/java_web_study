<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

  @import url('https://fonts.googleapis.com/css2?family=Delicious+Handrawn&family=Noto+Sans+KR:wght@300&display=swap');

*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}
h1{
	padding: 20px;
	margin-bottom: 50px;
	font-family: 'Delicious Handrawn', cursive;
}

body{
	display: flex;
	flex-direction: column;
	align-items: center;
}

form {
	width: 350px;
	border: 1px solid black;
	display: flex;
	flex-direction: column;
	padding: 10px;
	font-family: 'Noto Sans KR', sans-serif;
}
form div{
	padding: 10px;
}

.text-box{
	display: flex;
	justify-content: space-between; 
}
.button-box{
	display:flex;
	justify-content: flex-end;
}
</style>
</head>
<body>
	<h1>Login</h1>
	<form action="loginProc.jsp">
	<div class="text-box">
	<label for="username">USERNAME: </label> <input type="text" name = "username">
	</div>
	<div class="text-box">
	<label for="password">PASSWORD: </label> <input type="password" name = "password">
	</div>
	<div class="button-box">
	<input type="submit" value="로그인">
	</div>
	</form>
</body>
</html>