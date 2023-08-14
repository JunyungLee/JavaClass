package com.mystudy.array4_2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		/* 문제 : 2차원 배열을 사용하여 
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		1. 2차원 배열 num2dim 값을 화면 출력 : 10 20 30 ...
		2. num2dim 의 세번째 값인 30을 100으로 변경하고 화면출력
		3. num2dim의 크기만큼 num2Copy 배열을 선언하고 
		   num2dim ----> num2Copy 데이터 복사 후 
		   num2Copy 데이터 화면 출력
		*** 데이터 복사 형태 확인 : 얕은복사(주소값복사), 깊은복사(물리적복제) 
		*/
		int[][] num2dim = { {10, 20}, 
							{30, 40}, 
							{50, 60} 
						  };
		
		/*
		num[0][0];
		num[0][1];
		num[1][0];
		num[1][1];
		num[2][0];
		num[2][1];
		*/
		
		//1.
		System.out.println("----1번문제----");
		
		for(int i = 0; i < num2dim.length; i++) {
			System.out.println(Arrays.toString(num2dim[i]));
		}
	
		System.out.println("---이중 for 문 사용 데이터 출력---");
		for (int i = 0; i < num2dim.length; i++) {
			//2차원 배열의 요소(1차원 배열데이터)
			for(int idx = 0; idx <num2dim[i].length; idx++) {
				System.out.print(num2dim[i][idx] + " ");
			}
		}
		System.out.println();
		
		System.out.println(Arrays.toString(num2dim)); //주소값 출력
		System.out.println(Arrays.deepToString(num2dim)); //2차원 배열 출력
		
		//2.
		System.out.println("----2번문제 ----");
		
		System.out.println("num2dim[1][0] : " + num2dim[1][0]);
		num2dim[1][0] = 100;
		System.out.println("num2dim[1][0] : " + num2dim[1][0]);
		
		for (int i = 0; i < num2dim.length; i++) {
			for(int idx = 0; idx <num2dim[i].length; idx++) {
				System.out.print(num2dim[i][idx] + " ");
			}
		}
		System.out.println();
		
		//3.
		System.out.println("---3번문제---");
		
		int[][] num2Copy = new int [num2dim.length][];
		System.out.println("num2Copy : " + Arrays.toString(num2Copy));
		for (int i = 0; i < num2Copy.length; i++) {
			for(int idx = 0; idx < num2Copy[i].length; idx++) {
				System.out.print(num2Copy[i][idx] + " ");
			}
		}
		System.out.println();
		
		System.out.println("---데이터 직접 복사 ---");
		for(int j = 0; j < num2dim.length; j++) {
			for(int i = 0; i < num2dim[j].length; i++) {
				num2Copy[j][i] = num2dim[j][i];
			}
		}
		System.out.println("--------------------");
		
		System.out.println("num2dim == num2Copy : " + (num2dim == num2Copy));
		System.out.println("num2dim[0] == num2Copy[0]: " + (num2dim[0] == num2Copy[0]));
		
		System.out.println();

		/*
		System.out.println("num2dim == num2Copy : " + (num2dim == num2Copy));
		System.out.println("num2dim[0] == num2Copy[0]: " + (num2dim[0] == num2Copy[0]));
		System.out.println("num2dim[1] == num2Copy[1]: " + (num2dim[1] == num2Copy[1]));
		System.out.println("num2dim[2] == num2Copy[2]: " + (num2dim[2] == num2Copy[2]));
		*/
		//clone(), copyof() 등 복사기능 사용 - 자습
		/*System.out.println("-----clone 활용-------");
		
		num2Copy = num2dim.clone();
		num2Copy[0] = num2dim[0].clone();
		System.out.println("num2dim[0] == num2Copy[0]: " + (num2dim[0] == num2Copy[0]));
		num2Copy[1] = num2dim[1].clone();
		System.out.println("num2dim[1] == num2Copy[1]:" +(num2dim[1] == num2Copy[1]));
		num2Copy[2] = num2dim[2].clone();
		System.out.println("num2dim[2] == num2Copy[2]: " + (num2dim[2] == num2Copy[2]));
		
		for(int i = 0; i < num2Copy[i].length; i++) {
			num2Copy[i] = num2dim[i].clone();
		}
		*/
		
	}

}
