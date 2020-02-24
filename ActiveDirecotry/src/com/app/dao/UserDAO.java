package com.app.dao;

import java.util.List;

import com.model.User;

public interface UserDAO {
	
	public void addUser(User user);

	public List<User>listar();
	
	
}
