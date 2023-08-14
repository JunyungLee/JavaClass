package com.mystudy.scanner2_sungjuk;

import java.util.Scanner;

//(개인별 실습) : StudentVO, List에 처리된 데이터 모아서 사용
public class ScannerSungjuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public ScannerSungjuk() {
	
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			input(scan);
			process();
			output();
			System.out.println("===============");
		}
	}
	
	private void output() {
		System.out.println("-----성적 결과-----");
		System.out.println("Name : " + name);
		System.out.println("Korean : " + kor);
		System.out.println("English : " + eng);
		System.out.println("Math : " + math);
		System.out.println("Total : " + tot);
		System.out.print("Average : " + avg);
		
	}

	private void input(Scanner scan) {
		System.out.print("Name : ");
		String name = scan.nextLine();
		
		System.out.print("Korean : ");
		int kor = scan.nextInt();

		System.out.print("English : ");
		int eng = scan.nextInt();
		
		System.out.print("Math : ");
		int math = scan.nextInt();
	}
	
	private void process() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	
	
}
