package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class ScannerScissors{
	private int scissors = 1;
	private int rock = 2;
	private int paper = 3;
	private int mychoice;
	int choice = (int) (Math.random() * 3 + 1);

	
	
	public ScannerScissors() {

	}
	
	public void start () {
		Scanner scan = new Scanner (System.in);
		while (true) {
			show();
			input(scan);
			print();
			if (mychoice == 0) {
				System.out.println("가위바위보를 종료합니다");
				break;
			}
		}
	}
	
	private void show() {
		System.out.println("----- Rock Scissors Paper play start ------");
		System.out.println("1 - Scissors");
		System.out.println("2 - Rock");
		System.out.println("3 - Paper");
		
	}
	
	public void input(Scanner scan) {
		System.out.print("가위바위보(person) : ");
		int mychoice = scan.nextInt();
		System.out.print("가위바위보(computer) : ");
		
		System.out.println(choice);
		
	}
	public void print() {
		if (mychoice == 1 && choice == 1) {
			System.out.println("무승부 입니다");
		} else if (mychoice == 2 && choice == 2) {
			System.out.println("무승부입니다");
		} else if (mychoice == 3 && choice == 3) {
			System.out.println("무승부입니다");
		} 
		
		if (mychoice == 1 && choice == 3) {
			System.out.println("person win"); 
		} else if (mychoice == 2 && choice == 1) {
			System.out.println("person win");
		} else if (mychoice == 3 && choice == 2) {
			System.out.println("person win");
		}
		
		if (mychoice == 1 && choice == 2) {
			System.out.println("computer win");
		} else if (mychoice == 2 && choice == 3) {
			System.out.println("computer win");
		} else if (mychoice == 3 && choice == 1) {
			System.out.println("computer win");
		}
	}
	

}
