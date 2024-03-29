package com.mystudy.ex04_interface2;

class Phone implements I_Phone{ //extends Object 중간 생략
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
	
	//---------- 아래쪽은 반드시 구현해야 하는것 -------------
	@Override
	public void view() {
		System.out.println("타입 : " + type + " , " +"전화번호 : " + phoneNo);	
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기!!");
	}

	@Override
	public void sendSms() {
		System.out.println(">> 메시지 보내기");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println(">> 메시지 받기!!");	
	}
	

}
