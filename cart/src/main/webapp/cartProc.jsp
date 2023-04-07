<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String[] fruits = request.getParameterValues("fruit");
String isDelete = request.getParameter("delete");
if (isDelete == null) {
	if (fruits != null && fruits.length > 0) {
		for (String fruit : fruits) {
	Cookie cookie = new Cookie(fruit, fruit);
	response.addCookie(cookie);
		}
		response.sendRedirect("cart.jsp");
	} else {
		out.println("<script> alert('장바구니에 담긴 물품이 없습니다.'); location.href='index.jsp' </script>");
	}
} 
// else {
//	Cookie[] cookies = request.getCookies();
//	if(cookies != null){
//		for(int i = 0; i < ){
//				if(cookie.getName())
//		}
//	}
//				cookie.setMaxAge(0);
//				response.addCookie(c);
// }

%>