package com.mystudy.ex04_interface2;

// 인터페이스에는 final 속성값, 추상(abstract)메소드가 있다
interface I_Phone { //public 있고, 없고
	// {} _> 구현부(body)가 없는 메소드 : 추상메소드(abstract method)
	// 인터페이스에 정의된 추상메소드는 모두 public abstract method => 가져다 쓰기 위한 목적이기 때문에 public 이다
	public abstract void view(); //선언부만 있음 //전화정보 확인
	public void call(); //abstract 생략 가능 //전화걸기 기능
	void receiveCall(); //public abstract 생략 //전화 받기 기능
	void sendSms(); 
	void receiveSMS();
	
	
	
	
	
	
	
	
	
	
}
