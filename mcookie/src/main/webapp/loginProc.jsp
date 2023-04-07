<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// form 태그로 넘어오는 값을 jsp파일에서 파싱하는 기술
// form 태그에 MIME TYPE = application/x-www...

String inputId = request.getParameter("userId");
String inputPwd = request.getParameter("password");
String remember = request.getParameter("remember");

// remember 값에 따라 쿠키 사용하여 로직 작성

if (remember != null) {
	// 쿠키 생성 - 생성자 매개변수: key, 값
	Cookie cookie = new Cookie("userId", inputId); // 쿠키 생성
	cookie.setMaxAge(60 * 60 * 24 * 30); // 30일간 유지
	response.addCookie(cookie);
} else {
	// 쿠키 삭제 - remember에 체크 안한 상황
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			if(c.getName().equals("userId")){
				c.setMaxAge(0);
				response.addCookie(c);
				break;
			}
		}
	}
}

response.sendRedirect("login.jsp");
%>