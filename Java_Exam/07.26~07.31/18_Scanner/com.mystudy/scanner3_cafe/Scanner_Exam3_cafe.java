package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class Scanner_Exam3_cafe {

	public static void main(String[] args) {
		//(실습) 카페 음료 주문 처리
		//음료의 종류 : 
		//1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000)
		//-------------------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		//----------------------------------------
		/*
		 * 반복 처리 = while (true) { // 메뉴선택 0 선택시 종료
		 1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료
		 > 메뉴를 선택하세요 (1~4) : 1 
		 > 주문수량 : 3
		 > 입금액 : 10000 
		 ==============
		 입금액 : 10000 원 
		 판매액 : 9000 원
		 잔액 : 10000 - 9000 = 1000 원
		 ==============
		 계속 주문하시겠습니까?
		 }
		 */
		
		Scanner scan = new Scanner(System.in);
		int Am= 3000;
		int La = 3500;
		int Mo = 4000;
		int Ju = 5000;
		System.out.println("===== Menu List =====");
		System.out.println("아메리카노 : " + Am);
		System.out.println("카페라떼 : " + La);
		System.out.println("카페모카 : " + Mo);
		System.out.println("과일주스 : " + Ju);
		System.out.println("=====================");
		
		
		while (true) {
			System.out.print("메뉴를 선택 하세요 : ");
			String menu = scan.nextLine();
		
			System.out.print("주문수량 : ");
			int num = scan.nextInt();
		
			System.out.print("입금액 : ");
			int cash = scan.nextInt();
		
			int tot = 0;
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
		
			System.out.println("선택 메뉴 : " + menu);
			System.out.println("주문수량 :" + num);
			System.out.println("입금액 : " + cash);
			System.out.println("판매액 : " + tot);
			System.out.print("잔액 : " + tr);		
		}
	}
}

