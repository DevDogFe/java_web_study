package com.tenco.todo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "todo";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "1234";
	
	private Connection conn;
	
	public Connection getConnection() {
		
		if(conn == null) {
			// ? <- 쿼리 파라미터
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
				System.out.println("DB연결 완료");
			} catch (Exception e) {
				System.out.println("DB연결 오류");
			}
		}
		
		return conn;
	}
	
	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
