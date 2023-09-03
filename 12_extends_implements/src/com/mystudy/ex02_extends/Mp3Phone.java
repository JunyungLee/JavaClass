package com.mystudy.ex02_extends;

// Phone 클래스를 상속받아(extends : 확장해서) Mp3Phone 만들기 
// Phone에서 허용된 속성, 기능을 사용 + Mp3Phone 속성, 기능을 추가해서 사용
class Mp3Phone extends Phone { //자녀클래스 extends 부모클래스 -> 부모클래스의 기능 + 자녀클래스의 기능 사용 가능 
	
	public Mp3Phone(String phoneNo) { //부모 클래스 기능 
		//super(phoneNo);
		super("Mp3Phone 타입", phoneNo); //부모클래스 생성자 호출
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo); //부모클래스 생성자 호출
	}
	
	//메소드(기능)----------------------- -> 자녀클래스만의 기능
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");
	}
	
	
	
	
	
}
