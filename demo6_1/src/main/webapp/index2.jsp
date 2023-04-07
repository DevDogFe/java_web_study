<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String imgDir = application.getInitParameter("imgDir");
%>

<div>
	<img alt="이미지1" src="/demo_1<%=imgDir%>a.png">
	<img alt="이미지2" src="/demo_1<%=imgDir%>mysql01.png">
</div>
<%
	String str = null;
	str.split("/");
%>

</body>
</html>