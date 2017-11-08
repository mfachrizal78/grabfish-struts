package com.service;

import java.util.List;

import com.model.User;
 
/**
 * @author Rizal
 *
 */
public interface UserService {
	void saveUser(User user);
	
	List<User> getUserList(); 
	
	User getUser(User user);
	
	User findByUsername(String username);
}
