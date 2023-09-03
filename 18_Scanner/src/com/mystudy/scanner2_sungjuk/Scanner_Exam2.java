package com.mystudy.scanner2_sungjuk;

import java.util.Scanner;

public class Scanner_Exam2 {

	public static void main(String[] args) {
		/* (실습) Scanner 사용 성적처리
		입력 : 성명, 국어, 영어, 수학 점수를 입력받아
		처리 : 총점, 평균 계산한다
		출력 : 결과를 화면 출력
		===(처리결과 출력예시)===
		성명 : 홍길동
		국어 : 100
		영어 : 90
		수학 : 81
		------------
		총점 : 271
		평균 : 90.33
		================= */
		Scanner scan = new Scanner(System.in);
		//-----입력----------------
		System.out.print("Name : ");
		String name = scan.nextLine();
		
		System.out.print("Korean : ");
		int kor = scan.nextInt();

		
		System.out.print("English : ");
		int eng = scan.nextInt();
		//scan.nextLine();
		System.out.print("Math : ");
		int math = scan.nextInt();
		//int math = Integer.parseInt(scan.nextLine());
		int tot = kor + eng + math;
		double avg =tot * 100 / 3 / 100.0;
		//avg = Math.round(tot * 100 / 3.0) / 100.0;
		
		//------출력--------
		System.out.println("--------성적처리 결과----------");
		System.out.println("Name : " + name);
		System.out.println("Korean : " + kor);
		System.out.println("English : " + eng);
		System.out.println("Math : " + math);
		System.out.println("Total : " + tot);
		System.out.print("Average : " + avg);
		
		//----반복-------
		System.out.println("\n----------------------------------");
		System.out.println(scan.nextLine());
		while (true) {
			System.out.print("continue?: ");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("0")) {
				System.out.println("---종료되었습니다---");
				break;
			}
			System.out.println("=================================");
			System.out.print("Name : ");
			name = scan.nextLine();
			
			System.out.print("Korean : ");
			kor = scan.nextInt();

			
			System.out.print("English : ");
			eng = scan.nextInt();
			
			System.out.print("Math : ");
			math = scan.nextInt();
			
			System.out.println("-----성적 결과-----");
			System.out.println("Name : " + name);
			System.out.println("Korean : " + kor);
			System.out.println("English : " + eng);
			System.out.println("Math : " + math);
			tot = kor + eng + math;
			System.out.println("Total : " + tot);
			avg = tot * 100 / 3 / 100.0;
			System.out.print("Average : " + avg);
			
			System.out.println(scan.nextLine());
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
