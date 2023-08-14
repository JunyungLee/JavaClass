package com.mystudy_ex01_exception;

public class Exception_throw_throws {

	public static void main(String[] args) {
		// throw : 예외 발생시키기
		// throws : 예외(들) 던질 때(위임, 전가) 사용
		// throws는 메소드 선언부에 사용
		//---------------------------------
		//throw new ArithmeticException("throw test ing"); // 예외 메세지 작성 가능
		//throw new ArithmeticException(); -> 예외를 발생시키겠다!
		// Exception 계열은 강제 예외처리 
		//throw new Exception(); //예외를 발생 시킴  = 예외 처리 필수 
		System.out.println("--- main() 시작 ---");
		int num1 = 100;
		int num2 = 50;
		int result = 0; 
		
		System.out.println(">> 연산처리 시작");
		num2 = 0;
		
		try {
			result = divThrows(num1, num2);
		} catch (Exception e) {
			//e.printStackTrace(); -> 예외 출력 가능 (어디서 예외가 발생했는지, 이 예외가 어디서 호출되었는지) 
			System.out.println("[예외발생] main() divThrows : " + e.getMessage());
		}
		
		
		System.out.println("계산결과 : " + result);
		
		System.out.println("--- main() 끝 ---");
	}
	
	// throws : 메소드 선언부에 작성해서 호출한 곳으로 예외를 던짐 (위임, 전가)
	// throw : 예외를 발생시킴
	static int divThrows (int num1, int num2) throws Exception {
		System.out.println("--->> divThrows() 시작 ");
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("[예외발생] : " + e.getMessage());
			throw new Exception("::: 내가 발생시킨 예외!");
		}
		System.out.println("--->> divThrows() 끝 ");
		return result;
	}
	
	
}
