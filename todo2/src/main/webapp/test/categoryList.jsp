<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
td{
	text-align: center;
	padding: 5px;
}
</style>
<body>
	<h2>Category List</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
		
		<c:forEach var="category" items="${list}">
		<tr>
			<td>${category.id}</td>		
			<td>${category.name}</td>		
			<td><button onclick="location.href='/todo2/cTest?action=delete&cid=${category.id}'">delete</button></td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>