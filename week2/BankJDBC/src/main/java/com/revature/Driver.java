package com.revature;

import java.sql.Connection;

import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		Connection conn = ConnectionUtil.getConnection();

	}

}
