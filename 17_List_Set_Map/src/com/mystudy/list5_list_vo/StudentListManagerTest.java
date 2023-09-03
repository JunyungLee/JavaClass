package com.mystudy.list5_list_vo;

import java.util.List;

public class StudentListManagerTest {

	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO();
		StudentVO stu2 = new StudentVO();
		StudentVO stu3 = new StudentVO();
		
		StudentListManager manager = new StudentListManager();
		List<StudentVO> list = manager.selectAll();

		System.out.println(list);

	}

}
