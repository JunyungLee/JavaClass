package com.mystudy.list4_list_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_String_Exam {

	public static void main(String[] args) {
		/* List 중 ArrayList<String> 사용 실습
		문자열 : "홍길동", "이순신", "이순신", "을지문덕"
		1. ArrayList 타입 names 변수를 선언하고 데이터 입력
		2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
			출력 예) 홍길동, 이순신, 이순신, 을지문덕
		3. List에 있는 데이터의 첫글자만 출력
			출력 예) 홍, 이, 이, 을
		4. 이름이 을지문덕 찾아서 "인덱스번호 : 이름" 형태로 출력 
			예) 3: 을지문덕
		5. 이름이 "이순신" 데이터 모두 삭제
		 =====================================*/
		//ArrayList<String> names = new ArrayList<String>();
		//List<String>names = new ArrayList<String>();
		LinkedList<String> names = new LinkedList<String>();
		names.add("홍길동");
		names.add("이순신");
		names.add("이순신");
		names.add("을지문덕");
		System.out.println(names);
		
		System.out.println("---2번---");
		for (int i = 0; i < names.size(); i++) {
			if (i == 0) {
				System.out.print(names.get(i));
			} else {
				System.out.print(", " + names.get(i));
			}
		}
		System.out.println();
		System.out.println(names);
		
		System.out.println("---3번 : list 에 있는 데이터 첫글자만 출력---");
		//String() : substring -> 일부문자열 추출
		for (int i = 0; i < names.size(); i++) {
			if (i == names.size() - 1 ) {
				System.out.println(names.get(i).substring(0,1));
			} else {
				System.out.print(names.get(i).substring(0,1) + ", ");				
			}
		}
		//String() : charAt -> 원하는 인덱스 번호 문자 추출
		for (int i = 0; i < names.size(); i++) {
			if (i == names.size() - 1 ) {
				System.out.println(names.get(i).charAt(0));
			} else {
				System.out.print(names.get(i).charAt(0) + ", ");				
			}
		}
		
		//개선된 for문 
		boolean isFirst = true;
		for(String name : names) {
			if(isFirst) {
				System.out.println(name.charAt(0));
				isFirst = false;
			} else {
				System.out.print("," + name.charAt(0));
			}
		}
		System.out.println();
		System.out.println("----4 : 인덱스 번호 + 이름 출력----");
		for (int i =0; i < names.size(); i++) {
			if (names.get(i).length() >= 4) {
				System.out.println(i + ":" + names.get(i));
			}
		}
		//인덱스 번호 출력하라고 했기 때문에 기본 for문 사용해주기
		for (int i = 0; i < names.size(); i++) {
			if ("을지문덕".equals(names.get(i))) {
				System.out.println(i + " : " + names.get(i) );
			}
		}
		
		System.out.println("--- 5 : 이순신 데이터 모두 삭제 ---");
		for (int i = 0; i < names.size(); i++) {
			if ("이순신".equals(names.get(i))) {
			names.remove(i--);
			}
		}
		System.out.println(names);
	}

}
