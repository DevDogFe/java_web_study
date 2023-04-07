package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// JSON 형식으로 name = 홍길동, age =10 이라는 값 리턴
		String str = " {\"name\": \"홍길동\",\"age\": 10} ";
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(str);
		
	}

	// METHOD: POST, http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ?? 연산을 해서 응답처리
		System.out.println("확인");
		// 요청시에 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("Name");
		String pwd = request.getParameter("Password");
		System.out.println("name: " + name);
		System.out.println("pwd: " + pwd);
		
		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().write("이름과 비밀번호 확인");
		
	}

}
