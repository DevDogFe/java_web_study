<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	if(username != null && password != null) {
		if(username.equals("admin") && password.equals("1234")){
			session.setAttribute("username", username);
			response.sendRedirect("index.jsp");
		} else{
			out.println("<script> alert('로그인에 실패하였습니다.'); location.href='login.jsp' </script>");
			
		}
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		height: 100vh;
	}
	
	form{
		display: flex;
		flex-direction: column;
	}
	
	/*속성 선택자 - 태그[속성값 = '값']*/
	input[type="text"], 
	input[type="password"], 
	input[type="submit"]{
		padding: 8px;
		border-radius: 5px;
		border: 1px solid #ccc;
	}
	
	input[type="submit"]{
		background-color: #007bff;
		color:#fff;
		font-size: 16px;
		border: none;
		cursor: pointer;
		margin-top: 10px;
	}
	input[type="submit"]:hover{
		background-color: #005bff;
		
	}
	label{
		margin-bottom: 5px;
		font-weight: bold;
	}
</style>
</head>
<body>
	<h1>Login Page</h1>
	
	<form action="login.jsp" mothod = "post">
		<label for="username">Username: </label>
		<input type="text" name="username" id="username" required="required">
		<label for="password">Password: </label>
		<input type="password" name="password" id="password" required="required">
		<input type="submit" value="Login">
	</form>
</body>
</html>