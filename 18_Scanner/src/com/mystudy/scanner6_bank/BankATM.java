package com.mystudy.scanner6_bank;

import java.util.Scanner;

// 은행의 ATM
// 1.입금 2.출금 3.통장확인 0.종료

public class BankATM {
	private int money; // 통장계좌 금액
	private int deposit; //입금액
	private int withdraw; //출금액
	private int select; //선택 메뉴
	private int depositTot; //입금 총액 
	private int withdrawTot; //출금 총액
	
	Scanner scan = new Scanner(System.in);
	public void start() {
		while (true) {	
			show();
			process();
			if (select == 0) {
				System.out.println(">> 작업을 종료합니다");
				break;
			}
		}
	}
	private void show() {
		System.out.println("1.입금\t2.출금\t3.통장확인\t 0.종료");
		System.out.println("-------------------------------");
		System.out.print("원하는 업무를 선택해주세요 : ");
	}
	private void process() {
		
//		int select = -1; //초기값 설정!
//		try {
//			select = scan.nextInt();
//		} catch (Exception e) {
//			System.out.println("[예외발생] 잘못된 값이 입력되었습니다" + "메뉴 0~3 숫자만 입력하세요");
//		} finally {
//		scan.nextLine(); //줄바꿈 문자까지의 빈문자열("") 읽어서 처리(버림)
//		}
		
		
//		if (select == 0) {
//			System.out.println("종료");
//			return select;
//		}
		
		if (select == 1) {
			System.out.print("원하는 입금금액을 입력하세요 : ");
			inputMoney();
			//scan.nextLine();
			deposit = scan.nextInt();
			money += deposit; //통장잔액 -> 입금액 누적
			depositTot += deposit; //입금액 총합
		}
		if (select == 2) {
			System.out.print("원하는 출금금액을 입력하세요 : ");
			withdraw = scan.nextInt();
			money -= withdraw; //통장잔액 -> 출금액 누적
			withdrawTot += withdraw; //출금액 총합
		}
		if (select == 3) {
			System.out.println("== 통장을 확인합니다. ==");
			System.out.println("입금총액 : " + depositTot + "원");
			System.out.println("출금총액 : " + withdrawTot + "원");
			System.out.println("통장잔액 : " + money + "원");
		}
		System.out.println("-----------------------");
		} 		
	
	private void inputMoney() {
		while (true) {
			try {
				money += Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다" + "메뉴 0~3 숫자만 입력하세요");
			}
		}
	}
}

/*
-------------------------
1.입금 2.출금 3.통장확인 0.종료
-------------------------
> 작업선택 : 1
> 입금금액 : 10000
-------------------------
1.입금 2.출금 3.통장확인 0.종료
-------------------------
> 작업선택 : 3
::통장금액 : 10000 원
-------------------------
1.입금 2.출금 3.통장확인 0.종료
-------------------------
> 작업선택 : 2
> 출금금액 : 5000 원
-------------------------
1.입금 2.출금 3.통장확인 0.종료
-------------------------
> 작업선택 : 3
:: 통장금액 : 5000 원
-------------------------
1.입금 2.출금 3.통장확인 0.종료
-------------------------
> 작업선택 : 0
>> 작업을 종료합니다.

*/
//		int count = 0;
//		while(count < 4) {
//			select = excep();
//			if (select < 0 || select > 4) {
//				System.out.println("범위 확인하고 다시 입력하세요!!");
//				continue;
//			}
//	public int excep() {
//		select = -1;
//		while (true) {			
//			try {
//				select = scan.nextInt();		
//				break;
//			} catch (Exception e) {
//				System.out.println("[주의] 숫자값을 입력하세요");
//			}
//		}
//		return select;
//	}