package com.mystudy.array;

//import java.util.Arrays;

public class Ex04_array_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기 
		int a = 100;
		int b = 200;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("-----------");
		//--------출력-----------------
		//System.out.println("a : 200");
		//System.out.println("b : 100");
		//-----------------------------
		int temp;
		temp = a; //a 값을 복사 후 
		a = b; // a가 값을 받는다 
		b = temp;
		
		System.out.println("---교환 후 결과----");				
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("=================");
		
		//              0    1    2    3    4    5
		int [] nums = {100, 200, 300, 400, 500, 600};
		System.out.println("배열의 크기 : " + nums.length);
		System.out.println("-----------");
		
		//배열 전체 데이터 화면출력
		printArray(nums);
		/*for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		*/
		System.out.println("=====데이터 뒤집기=====");
		
		//배열 데이터를 뒤집기
		//nums : {600, 500, 400, 300, 200, 100};
		/*--------------------------------
		//첫번째 0 <---> 마지막 5
		temp = nums[0];
		nums[0] = nums[5];
		nums[5] = temp;
		//두번째 1 <---> 다섯번째 4
		temp = nums[1];
		nums[1] = nums[4];
		nums[4] = temp;
		//세번째 2 <---> 네번째 3
		temp = nums[2];
		nums[2] = nums[3];
		nums[3] = temp;
		-------------------------------------*/
	
		for (int i = 0; i < nums.length / 2; i++) {
			int backIdx = nums.length -(i + 1);
			temp = nums[i];
			nums[i] = nums[backIdx];
			nums[backIdx] = temp;
		}
		printArray(nums);
		/*for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		*/
	}
	
	static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		}
	static void reverse (int [] nums) {
		for (int i = 0; i < nums.length / 2; i++) {
	
		int temp = nums[i];
		nums[i] = nums[nums.length -(i + 1)];
		nums[nums.length -(i + 1)] = temp;
		}
	}
}
	

