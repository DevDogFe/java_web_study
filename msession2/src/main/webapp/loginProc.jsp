<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

String username = request.getParameter("username");
String password = request.getParameter("password");

if(username.equals("admin") && password.equals("1234")){
	session.setAttribute("username", username);
	response.sendRedirect("index.jsp");
} else {
	out.print("<script> alert('로그인에 실패하였습니다. 아이디와 비밀번호를 확인해주세요.'); location.href='login.jsp' </script>");
}
%>