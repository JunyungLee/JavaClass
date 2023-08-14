package com.mystudy_ex02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) {
		System.out.println("--- main () start ---");
		//throw new MyException("처음 만든 예외");
		
		try {
			firstMethod();
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(">> main-catch 문 실행");
			System.out.println(">> 오류 메시지 : " +  e.getMessage());
		}
		
		
		System.out.println("--- main () finish ---");
	}

	private static void firstMethod() throws MyException {
		System.out.println("--- firstMethod() start ---");
		secondMethod();
		System.out.println("--- firstMethod() finish ---");
		
	}

	private static void secondMethod() throws MyException {
		System.out.println("--- secondMethod() start ---");
		// 예외 발생시키기
		throw new MyException("secondMethod() 에서 예외발생");
		
		//System.out.println("--- secondMethod() finish ---");
		
	}

}
