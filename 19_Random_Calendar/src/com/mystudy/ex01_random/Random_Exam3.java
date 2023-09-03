package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class Random_Exam3 {

	public static void main(String[] args) {
		// 오늘 당신의 행운지수 알아보기 (0~100)
		//Math.random(), Random 사용해서 행운지수 값 만들기
		//실행결과 출력 
		// 예) 2023년 7월 31일 당신의 행운지수(0~100)는 77 입니다
		//-----------------------------------------------
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //Month 값 : 0~11 + 1
		int date = calendar.get(Calendar.DATE);
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Date : " + date);
		System.out.println(year + "년" + month + "월" + date + "일");
		String yyyymmdd = year + "년" + month + "월" + date + "일";
		System.out.println("-------------------");
		
		//방법1 : Math.random () 사용하기 
		System.out.println("---- Math.random() 사용하기 ----");
		int result =  (int)(Math.random() * 101);
		System.out.println("2023년 7월 31일 당신의 행운지수(0~100)는 " + result + " 입니다");
		System.out.println( yyyymmdd +"당신의 행운지수(0~100)는" +  result + " 입니다");
		
		//방법2 : Random nextInt(숫자)사용하기
		System.out.println("---- Random 사용하기 ----");
		Random ran = new Random();
		result = ran.nextInt(101);
		System.out.println("2023년 7월 31일 당신의 행운지수(0~100)는 " + result + " 입니다");
		System.out.println( yyyymmdd + "당신의 행운지수(0~100)는 " + result + " 입니다");

	}

}
