package com.mystudy.innerclass;

public class InstanceClassTest {
	int a = 100; // instance variables
	private int b = 10;
	static int c = 200;
	int sum = 0;
		
	
	void sum() { // instance method
		sum = a + b;
	}
	
	// 내부클래스 : 인스턴스 클래스 
	class Inner { // 객체가 생성되어야 사용 가능
		int in = 100;
		void printData() {
			System.out.println("외부 int a : " + a);
			System.out.println("외부 private int b : " + b);
			System.out.println("외부 static int c : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("내부 클래스 필드 in : " + in);
		}
	}
	
	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드변수 a : " + out.a);
		
		
		//내부 클래스 사용
		System.out.println("--- 내부 인스턴스 클래스 사용 ---");
		// 내부클래스타입 : 외부 클래스명.내부클래스명
		// 인스턴스 클래스의 객체(인스턴스) 생성 하기 위해서는 외부클래스 객체를 통해서 생성할 수 있다 
		InstanceClassTest.Inner inner = new InstanceClassTest().new Inner(); //만들어있지 않으면 직접 생성
		//InstanceClassTest.Inner inner = out.new Inner(); // 이미 객체를 가지고 있다면 . new Inner 생성
		inner.printData();
		
		
	}

}
