package com.ar2w.aron2wheels.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbUtil {
	
	private static String connectionUrl = "jdbc:mariadb://localhost:3306/aron2?user=root&password=toor";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(connectionUrl);
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

//	public static void main(String[] args) {
//		Connection connection = getConnection();
//		if (null == connection) {
//			System.out.println("Help. connection is null.");
//		} else {
//			System.out.println("A real connection!!!");
//		}
//
//	}

}
