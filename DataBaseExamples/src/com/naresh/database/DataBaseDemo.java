package com.naresh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdvr", "root", "");
		String sqlQuery = "insert into user.user(accountId,disabled,maxsessions,occupied,occupiednumrecordings,occupiedBytes,quota,scheduled,role,username)values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sqlQuery);
		System.out.println("====Transaction starts======");
		for (int i = 0; i <= 16; i++) {
			ps.setString(1, "defaultaccount");
			ps.setInt(2, 0);
			ps.setInt(3, -1);
			ps.setInt(4, 0);
			ps.setInt(5, 0);
			ps.setInt(6, 0);
			ps.setInt(7, 0);
			ps.setInt(8, 0);
			ps.setString(9, "user");
			ps.setString(10, "userId" + i);
			ps.execute();
		}
		System.out.println("=====User Insertion is Succssful======");

		String scheduleSqlQuery = "insert into cdvr.schedule(channelId,startTime,endTime,status,statusDetail)values(?,?,?,?,?)";
		PreparedStatement ps0 = connection1.prepareStatement(scheduleSqlQuery);
		for (int i = 0; i <=16; i++) {
			ps0.setString(1, "channelid1" + i);
			ps0.setLong(2, Long.parseLong("155139840000" + i));
			ps0.setLong(3, Long.parseLong("155139840030" + i));
			ps0.setString(4, "completed");
			ps0.setString(5, "assetizationFailed");
			ps0.execute();

	}
	System.out.println("Schedule Insertion successful");	
		
		String recordSqlQuery = "insert into cdvr.records(programId,scheduleId,userId,name,startTime,duration,status,protected,channelId,channelName,statusReason)values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps1 = connection1.prepareStatement(recordSqlQuery);
		for (int i = 0; i <=16; i++) {
				ps1.setString(1, "programid" + i);
				ps1.setString(2, "scheduleid" + i);
				ps1.setString(3, "userId" + 1);
				ps1.setString(4, "testname");
				ps1.setLong(5, Long.parseLong("155139840000" + i));
				ps1.setInt(6, 60);
				ps1.setString(7, "Completed");
				ps1.setInt(8, 0);
				ps1.setString(9, "123Channelname");
				ps1.setString(10, "ChannelName123");
				ps1.setString(11, "assetizationFailed");
				ps1.execute();

		}

		System.out.println("Completed the transactions");

	}

}
