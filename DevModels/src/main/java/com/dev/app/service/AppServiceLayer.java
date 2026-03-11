package com.dev.app.service;

import java.util.List;

import com.dev.app.model.User;

public interface AppServiceLayer {
	
	public List<User> getAllUsers();
	public User getUserId(User user);
	public String insertUser(User user);
	public String updateUserRecord(User user);
	public String deleteUserRecord(User user);

}
