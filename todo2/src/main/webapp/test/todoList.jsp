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
	width: 1000px;
	
}

.flex-items{
	background-color: #345;
	text-align: center;
	padding: 5px;
	border-radius: 5px;
	margin: 3px;
	color: #def;
}
.item1{
	flex: 1;
}
.item2{
	flex: 3;
}
.item3{
	flex: 5;
}
.item4{
	flex: 2;
}
.item5{
	flex: 3;
}
.item6{
	flex: 5;
}
.item7{
	flex: 3;
}
.item8{
	flex: 2;
}

#header div{
	background-color: #543;
	font-weight: bold;
}

.flex-con{
	display: flex;
	width: 1000px;
}
.flex-con div{
	flex: 1;
	display: flex;
	flex-direction: column;
	padding: 10px;
}
.flex-con table{
	flex: 1;
}

td{
	text-align: center;
	padding: 5px;
}

.flex-con input{
	font-size: 16px;
	margin-top: 5px;
}

#save-button{
	margin-top: 75px;
}
form :last-child{
	display: block;
}

input[type="submit"]{
	border: none;
	background: #454;
	color: #eee;
	height: 35px;
	width: 300px;
	margin-left: 30px;
	border-radius: 10px;
	box-shadow: 2px 2px 5px rgba(0,0,0,0.8);
	cursor: pointer;
}




</style>
<body>
	<h2>Category List</h2>
	<div class="flex-container" id="header">
		<div class="flex-items item1">id</div>
		<div class="flex-items item2">title</div>
		<div class="flex-items item3">description</div>
		<div class="flex-items item4">priority</div>
		<div class="flex-items item5">completed</div>
		<div class="flex-items item6">createdAt</div>
		<div class="flex-items item7">category_id</div>
		<div class="flex-items item8">delete</div>
	</div>

	<c:forEach var="todo" items="${todoList}">
		<div class="flex-container">
			<div class="flex-items item1">${todo.id}</div>
			<div class="flex-items item2">${todo.title}</div>
			<div class="flex-items item3">${todo.description}</div>
			<div class="flex-items item4">${todo.priority}</div>
			<div class="flex-items item5">${todo.completed}</div>
			<div class="flex-items item6">${todo.createdAt}</div>
			<div class="flex-items item7">${todo.categoryDTO.id} ${todo.categoryDTO.name}</div>
			<div class="flex-items item8">
				<button	onclick="location.href='/todo2/todoTest?action=delete&cid=${todo.id}'">delete</button>
			</div>
		</div>
	</c:forEach>
	<div class="flex-con">
		<div>
			<h1>TodoList 기록</h1>
			<form action="/todo2/todoTest?action=insert" method="post">
				<div>
					<label>title</label> <input type="text" name="title" required="required">
				</div>
				<div>
					<label>description</label> <input type="text" name="description">
				</div>
				<div>
					<label>categoryId</label> <input type="number" name="categoryId" required="required">
				</div>
				<div>
					<label>priority</label> <input type="number" name="priority" required="required" value="0">
				</div>
				<div>
					<input type="submit" value="카테고리 저장" id="save-button">
				</div>
			</form>
		</div>
		<div>
			<h1>TodoList 수정</h1>
			<form action="/todo2/todoTest?action=update" method="post">
				<div>
					<label>id</label> <input type="number" name="id" required="required">
				</div>
				<div>
					<label>title</label> <input type="text" name="title" required="required">
				</div>
				<div>
					<label>description</label> <input type="text" name="description">
				</div>
				<div>
					<label>categoryId</label> <input type="number" name="categoryId" required="required">
				</div>
				<div>
					<label>priority</label> <input type="number" name="priority" required="required" value="0">
				</div>
				<div>
					<input type="submit" value="카테고리 수정">
				</div>
			</form>
		</div>
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
				</tr>
				
				<c:forEach var="category" items="${categoryList}">
				<tr>
					<td>${category.id}</td>		
					<td>${category.name}</td>		
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>