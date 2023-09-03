package com.mystudy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonJDBCUtil {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	//private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String URL = "jdbc:oracle:thin:@192.168.18.31:1521:xe";
	private static final String USERS = "MYSTUDY";
	private static final String PASSWORD = "mystudypw";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USERS, PASSWORD);
		} catch (SQLException e) {
			System.out.println("[예외발생] : 접속 실패 " + e.getMessage());
		}
		return null;
		
	}	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {}
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {}
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {}
	}
	public static void close(Connection conn, Statement stmt) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {}
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {}
	}

}
