package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class UserDaoImpl implements UserDao{
/*
 * DAO = Data Access Object is responsible for handling all logic that interacts with our database
 * 
 * We use a DAO to separate business logic from our persistence layer (DB logic like SQL statements).
 * 
 * That way, other parts of our application can interact with the DB without needing to think
 * about this complex logic.
 */
	
	@Override
	public int insert(User u) {
		
		try {
		// Step 1. Get a connection using ConnectionUtil
		// import Connection from java.sql
		Connection conn = ConnectionUtil.getConnection();
		
		
		// Step 2. Define our SQL statmentts to perform an action on our DB
		String columns = "username, pass, first_name, last_name, email, role_id";
		String sql = "INSERT INTO users ("+ columns +") VALUES (?, ?, ?, ?, ?, ?)";
		// The ?'s are placeholders for input values
		// They work for PreparedStatements, which are designed to protect us from SQL injection 
		
		// Step 3a: Obtain Statement Object

			PreparedStatement stmt = conn.prepareStatement(sql);
			
			
		// Step 3b: Inject values to replace all th ? marks
			
			
		// Step 4: Execute the statement;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
