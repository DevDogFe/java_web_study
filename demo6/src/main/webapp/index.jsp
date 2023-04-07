<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String imgDir;
	String testServerIp;
	String realServerIp;
	imgDir = application.getInitParameter("imgDir");
	testServerIp = application.getInitParameter("testServerIp");
	realServerIp = application.getInitParameter("realServerIp");
%>

<div>
imgDir: <%= imgDir%>
</div>
<div>
testServerIp: <%= testServerIp%>
</div>
<div>
realServerIp: <%= realServerIp%>
</div>
<div>
	<img alt="배너이미지" src="/demo6<%= imgDir%>/a.png">
</div>
</body>
</html>