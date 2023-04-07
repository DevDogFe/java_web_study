<%@page import="com.tenco.todo.dto.CategoryDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loop Example</title>
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
<c:set var="count" value="0"/>
<!-- 반복문 사용
p태그 -->
<c:forEach var = "category" items="${list}">
<c:out value="${count}"/>
<c:set var="count" value="${count +1}"/>
	
</c:forEach>



</body>
</html>