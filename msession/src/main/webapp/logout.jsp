<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.invalidate(); // 세션 메모리에서 해제
response.sendRedirect("login.jsp"); // 페이지 이동

%>