package com.mystudy.member.dao;

import java.util.List;

import com.mystudy.member.vo.MemberVO;



public class MemberDAOTest {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
		
		for(MemberVO vo : list) {
			
			System.out.println(vo);
		}
		
		System.out.println("---insert(vo) ----");
		MemberVO vo = new MemberVO("SHIN","신민기","1234","010-5555-5555","용인"); 
		System.out.println(vo);
		int result = dao.insert(vo);
		System.out.println("입력건수 : " + result);
		System.out.println("입력결과 : " + dao.insert(vo));
		
		
//		System.out.println("----update(vo)----");
//		vo = new MemberVO("KANG", "강감찬2", "1233", "010-4444-4444", "서울 강남");
//		result = dao.update(vo);
//		System.out.println("입력건수 : " + result);
//		
//		System.out.println("----delete(vo)----");
//	
//		result = dao.delete(vo.getId());
//		System.out.println("삭제건수 : " + result);
//		
		
		
	}

}
