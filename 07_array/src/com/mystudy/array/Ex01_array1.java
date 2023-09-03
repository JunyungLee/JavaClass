package com.mystudy.array;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {
		// 배열(array) : 동일한 데이터 타입들의 연속된 저장공간
		// 배열의 선언 : 자료형[] 변수명
		// 변수에 값을 저장 : 배열변수명[인덱스 번호] = 값; /->인덱스 번호는 0 부터 시작
		
		/* 배열의 선언 및 생성
		1. 자료형[] 변수명 = new 자료형[갯수];
		   자료형 변수명[] = new 자료형[갯수];
		2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		-------------------*/
		int[] arr = new int[5];
		System.out.println("arr : " + arr);
		//arr : [I@15db9742 --->주소값(저장위치) : 배열/int값/
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("-----");
		
		//int index = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		arr[0] = 10; //배열의 첫번째 위치 (인덱스번호 : 0번)에 10 설정(저장)
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 11;
		System.out.println("arr[1] : " + arr[1]);
		arr[2] = 12;
		System.out.println("arr[2] : " + arr[2]);
		arr[3] = 13;
		System.out.println("arr[3] : " + arr[3]);
		arr[4] = 14; //마지막 데이터 (크기 - 1) 
		System.out.println("arr[4] : " + arr[4]);
		//arr[5] = 15; // ArrayIndexOutOfBoundsException
		System.out.println("----------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println("---- 배열 length 속성 ----");
		//배열의 크기(length)를 확인할 수 있는 속성값
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		System.out.println("=========배열 선언 형태 2번==========");
		//2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		//                       0    1    2    3    4   : 인덱스번호
		int[] arr2 = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=== 배열 선언 형태 3번====");
		//3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		int[] arr3 = {10, 11, 12, 13, 14, 15};// 이 형태는 선언 되었을때와 동시에만 사용 가능 
		for (int idx = 0; idx < arr3.length; idx++) {
			System.out.println(arr3[idx]);
		}
		
		System.out.println("==================");
		int[] nums = new int[10];
		//초기값 설정 : 1~10 숫자를 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// 배열값 확인
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		System.out.println("=================");
		
		System.out.println("==== 영어 알파벳 문자 저장/출력(A~Z) ====");
		char[] ch = new char[26];
		System.out.println(Arrays.toString(ch));
		System.out.println("-" + ch[0] + "-");
		System.out.println("-" + '\u0000' + "-");
		ch[0] ='A'; //65(위치값)
		ch[1] ='B'; //66 <-- 'A' + 1
		ch[2] ='C'; //즉, ='A' + 2를 써도 똑같은 결과 //67 <-- 'A' + 2
		System.out.println("-------");
		
		ch[0] ='A' + 0; //A
		ch[1] ='A' + 1; //B
		ch[2] ='A' + 2; //C
		ch[3] ='A' + 3; //D
		System.out.println(Arrays.toString(ch));
		System.out.println("------------");
		
		//(실습) 데이터 A~Z 일괄입력(반복문 사용)
		char[] ch1 = new char[26];
		for(char i = 0; i < ch1.length; i++) {
			ch1[i] = (char) ('A' + i);
		}
		//(실습) 배열 데이터 화면 출력(반복문 사용)
		
		for(char i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(ch1));
		System.out.println();
		
		
	}

}
