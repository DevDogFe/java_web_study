package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		//http://localhost:8080/inc?name=홍길동&pw=1234
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		System.out.println(username + " / " + pw);
		// path: URI(URL) 개념
		// docBase = 폴더경로 -> 루트경로: webapp - WEB-INF - index.jsp
		// 보안상 바로 접근 할 수 없어서 forward 방식으로 처리를 한다.
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
		// 1. 콘솔에 한글 안깨짐
		// 2. 응답시 한글 깨짐
		//response.getWriter().write(username + " / " + pw);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html; charset=UTF-8");
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		System.out.println(username + " / " + pw);
		PrintWriter out = response.getWriter();
		out.write(username + "/" + pw);
	}

}
