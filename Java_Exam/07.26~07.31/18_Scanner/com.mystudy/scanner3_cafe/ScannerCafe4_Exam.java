package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class ScannerCafe4_Exam {

	public static void main(String[] args) {
		//(실습) 카페 음료 주문 처리
		//음료의 종류 : 
		//1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료
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
		final int AMERICANO = 3000;
		final int CAFFELATTE = 3500;
		final int CAFFEMOCA = 4000;
		final int FRESHJUICE = 5000;
		int income = 0;
		
		while (true) {
			System.out.println("============ Menu List ===============");
			System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
			System.out.print("<메뉴선택(1~4)> : ");
			int choice = scan.nextInt();
			//System.out.println("choice: " + choice);
		
			if (choice == 0) {
				System.out.println(">> Finish");
				System.out.println("오늘 매출 총액 : " + income + "원");
				break;
			}
			
			System.out.print("수량선택 : ");
			int num = scan.nextInt();
			//System.out.println("number : " + num);
		
			System.out.print("입금액 : ");
			int mon = scan.nextInt();
			//System.out.println("money : " + mon);
		
			//계산
			int tot = 0; //판매액 = 메뉴단가 * 수량
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
			// System.out.println("tot : " + tot);
		 
			/* switch문도 사용 가능 
			 *  switch (choice) {
		 	case 1 : tot = AMERICANO * num; break;
		 	case 2 : tot = CAFFELATTE * num; break;
		 	case 3 : tot = CAFFEMOCA * num; break;
		 	case 4 : tot = FRESHJUICE * num; break;
		 	}
		 	System.out.println("tot : " + tot);
			*/
		 
			int rest = mon - tot;
			// System.out.println("rest : " + rest);
			income += tot; //총 매출액 구하기 
			
			System.out.println("===================");
			System.out.println("입금액 : " + mon);
			System.out.println("판매액 : " + tot);
			System.out.println("잔액 : " + rest);
			System.out.println();
			}
		

	}

}
