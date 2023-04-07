<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp" />
<style>
main {
	height: 300px;
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: flex-start;
	justify-content: flex-start;
}

h1 {
	margin-top: 30px;
	margin-bottom: 10px;
	font-size: 28px;
}

main pre {
	height: 100%;
	border: 1px solid black;
	padding: 20px;
}

a {
	text-decoration: none;
	color: black;
}

a:visited {
	color: black;
}
</style>
<main>
	<h1>덧셈 게임</h1>
	<%
	if (request.getParameter("answer") != null) {
		int answer = Integer.parseInt(request.getParameter("answer"));
		int guess = Integer.parseInt(request.getParameter("guess"));
		if (answer == guess) {
			out.println("<p>정답입니다!</p>");
		} else {
			out.println("<p>오답입니다! 정답은 " + answer + "입니다. 다시 도전해 보세요.</p>");
		}
	}
	%>
	<br>
	<div>
		<a href="/demo3/tag5.jsp">문제 다시 풀어보기</a>
	</div>

</main>

<jsp:include page="/layout/footer.jsp" />
