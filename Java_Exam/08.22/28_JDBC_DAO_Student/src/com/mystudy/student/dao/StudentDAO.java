package com.mystudy.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//XxxxDAO, XxxxDao : Data Access Object
//데이터베이스(Database)와 연동해서 CRUD를 구현하는 클래스
//데이터베이스(Database)와 연동해서 CRUD를 작업을 할 수 있는 기능을 제공하는 클래스
public class StudentDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERS = "MYSTUDY";
	private static final String PASSWORD = "mystudypw";
	// static 초기화 구문
	static {
		//1. JDBC 드라이버 로딩
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] JDBC 드라이버 로딩 실패!!!");
		}
	}
	
	//SELECT :데이터 1개 조회(id) -selectOne : StudentVO
	public StudentVO selectOne(String id) {
		StudentVO vo = null;
		//(할일) DB연결하고 SQL문 실행해서 결과값을 VO 변수에 저장하고 리턴
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USERS, PASSWORD);
			
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ");
			sb.append(" FROM STUDENT ");
			sb.append(" WHERE ID = ? ");
			
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리, select 이후 데이터 작업처리 필수 
			
//			if(rs.next()) {
//				vo = new StudentVO();
//				vo.setId(rs.getString("ID"));
//				vo.setName(rs.getString("NAME"));
//			}
			
			if(rs.next()) {
				vo = new StudentVO(rs.getString("ID"),rs.getString("NAME")
									,rs.getInt("KOR"),rs.getInt("ENG"),rs.getInt("MATH") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return vo;
		
	}

	//SELECT :데이터 1개 조회(VO) -selectOne : StudentVO
		public StudentVO selectOne(StudentVO student) {
			StudentVO vo = null;
			//(할일) DB연결하고 SQL문 실행해서 결과값을 VO 변수에 저장하고 리턴
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				//2. DB연결 - Connection 객체 생성 <- DriverManager
				conn = DriverManager.getConnection(URL, USERS, PASSWORD);
				
				//3. Statement 문 실행(SQL 문 실행)
				StringBuilder sb = new StringBuilder();
				sb.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ");
				sb.append(" FROM STUDENT ");
				sb.append(" WHERE ID = ? ");
				
				pstmt = conn.prepareStatement(sb.toString());
				
				pstmt.setString(1, student.getId());
				
				rs = pstmt.executeQuery();
				
				//4. SQL 실행 결과에 대한 처리
				//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리, select 이후 데이터 작업처리 필수 

				if(rs.next()) {
					vo = new StudentVO(rs.getString("ID")
										,rs.getString("NAME")
										,rs.getInt("KOR")
										,rs.getInt("ENG")
										,rs.getInt("MATH") );
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//5. 클로징 처리에 의한 자원 반납
				close(conn, pstmt, rs);
			}
			return vo;	
		}
		
		private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {}
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {}
		}
		
		//SELECT : 테이블 전체 데이터 조회 - selectAll : List<StudentVO>
		public List<StudentVO> selectAll() {
			List<StudentVO> list = null;
			
			return list;
		}
		// SELECT : 이름으로 검색 - select : List<StudentVO>
		public List<StudentVO> select() {
			List<StudentVO> list2 = null;
			return list2;
		}
		//INSERT : VO 데이터를 받아서 입력 - insert : int
		public int insert(StudentVO vo) {
			int result = 0;
			
			return result;
		}
		//UPDATE : VO 데이터를 받아서 수정 - update : int
		public int update(StudentVO vo) {
			int update_re = 0;
			return update_re;
		}
		//- UPDATE : 이름(name) 받아서 수정 - updateName : int
		public int updateName() {
			int updateName = 0;
			return updateName;
		}
		//- UPDATE : 국어점수(kor) 수정 - updateKor : int
		public int updateKor() {
			int updateKor = 0;
			return updateKor;
		}
		//- UPDATE : 총점, 평균 계산처리 - updateTotAvg : int
		public int updateTotAvg() {
			int updateTotAvg = 0;
			return updateTotAvg;
		}
		//DELETE : VO 객체를 받아서 삭제 - delete : int
		public int delete() {
			int delete_re = 0;
			return delete_re;
		}
		//DELETE : 키값(id)을 받아서 삭제 - delete : int
		public int deleteId() {
			int delete_id = 0;
			return delete_id;
		}
}
			
			
			
			
		

