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
		
		
		
		
	}

	public static void run() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Bank!\n [1] To register\n [2] To login\n");
		
		int choice = scan.nextInt();
		
		if(choice == 1) {
			register();
		} else if (choice == 2){
			//login();
			// In a sign in method, I would have to use a method from my UserService or my
			// DaoImpl class.....
			
			// I would have to query both the username AND the password, and make sure they match.
		}

	}

	

}
