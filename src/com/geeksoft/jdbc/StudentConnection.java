package com.geeksoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentConnection {
	
	public static void main(String[] args) {
		try {

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","system","Sree533633");
			System.out.println("Successfully connected: " +conn.toString());
		} catch (Exception e) {
			System.out.println("Exception getting the connection." +e);
		}
		
	}
	
}
