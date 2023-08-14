package com.mystudy.array;

//import java.util.Arrays;

public class Ex03_array_star {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 **
		 ***
		 ****
		 *****
		 ---------------------*/
		// char 타입의 데이터 5개 저장할 수 있는 배열을 만들고 별(*) 입력
		// char[] ch = new char[5];
		// char[] ch = {'*','*','*','*','*',};
		// char[] ch = {'!','@','#','$','%',};
		// char[] ch = {'0','1','2','3','4',};
		
		char[]ch = new char [5];
		
		int starNum = 1;
		for(int i = 1; i <= ch.length; i++) {
			for(i = 0; i < starNum; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println();
			starNum++;
		}
		System.out.println("====================");
		//char[] ch = {'0','1','2','3','4',};
		System.out.println(ch[0]);
		System.out.println();
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println();
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println();
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println();
		//.........
		
		System.out.println("----반복처리---");
		for(int i = 0; i <= 0; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		for(int i = 0; i <= 1; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		System.out.println("---이중반복처리---");
		for(int j = 0; j <= 4; j++) {
			for(int i = 0; i <= j; i++) {
				System.out.println(ch[i]);
			}
			System.out.println();
		}
		

	}

}
