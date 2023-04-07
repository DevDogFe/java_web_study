<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>


.flex-container{
	display: flex; 
	width: 150px;
	
}

.flex-container :first-child{
	flex: 1;
	
}
.flex-container :last-child{
	flex: 4;
	
}

.flex-items{
	background-color: #345;
	text-align: center;
	padding: 5px;
	border-radius: 5px;
	margin: 3px;
	color: #def;'
}

#title div{
	background-color: #543;
	font-weight: bold;
}
</style>
<body>
	<h2>Category List</h2>
	<%-- <%request.getAttribute("list") %> --%>
		<div class = "flex-container" id="title">
			<div class="flex-items">ID</div>
			<div class="flex-items">Name</div>
		</div>
	<c:forEach var="category" items="${list }">
		<div class = "flex-container">
			<div class="flex-items">${category.id}</div>
			<div class="flex-items">${category.name}</div>
		</div>
	</c:forEach>
	</table>
</body>
</html>