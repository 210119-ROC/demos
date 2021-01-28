package com.revature;

import java.sql.Connection;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl(); // UserDaoImpl is a TYPE of UserDao
		
		Connection conn = ConnectionUtil.getConnection();
		
		User u1 = new User("skywalker99", "lightsaber", "Luke", "Skywalker", "jedi@mail.com", new Role(1, "Admin"));
		
		System.out.println(dao.insert(u1)); // if we are successful, we return a 1-- if not,we return a 0;
	}

}
