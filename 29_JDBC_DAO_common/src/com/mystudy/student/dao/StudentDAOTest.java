package com.mystudy.student.dao;

import java.util.List;

import com.mystudy.student.vo.StudentVO;

public class StudentDAOTest {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String id = "2023001";
		StudentVO stu1 = dao.selectOne(id);
		System.out.println("stu1 : " + stu1);
		
		System.out.println("--- selectOne(VO) ---");
		StudentVO stu2 = new StudentVO("2023002","",0,0,0);
		System.out.println("검색용 전달vo :" + stu2);
		
		StudentVO student = dao.selectOne(stu2);
		System.out.println("DB 검색된 student : " + student);
		
		System.out.println("----selectAll ----");
		List<StudentVO> list = dao.selectAll();
		for(StudentVO vo : list) {
			System.out.println(vo);
		}
		
		System.out.println("--- insert(vo) -----");
		student = new StudentVO("2023022", "홍경래2", 100, 92, 84);
		System.out.println("입력할 학생 : " + student);
		
		
		int result = dao.insert(student);
		System.out.println("입력건수 : " + result);
		
		System.out.println("---- update(vo) ------");
		student = new StudentVO("2023022", "홍경래2upd", 95, 82, 84);
		System.out.println("수정할 학생 : " + student);
		
		result = dao.update(student);
		System.out.println("수정건수 : " + result);
		System.out.println("수정결과 : " + dao.selectOne(student));
		
		 
		System.out.println("--- Delete(id) ----");
		System.out.println("삭제할 데이터 : " + dao.selectOne(student));
		int count = dao.delete(student.getId());
		System.out.println("삭제건수 : " + count);
		System.out.println("삭제결과 : " + dao.selectOne(student));
		
		
//		System.out.println("---UpdateTotAvg ----");
//		result = dao.updateTotAvg(id);
//		System.out.println(result);
//		System.out.println("수정결과 : " + dao.selectOne(student));
		
		
		
	}

}
