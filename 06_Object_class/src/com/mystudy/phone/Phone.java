package com.mystudy.phone;

public class Phone {
	//속성(필드변수, 인스턴스 변수, 멤버변수)
	String name;
	String type;
	int hsize;
	int vsize;
	boolean hasLCD;
	
	//생성자
	Phone(){} //기본생성자
	Phone(String name, String t) {
		this.name = name; //this. 현재 필드에 있는(저장되어있는)변수 (인스턴스)
		type = t;
		hsize = 200; 
	}	
	
	Phone(String n, String t, boolean h) {
		name = n;
		type = t;
		hasLCD = h;
	}
	
	//메소드
	void call () {
		System.out.println("전화걸기");
	}
	void receiveCall () {
		System.out.println("전화받기");
	}
	void sendSms (String sendSms) {
		System.out.println("[메시지전송]" + sendSms);
	}
	
	String receiveSms (String receiveSms) { 
		//System.out.println("[메시지수신]" + receiveSms );
		return receiveSms; //return 하면 출력 X
	}
	//----------------------------------------
	int num (int num1, int num2, int num3) {
		
		return num1 + num2 + num3;
	}
	
	void view () {
		System.out.println("---전화기정보확인----");
		System.out.println("모델명 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("가로크기 : " +hsize);
		System.out.println("세로크기 : " + vsize);
		System.out.println("LCD 유무 : " + hasLCD);
		
		
	}
		
	
			
}


