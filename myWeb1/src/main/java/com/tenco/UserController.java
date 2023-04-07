package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/uc")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
        System.out.println("UserController 생성자 호출");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserController doGet 메서드 호출");
		PrintWriter out = response.getWriter();
		// HTTP 메세지 헤더에 정의
		// ContentType --> text/html. application/json
		// ContentType: 응답 보낼 데이터타입의 형식
		// 웹 표준기술인 MIME TYPE이라는 것이 정해져있다.
		response.setContentType(getServletInfo());
	}

	// 주소 경로는 똑같지만 METHOD 선정에 따라 구분할 수 있다. --> 서버는
	// http://localhost:8080/myWeb1/uc
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Method 방식 중 POST 요청 방식을 확인하고 응답 처리해보기");
		// MIME TYPE : text/plain
		// Mike 문자열 응답처리하기
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write("MIKE~");
		String str = request.getReader().readLine();
		System.out.println(str);
	}

}
