package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		// String 클래스 : 문자열 저장, 처리하기 위한 클래스 
		// String 클래스 : 참조형 데이터 타입
		// String 데이터는 불변임(immutable)
		//---------------------------
		// 사용형식 2가지
		// String str = "홍길동"; //기본 데이터 타입처럼 사용 가능 ->편하게 사용하기 위해 허용하는 방식
		// String str = new String ("홍길동"); //객체(인스턴스) 생성
		//------------------------------
		String str1 = "홍길동"; //str2랑 같은 주소 공유
		String str2 = "홍길동";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		//System.out.println("str1 == str2 : " + str1 == str2); //컴파일 오류 안나도 괄호 사용해주기
		// == : 객체(인스턴스, 주소값) 비교 (동일 객체 여부 확인)
		System.out.println("str1 == str2 : " + (str1 == str2)); //주소값! 괄호 꼭 사용해주어야 함
		System.out.println("str1.equals (str2) : " + str1.equals(str2));
		System.out.println("-----------");
		
		String strObj1 = new String("홍길동"); //str1, str2랑 다른 주소
		String strObj2 = new String("홍길동"); // str1, str2, strObj1과 다른 주소
		System.out.println("strObj1 : " + strObj1);
		System.out.println("strObj2 : " + strObj2);
		System.out.println("str1 == strObj1:" + (str1 == strObj1)); //동일한 주소값? -동일객체?
		System.out.println("strObj1 == strObj2 : " + (strObj1 == strObj2));
		
		System.out.println("==== 문자열 값 비교 equals() 사용 ====");
		// equals() : 문자열 값을 비교할 때는 반드시 equals() 사용할 것 
		System.out.println("str1.equals (str2) : " + str1.equals(str2));
		System.out.println("str1.equals (strObj1):" + str1.equals(strObj1)); //동일한 문자열?
		System.out.println("strObj1.equals (strObj2):" + strObj1.equals(strObj2)); //동일한 문자열?

	}

}
