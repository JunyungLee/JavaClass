package com.mystudy.ex05_interface3;
/*
인터페이스의 구성요소
	- static final 상수 : public static final 변수 
	- 추상메소드 : public abstract 메소드 
	-------------------------
	자바 8 version (JDK 8) 에서 추가된 요소 : 구현부가 있는 메소드 
		- public default 메소드 : public default 메소드명() {}
		- public static 메소드 : 재정의 없이 인터페이스 명으로 참조해서 사용 
*/
interface I_Phone {
	// 상수화된 변수 : public static final 변수 
	public static final boolean SUCCESS_CALL = true;
	boolean FAIL_CALL = true;
	
	//인터페이스에 정의된 추상메소드는 모두 public abstract 메소드  _> 반드시 구현해야 하는 메소드
	public abstract void view(); 
	public void call(); 
	void receiveCall(); 
	void sendSms(); 
	void receiveSMS();
	
	// default 메소드 : 구현부가 있어서 구현을 안해도 됨 
	// 필요 시 선택적으로 재정의해서 사용(구현)한다
	public default void changeNo(String phoneNo) {
		// 구현이 필요없으면 구현 안해도 되고,
		// 공통적으로 사용하는 기본 기능이 있으면 구현해도 됨
	}
	
	// static 메소드 : 재정의 없이 인터페이스명으로 참조해서 사용
	public static void staticMethod() {
		System.out.println("I_Phone 인터페이스의 static 메소드");
	}
	
	
	
}
