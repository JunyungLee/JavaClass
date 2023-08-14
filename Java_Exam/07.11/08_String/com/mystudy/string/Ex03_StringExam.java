package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		//String str = "901012-1234567"; //주민번호
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인
		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		//   예) 90년 10월 12일 또는 1990년 10월 12일
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		//참고) int num = Integer.parseInt("10"); //"10" -> 10
		//---------------------------------------------------
		
		//1-1-----------------------
		//            0123456789
		String str = "901012-1234567";
		System.out.println("주민번호 : " + str);
		System.out.println("str.length: " + str.length());
		if (str.length() == 14) {
				System.out.println("[정상] 14개가 맞습니다");
		} else {
			System.out.println("[비정상] 전체길이 " + str.length());
		}
		//1-2-----------------------------------
		System.out.println("--substring 사용--");
		System.out.println("str.substring() : " + str.substring(6, 7));
		if (str.subSequence(6, 7).equals("-")) {
			System.out.println("[정상] '-' 문자위치 7번째");
		} else {
			System.out.println("[비정상] 7번째 문자 " + str.substring(6, 7));
		}
		
		//7번째 문자가 '-' 아닌경우
		if (!"-".equals(str.subSequence(6, 7))) {
			System.out.println("[비정상2] 7번째 문자" + str.substring(6, 7));
		}
		
		System.out.println("--indexOf 사용--");
		System.out.println("str.indexOf : " + str.indexOf('-'));
		if (str.indexOf('-') == 6) {
			System.out.println("[정상] 7번째 값 '-' 맞습니다");
		} else {
			System.out.println("[비정상3] '-' 문장위치가 7번째 아님");
		}
		
		System.out.println("---charAt 사용---");
		System.out.println("str.charAt(6) : " + str.charAt(6));
		if (str.charAt(6) == '-') {
			System.out.println("[정상] 7번째 값 '-' 맞습니다");
		} else {
			System.out.println("[비정상4] 7번째 문자 '-' 아님");
		}
		//2----------------------
		//str = "901012-1234567";
		System.out.println("---생년월일 출력---");
		String yymmdd = str.substring(0, 6);
		System.out.println("yymmdd :" + yymmdd);

		String yy = str.substring(0, 2);
		String mm = str.substring(2, 4);
		String dd = str.substring(4, 6);
		System.out.println(yy + "년" + mm + "월" + dd + "일");
		
		char charFlag = str.charAt(7);
		String yyyy = "";
		if (charFlag == '1' || charFlag == '2') {
			//System.out.println("19" +yy + "년" + mm + "월" + dd + "일" );
			yyyy = "19" + yy;
		} else if (charFlag == '3' || charFlag == '4') {
			//System.out.println("20" +yy + "년" + mm + "월" + dd + "일" );
			yyyy = "20" + yy;
		}
		
		String flag = str.substring(7, 8);
		System.out.println("flag : " + flag);
		if ("1".equals(flag) || "2".equals(flag)) { //비교 == 쓰지 않도록 조심!
			yyyy = "19" + yy;
		} else if ("3".equals(flag) || "4".equals(flag)) {
			yyyy = "20" + yy;
		}
		
		System.out.println(yy + "년" + mm + "월" + dd + "일");
		System.out.println(yyyy + "년" + mm + "월" + dd + "일");
		//------------------
		int year = Integer.parseInt(str.substring(0,2));
		int month = Integer.parseInt(str.substring(2,4));
		int day = Integer.parseInt(str.substring(4,6));
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
		//3-------------------
		//str = "901012-1234567";
		System.out.println("---성별 확인---");
		int ch2 = Integer.parseInt(str.substring(7,8));
		if (ch2 == 1 || ch2 == 3) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}
		
		System.out.println("--#2 switch 로 성별 확인--");
		
		char sex = str.charAt(7);
		switch (sex) {
			case '1' :
			case '3' :
			System.out.println("남성입니다");
			break; 
			
			case '2' :
			case '4' :
			System.out.println("여성입니다");
			break;
		}
		
		//4-----------
		//String str = "901012-1234567";
		System.out.println("--- 월,일 값 검증 ---");
		
		String sMonth =	str.substring(2, 4);
		int month1 = Integer.parseInt(sMonth);
		if ( 1 <= month1 && month1 <= 12) {
			System.out.println("month 정상입니다");
		} else {
			System.out.println("month 비정상입니다");
		}
		
		
		if ( 1 <= day && day <= 31) {
			System.out.println("day 정상입니다");
		} else {
			System.out.println("day 비정상입니다");
		}
		
		
		

	}

}
