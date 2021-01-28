package com.revature;

import java.sql.Connection;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.service.UserService;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();// UserDaoImpl is a TYPE of UserDao
		
		// Calling methods from the service layer allows us more abstraction
		// we can incorporate extra code into our Service layer
		UserService us = new UserService();
		
		Connection conn = ConnectionUtil.getConnection();
		
//		User u1 = new User("skywalker99", "lightsaber", "Luke", "Skywalker", "jedi@mail.com", new Role(1, "Admin"));
//		
//		System.out.println(dao.insert(u1)); // if we are successful, we return a 1-- if not,we return a 0;
		
		System.out.println(us.returnAllUsers());
		
		
	}

}
