package com.mystudy.scanner5_guess;

import java.util.Scanner;

/* 숫자 추측 게임
컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
선택 기회 5회
---------------------
Math.random() : 0 <= random값 < 1 범위의 실수값 
컴숫자 : 70 인 경우 
  사람이 선택한 숫자(80)가 크면 : 생각한 숫자보다 작다는 메시지 출력
  사람이 선택한 숫자(50)가 작으면 : 생각한 숫자보다 크다는 메시지 출력
5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
-----
다시 도전하시겠습니까?(y,n) 
---------------------------
*/

public class GuessNumberGame {
	private int comNum = (int)(Math.random() * 100 + 1);
	private int guessNum;
	private int count;
	private String answer;
	private int min = 1;
	private int max = 100;
	
	Scanner scan = new Scanner(System.in);
	public void startGame() {
		System.out.println("---Game을 시작합니다---");
		while (true) {
			playGame(scan);
			selectNumber(min, max);
			System.out.print("다시 도전하시겠습니까? : ");
			if ("n".equalsIgnoreCase(scan.nextLine())) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}
	
	private void playGame (Scanner scan) {
		// 1. 컴퓨터가 1~100까지의 숫자 중 하나를 선택 -> 입력 		
		comNum = (int)(Math.random() * 100 + 1);
		System.out.println("컴 : 1~100 까지의 숫자 중 하나를 생각했습니다.");
		System.out.println("확인 용 : " + comNum);
		
		min = 1; 
		max = 100; //초기화 식 , 변수선언은 필드 변수 하는 곳에 초기화는 시작 전에 작성해주기
		for(int i = 1; i < 5; i++) {
		//int count = 1;
		///while (count <= 5) {guessNum(count)}
		// 2. 사람이 숫자를 선택  -> 입력
		guessNum = selectNumber(min, max);
		if (guessNum < min || guessNum > max) {
			System.out.println("범위 확인하고 다시 입력하세요!!");
			continue;
		}
		
		// 3. 사람 선택 숫자와 컴퓨터 숫자 비교 판정 -> 처리 
			System.out.println("기회가 " + (4-count) +"만큼 남았습니다");		
			count++;
			
			if (guessNum == comNum) {
				System.out.println("정답입니다!" + "제가 생각한 숫자는" + comNum + "입니다"); 
				break; 
			}
			if (guessNum < comNum) {
				System.out.println(guessNum +"보다 많습니다");
				min = guessNum + 1;
			}
			if (guessNum > comNum) {
				System.out.println(guessNum +"보다 작습니다");
				max = guessNum - 1;
			} 
			//System.out.println("다음선택값 범위 : " + min + " ~ " + max);
			
			// 5번 시도 후 여기까지 왔으면 실패
			if (i == 5) {
				System.out.println("실패!! 제가 생각한 숫자는 : "  + comNum + "입니다");
			}
		}
	}

	private int selectNumber(int min, int max) {
		int number = -1;
		while (true) {			
			try {
				System.out.print("당신이 생각한 숫자는 (" + min + " ~ " + max + ")>");
				number = Integer.parseInt(scan.nextLine());		
				break;
			} catch (NumberFormatException e) {
				System.out.println("[주의] 숫자값을 입력하세요");
			}
		}
		return number;
	}
	
	
	
	
}
