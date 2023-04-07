<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Arrays"%>
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
</style>
<main>
	<h1>숫자야구 게임</h1>
	<%
	int[] nums = new int[3];
	while ((nums[0] == nums[1]) || (nums[0] == nums[2]) || (nums[1] == nums[2])) {
		nums[0] = (int) (Math.random() * 9) + 1;
		nums[1] = (int) (Math.random() * 9) + 1;
		nums[2] = (int) (Math.random() * 9) + 1;
	}
	%>

	<p>1 ~ 9의 숫자를 3개 입력해주세요</p>
	<form action="/demo3/result2.jsp" method="post">
		<input type="hidden" name="answer1" value="<%=nums[0]%>"> <input
			type="hidden" name="answer2" value="<%=nums[1]%>"> <input
			type="hidden" name="answer3" value="<%=nums[2]%>"> <input
			type="number" name="guess1" required="required" min="1" max="9"> <input
			type="number" name="guess2" required="required" min="1" max="9"> <input
			type="number" name="guess3" required="required" min="1" max="9"> <input
			type="submit" value="정답제출">
	</form>
</main>

<jsp:include page="/layout/footer.jsp" />
