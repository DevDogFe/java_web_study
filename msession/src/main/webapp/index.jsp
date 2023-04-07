<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// 세션 꺼내는 방법 확인
String username = (String)session.getAttribute("username");
if(username == null){
	response.sendRedirect("login.jsp");
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

@import url('https://fonts.googleapis.com/css2?family=Anton&family=Roboto:ital,wght@1,100&display=swap');

*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	
}

header{
	display: flex;
	justify-content: space-between;
	background-color: #cde;
	padding-bottom: 15px;
	font-family: 'Anton', sans-serif;
	font-weight: lighter;
}

header :last-child{
	display: flex;
	justify-content: flex-end;
}

header h1{
	margin: 10px;
	margin-top: 20px;
}

header h2{
	margin-top: 30px;
}

input[type="submit"]{
	padding: 10px;
	background-color: #ff5023;
	font-size: 20px;
	color: #fff;
	margin: 10px;
	cursor: pointer;
	box-shadow: 1px 1px 5px rgba(240, 10, 10, 0.2);
	
}

input[type="submit"]:hover{
	padding: 10px;
	background-color: #ff3003;
	color: #000;
	margin: 10px;
	cursor: pointer;
	
}

section {
	height: 700px;
	display: flex;
}

section aside{
	flex: 1;
	background-color: #ddd;
}

section article{
	flex: 8;
	background-color: #bbb;
}

footer {
	background-color: #222;
	color: #ddd;
	height: 200px;
	text-align: center;
	padding: 40px;
	font-family: 'Roboto', sans-serif;
}

footer p{
}


</style>

</head>
<body>

<header>
	<div> <h1>P A G E &nbsp; T I T L E</h1></div>
	<div>
		<h2>Welcome, <%=username%>!</h2>
		<form action="logout.jsp">
			<input type="submit" value="L O G O U T">
		</form>
	</div>
</header>

<section>
	<article></article>
	<aside></aside>
	<aside></aside>
</section>

<footer>
	<p>email: abc@test.com</p>
	<p>tel: 123)456-7890</p>
	<p>@Copyright is none.</p>
</footer>
</body>
</html>