package com.tenco.todo.repository;

import java.sql.Connection;

import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo {
	
	private DBHelper dbHelper;
	private Connection conn;
	
	
	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public void selet() {
		
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	

}
