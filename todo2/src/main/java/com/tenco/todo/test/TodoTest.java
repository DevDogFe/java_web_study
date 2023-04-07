package com.tenco.todo.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodoTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		TodoDAO dao = new TodoDAO();
		CategoryDAO categoryDAO = new CategoryDAO();
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo2/todoTest");
		} else {
			ArrayList<TodoDTO> resultList = dao.select();
			request.setAttribute("todoList", resultList);
			ArrayList<CategoryDTO> categoryList = categoryDAO.select();
			request.setAttribute("categoryList", categoryList);
			request.getRequestDispatcher("test/todoList.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		TodoDAO dao = new TodoDAO();
		int resultRow = 0;
		String action = request.getParameter("action");
		String title = request.getParameter("title");
		String description = request.getParameter("description") + "";
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		int priority = Integer.parseInt(request.getParameter("priority"));
		if("insert".equals(action)) {
			dao.insert(title, description, priority, categoryId);
		} else if("update".equals(action)){
			int id = Integer.parseInt(request.getParameter("id"));
			dao.update(id, title, description, priority, categoryId);
		}
		response.sendRedirect("/todo2/todoTest");
	}

}
