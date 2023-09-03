package com.mystudy.poly2_overriding;

class Animal {
	String name; //이름, 명칭
	int legCnt; // 다리갯수
	
	void eat() {
		System.out.println(">> 먹는다");
	}
	
	void sleep() {
		System.out.println(">> 잠자기");
	}
	
	// 자녀(하위) 클래스에 공통으로 있는 메소드를 정의 
	// 자녀(하위) 클래스에서 필요에 따라 재정의 해서 사용하도록 함
	void sound() {
		System.out.println(">> Animal 소리없음");
	}
	
}
