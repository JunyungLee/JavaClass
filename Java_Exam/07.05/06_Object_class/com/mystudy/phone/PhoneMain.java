package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		System.out.println("phone1 : " + phone1);
		phone1.view();
		
		System.out.println("모델명 : " + phone1.name);
		System.out.println("타입 : " + phone1.type);
		System.out.println("가로크기 : " +phone1.hsize);
		System.out.println("세로크기 : " + phone1.vsize);
		System.out.println("LCD 유무 : " + phone1.hasLCD);
		System.out.println("--------------");
		
		phone1.name = "iphone";
		System.out.println("모델명 : " + phone1.name);
		phone1.hasLCD = true;
		System.out.println("LCD 유무 : " + phone1.hasLCD);
		
		phone1.call ();
		phone1.receiveCall();
		
		phone1.sendSms ("안녕~");
		String rmsg = phone1.receiveSms("안녕하세요");
		System.out.println("[메시지수신]" + rmsg); //출력
		//------------------------------------
		int n = phone1.num(1, 2, 3);
		System.out.println(n);
		
		System.out.println("=== phone2 =====");
		Phone ph2 = new Phone("마이폰", "갤럭시S23");
		System.out.println("ph2 : " + ph2);
		ph2.view();
		
}
	}
