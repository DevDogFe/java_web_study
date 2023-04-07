package com.tenco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tenco.dto.UserDTO;
import com.tenco.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;

	@Override
	public int createUser(UserDTO dto) {
		int resultRow = 0;
		String sql = " INSERT INTO users(email, password, isRemember, hobby) " + " VALUES (?, ?, ?, ?) ";
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getIsRemember());
			pstmt.setString(4, dto.getHobby());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}

	@Override
	public int createAnimal(UserDTO dto) {
		int resultRow = 0;
		try {
			for (int i = 0; i < dto.getLikedAnimal().length; i++) {
				String sql = " INSERT INTO animals(email, likedAnimal) " + " VALUES (?, ?) ";
				dbHelper = DBHelper.getInstance();
				conn = dbHelper.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getEmail());
				pstmt.setString(2, dto.getLikedAnimal()[i]);
				resultRow += pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				dbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}
}
