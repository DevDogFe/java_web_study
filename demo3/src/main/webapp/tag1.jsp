<%@page import="java.util.Date"%>
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

main pre{
	height: 100%;
	border: 1px solid black;
	padding: 20px;
}
</style>
<main>
	<pre>
	<%	%> <-- 스크립트릿(scriptlet, HTML 랜더링 후 보이지 않음) 
	<%=""%> <-- 표현식(expression, HTML 랜더링 후 보이지 않음) 
	<%-- --%> <-- jsp 주석 (HTML 랜더링 후 보이지 않음, 소스보기로도 확인 불가) 
	<!-- html 주석은 소스보기로 확인 가능하다. -->
	
	--------------------------------------------------
	스크립트 릿은 html과 Java 코드를 혼합하여 사용할 수 있다.
	<% new Date().toString(); %>
	현재시간: <%= new Date().toString() %>
	--------------------------------------------------
	사용방법
	스크립트 릿 : <% %> JSP 페이지에 코드를 실행할 수 있다.
	표현식: <%= "" %> JSP 페이지에서 Java코드의 결과값 출력할 수 있다.
	
	출력결과
	스크립트 릿 : 출력 결과를 지정하지 않으면 아무런 출력이 되지 않는다.
	표현식: Java 결과값을 출력한다.
	</pre>
</main>

<jsp:include page="/layout/footer.jsp" />
