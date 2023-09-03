package com.mystudy.map1_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Exam {

	public static void main(String[] args) {
		// Map<K,V> 인터페이스 : 키(key)-값(Value) 쌍으로 데이터 저장 관리 
		// - 특징 : 키(key)-값(value), 순서는 없음
		// - 키(key) : 중복 안됨 (중복값 없이 유일한 데이터)
		// - 값(value) : 중복 데이터 저장 가능
		//-----------------------------------------
		
		TreeMap<String, Integer> map = new TreeMap<String,Integer>();
		//Map<String, Integer> map = new HashMap<String,Integer>(); 
		//Map<String, Integer> map = new TreeMap<String,Integer>(); => treeMap고유기능은 사용하지 못한다
		
		System.out.println("\n==== 입력(추가) =====");
		// 입력 - Create, Insert
		map.put("홍길동", 100); 
		map.put("김유신", 95);
		map.put("강감찬", 88);
		map.put("박혁거세", 88);
		map.put("황기동", 88);
		System.out.println("map : " + map); 
		System.out.println("데이터 갯수 : " + map.size()); 
		System.out.println("map.isEmpty() : "+ map.isEmpty()); 
		
		System.out.println("----");
		
		Integer returnObj = map.put("계백", 88); 
		System.out.println("map.put(\"계백\", 88) 리턴값 : "+ returnObj);
		
		returnObj = map.put("홍길동", 95); 
		System.out.println("map.put(\"홍길동\", 95) 리턴값 : " + returnObj);
		System.out.println("map : " + map); 
		
		System.out.println("\n==== 조회(검색) =====");
		// 조회(검색) - Read
		int returnValue = map.get("홍길동"); 
		System.out.println("map.get(\"홍길동\"): "+ returnValue);
		
		System.out.println("\n==== 수정 =======");
		// 수정 - Update
		System.out.println("map.replace(\"홍길동\", 99) 리턴값 : " 
							+ map.replace("홍길동", 99));
		System.out.println("map : " + map);
		
		System.out.println("map.replace(\"을지문덕\", 99) 리턴값 : " 
				+ map.replace("을지문덕", 99)); 
		System.out.println("map : " + map);
		
		System.out.println("\n === 삭제 ====");
		// 삭제 - Delete
		System.out.println("map.remove(\"홍길동\", 100): " + map.remove("홍길동", 100)); 
		System.out.println("map.remove(\"홍길동\") : " + map.remove("홍길동")); 
		
		System.out.println("map : " + map);
		
		System.out.println("\n====== 전체 데이터 처리 =======");
		System.out.println("==== keySet() 사용 ====");
		Set<String> keySet = map.keySet();
		System.out.println("keySet : " + keySet);
		
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key)); 
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
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//Set<Entry<String, Integer>> entrySet = map.entrySet();
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
		
		
		// TreeMap 고유기능 사용 => treeMap 타입일때만 사용 가능 
		//NavigableSet<String> descend = map.descendingKeySet();
		
		
		
		
		
	}

}
