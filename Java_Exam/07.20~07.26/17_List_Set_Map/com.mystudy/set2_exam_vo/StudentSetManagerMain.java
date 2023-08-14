package com.mystudy.set2_exam_vo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetManagerMain {

	public static void main(String[] args) {
		/*
		 * (실습) Set 중 HashSet 또는 TreeSet 사용 사용클래스명 : StudentVO, StudentSetManagerMain - main() 메소드 
		 1. StudentVO 클래스를 사용해서 3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고) 
		 "홍길동",100, 90, 81 
		 "이순신", 95, 88, 92 
		 "김유신", 90, 87, 77 
		 --------------------- 
		 2. Set타입의 변수(set)에 저장하고 
		 3. set에 있는 데이터를 사용해서 화면출력
		 성명 국어 영어 수학 총점 평균
		 --------------------------------- 
		 홍길동 100 90 81 270 90.33 ... 
		 4. "김유신" 국어 점수를95 점으로 수정 
		 5. 수정된 "김유신" 데이터만 출력 확인 
		 6. 전체 데이터 화면 출력
		 * ========================================
		 */

//		StudentVO stu = new StudentVO("홍길동",100,90,81);
//		stu.computeTotAvg();
//		StudentVO stu1 = new StudentVO("이순신", 95, 88, 92);
//		stu1.computeTotAvg();
//		StudentVO stu2 = new StudentVO("김유신", 90, 87, 77);
//		stu2.computeTotAvg();

//		set.add(stu);
//		set.add(stu1);
//		set.add(stu2);
		
		HashSet<StudentVO> set = new HashSet<StudentVO>();
//		TreeSet <StudentVO> set = new TreeSet<StudentVO>();
//		Set <StudentVO> set = new TreeSet<StudentVO>();
		set.add(new StudentVO("홍길동", 100, 90, 81));
		set.add(new StudentVO("이순신", 95, 88, 92));
		set.add(new StudentVO("김유신", 90, 87, 77));
		System.out.println("------------- 전체 데이터 화면 출력 ---------------");
		System.out.println("성명\t국어\t영어\t수학\t총합\t평균");
		System.out.println("---------------------------------------------");
		for (StudentVO stu : set) {
			stu.computeTotAvg();
			System.out.println(stu.toString());
		}
		System.out.println("--------------------------------------------");

//		for (StudentVO stu : set) {
//			if (stu.getName().equals("홍길동")) {
//				stu.computeTotAvg();
//				System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath()
//						+ "\t" + stu.getTot() + "\t" + stu.getAvg());
//			} else if (stu.getName().equals("이순신")) {
//				System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath()
//						+ "\t" + stu.getTot() + "\t" + stu.getAvg());
//			} else if (stu.getName().equals("김유신")) {
//				System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath()
//						+ "\t" + stu.getTot() + "\t" + stu.getAvg());
//			}
//		}
		
		//-------김유신 국어 -> 95 수정----------
		for(StudentVO stu : set) {
			if (stu.getName().equals("김유신")) {
				stu.setKor(95);
			}
		}
		System.out.println("--------김유신 데이터 화면출력----------");
		for(StudentVO stu : set) {
			if (stu.getName().equals("김유신")) {
				stu.computeTotAvg();
				System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t"
						+ stu.getTot() + "\t" + stu.getAvg());				
			}
		}
		System.out.println("--------------전체 데이터 화면출력-----------");
		System.out.println("성명\t국어\t영어\t수학\t총합\t평균");
		for (StudentVO stu : set) {
			stu.computeTotAvg();
			System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t"
					+ stu.getTot() + "\t" + stu.getAvg());
		}
		System.out.println("-------iterator사용-----------");
		Iterator<StudentVO> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());;
		}
		
		System.out.println("====================");
//		set.descendingIterator(); //(=> TreeSet에만 있는 메소드) 개인별실습 :  iterator로 데이터 출력하기
		
		
	}

}
