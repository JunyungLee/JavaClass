package com.mystudy.ex01_random;

import java.util.Date;
import java.util.Random;

public class Random_Exam1 {

	public static void main(String[] args) {
		// Random 클래스 : 난수(임의의 수)를 생성하는 클래스
		// 정수 추출 : nextInt() - int 타입의 난수 생성
		//          nextInt(10) : 0~9 범위의 난수 생성
		// 실수 추출 : nextFloat() - 실수형 float 타입의 난수 생성
		//        : nextDouble() - 실수형 double 타입의 난수 생성
		// 논리형 : nextBoolean() - true, false 둘 중 하나 생성
		//--------------------------------------------------
		//Random ran = new Random(new Date().getTime());
		Random ran = new Random(); //객체 생성을 해야만 메소드 호출해서 사용 가능!
		System.out.println("---- nextBoolean() ----");
		System.out.println("ran.nextBoolean() : " + ran.nextBoolean());
		System.out.println("ran.nextBoolean() : " + ran.nextBoolean());
		
		for (int i = 0; i < 10; i++) {
			System.out.print(ran.nextBoolean() + " ");
		}
		System.out.println();
		
		System.out.println("---- nextInt() ----");
		System.out.println("ran.nextInt() : " + ran.nextInt());
		System.out.println("ran.nextInt() : " + ran.nextInt());
		System.out.println("ran.nextInt() : " + ran.nextInt());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextInt());
		}
		
		System.out.println("--- nextFloat() ----");
		
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextFloat());
		}
		
		System.out.println("--- nextDouble() ---");
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextDouble());
		}
		
		
		
		

	}

}
