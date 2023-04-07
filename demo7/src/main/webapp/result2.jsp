<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 result2.jsp</h1>
	<div>
		<%
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain");
			String msg = (String)request.getAttribute("msg2");
			msg += "<<<";
			out.println(msg);
		%>
		<p>넘겨받은 데이터: <%=msg%></p>
		
		
	</div>
</body>
</html>