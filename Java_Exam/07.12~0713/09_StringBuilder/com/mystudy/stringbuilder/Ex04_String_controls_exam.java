package com.mystudy.stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex04_String_controls_exam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신  이순신 Tom 홍길동";
		  String str2 = "    TOM   을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸 1개(" ")를 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
		     (String split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...  // .append
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... //배열 데이터 - charAt[0]
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		********************************/
		String str1 = "홍길동 이순신  이순신 Tom 홍길동";
		String str2 = "    TOM   을지문덕 김유신 연개소문";
		
		// 1번
		StringBuilder sb = new StringBuilder(); // String sb ="";
		sb.append(str1);		//sb = 홍길동; str2 = 이순신;
		sb.append(str2);
		System.out.println(sb);
		
		//2번
		//String sb1 = sb.toString(); 
		String[] names = sb.toString().split(" "); 
		System.out.println("names.length : "+ names.length);
		System.out.println(Arrays.toString(names));
				
		//저장된 배열 데이터 확인 -> 공백 포함
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		//화면출력 -> 공백 제외
		System.out.println("----length() 사용 ---");
		for(int i = 0; i < names.length; i++) {
			if(names[i] == null) continue;
			if(names[i].trim().length() > 0 ) {
				System.out.print(names[i] + " ");
			}
		}
		System.out.println("-----------------");
		for(int i = 0; i < names.length; i++) {
			if(names[i] == null) continue;
			if(names[i].trim().length() > 0 ) continue;
			if(i == 0) {
				System.out.print(names[i]);
			} else {
				System.out.print("," + names[i] );
			}
		}
		
		//3. -> , 추가
		System.out.println();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 0) {
				continue;
			}
			sb2.append(names[i] + ",");  // names[0] = 홍길동  sb2.append(names[0]) 0 ~ length									
											//names[1] = 이순신 sb2.append(names[1])
		}
		System.out.println(sb2); //-> 마지막 , 까지 출력 
		sb2.delete(sb2.length()-1, sb2.length());
		System.out.println(sb2); // -> 마지막 , 제거 후 출력
	
		
		System.out.println();
		System.out.println("---------------");
		for(int i = 0; i < names.length; i++) {
			if(names[i] == null) continue;
			if(names[i].trim().length() > 0 ) continue;
			if(i == 0) {
				sb2.append(names[i]);
			} else {
				sb2.append(",").append(names[i]);
			}
		}
		System.out.println("sb2 : "+ sb2.toString());
		
		//4. -> 첫글자만 추출
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 0) {
				continue;
			}
			sb3.append(names[i].charAt(0) + ",");
		}
		sb3.delete(sb3.length() - 1, sb3.length());
		System.out.println(sb3);
		
		System.out.println("-------------------");
		/*for(int i = 0; i < names.length; i++) {
			if(names[i] == null) continue;
			if(names[i].trim().length() > 0 ) continue;
			sb3.append(names[i].charAt(0)).append(",");
		}
		sb3.delete(sb3.length() -1, sb3.length());
		//sb3.deleteCharAt(sb3.length() -1);
		System.out.println("sb3 : "+ sb3);
	*/
		System.out.println("==== StringTokenizer 사용 ====");
		System.out.println("StringBuilder sb : " + sb);
		StringTokenizer tokens = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰갯수 : " + tokens.countTokens());
		System.out.println("----");
		
		
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		System.out.println("--------");
		System.out.println("토큰갯수 : " + tokens.countTokens());
		
		System.out.println("========");
		tokens = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰갯수 : " + tokens.countTokens());
		
		String[] names2 = new String[tokens.countTokens()];
		System.out.println("names2.length : " + names2.length);
		System.out.println(Arrays.toString(names2));
		
		int idx = 0;
		while (tokens.hasMoreTokens()) {
			//배열에 저장
			names2[idx++] = tokens.nextToken();
		}
		System.out.println(Arrays.toString(names2));
		
		
		
		
		
		
		
		
	}

}
