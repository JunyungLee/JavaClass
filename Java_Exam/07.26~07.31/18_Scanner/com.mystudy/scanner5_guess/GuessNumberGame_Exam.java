package com.mystudy.scanner5_guess;

import java.util.Scanner;

public class GuessNumberGame_Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			int comNum = (int)(Math.random() * 100 + 1);
			int count = 0;
			while (true) {			
				System.out.print("선택한 숫자는? : ");
				int selectNum = scan.nextInt();
			
				System.out.println("기회가 " + (4-count) +"만큼 남았습니다");		
				count++;
				if (comNum == selectNum) {
					System.out.println("정답입니다" + count + "만에 맞췄습니다");
					break;
				}
				if (comNum > selectNum) {
					System.out.println("생각한 숫자보다 큽니다");
				}
				if (comNum < selectNum) {
					System.out.println("생각한 숫자보다 작습니다");
				}
				if (count > 4) {
					System.out.println("실패 ! 제가 생각한 숫자는 : " + comNum);
					break;
				}
			}
		System.out.println("다시 도전하시겠습니까? : ");
		scan.nextLine();
		String answer = scan.nextLine();
		if (answer.equals("y")) {
			
		} else if (answer.equals("n")) {
			System.out.println("게임을 종료합니다");
			break;
		}
		
		}
		
			
		

		

	}

}