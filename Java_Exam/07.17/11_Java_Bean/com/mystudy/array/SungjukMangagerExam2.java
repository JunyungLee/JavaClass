package com.mystudy.array;

public class SungjukMangagerExam2 {

	public static void main(String[] args) {
		// 2차원 배열을 사용한 성적처리 
		/* 국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk)을 만들고 
		 3명의 성적을 입력하고 개인별 총점과 평균을 계산 후 화면에 출력
		 ----------------------------*/
		/*
		 국어\t영어 수학 총점 평균
		 --------------------
		 100  90  80  270 90.0
		 100  90  81  271 90.33
		 100  90  82  272 90.66
		 ----------------------*/
		int[][] sungjuk = { {100, 90, 80}, 
				            {100, 90, 81},
				            {100, 90, 82} };
		String[] names = {"김유신", "이순신", "홍길동"}; //다른 타입은 따로 지정해주어야 한다
		int[] tots = new int[sungjuk.length];
		double[] avgs = new double[sungjuk.length];
		
		//--- 1번째 사람 데이터 처리 ---
		int kor = sungjuk[0][0];
		int eng = sungjuk[0][1];
		int math = sungjuk[0][2];
		
		//계산처리 
		int tot = kor + eng + math;
		double avg = tot * 100 / 3 / 100.0;
		
		//화면출력 
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg );
		//--- 2번째 사람 데이터 처리 ---
		kor = sungjuk[1][0];
		eng = sungjuk[1][1];
		math = sungjuk[1][2];
		
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg );
		
		//--- 3번째 사람 데이터 처리 ---
		kor = sungjuk[2][0];
		eng = sungjuk[2][1];
		math = sungjuk[2][2];
		
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg );
		
	
		System.out.println("----반복 처리----");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < sungjuk.length; i++) {
			kor = sungjuk[i][0];
			eng = sungjuk[i][1];
			math = sungjuk[i][2];	
			tot = kor + eng + math;
			avg = tot * 100 / 3 / 100.0;
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg );
		}
		
	}
}
		
	
	
	



