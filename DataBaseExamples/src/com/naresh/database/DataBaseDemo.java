package com.naresh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.10.124:3306/user", "vrmuser",
				"vrmuser");
		String sqlQuery = "insert into user.user(accountId,disabled,maxsessions,occupied,occupiednumrecordings,occupiedBytes,quota,scheduled,role,username)values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sqlQuery);
		for(int i=0;i<=100000;i++) {
			ps.setString(1, "defaultaccount");
			ps.setInt(2, 0);
			ps.setInt(3, -1);
			ps.setInt(4, 0);
			ps.setInt(5, 0);
			ps.setInt(6, 0);
			ps.setInt(7, 0);
			ps.setInt(8, 0);
			ps.setString(9, "user");
			ps.setString(10, "userId"+i);
			System.out.println("=====i===="+i);
			ps.execute();
		}
		
		System.out.println("Completed the transactions");

	}

}
