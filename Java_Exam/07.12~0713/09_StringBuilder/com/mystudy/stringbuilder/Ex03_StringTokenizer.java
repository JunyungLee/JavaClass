package com.mystudy.stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String 클래스의 split() vs StringTokenizer 클래스
		System.out.println("---- String split() ----");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str.toString());
		
		String[] strSplit = str.split(",");  //빈 문자열도 데이터로 인식
		System.out.println("strSplit.length : "+ strSplit.length);
		System.out.println(Arrays.toString(strSplit));
		
		System.out.println("--- str.split(\",\") 실행 결과 배열 ---" );
		for (int i =0; i < strSplit.length; i++) {
			System.out.println(i + " : " + strSplit[i]);
		}
		System.out.println();
		
	
		System.out.println("-- 개선된 for문으로 (또는 forEach) --");
		for (String str2 : strSplit) {
			System.out.println("-" + str2 + "-");
		}
		System.out.println("----");
		
		int idx = 0; 
		for (String str2 : strSplit) {
			System.out.println(idx + ": -" + str2 + "-");
			idx++;
		}
		
		System.out.println("\n==== StringTokenizer =====");
		str = "사과,배,복숭아, ,포도";
		System.out.println("str : " + str);
		
		StringTokenizer strToken = new StringTokenizer (str, ","); //객체 생성
		System.out.println("strToken.countTokens() : "+ strToken.countTokens()); //빈문자열 데이터 인식 x, 빈칸은 데이터 O
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println("-"+ token + "-");
		}
		// (주의) 토큰이 없을 때 nextToken() 사용하면 
		//strToken.nextToken(); --> NoSuchElementException 예외 발생
		System.out.println("strToken.countTokens() : "+ strToken.countTokens()); 
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println(token);
		} // 재사용 X
		System.out.println("============================");
		
		strToken = new StringTokenizer(str, ",");
		System.out.println("strToken.countTokens() : "+ strToken.countTokens()); //빈문자열 데이터 인식 x
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println(token);
		} // 다시 Token 후 사용
		
		System.out.println("===========");
		System.out.println("--- (실습) 토큰데이터 for 문으로 화면 출력 ---");
		
		strToken = new StringTokenizer(str, ","); //토큰 재생성
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		
		int tokenCnt = strToken.countTokens(); //데이터 갯수를 모를때는 while문으로만 가능
		for	(int i = 0; i < tokenCnt; i++) {
			if(strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println(token);
			System.out.println("토큰갯수 : " + strToken.countTokens());
			}
		}
		System.out.println("--- main() 끝 ---");
		

	}

}
