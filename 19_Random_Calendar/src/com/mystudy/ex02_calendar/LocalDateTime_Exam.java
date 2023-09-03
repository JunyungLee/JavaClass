package com.mystudy.ex02_calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDateTime_Exam {

	public static void main(String[] args) {
		// Calendar : 값이 변경됨 (Mutable 하다)
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println("cal.date : " + cal.get(Calendar.DATE));
		cal.add(Calendar.DATE, -3);
		System.out.println("cal 3일 전 : " + cal);
		System.out.println("cal.date 3일 전: " + cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("===================");
		// LocalDate, LocalTime, LocalDateTime : 데이터 불변 (Immutable) -like String()
		System.out.println("======= LocalDate ==========");
		LocalDate nowDate = LocalDate.now();
		System.out.println("LocalDate.now() : " + nowDate.toString()); //LocalDate.now() : 2023-07-31 형태의 문자열 출력 
		System.out.println("년 : " + nowDate.getYear());
		System.out.println("월 : " + nowDate.getMonthValue()); // 1~12 (+1 필요없다) 
		System.out.println("일 : " + nowDate.getDayOfMonth());
		
		LocalDate newLocalDate = nowDate.plusYears(2).plusMonths(2).plusDays(1); //chain
		System.out.println("nowDate : " + nowDate);
		System.out.println("newLocalDate : " + newLocalDate);
		
		System.out.println("======= LocalTime ==========");
		LocalTime nowTime = LocalTime.now();
		System.out.println("LocalTime.now() : " + nowTime.toString()); //16:52:44.375
		System.out.println("시 : " + nowTime.getHour());
		System.out.println("분 : " + nowTime.getMinute());
		System.out.println("초 : " + nowTime.getSecond());
		
		System.out.println("======== LocalDateTime =======");
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("LocalDateTime.now() : " + nowDT.toString()); //toString안해도 문자열로 준다!
		System.out.println("년 : " + nowDT.getYear());
		System.out.println("월 : " + nowDT.getMonthValue());
		System.out.println("일 : " + nowDT.getDayOfMonth());
		//----------------------------------------------------
		System.out.println("시 : " + nowDT.getHour());
		System.out.println("분 : " + nowDT.getMinute());
		System.out.println("초 : " + nowDT.getSecond());
		//--------------------------------------------------------
		
		System.out.println(nowDT.plusYears(2).plusMonths(3)); //->데이터 값 수정 => 새 데이터 생성
		
		
		
	}

}
