package com.mystudy.set1_hashset;

import java.util.HashSet;

class Person {
	String jumin; // 주민번호
	String name; // 이름
	String address; //주소
	public Person(String jumin, String name, String address) {
		super();
		this.jumin = jumin;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [jumin=" + jumin + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		System.out.println(":: hashCode () 실행");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result; //jumin 의 해시코드만 같을시 동일객체로 판단하기로 정함 =>정의를 안하면 서로 다른 데이터 처리 가능
	}
	@Override
	public boolean equals(Object obj) { //equals 재정의 시 hashCode 재정의 필요 
		System.out.println(":: equals () 실행");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}
	
	
}
public class HashSet_Exam2_equals {

	public static void main(String[] args) {
		// Set 에서 동일데이터 여부 확인 hashCode(), equals () 값 확인
		// 1. 해시코드 값 확인 : hashCode()
		// 2. equals() 메소드 결과값이 모두 일치하면 동일 데이터 처리
		
		Person p1 = new Person ("950101-1234567", "홍길동", "서울");
		Person p2 = new Person ("950101-1234567", "홍길동", "부산");
		
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p2.hashCode() : " + p2.hashCode());
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("===================");
		
		HashSet<Person> set = new HashSet<Person>();
		System.out.println("-- p1 입력 --");
		set.add(p1);
		System.out.println("-- p2 입력 --");
		set.add(p2);
		
		System.out.println("set : " + set);
		
		
		System.out.println("--- 홍경래 입력(동일주민번호 값 입력) ----");
		set.add(new Person ("950101-1234567", "홍경래" , "대전"));
		System.out.println("set : " + set);
		
		System.out.println("--- 김유신 입력(주민번호 다름) ----");
		Person kim = new Person ("991111-1234567", "김유신" , "서울");
		System.out.println("kim.hashCode() : " + kim.hashCode());
		set.add(kim);
	
		System.out.println("set : " + set);
		System.out.println("================");
		for (Person vo : set) {
			System.out.println(vo.jumin + ", " + vo.name + ", " +vo.address);
		}
		System.out.println("---- contains() 사용 ----");
		if (set.contains(p2)) {
			System.out.println(">> 동일데이터 존재 : " + p2); //주민등록번호만 일치 시 같은 데이터 처리 라고 정해놨음!!
		} else {
			System.out.println(">> 동일 데이터 없음 : " + p2);
		}
		
	
	
	}

	
}
