package com.mystudy.map2_exam_vo;

import java.util.Collection;
import java.util.HashMap;
import com.mystudy.set2_exam_vo.StudentVO;

import java.util.Set;

public class StudentMapManagerMain {

	public static void main(String[] args) {
		/*(실습) Map<K, V> 데이터 다루기
		 사용클래스명 : StudentVO, StudentMapManagerMain - main() 메소드
		1. StudentVO 클래스를 사용해서
		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		   ---------------------
		2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
		3. map에 있는 데이터를 사용해서 화면출력
		   성명    국어   영어  수학    총점     평균
		   --------------------------
		   홍길동   100  90  81  270  90.33
		   ...
		   -----------------------------
		4. 저장된 map에 있는 김유신 학생의 국어 점수를 95점으로 수정
		5-1. "김유신" 학생의 성적 화면 출력
		5-2. "김유신" 학생의 성명, 총점, 평균 화면 출력
		======================================= */
		//1--------------------------
		StudentVO stu = new StudentVO("홍길동", 100, 90,81);
		stu.computeTotAvg();
		StudentVO stu1 = new StudentVO("이순신", 95, 88, 92);
		stu1.computeTotAvg();
		StudentVO stu2 = new StudentVO("김유신", 90, 87, 77);
		stu2.computeTotAvg();
		 
		//2-------------------- 데이터 확인 + 입력
		HashMap<String, StudentVO> map = new HashMap<>();
		map.put(stu.getName(), stu);
		map.put(stu1.getName(), stu1);
		map.put(stu2.getName(), stu2);
		
		System.out.println("map : " + map);
		
		//3-------------------------- 화면출력
		System.out.println("===== 전체 데이터 화면 출력 =====");
		System.out.println("---------------------------------");
		System.out.println("성명\t국어\t영어\t수학\t총합\t평균");
		Collection<StudentVO> keySet = map.values();
		for (StudentVO vo : keySet ) {
			printData(vo);
			
		}
		System.out.println("====================");
		Set<String> set = map.keySet();
		System.out.println("set : " + set);
		for(String name : set) {
			//StudentVO vo = map.get(name);
			printData(map.get(name));
		}
		
		System.out.println("--------김유신 데이터 국어 점수 95점으로 수정---------");
		String name = "김유신";
		StudentVO student = map.get(name);
		System.out.println("student: " + student);
		if(student == null) {
			System.out.println(">> 데이터 없음");
		} else {
			student.setKor(95);
		}
		printData(student);
		
		
		System.out.println("------------김유신 데이터 출력---------------");
		printData(map.get("김유신")); 
		
		System.out.println("---------김유신 데이터 이름, 총점, 평균 출력-------------");
		StudentVO kim = map.get("김유신");
		System.out.println("이름 : " + kim.getName() + ", " +"총점 : " + kim.getTot() + "평균 : "+ ", " + kim.getAvg());
		 
		
	}
		
		static void printData(StudentVO vo) {
			System.out.println(vo.getName() + "\t" + vo.getKor() +"\t" + vo.getEng() +"\t"+ vo.getMath()+"\t"
					+ vo.getTot() +"\t"+ vo.getAvg());

		}
	
}
	

