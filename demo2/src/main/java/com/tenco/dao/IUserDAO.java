package com.tenco.dao;

import com.tenco.dto.UserDTO;

public interface IUserDAO {
	
	int createUser(UserDTO dto);

	int createAnimal(UserDTO dto);
}
