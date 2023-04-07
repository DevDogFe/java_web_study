package com.tenco.controller;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.dto.UserDTO;
import com.tenco.service.LoginService;

@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginProc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
	}

	// method: post(from form태그)
	// http://localhost:8080/demo2/loginProc
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		String[] likes = request.getParameterValues("like"); // 배열 처리
		System.out.println(email);
		System.out.println(password);
		System.out.println(isRemember);
		System.out.println(hobby);
		if(likes != null) {
			for (String string : likes) {
				System.out.println("like: " + string);
			}
		}
		int resultRow = new LoginService().createUserByLogin(new UserDTO(email, password, isRemember, hobby, likes));
		System.out.println(resultRow);
	}

}
