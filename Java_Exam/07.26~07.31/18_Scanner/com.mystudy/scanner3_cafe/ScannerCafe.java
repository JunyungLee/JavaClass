package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class ScannerCafe {
	private String menu;
	private int num; 
	private int cash;
	private int tot;
	private int tr;
	
	
	public ScannerCafe() {

	}
	public void start() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			input(scan);
			output();
			
		}
	}
	
	private void input(Scanner scan) {
		int Am = 3000;
		int La = 3500;
		int Mo = 4000;
		int Ju = 5000;
		int tot = 0;
		
		System.out.println("===== Menu List =====");
		System.out.println("아메리카노 : " + Am);
		System.out.println("카페라떼 : " + La);
		System.out.println("카페모카 : " + Mo);
		System.out.println("과일주스 : " + Ju);
		System.out.println("=====================");
	
		System.out.print("메뉴를 선택 하세요 : ");
		String menu = scan.nextLine();
	
		System.out.print("주문수량 : ");
		int num = scan.nextInt();
	
		System.out.print("입금액 : ");
		int cash = scan.nextInt();
		if (menu.equals("아메리카노")) {
			tot = num * Am;
		} else if (menu.equals("카페라떼")) {
			tot = num * La;
		} else if (menu.equals("카페모카")) {
			tot = num * Mo;
		} else if (menu.equals("과일주스")) {
			tot = num * Ju;
		}
		int tr = cash - tot;
	}
	
	private void output() {
		System.out.println("선택 메뉴 : " + menu);
		System.out.println("주문수량 :" + num);
		System.out.println("입금액 : " + cash);
		System.out.println("판매액 : " + tot);
		System.out.print("잔액 : " + tr);
	}

	
	
}
