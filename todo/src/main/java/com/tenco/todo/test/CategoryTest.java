package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.utils.DBHelper;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public CategoryTest() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	// todo - DB 연결 확인 후 삭제 예정
    	// DBHelper dbHelper = new DBHelper();
    	// dbHelper.getConnection();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		CategoryDAO dao = new CategoryDAO();
		// 주소 설계
		// http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo/cTest");
		} else {
			ArrayList<CategoryDTO> resultList = dao.select();
			request.setAttribute("list", resultList);
			request.getRequestDispatcher("test/categoryList.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		// method - post 요청시 동작
		String name = request.getParameter("name");
		CategoryDAO categoryDAO = new CategoryDAO();
		
		// 쿼리 파라미터 방식으로 데이터 받기
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		int responseCount = 0;
		
		if(action.equals("update")) {
			responseCount = categoryDAO.update(id, name);
			out.print("수정된 갯수 확인" + responseCount);
			
		} else if(action.equals("insert")) {
			responseCount = categoryDAO.insert(name);
			out.print("저장된 갯수 확인" + responseCount);
			
		} else if(action.equals("delete")) {
			responseCount = categoryDAO.delete(id);
			out.print("삭제된 갯수 확인" + responseCount);
			
		}
		
	}

}
