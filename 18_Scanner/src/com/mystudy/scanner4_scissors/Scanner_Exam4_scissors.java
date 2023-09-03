package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class Scanner_Exam4_scissors {

	public static void main(String[] args) {
		/* Scanner를 이용한 가위, 바위 , 보 게임 *******
		// scissors, rock, paper
		// draw : 무승부, person_win, computer_win
		컴퓨터와 함께하는 가위,바위,보 게임
		0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
		2. 선택값 입력
		3. 결과 비교 후 승자, 패자 결정
		(반복) 게임 반복 진행 - 0 선택시 종료 처리
		=============================== */
		Scanner scan = new Scanner(System.in);
		final int scissors = 1;
		final int rock = 2;
		final int paper = 3;
	
		System.out.println("1. Scissors , 2. Rock, 3. Paper , 0. Finish");
		while(true) {
			System.out.println("===== Rock Scissors Paper Game Start =====");
			int choice = (int)(Math.random() * 3 + 1);
			
			String ch = "선택없음";
			switch (choice) {
				case 1 : ch = "Scissors"; 
				case 2 : ch = "Rock"; 
				case 3 : ch = "paper"; 
			}
			System.out.print("Rock Scissors Paper (person) : ");
			int mychoice = scan.nextInt();
			
			String pch = "선택없음";
			switch (mychoice) {
				case 1 : pch = "Scissors"; 
				case 2 : pch = "Rock";
				case 3 : pch = "paper"; 
		}
			if (mychoice == 0) {
				System.out.println("Finish this game");
				break;
			}
			System.out.print("Rock Scissors Paper (computer) : ");
			
			System.out.println(choice);
			
			System.out.println("----- Result!! -----");
			System.out.println("ME\tComputer");
			if (mychoice == 1 && choice == 1) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : draw!!");
			} else if (mychoice == 2 && choice == 2) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : draw!!");
			} else if (mychoice == 3 && choice == 3) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : draw!!");
			}
			if (mychoice == 1 && choice == 2) {
				System.out.println(pch+"\t" + ch);
				System.out.println("Result : computer win");
			} else if (mychoice == 2 && choice == 3) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : computer win");
			} else if (mychoice == 3 && choice == 1) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : computer win");
			}
			if (mychoice == 1 && choice == 3) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : person win"); 
			} else if (mychoice == 2 && choice == 1) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : person win");
			} else if (mychoice == 3 && choice == 2) {
				System.out.println(pch +"\t" + ch);
				System.out.println("Result : person win");
			}
			
			//------------------------------------------------
//			if (mychoice == 1) {
//				if (choice == 1) {
//					System.out.println("draw");
//				}
//				if (choice == 2) {
//					System.out.println("Com win");
//				}
//				if (choice == 3) {
//					System.out.println("Person win");
//				}
//			}
//			
//			if (mychoice == 2) {
//				if (choice == 1) {
//					System.out.println("Person win");
//				}
//				if (choice == 2) {
//					System.out.println("draw");
//				}
//				if (choice == 3) {
//					System.out.println("Com win");
//				}
//			}
//			
//			if (mychoice == 3) {
//				if (choice == 1) {
//					System.out.println("Com win");
//				}
//				if (choice == 2) {
//					System.out.println("Person win");
//				}
//				if (choice == 3) {
//					System.out.println("draw");
//				}
//			}
//			
//			//----------------------
//			String result = "판정안됨";
//			if (ch.equals(pch)) {
//				result = "draw";
//			}
//			
//			if (ch.equals("Scissors")) {
//				if (pch.equals("Rock")) {
//					result = "Person win";
//				}
//				if (pch.equals("Paper")) {
//					result = "Com win";
//				}
//			}
//			if (ch.equals("Rock")) {
//				if (pch.equals("Scissors")) {
//					result = "Com win";
//				}
//				if (pch.equals("Paper")) {
//					result = "Person win";
//				}
//			}
//			if (ch.equals("Paper")) {
//				if (pch.equals("Scissors")) {
//					result = "Person win";					
//				}
//				if (pch.equals("Rock")) {
//					result = "Com win";
//				}
//			}
//			
//			
//			//승/패 결과 출력
//			System.out.println(">>> result : " + result);
			
			System.out.println();	
		}
		
		
	}
//	private int selectPerson() { // => 다른 문자열 넣었을때 발생하는 예외 해결
//		int select = -1;
//		while (true) {	
//			try {
//				System.out.print("Rock Scissors Paper (person) : ");
//				select = Integer.parseInt(scan.nextLine()); //숫자 ->문자열로 (숫자가 들어오면 끝내겠다)
//				if(select >= 0 && select <= 3) {
//					break;
//				} else {
//					System.out.println("::: 잘못된 값 입력, 숫자 0~3 입력하세요 ");
//				}
//			} catch (Exception e) {
//				System.out.println ("::: 잘못된 값 입력, 숫자 0~3 입력하세요");
//			}
//		}
//		return select;
//	}


}


