package com.mystudy.ex02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Exam {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("new Date() : " + date);
		
		// 월 : 0~11 - 0: 1월, 1: 2월, ... , 11: 12월
		date = new Date(2023 - 1900, 6, 31);
		System.out.println("new Date(2023, 7, 31) : " + date);
		System.out.println("==========");
		
		System.out.println("------ Calendar -------");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// 년, 월, 일
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH) +1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		
		// 시, 분, 초
		System.out.println("오전오후 : " + cal.get(Calendar.AM_PM)); //0-> 오전, 1->오후
		System.out.println("시(12시간) : " + cal.get(Calendar.HOUR));
		System.out.println("시(24시간) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리 초 : " + cal.get(Calendar.MILLISECOND));
		System.out.println("----------------");
		
		//년-월-일 시:분:초 또는 년/월/일 시:분:초
		String dateTime = cal.get(Calendar.YEAR) 
					+ "-" + (cal.get(Calendar.MONTH) + 1)
					+ "-" + cal.get(Calendar.DATE)
					+ " " + cal.get(Calendar.HOUR_OF_DAY)
					+ ":" + cal.get(Calendar.MINUTE)
					+ ":" + cal.get(Calendar.SECOND);
		System.out.println(">> 년-월-일 시:분:초 : " + dateTime);
		System.out.println();
		
		//calendar데이터 수정 가능
		cal.add(Calendar.YEAR, 2); //2년후
		cal.add(Calendar.MONTH, 2); //2달후
		cal.add(Calendar.DATE, -2); //2일전
		cal.add(Calendar.HOUR_OF_DAY, 2); 
		cal.add(Calendar.MINUTE, 2); 
		cal.add(Calendar.SECOND, 2); 
		
		dateTime = cal.get(Calendar.YEAR) 
				+ "-" + (cal.get(Calendar.MONTH) + 1)
				+ "-" + cal.get(Calendar.DATE)
				+ " " + cal.get(Calendar.HOUR_OF_DAY)
				+ ":" + cal.get(Calendar.MINUTE)
				+ ":" + cal.get(Calendar.SECOND);
		System.out.println(">> 변경 후 : 년-월-일 시:분:초 : " + dateTime);
		System.out.println();
		System.out.println("==================");
		
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		date = new Date();
		System.out.println("new Date() : " + date);
		System.out.println("y-M-d H:m:s : " + sdf.format(date));
		System.out.println("------------");
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //두자리씩 표기하는 형태
		System.out.println("yyyy-MM-dd HH:mm:ss : " + sdf.format(date));

		System.out.println("=========");
		// calendar 데이터 -> 수정가능하다
		cal.set(Calendar.YEAR, 2000);
		date = cal.getTime();
		System.out.println("yyyy-MM-dd HH:mm:ss : " + sdf.format(date));
		
		
		
	}

}
