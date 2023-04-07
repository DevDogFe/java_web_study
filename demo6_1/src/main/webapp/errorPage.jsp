<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	display: flex;
	justify-content: center;
}
section{
	padding: 50px;
	
}

#errorImg{
	width: 400px;
	margin-bottom: 50px;
	
}

.errorMessage{
	color: gray;	
}

</style>
</head>
<body>
<section>
<%
String imgDir = application.getInitParameter("imgDir");	
%>

<div>
	<img alt="error" src="/demo_1<%= imgDir%>error.png" id="errorImg">
</div>
<div>
	<h1>에러가 발생하였습니다.</h1>
	<p class="errorMessage"><%=exception.getLocalizedMessage() %></p>
	<p>자세한 문의는 a@test.com으로 문의바랍니다. 담당자: 홍길동</p>
</div>
</section>
</body>
</html>