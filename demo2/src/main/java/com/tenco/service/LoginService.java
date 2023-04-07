package com.tenco.service;

import com.tenco.dao.UserDAO;
import com.tenco.dto.UserDTO;

public class LoginService {
	
	private UserDAO userDAO;
	
	public LoginService() {
		userDAO = new UserDAO();
	}
	
	public int createUserByLogin(UserDTO dto){
		int resultRow = 0;
		
		if(dto.getEmail() != null && dto.getPassword() != null && dto.getHobby() != null) {
			resultRow = userDAO.createUser(dto);
			resultRow += userDAO.createAnimal(dto);
			
		} else {
			System.out.println("필수값 없음");
		}
		
		return resultRow; 
	}
}
