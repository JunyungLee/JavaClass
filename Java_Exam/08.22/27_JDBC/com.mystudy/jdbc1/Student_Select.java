package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Select {

	public static void main(String[] args) {
		//JDBC 이용한 DB 연동 프로그래밍 작성 절차
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL 문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리, select 이후 데이터 작업처리 필수 
		//5. 클로징 처리에 의한 자원 반납
		//--------------------------------------
		
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">>드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!"+ e.getMessage());
		}
			
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"MYSTUDY", "mystudypw");
			System.out.println(">>DB 연결 성공 : " + conn);
		} catch (SQLException e) {
			System.out.println("[예외발생] DB 연결 실패 : " + conn);
			//e.printStackTrace();
		}
		ResultSet rs = null;
		Statement stmt = null;
		try {
			//3. Statement 문 실행(SQL 문 실행)
			//Connection 객체로 부터 Statement 객체 생성
			stmt = conn.createStatement();
			//System.out.println("statement 객체 생성 성공");
			String sql = "" + "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG " 
							+ "FROM STUDENT "
//							+ "WHERE NAME LIKE '홍길동%' "
							+ "ORDER BY ID";
			System.out.println("sql : " + sql);
			rs =stmt.executeQuery(sql);

			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리, select 이후 데이터 작업처리 필수 
			while (rs.next()) {
				System.out.print(rs.getString("ID") + "\t");
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getInt("KOR") + "\t");
				System.out.print(rs.getInt("ENG") + "\t");
				System.out.print(rs.getInt("MATH") + "\t");
				System.out.print(rs.getInt("TOT") + "\t");
				System.out.println(rs.getDouble("AVG") + "\t");
			}
			
//			while (rs.next()) {
//				String str = rs.getString("ID") + "\t" 
//							+ rs.getString("Name") + "\t"
//							+ rs.getInt("KOR") + "\t" 
//							+ rs.getInt("ENG") + "\t"
//							+ rs.getInt("MATH") + "\t"
//							+ rs.getInt("TOT") + "\t"
//							+ rs.getDouble("AVG") + "\t";
//				System.out.println(str);
//			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5. 클로징 처리에 의한 자원 반납
		try {
			if (rs != null) rs.close();
		} catch (SQLException e) {}
		
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {}
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {}
		
		
		
		
		
		
		

	}

}
