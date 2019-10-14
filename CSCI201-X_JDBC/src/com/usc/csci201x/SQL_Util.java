package com.usc.csci201x;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_Util {
	
	public static final String credentials = "jdbc:mysql://localhost:3306/CSCI201_FALL2019?user=root&password=123123&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static Connection connection = null;
	
	public static void initConnection() {
		if (connection != null) {
			System.out.println("[WARN] Connection has already been established.");
			return;
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(credentials);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addUser(String username, String password) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO UserRegistry(username, pw) VALUES (?, ?)");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addVehicle(String details) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO VehicleRegistry(details) VALUES (?)");
			preparedStatement.setString(1, details);
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addVehicleToUser(int uid, int vid, String notes) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO VehicleLUT(uid, vid, notes) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, uid);
			preparedStatement.setInt(2, vid);
			preparedStatement.setString(3, notes);
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int getUID(String username) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM UserRegistry WHERE username=?");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int UID = resultSet.getInt("uid");
				preparedStatement.close();
				resultSet.close();
				return UID;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int getVID(String details) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM VehicleRegistry WHERE details=?");
			preparedStatement.setString(1, details);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int UID = resultSet.getInt("vid");
				preparedStatement.close();
				resultSet.close();
				return UID;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
