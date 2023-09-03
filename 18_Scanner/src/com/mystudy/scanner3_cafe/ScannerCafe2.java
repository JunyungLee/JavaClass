package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class ScannerCafe2 {
	//변수
	private int choice;
	private int num;
	private int mon;
	private int tot;
	private int rest;
	
	public static final int AMERICANO = 3000;
	public static final int CAFFELATTE = 3500;
	public static final int CAFFEMOCA = 4000;
	public static final int FRESHJUICE = 5000;
	int income = 0; //총 매출액 
	
	public ScannerCafe2() {
		
	}
	//public ScannerCafe2(int choice, String menu) {
		
	//}
	public void start() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			showMenu();
			input(scan);
			process();
			output();
			if (choice == 0) {
				System.out.println(">> Finish");
				System.out.println("오늘 매출 총액 : " + income + "원");
				break;
			}
		}
	}
	
	private void showMenu() {
		System.out.println("============ Menu List ===============");
		System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
		System.out.print("<메뉴선택(1~4)> : ");
		
	}
	public void input(Scanner scan) {
		choice = scan.nextInt();
		
		System.out.print("수량선택 : ");
		num = scan.nextInt();
	
		System.out.print("입금액 : ");
		mon = scan.nextInt();
	}
	public void process() {
		tot = 0; //판매액 = 메뉴단가 * 수량
		if (choice == 1) {
			tot = AMERICANO * num;
		} 
		if (choice == 2) {
			tot = CAFFELATTE * num;
		}
		if (choice == 3) {
			tot = CAFFEMOCA * num;
		}	
		if (choice == 4) {
			tot = FRESHJUICE * num;
		}
		rest = mon - tot;
		income += tot;
	}
	public void output() {
		System.out.println("입금액 : " + mon);
		System.out.println("판매액 : " + tot);
		System.out.println("잔액 : " + rest);
		System.out.println();
		}
	}


