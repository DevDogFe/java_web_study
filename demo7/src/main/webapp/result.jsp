<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 result.jsp</h1>
	<div>
		<%
			//request, response 그대로 전달받음(MyServlet에서)
			String message = (String)request.getAttribute("msg");
			out.println(message);
		%>
		<p>넘겨받은 데이터: <%=message %></p>
		
		
	</div>
</body>
</html>