package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔(화면) 에서 데이터 읽어오기 
		Scanner scan = new Scanner(System.in); // System.in : .-> 참조형 데이터이다! (기본 데이터 타입에는 사용 X), static 변수 or method 
		
		System.out.print("문자열 입력 1 : ");
		String str1 = scan.nextLine();
		System.out.println(">>> " + str1);
		System.out.println("-----------");
		
		System.out.print("문자열 입력 2: ");
		String str2 = scan.nextLine();
		System.out.println(">>> " + str2);
		System.out.println("==============");
		
		System.out.println("정수값 2개를 입력하면 더한 결과 출력");
//		int num1 = 10; 
//		int num2 = 20;
//		int sum = num1 + num2;
		int sum = 0;
		
		//(주의) nextXxx 메소드 사용 후 nextLine() 사용시 문제 발생
		System.out.print("숫자입력1 : ");
		int num1 = scan.nextInt();
		scan.nextLine(); //줄바꿈(엔터)문자까지의 값을 읽어서 버리기
		
		System.out.print("숫자입력2 : ");
		//int num2 = scan.nextInt();
		int num2 = Integer.parseInt(scan.nextLine());
		//scan.nextLine(); //줄바꿈(엔터) 문자까지의 값을 읽어서 처리 
		
		sum = num1 + num2;
		System.out.println("합계 : " + sum);
		
		
		System.out.print("문자열(nextLine): ");
		String temp = scan.nextLine();
		System.out.println("입력 문자열 출력 : " + temp);
		
		System.out.println("===================");
		System.out.print("문자열 1개와 정수 숫자 3개 연속 입력 : ");
		String strTemp = scan.next();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		System.out.println("첫번째 문자열 : " + strTemp);
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		
		scan.close();
		
	}

}
