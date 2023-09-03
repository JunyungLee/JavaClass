package com.mystudy.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mystudy.common.CommonJDBCUtil;
import com.mystudy.member.vo.MemberVO;

public class MemberDAO {
//	private static final String DRIVER = "oracle.jdbc.OracleDriver";
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String USERS = "MYSTUDY";
//	private static final String PASSWORD = "mystudypw";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//전체 데이터 검색(찾기) - selectAll()
	public List<MemberVO> selectAll() {
		List<MemberVO> list = null;
		try {
			conn = CommonJDBCUtil.getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS FROM MEMBER ORDER BY ID ");
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			list = new ArrayList<MemberVO>();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO(rs.getString("ID"), rs.getString("NAME"), rs.getString("PASSWORD"), 
											rs.getString("PHONE"), rs.getString("ADDRESS"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CommonJDBCUtil.close(conn, pstmt, rs);
		}
		return list;
	}
	//(실습) INSERT :VO 전달받아 데이터 입력처리 -insert(vo):int
	public int insert(MemberVO vo) {
		int result = 0;
		try {
			conn = CommonJDBCUtil.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO MEMBER (ID, NAME, PASSWORD, PHONE, ADDRESS) VALUES (?, ?, ?, ?, ?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			int i = 1;
			pstmt.setString(i++, vo.getId());
			pstmt.setString(i++, vo.getName());
			pstmt.setString(i++, vo.getPassword());
			pstmt.setString(i++, vo.getPhone());
			pstmt.setString(i++, vo.getAddress());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("[예외발생]" + e.getMessage());
			return -1;
		} finally {
			CommonJDBCUtil.close(conn, pstmt);
		}
		return result;
	}
	
	public int update(MemberVO vo) {
		int result = 0;
		conn = CommonJDBCUtil.getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE MEMBER SET NAME = ?, PASSWORD = ?, PHONE = ?, ADDRESS =? WHERE ID = ?");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			int i = 1;
			pstmt.setString(i++, vo.getName());
			pstmt.setString(i++, vo.getPassword());
			pstmt.setString(i++, vo.getPhone());
			pstmt.setString(i++, vo.getAddress());
			pstmt.setString(i++, vo.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("[예외발생]" + e.getMessage());
			return -1;
		}
		return result;
	}
	
	public int delete(String id) {
		int result = 0;
		conn = CommonJDBCUtil.getConnection();
		String sql = "DELETE FROM MEMBER WHERE ID = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("[예외발생]" + e.getMessage());
			return -1;
		}
		
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
