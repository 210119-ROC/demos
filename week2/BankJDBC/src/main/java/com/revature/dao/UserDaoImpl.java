package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Role;
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
		// PreparedStatement is a sub interface of Statment  that provides extra
		// security to prevent SQL injection.
		PreparedStatement stmt = conn.prepareStatement(sql);
			
			
		// Step 3b: Inject values to replace all the ? marks 
		stmt.setString(1, u.getUsername());
		stmt.setString(2, u.getPassword());
		stmt.setString(3, u.getFirstName());
		stmt.setString(4, u.getLastName());
		stmt.setString(5, u.getEmail());
		stmt.setInt(6, u.getRole().getId()); // this is returning the int value for the Role id of the Role object
		
			
		// Step 4: Execute the statement;
		return stmt.executeUpdate(); // this will return the number of statements executed (1)

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// otherwise we return 0 if we cannot insert
		return 0;
	}

	// this method will pull all records from our DB and store them in Objects in our Java applciation
	@Override
	public List<User> findAll() {
		// In this method we return ALL user objects
		
		// Hence, we need to create a List<User> at the top of the method
		List<User> allUsers = new ArrayList<User>();
		
		Connection conn = ConnectionUtil.getConnection();
		String sql = "SELECT * FROM users INNER JOIN roles ON users.role_id = roles.id";
		// This is returning BOTh user info and the name of their Role

		
		try {
			Statement stmt = conn.createStatement();

			// Special step for retrieving objects FROM the database
			// we read the values of each column by using a special iteration technique with a ResultSet
			
			// Steps 1 - 3 are sismilar to our first method
			/*
			 * EXCEPT, We must make sure that we're saving the data that we retrieve into User objects
			 * then we store those objects in the User ArrayList that we cretaeted above
			 */
			ResultSet rs = stmt.executeQuery(sql);
			
			// ResultSets are similar to iterators, so this while-loop will
			// iterate over every record that we obtian from the database;
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String pass = rs.getString("pass");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				int roleId = rs.getInt("role_id");
				String roleName = rs.getString("role_name");
			
				// No we use the data we just pulled to create a User object
				Role r = new Role(roleId, roleName);
				User u = new User(id, username, pass, firstName, lastName, email, r);
				
				// Now make sure to add it to our list of Users
				allUsers.add(u);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			// if something goes wrong, return an empty list
			return new ArrayList<User>();
		}

		// If everything goes well, return the allUsers arrayList
		return allUsers;
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
