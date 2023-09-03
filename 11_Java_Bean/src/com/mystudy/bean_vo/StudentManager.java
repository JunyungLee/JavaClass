package com.mystudy.bean_vo;

import java.util.Arrays;

public class StudentManager {

	public static void main(String[] args) {
		/* 3명의 성적처리 StudentVO 사용
		 "김유신", 100, 90, 81
		 "이순신", 95, 88, 92
		 "홍길동", 90, 87, 77
		 =====================
		 이름 	국어	영어	수학	총점	평균
		 김유신	100	90	81	271	90.33
		 이순신	95	88	92	275	91.66
		 홍길동	90	87	77	254	84.66
		-----------------------------*/
		StudentVO stu = new StudentVO();
		
		System.out.println("----------------------------------------------");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		//1번째
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		System.out.println("stu1 : " + stu1.toString());
		//stu.setName("김유신"); 
		//stu.setKor(100);
		//stu.setEng(90);
		//stu.setMath(81);
		
		//int tot = stu.getKor() + stu.getEng() + stu.getMath();
		//double avg = tot * 100 / 3 / 100.0;
		//stu.setTot(tot);
		//stu.setAvg(avg);
		//stu.printData();
		
		//2번째
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		System.out.println("stu1 : " + stu2.toString());
		//stu.setName("이순신"); 
		//stu.setKor(95);
		//stu.setEng(88);
		//stu.setMath(92);
		
		//tot = stu.getKor() + stu.getEng() + stu.getMath();
		//avg = tot * 100 / 3 / 100.0;
		//stu.setTot(tot);
		//stu.setAvg(avg);
		//stu.printData();
		
		//3번째
		StudentVO stu3 = new StudentVO("홍길동", 90, 87, 77);
		System.out.println("stu1 : " + stu3.toString());
		//stu.setName("홍길동"); 
		//stu.setKor(90);
		//stu.setEng(87);
		//stu.setMath(77);
		
		//tot = stu.getKor() + stu.getEng() + stu.getMath();
		//avg = tot * 100 / 3 / 100.0;
		//stu.setTot(tot);
		//stu.setAvg(avg);
		//stu.printData();
		
		System.out.println("----------");
		
		StudentVO[] students = new StudentVO[3];
		System.out.println(Arrays.toString(students));
		for (int i = 0; i < students.length; i++) {
			stu.printData();
		}
	}

		static void printData(StudentVO students) {
			System.out.println(students.getName() + "\t" + students.getKor() + "\t" + students.getEng() +"\t"
							+ students.getMath() +"\t"+ students.getTot() +"\t"+ students.getAvg() +"\t");
	}
}
