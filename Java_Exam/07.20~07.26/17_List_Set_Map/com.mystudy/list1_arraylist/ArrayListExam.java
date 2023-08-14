package com.mystudy.list1_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// ArrayList : Array(배열)의 속성을 가진 List(목록)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//ArrayList<Integer> list1 = new ArrayList<>(); -> 생략도 가능
		System.out.println("list1.size() : " + list1.size());
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		System.out.println("---- 데이터 입력(add) ----");
		//입력(C) : 맨 뒤에 추가 
		list1.add(new Integer(5)); //Integer 저장
		list1.add(1); // int ---> Integer 자동형변환 되어 입력됨
		list1.add(5);
		list1.add(6);
		boolean isSuccess = list1.add(7);
		System.out.println("isSuccess : " + isSuccess);
		System.out.println(list1.toString()); // 확인
		System.out.println("list1.size() : " + list1.size());
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		//입력(C) :지정된 특정 위치에 데이터 추가
		list1.add(0, 100);
		System.out.println("0번 인덱스에 100 add 후 : " + list1.toString());
		System.out.println("list1.size() : " + list1.size());
		
		//(주의) add, get, set, remove : 사용시 인덱스 사용에 주의
		//list1.add(100, 999); ->IndexOutOfBoundsException 
		
		System.out.println("---- 데이터 검색(get) ----");
		//검색, 조회(R) : 특정 위치의 데이터 읽기(조회, 검색, 확인, 선택)
		int firstData = list1.get(0);
		System.out.println("list1.get(0) : " + firstData);
		System.out.println(list1);
		
		// 데이터 존재여부 -> true/false
		boolean isExist = list1.contains(999);
		System.out.println("list1.contains(999) : " + isExist);
		System.out.println("list1.contains(100) : " + list1.contains(100));
		
		
		System.out.println("---- 데이터 수정(set) ----");
		int returnValue = list1.set(1, 888);
		System.out.println("list1.set(1, 888) : " + returnValue); //어떤 데이터를 수정하는지 확인
		System.out.println(list1);
		
		System.out.println("---- 데이터 삭제(remove) ----");
		 returnValue = list1.remove(0);
		System.out.println("list1.remove(0) : " + returnValue); // 어떤 값을 삭제하는지 확인
		System.out.println(list1);
		System.out.println("list1.size() : " + list1.size());
		
		//list1.remove(5); // remove(int) 인덱스 찾아서 삭제 -> IndexOutOfBoundsException: Index: 5, Size: 5 
		isSuccess = list1.remove(new Integer(5)); // remove(Object) 동일데이터 찾아서 삭제 
		System.out.println(list1);
		System.out.println("remove(new Integer(5)) return : " + isSuccess); //-> boolean값 return
		
		System.out.println("=====================");
		System.out.println("Before reverse list1 : " + list1);
		Collections.reverse(list1); 
		System.out.println("After reverse list1 : " + list1);
		
		System.out.println("---------------------");
		//[7, 6, 1, 888]
		System.out.println("list1.subList(1, 3) 부분추출 : " + list1.subList(1, 3));
		List<Integer> list2 = list1.subList(1, 3);
		ArrayList<Integer> list3 = new ArrayList<Integer>(list1.subList(1, 3)); //ArrayList 타입으로 써야 할 때 
		
		System.out.println("------Collections.sort () 사용 -------");
		System.out.println("정렬 전 list1 : " + list1);
		Collections.sort(list1); //오름차순 정렬 
		System.out.println("정렬 후 list1 : " + list1); 
		
		System.out.println("=========================");
		System.out.println("list1 : " + list1); //[1, 6, 7, 888]
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i)); //인덱스 번호와 함께 데이터 확인 가능
		}
		
		//(개인별 실습) 개선된(향상된)for
		
		
		
	}

}
