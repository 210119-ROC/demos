package com.revature;

import java.sql.Connection;
import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.service.UserService;


public class Driver {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();// UserDaoImpl is a TYPE of UserDao
		
		// Calling methods from the service layer allows us more abstraction
		// we can incorporate extra code into our Service layer
		UserService us = new UserService();
		
//		Connection conn = ConnectionUtil.getConnection();
		
//		User u1 = new User("skywalker99", "lightsaber", "Luke", "Skywalker", "jedi@mail.com", new Role(1, "Admin"));
//		
//		System.out.println(dao.insert(u1)); // if we are successful, we return a 1-- if not,we return a 0;
		
		//System.out.println(us.returnAllUsers());
		
		System.out.println(us.returnAUserById(2));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the galactic bank!\n Please enter your username");
		String inputUsername = scan.nextLine();
		System.out.println("Please enter your password:\n");
		String inputPassword = scan.nextLine();
		System.out.println("Please enter your first name:\n");
		String inputFirstName = scan.nextLine();
		System.out.println("Please enter your last name\n");
		String inputLastName = scan.nextLine();
		System.out.println("Please enter you email\n");
		String inputEmail = scan.nextLine();
		System.out.println("Are you a Admin or an Employee?\n Press [1] for Admin\n Press [2] for Employee:\n");
		
		int roleId;
		
		if (scan.nextInt() == 1) {
			roleId = 1;
		} else {
			roleId = 2;
		}
		
		Role r = new Role(roleId);
		if (r.getId() == 1) {
			r.setName("Admin");
		} else {
			r.setName("Employee");
		}
		
		User u = new User(inputUsername, inputPassword, inputFirstName, inputLastName, inputEmail, r);
		
		System.out.println(dao.insert(u));

		System.out.println(us.returnAllUsers());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
