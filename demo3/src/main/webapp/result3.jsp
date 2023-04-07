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
		int strikeCount = 0;
		int ballCount = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == guesses[i])
		strikeCount++;
			isRight = true;
		}
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < guesses.length; j++) {
		if (i != j && answers[i] == guesses[j])
			ballCount++;
			}
		}
		out.println("<p>오답입니다! " + strikeCount + "S" + ballCount + "B</p>" + "<p>입력된 숫자: " + guesses[0] + ", " + guesses[1]
		+ ", " + guesses[2] + "</p>");
		if (!isRight) {
	}
	%>
	<br>
	<div>
		
		<p>1 ~ 9의 숫자를 3개 입력해주세요</p>
	<form action="/demo3/result4.jsp" method="post">
		<input type="hidden" name="answer1" value="<%=answers[0]%>"> <input
			type="hidden" name="answer2" value="<%=answers[1]%>"> <input
			type="hidden" name="answer3" value="<%=answers[2]%>"> <input
			type="number" name="guess1" required="required" min="1" max="9"> <input
			type="number" name="guess2" required="required" min="1" max="9"> <input
			type="number" name="guess3" required="required" min="1" max="9"> <input
			type="submit" value="정답제출">
	</form>
	</div>
		<%
		}
		%>



</main>

<jsp:include page="/layout/footer.jsp" />
