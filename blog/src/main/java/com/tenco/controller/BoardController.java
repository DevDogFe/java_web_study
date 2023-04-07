package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// URL: http://localhost:8080/blog/index.html
// URI: http://localhost:8080/blog/boardcontroller
@WebServlet("/boardcontroller")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();
    }

    // GET, http://localhost:8080/blog/boardcontroller?name=kim
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BoardController 동작");
		System.out.println("contextPath: " + request.getContextPath());
		System.out.println("cookies: " + request.getCookies());
		// JSESSIONID 겟은 사용자가 웹 서버에 최초 요청하고 응답시에 값을 담아 보낸다
		System.out.println("session: " + request.getSession());
		System.out.println("parameterNames: " + request.getParameterNames());
		System.out.println("test: " + request.getParameter("name"));
		
		
		response.addCookie(new Cookie("myCookie", "asd123"));
		response.getStatus();
		response.sendRedirect("/usercontroller");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	

}
