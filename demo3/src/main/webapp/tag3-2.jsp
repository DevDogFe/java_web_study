<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp" />
<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: center;
	justify-content: flex-start;
}

main pre {
	height: 100%;
	border: 1px solid black;
	padding: 20px;
}

table {
	width: 400px;
	font-size: 14px;
	margin: 20px;
	border-collapse: collapse;
}

td{
	background-color: #f2f2f2;
	border: 1px solid #ccc;
	text-align: center;
}
</style>
<main>
	<h1>구구단 예제</h1>
	<% for(int i = 2; i < 10; i++){ %>
		<span style="font-weight: bold"><%=i %> 단 시작</span> 
		<% for(int j = 1; j < 10; j++){ %>
		<%=i + " X " + j + " = " + (i * j) %>
		<br>
		<% } %>
		<br>
	<% } %>
	<br>
	<pre>
스크립트릿과 표현식을 잘 구분해봅시다.
	</pre>
</main>

<jsp:include page="/layout/footer.jsp" />
