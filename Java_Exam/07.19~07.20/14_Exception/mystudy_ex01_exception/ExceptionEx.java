package com.mystudy_ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		int num1 = 100;
		int num2 = 10;
		int result = 0; 
		System.out.println(">> 연산 시작");
		
		//result = num1 / num2; //ArithmeticException: / by zero
		
		//예외처리 ------
		if (num2 == 0) {
			System.out.println("[예외발생] 나누는 값이 0입니다");
		} else {
			result = num1 / num2;
			System.out.println("연산 결과 result : " + result);			
		}
		System.out.println();
		
		System.out.println("=== try ~ catch 예외처리 ===");
		try {
			System.out.println("-- try 문 시작 --");
			result = num1 / num2;
			System.out.println("연산 결과 result : " + result);
			System.out.println("-- try 문 끝 --");
			return; //메소드 종료 -> main() 끝 실행 X // finally문은 정상 실행 처리
		} catch(ArithmeticException e) {
			System.out.println("[예외발생] 나누는 값이 0입니다");
			System.out.println("[예외발생-ArithmeticException] " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("[예외발생-RuntimeException] " + e.getMessage());
		} catch(Exception e) {
			System.out.println("[예외발생-Exception] " + e.getMessage());
		} finally {
			System.out.println("*** >> finally : 항상(무조건) 실행");
		}
		
		
		System.out.println("test : try ~ catch ~ finally 이후 문장" );
		
		System.out.println("--- main() 끝 ---");
	}

}
