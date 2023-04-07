package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {

	ArrayList<TodoDTO> select();

	
	int insert(String title, String description, int category_id);
	
	int insert(String title, String description, int priority, int category_id);
	
	int update(int id, String title, String description, int priority, int category_id);
	
	int delete(int id);
	
}
