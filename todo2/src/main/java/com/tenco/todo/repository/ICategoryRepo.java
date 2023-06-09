package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;

public interface ICategoryRepo {

	ArrayList<CategoryDTO> select();
	
	CategoryDTO select(int id);

	int insert(String name);

	int update(int id, String name);
	
	int delete(int id);


}
