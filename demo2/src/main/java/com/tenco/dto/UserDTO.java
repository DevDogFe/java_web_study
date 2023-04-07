package com.tenco.dto;

public class UserDTO {
	private String email;
	private String password;
	private String isRemember;
	private String hobby;
	private String[] likedAnimal;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsRemember() {
		return isRemember;
	}

	public void setIsRemember(String isRemember) {
		this.isRemember = isRemember;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String[] getLikedAnimal() {
		return likedAnimal;
	}

	public void setLikedAnimal(String[] likedAnimal) {
		this.likedAnimal = likedAnimal;
	}

	// createAnimal()용
	public UserDTO(String email, String[] likedAnimal) {
		super();
		this.email = email;
		this.likedAnimal = likedAnimal;
	}

	// createUser()용
	public UserDTO(String email, String password, String isRemember, String hobby) {
		super();
		this.email = email;
		this.password = password;
		if (isRemember == null) {
			isRemember = "";
		} else {
			this.isRemember = isRemember;
		}
		this.hobby = hobby;
	}

	public UserDTO(String email, String password, String isRemember, String hobby, String[] likedAnimal) {
		super();
		this.email = email;
		this.password = password;
		this.isRemember = isRemember;
		this.hobby = hobby;
		this.likedAnimal = likedAnimal;
	}

}
