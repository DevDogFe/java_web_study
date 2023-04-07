<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie c : cookies){
			c.setMaxAge(0);
			response.addCookie(c);
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}	

header{
	text-align: center;
	padding: 20px;
	background-color: #222;
	color: #eee;
}

section{
	font-size: 20px;
}
form{
	display: flex;
	flex-direction: column;
	align-items: center;
	padding: 5px;
}
input[type="submit"]{
	background-color: #25e;
	font-size: 16px;
	color: #fff;
	padding: 10px;
	border-radius: 10px;
	border: none;
	
}
</style>
</head>
<body>
	<header><h1>과일 고르기</h1></header>
	<section>
		<form action="cartProc.jsp">
			<div><input type="checkbox" name="fruit" value="apple" id="apple"> <label for="apple">사과</label></div>
			<div><input type="checkbox" name="fruit" value="banana" id="banana"> <label for="banana">바나나</label></div>
			<div><input type="checkbox" name="fruit" value="peach" id="peach"> <label for="peach">복숭아</label></div>
			<div><input type="submit" value="담기">
			<div><input type="submit" value="삭제" name="delete">
		</form>
	</section>
</body>
</html>