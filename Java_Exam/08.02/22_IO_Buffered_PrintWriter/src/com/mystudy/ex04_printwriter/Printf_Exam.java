package com.mystudy.ex04_printwriter;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		// prinf() 메소드 사용시 형식문자  사용
		int a = 20;
		long b = 300_000_000_000L;
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~~~";
		boolean g = false;
		
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF",today); //2023-08-02 형태로 출력 가능
		System.out.println();
		
		System.out.println(">>" + a + " " + b + " " + c + " " 
							+ d + " " + e + " " + f + " " + g);
		System.out.println("======================");
		
		/* [ ] : 생략가능(option) 
		 %[인덱스$][-(정렬-> 생략가능)][크기]형식문자 : %, 형식문자 필수
		 -기본은 우측정렬
		 -마이너스 부호는 좌측정렬 사용 예) %-10d
		 -----------------------*/
		System.out.printf("%d %d %c %s%n", 100, 12345, 'A', "Hello~");
		
		System.out.println("--- 인덱스(파라미터 위치값) 사용 ---");
		// [인덱스$] 파라미터 위치값 $ 부호와 함께 사용 
		// [주의] 인덱스 사용하면 데이터 매칭에서 제외됨 
		System.out.printf("%1$d %1$d %c %s%n", 67, "Hello~~~"); //같은 갯수 매칭 안시켜줄시 발생하는 오류 => java.util.IllegalFormatConversionException
		
		System.out.println("---- 실수형 데이터 표시 ----");
		System.out.printf("%f %1$a %1$e %1$g %n", 65.812345678); //%f 사용!!!
		System.out.printf("%10.3f %n", 65.567890); //전체자릿수(소수점포함) 10, 소수점이하 3 
		System.out.printf("%10.3f %n", 12345.567890); //전체자릿수(소수점포함) 10, 소수점이하 3 
		System.out.printf("%-10.3f %n", 65.567890); //좌측정렬 : 전체자릿수(소수점포함) 10, 소수점이하 3 
		System.out.printf("%30.10f %n", 65.12345678901234); //전체자릿수 30, 소수점이하 10 까지 표시
		
		System.out.println("------ 날짜관련 -----");
		System.out.printf("%tF %n", today); //2023-08-02
		System.out.printf("%tT %n", today); //16:00:47 시:분:초
		System.out.printf("%ta %n", today); //ex)_수  [요일]
		System.out.printf("%1$tY/%1$tm/%1$td %n", today); //2023/08/02 - 년/월/일
		System.out.printf("%1$tY/%1$tm/%1$td(%1$ta) %n", today); //2023/08/02 (수) - 년/월/일 (요일)
		System.out.printf("%1$tH:%1$tM:%1$tS %n", today); //시:분:초 ex_ 16:01:54
		System.out.println("====================");
		
		String name = "홍길동";
		int kor = 100, eng = 90, math = 81;
		System.out.printf("%s은 국어 %d, 영어 %d, 수학 %d 입니다. %n", 
						name, kor, eng, math);
		System.out.println(name + "은 국어 " + kor + ", 영어 " + eng + ", 수학 " + math + " 입니다.");
		
		
		
		
		
		
	}

}
