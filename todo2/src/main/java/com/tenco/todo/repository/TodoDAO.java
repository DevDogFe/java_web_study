package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo {
	
	private DBHelper dbHelper;
	private Connection conn;
	
	
	
	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	

	@Override
	public ArrayList<TodoDTO> select() {
		ArrayList<TodoDTO> list = new ArrayList<>();
		
		String strQuery = " SELECT t.id, t.title, t.description, t.priority, t.completed, t.createdAt, t.category_id, c.name FROM todolist AS t "
				+ " LEFT JOIN category AS c ON t.category_id = c.id ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(strQuery);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				TodoDTO todoDTO = new TodoDTO(rs.getString("title"), rs.getString("description"), rs.getInt("category_id"));
				todoDTO.setId(rs.getInt("id"));
				todoDTO.setPriority(rs.getInt("priority"));
				todoDTO.setCompleted(rs.getInt("completed"));
				todoDTO.setCreatedAt(rs.getString("createdAt"));
				list.add(todoDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return list;
	}
	




	@Override
	public int insert(String title, String description, int category_id) {
		int resultCount = 0;
		String queryStr = " INSERT INTO todolist(title, description, category_id) VALUES"
				+ "(?, ?, ?) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setInt(3, category_id);
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}


	@Override
	public int insert(String title, String description, int priority, int category_id) {
		int resultCount = 0;
		String queryStr = " INSERT INTO todolist(title, description, priority, category_id) VALUES"
				+ "(?, ?, ?, ?) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setInt(3, priority);
			pstmt.setInt(4, category_id);
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}


	@Override
	public int update(int id, String title, String description, int priority, int category_id) {
		int resultCount = 0;
		String queryStr = " UPDATE todolist SET title = ?, description = ?, priority = ?, category_id = ? WHERE id = ? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setInt(3, priority);
			pstmt.setInt(4, category_id);
			pstmt.setInt(5, id);
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}


	@Override
	public int delete(int id) {
		int resultCount = 0;
		
		String queryStr = " DELETE FROM todolist WHERE id = ? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, id);
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}

}
