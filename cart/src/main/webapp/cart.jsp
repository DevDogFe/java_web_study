<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie[] cookies = request.getCookies();
	boolean apple = false;
	boolean banana = false;
	boolean peach = false;
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("apple")){
			apple = true;
		}
		if(cookie.getName().equals("banana")){
			banana = true;
		}
		if(cookie.getName().equals("peach")){
			peach = true;
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

.apple-box{
	
}

.banana-box{
	
	
}
	
</style>
</head>
<body>
	<header>
		<h1>내 장바구니</h1>
	</header>
	<section>
		<h1>장바구니 목록</h1>
		<%if(apple){%>
		<div class="apple-box">사과</div>
		<%}%>
		
		<%if(banana){%>
		<div class="banana-box">바나나</div>
		<%}%>
		
		<%if(peach){%>
		<div class="banana-box">복숭아</div>
		<%}%>
		
	</section>
	

</body>
</html>