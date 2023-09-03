package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("stu : " + stu.toString()); //.toString() -> Object클래스에 있는 method
		
		//System.out.println("stu.name : "+ stu.name); //private -> The field Student.name is not visible : 선언은 되어있지만 보여지지 않는다
		stu.setName("홍길동");
		String name = stu.getName();
		System.out.println("name : " + name);
		System.out.println("name : " + stu.getName());
		
		//stu.kor = 999;
		//System.out.println("kor : " + stu.kor);
		System.out.println("--입력전 kor : " + stu.getKor());
		stu.setKor(100);
		System.out.println("입력후 kor : " + stu.getKor());
		
		//System.out.println("eng : " + stu.eng); -> private
		System.out.println("--입력전 eng : " + stu.getEng());
		stu.setEng(90); // stu 안에 있는 method setEng 사용 
		System.out.println("입력후 eng : " + stu.getEng()); //stu/ 안에 있는 method getEng 사용 
		
		//System.out.println("math : " + stu.math); -> private
		System.out.println("--입력전 math : " + stu.getMath());
		stu.setMath(88);
		System.out.println("입력후 math : " + stu.getMath());
		
		//-----------------------------------------
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println("tot : " + tot);
		stu.setTot(tot); //계산된 합계 데이터를 Student 타입의 객체의 필드에 저장
		
		double avg = tot * 100 / 3 / 100.0; // 소수점 둘째 자리까지의 값을 얻을 수 있음 
		System.out.println("avg : " + avg);
		stu.setAvg(avg); //계산된 합계 데이터를 Student 타입의 객체의 필드에 저장 -> 값을 저장하기 위해서는 avg그대로 출력 x setAvg 메소드 사용 
		
		stu.printData(); //stu. 안에 있는 printData 사용!
		
		System.out.println("=== 생성자 사용 데이터 입력 ===");
		Student stu2 = new Student("김유신", 100, 90, 82);
		
		stu2.printData();
		//stu2.computeTotAvg(); ->private 처리 되어있으므로 사용 X
		
				
	}

}
