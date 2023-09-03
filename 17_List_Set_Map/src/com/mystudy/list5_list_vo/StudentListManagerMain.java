package com.mystudy.list5_list_vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListManagerMain {

	public static void main(String[] args) {
		/* (실습) List를 사용한 성적 처리
		사용클래스명 : StudentVO, StudentListManager - main() 메소드
		1. StudentVO 클래스를 사용해서
		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. ArrayList 타입의 변수(list)에 저장하고
		3. list에 있는 전체 데이터 화면출력
		   성명   국어  영어  수학  총점  평균
		   ---------------------------------
		   홍길동  100  90  81   270  90.33
		   ...
		4. 김유신 국어 점수를 95 점으로 수정 후 김유신 데이터만 출력
		5. 전체 데이터 화면 출력
		========================================== */
		//1---------------------------------
		StudentVO stu = new StudentVO("홍길동",100, 90, 81);
		stu.computeTotAvg();
		StudentVO stu1 = new StudentVO("이순신",95, 88, 92);
		stu1.computeTotAvg();
		StudentVO stu2 = new StudentVO("김유신",90, 87, 77);
		stu2.computeTotAvg(); //_> 반복문 사용할때 같이 출력해주는 것도 가능 
		//2------------------------------
		List<StudentVO> list = new ArrayList<StudentVO>();
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		
		//3---------------------------------------------
		System.out.println("---List에 있는 데이터 화면출력---");
		System.out.println("-------------------------------");
		
		System.out.println("----- 첫번째 홍길동 데이터 화면 출력 -----");
		StudentVO vo = list.get(0);
		System.out.println(vo.getName() );
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(list.get(0).getMath());
		System.out.println(vo.getTot());
		System.out.println(vo.getAvg());
		
		System.out.println("--- 반복문 활용해서 3명 데이터 화면 출력 ---");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMath() + "\t");
			System.out.print(list.get(i).getTot() + "\t");
			System.out.print(list.get(i).getAvg() + "\t");
			System.out.println();
		}
		System.out.println("===============================================");
		
		
		
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		for (StudentVO students : list ) {
			System.out.println(students.getName() + "\t" + students.getKor() + "\t" + students.getEng() + "\t"
							+ students.getMath() + "\t" + students.getTot() + "\t" + students.getAvg());
		}
		
		//4---------------------------------------------
		
		System.out.println("------------------한번에 출력하기-------------------");
		for (StudentVO students : list) {
			if ("김유신".equals(students.getName())) {
				students.setKor(95);
				students.computeTotAvg(); //재계산 처리 해주어야 함 
				System.out.println(students.getName() +"\t" + students.getKor() + "\t" + students.getEng() + "\t"
						+ students.getMath() + "\t" + students.getTot() + "\t" + students.getAvg() );
			}
		} 
		
		System.out.println("----------나눠서 출력하기--> 수정에 용이---------------");
		
		for (StudentVO students : list) {
			if ("김유신".equals(students.getName())) {
				students.setKor(95);
				students.computeTotAvg();
				break;
			}
			
		} 
		for (StudentVO students : list) {
			if ("김유신".equals(students.getName())) {
				System.out.println(students.getName() +"\t" + students.getKor() + "\t" + students.getEng() + "\t"
				+ students.getMath() + "\t" + students.getTot() + "\t" + students.getAvg() );
			}
		}
		//System.out.println(list);
		
		//5----------------------------------------------
		System.out.println("-----------------------------------------------");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			StudentVO students = list.get(i);
			System.out.println(students.getName() + "\t" + students.getKor() + "\t" + students.getEng() + "\t"
							+ students.getMath() + "\t" + students.getTot() + "\t" + students.getAvg());
		}
		System.out.println();
		
		printData(list);
		
		System.out.println("========================");
		//StudentVO equals() 구현 후 contains(), indexOf() 정상동작
		System.out.println("list.contains(stu) : "+ list.contains(stu));
		System.out.println("list.contains(stu1) : "+ list.contains(stu1));
		System.out.println("list.contains(stu2) : "+ list.contains(stu2));
		
		System.out.println("list.indexOf(stu): "+ list.indexOf(stu));
		System.out.println("list.indexOf(stu1): "+ list.indexOf(stu1));
		System.out.println("list.indexOf(stu2): "+ list.indexOf(stu2));
		System.out.println("------------");
		StudentVO test = new StudentVO("김유신", 0, 0, 0);
		//StudentVO test = new StudentVO("을지문덕", 0, 0, 0);
		System.out.println("list.contains(test) : "+ list.contains(test));
		System.out.println("list.indexOf(test) : "+ list.indexOf(test));
		
		
		System.out.println("===== 김유신 국어점수 88점으로 수정 =====");
		StudentVO kim = new StudentVO("김유신", 88, 0, 0);
		System.out.println("list.contains(kim)" + list.contains(kim));
		System.out.println("list.indexOf(kim)" + list.indexOf(kim));
		
		int idx = list.indexOf(kim);
		StudentVO listKim = list.get(idx);
		System.out.println("리스트 원본 :");
		printData(listKim);
		
		System.out.println(">>국어 점수 수정 처리!");
		listKim.setKor(kim.getKor());
		listKim.computeTotAvg();
		System.out.println("리스트 수정본 :");
		printData(listKim);
	}
		
	static void printData(StudentVO vo) {
	
		System.out.println(vo.getName() );
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTot());
		System.out.println(vo.getAvg());
		
	}
	static void printData(List<StudentVO> list) {
		for(StudentVO stu : list) {
			printData(stu);
		}
		
	}
	static StudentVO getData(List<StudentVO> list, String name) {
		for (StudentVO student : list) {
			if(name.equals(student.getName())) {
				return student;
			}
		}
		return null;
	}
}
	

