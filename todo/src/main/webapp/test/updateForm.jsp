<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Category Update Form</h1>
	<p>
		HTTP 메세지 시작줄에 추가적인 정보를 달아서 서버에 보낼 수 있다.
		Query Parameter 방식, Pass Variable 방식
	</p>
	<form action="/todo/cTest?action=update" method="post">
		<input type="number" name="id" required="required"> 
		<input type="text" name="name" required="required"> 
		<input type="submit" value="카테고리 수정">
	</form>
</body>
</html>