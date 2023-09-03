package com.mystudy.map1_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Exam {

	public static void main(String[] args) {
		// Map<K,V> 인터페이스 : 키(key)-값(Value) 쌍으로 데이터 저장 관리 
		// - 특징 : 키(key)-값(value), 순서는 없음
		// - 키(key) : 중복 안됨 (중복값 없이 유일한 데이터)
		// - 값(value) : 중복 데이터 저장 가능
		//-----------------------------------------
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		System.out.println("\n==== 입력(추가) =====");
		// 입력 - Create, Insert
//		System.out.println("map : " + map); //map : {}
		map.put("홍길동", 100); //순서 개념은 없다!!!!!!
		map.put("김유신", 95);
		map.put("강감찬", 88);
		System.out.println("map : " + map); //map : {}
		System.out.println("데이터 갯수 : " + map.size()); //map 크기 
		System.out.println("map.isEmpty() : "+ map.isEmpty()); //비어있냐?
		
		System.out.println("----");
		
		Integer returnObj = map.put("계백", 88); //새로운 데이터 입력시 null 리턴 받는다 + null은 참조형 데이터에만 저장 가능
		System.out.println("map.put(\"계백\", 88) 리턴값 : "+ returnObj);
		
		returnObj = map.put("홍길동", 95); //데이터를 이미 가지고 있으면(key값이 일치하는 데이터가 있으면) 수정처리
		System.out.println("map.put(\"홍길동\", 95) 리턴값 : " + returnObj);
		System.out.println("map : " + map); 
		
		System.out.println("\n==== 조회(검색) =====");
		// 조회(검색) - Read
		int returnValue = map.get("홍길동"); //return값 : Integer => Integer java.util.HashMap.get(Object key)
		System.out.println("map.get(\"홍길동\"): "+ returnValue);
		
		System.out.println("\n==== 수정 =======");
		// 수정 - Update
		System.out.println("map.replace(\"홍길동\", 99) 리턴값 : " 
							+ map.replace("홍길동", 99));
		System.out.println("map : " + map);
		
		System.out.println("map.replace(\"을지문덕\", 99) 리턴값 : " 
				+ map.replace("을지문덕", 99)); //map.replace("을지문덕", 99) 리턴값 : null
		System.out.println("map : " + map);
		
		System.out.println("\n === 삭제 ====");
		// 삭제 - Delete
		System.out.println("map.remove(\"홍길동\", 100): " + map.remove("홍길동", 100));  //key-value가 모두 일치해야 제거 가능
		System.out.println("map.remove(\"홍길동\") : " + map.remove("홍길동")); //삭제 처리 가능
		
		System.out.println("map : " + map);
		
		System.out.println("\n====== 전체 데이터 처리 =======");
		System.out.println("==== keySet() 사용 ====");
		Set<String> keySet = map.keySet();
		System.out.println("keySet : " + keySet);
		
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key)); //key + value 값 출력 가능
		}
		System.out.println("---iterator 사용 (keyset)---");
		//(개인적) Iterator(); 사용방식
		Iterator<String> ite = keySet.iterator();
		while (ite.hasNext()) {
			String key2 = ite.next();
			System.out.println(key2);
		}
		
		System.out.println("====================");
		Collection<Integer> values = map.values();
		System.out.println("values : " + values);
		 
		for(Integer value : values) {
			System.out.println("점수 : " + value);
		}
		System.out.println("----------");
		int sum = 0;
		for(Integer value : values) {
			sum += value;
		}
		System.out.println("::: 점수합계 " + sum );
		
		System.out.println("=========entrySet() 사용=============");
		//Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("entrySet : " + entrySet);

		System.out.println("=========entrySet().iterator() 사용=============");
		Iterator<Entry<String, Integer>> ite2 = entrySet.iterator();
		while (ite.hasNext()) {
			Entry<String, Integer> entry = ite2.next();
			System.out.println("key : " + entry.getKey() + ", " + "value : " + entry.getValue());
		}
		
		System.out.println("\n------ 개선된 for문 사용 ----------");
		//개인적으로 실습 entrySet 데이터 개선된(향상된) for문 사용 
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("key : " + entry.getKey() + ", " + "value : " + entry.getValue());
		}
		
		
		
		
		
		
	}

}
