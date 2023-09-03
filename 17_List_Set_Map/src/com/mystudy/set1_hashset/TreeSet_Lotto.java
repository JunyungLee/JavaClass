package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Lotto {

	public static void main(String[] args) {
		// Set 을 이용한 로또 만들기 : 1 ~45 랜덤숫자 6개를 Set에 저장
		//1. 로또번호 6개를 추첨해서 Set에 저장하고, 화면 출력
		//   Math.random() : 0.0 ~ 0.9999999... 실수형 데이터 생성 (0 <= ran < 1)
		//   Math.random() 사용 : (int)(Math.random() * 45 + 1)
		//2. 출력은 작은 숫자부터 큰 숫자 형태로 출력
		//    예) 금주의 로또 번호 : 5, 8, 10, 25, 33, 41
		//---------------------------------------------------------
		System.out.println("-----------------실습-------------------------");
		TreeSet <Integer> lotto = new TreeSet <Integer>();
		//Set <Integer> lotto = new TreeSet <Integer>();
		
		//1번 
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45 + 1));
			
		}
		for (Integer set : lotto) {
			System.out.print(set + " ");		
		}
		
		System.out.println();

		System.out.println("-----------------수업-------------------------");
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(; set.size() < 6;) { //6개가 될 때까지 
			int ranNum = (int)(Math.random() * 45 + 1);
			set.add(ranNum);
		}
		System.out.println("로또번호 : " + set);
		System.out.println("--------------------");
		set.clear();
		
		while(set.size() < 6) {
			int ranNum = (int)(Math.random() * 45 + 1);
			set.add(ranNum);
		}
		System.out.println("로또번호 : " + set);
		
	
		
	}

}
