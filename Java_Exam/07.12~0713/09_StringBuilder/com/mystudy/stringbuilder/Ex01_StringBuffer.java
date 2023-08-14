package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer 클래스 
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		String str = sb.toString(); //StringBuffer의 저장 전체 문자열 불러오기(확인)
		System.out.println("sb.length() : " + sb.length()); //저장한 문자열의 길이 
		System.out.println("sb.capacity() : " + sb.capacity()); //저장할 수 있는 문자열의 용량 
		
		System.out.println("---- String : 데이터 불변(immutable) ----");
		String str1 = sb.toString(); // String 객체로 변환하기 위해서 toString을 통해 String 객체로 변환 후 어떤 문자열이 저장되어 있는지 확인
		System.out.println("str1 : " + str1);
		str1 = str1.concat(" 반갑습니다");
		System.out.println("str1 : " + str1);
		String str2 = str1.concat(" 반갑습니다");
		System.out.println("str2 :" + str2);
		System.out.println("str1 == str2 : " + (str1 == str2)); //false
		System.out.println("---------");
		
		System.out.println("--- StringBuffer : 데이터 변경 가능 ----");
		System.out.println("sb : " + sb.toString());
		
		sb.append(" 반갑습니다").append("~~~"); 
		System.out.println("After append sb : " + sb.toString());
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity()); 
		
		sb.reverse();
		System.out.println("After reverse sb : " + sb.toString());	
		sb.reverse();
		System.out.println("After reverse sb : " + sb.toString());	
		
		System.out.println("==== delete(), insert(), replace() ====");
		//Hello Java!!! 반갑습니다~~~
		StringBuffer sb2 = sb.delete(0, 6); //특정 위치에 있는 것 삭제(substring과 같이 두가지 인덱스로 범위 지정 후 사용)
		System.out.println("sb.delete(0, 6) : " + sb2.toString());
		System.out.println("sb : " + sb.toString());
		System.out.println("sb == sb2 : " + (sb == sb2));
		
		sb.insert(0, "Hello ");
		System.out.println("sb.insert(0, \"Hello \") : " + sb.toString());
		
		sb.replace(0, 5, "Hi,");
		System.out.println("sb.replace(0, 5, \"Hi,\") : " + sb.toString());
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity()); 
		System.out.println("--------------");
		
		 sb2 = new StringBuffer(100);
		 System.out.println("sb2.length() : " + sb2.length());
		 System.out.println("sb2.capacity() : " + sb2.capacity()); 
		 
		 sb2.append("안녕하세요").append(" 반갑습니다!!!");
		 System.out.println("sb2 : " + sb2.toString());
		
		 System.out.println("sb2.length() : " + sb2.length());
		 System.out.println("sb2.capacity() : " + sb2.capacity()); 
		 
		 System.out.println("--- trimToSize () 실행하면 ---");
		 sb2.trimToSize(); //남은 용량의 크기, 여유공간 줄이기 -> return 값이 없다(void)
		 System.out.println("sb2.length() : " + sb2.length());
		 System.out.println("sb2.capacity() : " + sb2.capacity()); 
		 
		 System.out.println("----- >> sb2.setLength(5) 실행하면 -----");
		 //sb2.setLength(5); //데이터 크기 설정 (작게 설정하면 delete 효과)
		 sb2.delete(5, sb2.length()); //앞에 5개 남기고 모두 삭제 
		 System.out.println("sb2 : " + sb2.toString());
		 System.out.println("sb2.length() : " + sb2.length());
		 System.out.println("sb2.capacity() : " + sb2.capacity()); 
		 
		 System.out.println("----- >> sb2.setLength(0) 실행하면 -----");
		 //sb2.setLength(0);
		 sb2.delete(0, sb.length());
		 System.out.println("sb2 : " + sb2.toString());
		 System.out.println("sb2.length() : " + sb2.length());
		 System.out.println("sb2.capacity() : " + sb2.capacity()); 
		 
		 
		
		
		
	}

}
