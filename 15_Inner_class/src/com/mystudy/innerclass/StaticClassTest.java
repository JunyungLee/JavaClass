package com.mystudy.innerclass;

public class StaticClassTest {
	//외부클래스
	int a = 100;
	private int b = 100;
	static int c = 200;
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 30;
	
	static void sum () {
		//sum = a + b; -> static에서는 instance 사용 불가능
		//sum = sNum1 + sNum2; => 50;
		sum = Inner.d + sNum2; //=>1030;
	}
	
	//스태틱(static) 내부클래스
	static class Inner {
		static int d = 1000;
		int e = 2000; // non-static 
		
		void printData() { //non-static 메소드지만 클래스가 static : non-static -> static 사용 불가능 -> 따라서 new 객체 생성 필수 
							//but -> static class안에 있기 때문에 static 사용 해주어야 한다 
			//System.out.println("외부 int a : " + a); -> non-static 변수 a 사용 X
			System.out.println("외부 static int c :" + c); //C 는 static변수이기 때문에 사용 가능
			System.out.println("내부 static int d :" + d); 
			System.out.println("내부 static int e :" + e);  
			sum();
			System.out.println("외부 static int sum :" + sum);  
			
		}
	}
	
	public static void main(String[] args) {
		int num = StaticClassTest.c;
		
		//static 내부클래스의 static 필드변수 사용
		int innerNum = StaticClassTest.Inner.d; 
		
		//static 내부클래스의 객체(인스턴스) 생성 후 printData() 호출(실행)
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData(); //객체 생성을 해주었기 때문에 외부 메소드 실행 가능
		
		
		

	}

}
