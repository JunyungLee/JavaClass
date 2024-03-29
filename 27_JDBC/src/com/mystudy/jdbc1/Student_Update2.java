package com.mystudy.jdbc1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_Update2 {

	public static void main(String[] args) {
		//JDBC 이용한 DB 연동 프로그래밍 작성 절차
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL 문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//--------------------------------------
		Connection conn = null;
		Statement stmt = null;
	
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">>드라이버 로딩 성공");
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println("DB 연결 성공");
			
			//3. Statement 문 실행(SQL 문 실행)
			stmt = conn.createStatement();
			
			//변수처리
			String id = "2023002";
			int kor = 92;
			int eng = 82;
			int math = 72;

			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "SET KOR = "+ kor;
			sql += "  , ENG = "+ eng;
			sql += "  , MATH = "+ math;
			sql += "WHERE ID = '" + id +"' ";
			System.out.println("sql : " + sql);
			
			//INSERT, UPDATE, DELETE 실행 :executeUpdate(sql) 사용 
			int result = stmt.executeUpdate(sql);
		
			//4. SQL 실행 결과에 대한 처리
			//- INSERT, UPDATE, DELETE : int 값(건수) 처리
			System.out.println("처리건수 : " + result);			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {}
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {}
		}
			

	}

}
