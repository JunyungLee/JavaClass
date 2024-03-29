package com.mystudy.jdbc1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_Insert {

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
			String id = "2023005";
			String name = "김유신2";
			int kor = 88;
			int eng = 93;
			int math = 76;
			int tot = 0;
			double avg = 0;
			
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "	   (ID, NAME, KOR, ENG, MATH) ";
			//sql += "VALUES ('2023003', '홍길동3', 70, 90, 60, 0, 0) ";
			sql += "VALUES('" + id + "' ,'" + name + "'," + kor + ", " + eng + ", " + math +") ";
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
