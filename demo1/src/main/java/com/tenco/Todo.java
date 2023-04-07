package com.tenco;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo")
public class Todo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Todo() {
        System.out.println(" >> 생성자 <<");
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println(">> i n i t <<");
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	System.out.println(">> s e r v i c e <<");
    }
    
    @Override
    public void destroy() {
    	System.out.println(">> d e s t r o y <<");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
