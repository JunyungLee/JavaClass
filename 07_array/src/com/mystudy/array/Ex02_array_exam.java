package com.mystudy.array;

import java.util.Arrays;

public class Ex02_array_exam {

	public static void main(String[] args) {
		/* (실습) 문제: 배열에 저장된 숫자의 합계 구하기(변수명 nums)
		 저장 숫자: 3, 5, 7, 1, 2, 4, 6, 8, 9, 10 
		 0.위 숫자가 저장된 배열 만들기
		 1.배열에 저장된 데이터 화면출력(반복문 사용)
		 2.배열에 저장된 데이터 합계 구하기
		 3.합계결과 출력
		 -----------------------------------------------*/
		int [] nums = new int [] {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
		System.out.println(Arrays.toString(nums));
		
		nums[0] = 3; 
		System.out.println("nums[0] :" + nums[0]);
		nums[1] = 5;
		System.out.println("nums[1] :" + nums[1]);
		nums[2] = 7;
		System.out.println("nums[2] :" + nums[2]);
		nums[3] = 1;
		System.out.println("nums[3] :" + nums[3]);
		nums[4] = 2;
		System.out.println("nums[4] :" + nums[4]);
		System.out.println("---------------------------");
		//.....
		
		int sum = 0;
		sum = sum + nums[0];
		sum = sum + nums[1];
		sum = sum + nums[2];
		sum = sum + nums[3];
		sum = sum + nums[4];
		System.out.println(sum);
		System.out.println("-----------------");
		//----------
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("합계 : " + sum);
		
		System.out.println("===2번=====");
				
		/* (실습) 문제 : 배열값 중 홀수합, 짝수합 구하기 
		배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
		배열에 있는 값 중 홀수는 홀수끼지 합산(oddSum)
		짝수합계, 홀수합계 출력
		 */
		int evenSum = 0;
		int oddSum = 0;
		
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]% 2 == 0) {
				evenSum += nums[i];
			} else {
				oddSum += nums[i];
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
		System.out.println();
		
	}
}