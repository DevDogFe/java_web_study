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
	<h1>별 피라미드</h1>
	<%= createStarPyramid() %>
	<br>
	<pre>
스크립트릿과 표현식을 잘 구분해봅시다.
	</pre>
</main>
<main>
	<%!
		String createStarPyramid(){
			String stars = "";
			for(int i = 0; i < 10; i++){
				for(int k = 0; k < 10 - i; k++){
					stars += "&nbsp;";
				}
				for(int j = 0; j < 2*i +1; j++){
					stars += "*";
				}
				stars += "<br>";
			}
			return stars;		
		}
		
	%>
</main>

<jsp:include page="/layout/footer.jsp" />
