package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;

// The service layer is created to reinforce "business logic"
/*
 * All interaction with the DAO will be through our service layer.  
 * Business logic, is nothing more than code that is strictly in java, and doesn't
 * incorporate any SQL statements, or more complex logic that pertains to our database
 * 
 * Most other layers (like our ConnectionUtil, or our DAO interface and Implementation are
 * called "boilerplate code" -- The service layer is where the most creativity is involved.
 */

public class UserService {
	
	// calling the interface......// then the class that implements it to create a DAO object
	private UserDao dao = new UserDaoImpl();
	
	// the starting place before you get creative, is to incorporate all CRUD methods.
	
	
	public int add(User u) {
		
		return dao.insert(u);
	}
	
	public List<User> returnAllUsers() {
		
		return dao.findAll();
	}
	
	
	

}
