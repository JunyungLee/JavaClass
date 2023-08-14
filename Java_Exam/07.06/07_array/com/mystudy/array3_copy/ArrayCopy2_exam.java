package com.mystudy.array3_copy;

import java.util.Arrays;

public class ArrayCopy2_exam {

	public static void main(String[] args) {
		/* 문제1 : int 타입의 데이터 4개를 저장할 수 있는 배열 (num1)에 
		1. 10, 20, 30, 40 숫자를 입력하고 화면 출력
		2. 세번째 데이터를 100 으로 바꾸고 화면 출력
		3. 20 숫자를 찾아서 99로 변경 
		--------------------------------------*/
		System.out.println("====1번 문제 ====");
		/*int[] num1 = new int [4];
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		*/
		//int [] num1 = new int[] {10, 20, 30, 40}

		int[] num1 = {10, 20, 30, 40};
		printData("num1", num1);
		
		/*for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		->static으로 */
		//--------------2----------------
		num1[2] = 100;
		printData("num1", num1);
		//---------------3-----------------
		for(int i = 0; i < num1.length; i++) {
			if (num1[i] ==20) {
				num1[i] = 99;
			}
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		
				
		/* 문제2 : num1과 크기가 같은 배열 num1Copy를 만들고
		num1Copy 에 num1 데이터를 복사하고 화면 출력
		주소값 복사인지 깊은복사(물리적 복사) 여부 확인
		--------------------------------------*/
		System.out.println("====2번문제=====");
		
		int[] num1Copy = Arrays.copyOf(num1, num1.length);
	
		for(int i = 0; i < num1Copy.length; i++) {
			num1Copy[i]= num1[i]; 
		}
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		
					
		//주소값 동일하냐? 동일객체냐?
		if(num1 == num1Copy) {
			System.out.println(":: num1, num1Copy : 동일주소, 동일객체");
		}
		if(num1 != num1Copy) {
			System.out.println(":: num1, num1Copy : 서로 다른주소, 별개의 다른객체");
		}
		
		System.out.println("\n ===다른 방법으로 처리 ====");
		System.out.println("===1차원 배열 clone() 처리 ===");
		num1Copy = num1.clone();
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy)); 
		
		System.out.println("\n === Arrays.copyOf 사용 ===");
		num1Copy = Arrays.copyOf(num1, num1.length);
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		
		System.out.println("\n === Arrays.copyOfRange 사용 ===");
		num1Copy = Arrays.copyOfRange(num1Copy, 0, num1.length);
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		
	}
	static void printData(String name, int[] num) {
		System.out.print(name + ": ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
