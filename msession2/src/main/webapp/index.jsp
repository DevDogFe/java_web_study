<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String sessionUserName = (String)session.getAttribute("username");
// 로그인이 안되어있으면 login.jsp 페이지로 이동시키기
if(sessionUserName == null){
	response.sendRedirect("login.jsp");
}

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 상태여야 이 페이지를 보여줍니다.</h1>
	
	<h1>로그아웃 기능 만들기</h1>
	<form action="logout.jsp">
		<input type="submit" value="Logout">
	</form>
</body>
</html>