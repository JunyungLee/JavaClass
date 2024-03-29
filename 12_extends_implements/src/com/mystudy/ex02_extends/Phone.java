package com.mystudy.ex02_extends;

//public class Phone extends Object {
class Phone { //접근제한자 제거하고 -> 이 패키지 안에서만 사용하겠다, extends Object 생략해 사용
	//필드변수(속성) ------------
	private String type; //전화 타입(형태)
	private String phoneNo; //전화번호
	
	
	//생성자 ----------------------
	public Phone() {}
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	//메소드 ----------------------
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//전화걸기 기능
	public void call() {
		System.out.println(">> 전화걸기");
	}
	
	//전화받기 기능
	public void receivecall() {
		System.out.println(">> 전화받기!!");
	}
	
	//전화정보 확인
	public void view() {
		System.out.println("타입 : " + type + " , " +"전화번호 : " + phoneNo);	
	}
	

}
