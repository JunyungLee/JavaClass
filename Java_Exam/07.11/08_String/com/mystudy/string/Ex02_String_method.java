package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String 클래스 메소드를 사용 문자열 처리 (단, 원본문자열 불변)
		//            0123456789
		String str = "Java World";
		System.out.println("str : " + str);
		
		System.out.println("--- charAt(인덱스번호) ---");
		char ch = str.charAt(0);
		System.out.println("str.charAt(0) : " + ch);
		System.out.println("str.charAt(1) : " + str.charAt(1));
		
		char[] ch2 = new char[4];
		/*ch2[0] = str.charAt(0);
		ch2[1] = str.charAt(1);
		ch2[2] = str.charAt(2);
		ch2[3] = str.charAt(3);
		----------------------*/
		for(int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch2));
		
		System.out.println("--- compareTo() : 문자열 비교(결과 : 음수, 0, 양수) ---"); //앞쪽부터 비교
		System.out.println("\"java\".compareTo(\"java\"): " + "java".compareTo("java"));
		System.out.println("aaa vs aaa : " + "aaa".compareTo("aaa")); //0
		System.out.println("bbb vs aaa : " + "bbb".compareTo("aaa")); //1
		System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa")); //2
		
		System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb")); //-1
		//     0123456789
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println();
		
		System.out.println("str.contains(\"Java\") : "+ str.contains("Java"));
		System.out.println();
		
		System.out.println("--- indexOf() : 문자(문자열) 위치값 확인 ---");
		System.out.println("str.indexOf('X') : " + str.indexOf('X')); // -1: 없다
		System.out.println("str.indexOf('J') : " + str.indexOf('J')); // 0 : 첫번째 위치
		System.out.println("str.indexOf(\"Java\") : " + str.indexOf("Java")); // 0 : 첫번째
		System.out.println("str.indexOf('a') : " + str.indexOf('a')); // 1 : 두번째 위치
		System.out.println("str.indexOf('a', 2) : " + str.indexOf('a', 2)); // 3 

		System.out.println("----- lastIndex0f() : 문자(문자열) 찾기 (뒤에서부터) -----");
		System.out.println("str.lastIndex0f('a') : " + str.lastIndexOf('a')); 
		
		System.out.println("---- startsWith(), endsWith() ----");
		System.out.println( "str.startsWith(\"Java\") : "+ str.startsWith("Java"));
		System.out.println( "str.startsWith(\"World\") : "+ str.startsWith("World"));
		
		System.out.println( "str.endsWith(\"Java\") : "+ str.endsWith("Java"));
		System.out.println( "str.endsWith(\"World\") : "+ str.endsWith("World"));
		System.out.println();
		
		System.out.println("---- isEmpty() ----");
		System.out.println("str : " + str);
		System.out.println( "str.isEmpty() : "+ str.isEmpty());
		System.out.println("str.length() : "+ str.length());
		
		str = ""; //빈문자열
		System.out.println("str : -" + str + "-");
		System.out.println( "str.isEmpty() : "+ str.isEmpty());
		System.out.println("str.length() : "+ str.length());
		System.out.println();
		
		System.out.println("---- replace() : 문자, 문자열 변경된 문자열 받기(리턴) ----");
		//     0123456789
		str = "Java World";
		System.out.println( "str : " + str);
		System.out.println("str.replace(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		System.out.println("str.replace(\"a\", \"m\") : " + str.replace("a", "m"));
		System.out.println( "str : " + str); //원본데이터 불변
		System.out.println("------");
		
		str = "Java Java";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Ja\", \"JA\") : " + str.replace("Ja", "JA"));
		System.out.println("str.replaceAll(\"Java\", \"Hello\") : " + str.replaceAll("Java", "Hello"));
		System.out.println("==========");
		
		System.out.println("---- substring() : 부분 문자열 추출 ----");
		//     0123456789
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println( "str.substring(5) : " + str.substring(5));
		System.out.println( "str.length() : " + str.length());
		
		//String java.lang.String.substring(int beginIndex, int endIndex)
		//beginIndex : 부터(포함)
		//endIndex : end 이전까지(불포함) -> 크기 - 1 data 까지 
		System.out.println( "str.substring(0, str.length()) : " + str.substring(0, str.length()));
		System.out.println( "str.substring(5, str.length()) : " + str.substring(5, str.length()));
		
		// 뒤에서 5개 문자만 사용
		System.out.println( "str.substring(str.length() - 5) : " 
				+ str.substring(str.length() - 5));
		System.out.println("-------------");
		
		str = "  Java World   ";
		System.out.println("str : -" + str + "-");
		System.out.println("str.trim() : -"+ str.trim() + "-");
		System.out.println("str.toUpperCase() : "+ str.toUpperCase());
		System.out.println("str.toLowerCase() : "+ str.toLowerCase());
		System.out.println("---------");
		
		System.out.println("---- String.valueOf() : 문자열로 변환 -----");
		int num = 100; 
		str = 100 + ""; // String <---- int
		str = String.valueOf(100); //"100" 문자열로 형변환, String 타입으로 형변환
		str = String.valueOf(num); //static 
		
		System.out.println("----- toCharArray() : 문자열을 char[]로 변환 ----- ");
		str = "Java World";
		System.out.println("str : " + str);
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println("charArray[0] : " + charArray[0]);
		
		
		
		
		
		
		
		
	}

}
