package com.mystudy.thread02_runnable;

class Parent {
	void print() {
		System.out.println("나는 Parent 클래스");
	}
}

// 다른 클래스를 상속확장한 경우  Thread 클래스를 상속받을 수 없음
// 쓰레드로 만들기 위해서는 Runnable 인터페이스를 구현 (implements) 해서 만든다 
class RunnableImpl extends Parent implements Runnable {

	@Override
	public void run() {
		super.print();
		System.out.println("RunnableImpl run() : Runnable 인터페이스 구현");
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}
	
}

public class RunnableImplThread {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		
		//Runnable interface를 구현한 객체를 Thread로 사용하기 위해서는 
		//Thread로 만들어야 하므로 Thread 클래스 객체를 생성해서 사용
		RunnableImpl runnableImpl = new RunnableImpl();
		//runnableImpl.run(); // Thread 실행 X just print method 호출한것 
		
		//Thread 클래스의 생성자에 Runnable 구현객체를 주입해서 생성
		Thread th1 = new Thread(runnableImpl); //Runnable interface에는 Start() 없음 => Thread로 동작 시킬수가 없다 =>  runnableImple 주입후 Thread 객체 생성 
		System.out.println(th1);
		th1.start(); //저장한 Thread 활용해서 Start() 사용하기
		
		System.out.println("--- main() 끝 ---");

	}

}
