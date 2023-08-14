package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector_Exam {

	public static void main(String[] args) {
		// Vector 클래스 : List 인터페이스 구현체 
		Vector<String> v = new Vector<String>();
		//List<String> v = new Vector<String>(); //-> List의 메소드만 사용 가능 ex)capacity: vector의 고유 기능이라 사용 X
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println("v.size() : "+ v.size());
		System.out.println("v.capacity() : "+ v.capacity()); //미리 default 저장공간 확보 
		
		String temp = v.toString();
		System.out.println(temp); // [1, 2, 3] = List와 동일 (순서O)
		
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size() : "+ v.size());
		System.out.println("v.capacity() : "+ v.capacity()); //미리 default 저장공간 확보 
		
		System.out.println("--- v.trimToSize() 실행 후 ----");
		v.trimToSize(); //vector고유기능
		System.out.println(v);
		System.out.println("v.capacity() : "+ v.capacity());
		
		v.addElement("4문자열"); //vector고유기능 = add 와 똑같은 기능
		System.out.println(v);
		
		v.add("AAA"); // 위치 지정 X :맨뒤에 추가 
		System.out.println(v);
		
		v.add(2, "BBB"); //특정 위치에 insert (삽입)
		System.out.println(v);
		
		Vector<String> v2 = (Vector<String>) v.clone(); //vector 타입으로 형변환
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2); //복제 
		
		//(실습) 주소값 복사인지 물리적으로 분리된 복사인지 확인
		System.out.println("v.equals(v2) : "+ v.equals(v2));
		System.out.println(v == v2);
		
		System.out.println("=========Enumeration 객체 사용 ==============");
		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) { //->사용할 데이터가 있는지? boolean값
			System.out.println("enu.nextElement() : " + enu.nextElement()); 
		}
		System.out.println("-----------------");
		
		
		//(개인별) for문 
		Enumeration<String> enu1 = v.elements();
		for (int i = 0; i < v.size(); i++) {
			if (enu1.hasMoreElements()) {
				System.out.println(enu1.nextElement());				
			}
		}
		System.out.println("-------------------------");
		
		//========================
		Iterator<String> ite = v.iterator(); //데이터를 순차적으로 순회하며 데이터를 조회하는 method
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println("ite.next(): " + ite.next());
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		//ite.next(); ->데이터가 더 이상 없기 때문에 오류 발생 
		
		System.out.println("=== 개선된 for문 사용 데이터 조회 ===");
		for(String str : v) {
			System.out.println(str);
		}
		
	}

}
