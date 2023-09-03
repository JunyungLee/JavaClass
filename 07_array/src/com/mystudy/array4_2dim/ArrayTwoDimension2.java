package com.mystudy.array4_2dim;

public class ArrayTwoDimension2 {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 객체 생성
		// 타입[][] 변수명 = new 타입[크기값][크기값];
		// 타입 변수명[][] = new 타입[크기값][크기값];
		// 타입[][] 변수명 = {{..}, {..}, ... {..}};
		//--------------------------
		int[][] nums = new int [3][]; //2차원 배열 크기값은 반드시 지정, 크기값 둘다 지정 안하면 값 필요
		// 방법1: new int[2] - new 사용 1차원 배열 생성 선언
		nums[0] = new int[2];
		nums[0][0] = 10; 
		nums[0][1] = 20;
		
		// 방법2: new int[] {30, 40} - new 사용 1차원 배열과 데이터 동시 입력하는 방식
		nums[1] = new int [] {30, 40};
		
		// 방법3(X) : {30, 40} - 컴파일오류
		//nums[3] = {30, 40}; // -> 선언과 동시에 사용, Array constants can only be used in initializers
		nums[2] = new int[] {50, 60, 70, 80};
		
		
		
		
	}

}
