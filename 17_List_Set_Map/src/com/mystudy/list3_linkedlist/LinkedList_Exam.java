package com.mystudy.list3_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Exam {

	public static void main(String[] args) {
		// LinkedList : List 속성(List 인터페이스 구현체) 
		LinkedList<String> list = new LinkedList<String>();
		//List<String> list = new LinkedList<String>();
		list.add("홍길동"); //0 번 인덱스
		list.add("홍길동"); //1 번 인덱스
		list.add("김유신"); 
		System.out.println("list : " + list);
		System.out.println("list.get(0): "+ list.get(0)); //0번 인덱스 값 불러오기 
		
		list.remove("홍길동");
		System.out.println("list : " + list);
		
		String str = "홍길동,김유신,홍길동,홍길동,김유신,강감찬,을지문덕,홍경래,김유신,홍길동";
		String[] names = str.split(",");
		System.out.println("names : " + Arrays.toString(names));
		
		//배열에 있는 데이터를 리스트에 추가 
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println("list : " + list);
		System.out.println("==== 실습 =====");
		//---------------------------------------
		//list : ["홍길동,김유신,홍길동,홍길동,김유신,강감찬,을지문덕,홍경래,김유신,홍길동"]
		//(실습) 리스트에 있는 데이터 변경하기
		//1. 홍길동: 모두 삭제(Delete)
		//2. 김유신 ---> 김유신 2 모두 수정(Update)
		
		System.out.println("=== 홍길동 데이터 모두 삭제 ===");
		System.out.println("삭제 전 : "+ list);
		System.out.println(list.size());
		//뒤에서부터 찾아서 삭제 
		/*int size = list.size();
		int lastIdx = list.size() - 1;
		for(int i = lastIdx; i >=0; i--) {
			if("홍길동".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.remove(i);
			}
		}
		System.out.println(list);
		
		System.out.println("list.remove(\"홍길동\") : "+ list.remove("홍길동")); 
		// 밑에 while문 2개 같은문장 -> 찾아서 삭제할 수 없을때까지 삭제 반복처리
		while (list.remove("홍길동")) {} //return값 : true or false => 찾아서 삭제해라
		while(true) {
			boolean removeSuccess = list.remove("홍길동");
			if (!removeSuccess) { //삭제 실패시
				break;
			}
		}
		*/
		//-----------------------------------------------------------
		System.out.println("list.contains(\"홍길동\") : " + list.contains("홍길동"));
		System.out.println("list.contains(\"ABC\") : " + list.contains("ABC"));
		/*while(true) {
			if (list.contains("홍길동")) { //데이터가 있냐?
				list.remove("홍길동");
			} else {
				System.out.println(">> 삭제 완료 (작업 끝) ");
				break;
			}
		}
		----------------------------------------------------*/
		System.out.println("list.indexOf(\"홍길동\") : " + list.indexOf("홍길동"));
		System.out.println("list.indexOf(\"ABC\") : " + list.indexOf("ABC"));
		while(true) {
			int idx = list.indexOf("홍길동");
			if (idx == -1) { //데이터가 없냐?
				System.out.println(">> 삭제 완료 (작업 끝) ");
				break;
			} 
			list.remove(idx);
		}
		
		
		System.out.println("----실습(개인별)-----");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - size : " + list.size());
			if ("홍길동".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.remove(i);			
				i--;
			}
		}
		System.out.println("삭제 후 : " + list);
		System.out.println(list.size());
		
		System.out.println("=== 김유신 --> 김유신2 수정 ===");
		System.out.println("수정 전 : "+ list);
		for (int i = 0; i< list.size(); i++) {
			if ("김유신".equals(list.get(i))) {
				list.set(i, "김유신2");
			}
		}
		System.out.println("수정 후 : " + list);
		
	}

}
