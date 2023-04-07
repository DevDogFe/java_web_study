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
	<h1>숫자야구 게임</h1>
	<%
	
	int[] answers = new int[3];
	int[] guesses = new int[3];
	boolean isRight = false;
	answers[0] = Integer.parseInt(request.getParameter("answer1"));
	answers[1] = Integer.parseInt(request.getParameter("answer2"));
	answers[2] = Integer.parseInt(request.getParameter("answer3"));
	guesses[0] = Integer.parseInt(request.getParameter("guess1"));
	guesses[1] = Integer.parseInt(request.getParameter("guess2"));
	guesses[2] = Integer.parseInt(request.getParameter("guess3"));
	if (answers == guesses) {
		out.println("<p>정답입니다!</p>" + "<p>정답 숫자: " + answers[0] + ", " + answers[1] + ", " + answers[2] + "</p>");
	} else {
		out.println("<p>오답입니다! 기회를 모두 사용하셨습니다.</p>");
		
	}
	%>
	<div>
		<a href="/demo3/tag6.jsp">다시하기</a>
	</div>
	



</main>

<jsp:include page="/layout/footer.jsp" />
