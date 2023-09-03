package com.mystudy.array;

public class SungjukMangagerExam {

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
		int[][] sungjuk = new int [3][5];
		
		sungjuk[0][0] = 100;
		sungjuk[0][1] = 90;
		sungjuk[0][2] = 80;
		
		sungjuk[1][0] = 100;
		sungjuk[1][1] = 90;
		sungjuk[1][2] = 81;
		
		sungjuk[2][0] = 100;
		sungjuk[2][1] = 90;
		sungjuk[2][2] = 82;
		
		for(int j = 0; j < sungjuk.length; j++) {
			for(int i = 0; i < sungjuk[j].length; i++) {
				System.out.print(sungjuk[j][i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("---tot----");
		for(int j = 0; j <= 2; j++) {
			int tot = 0; 
			for(int i =0; i <= 2; i++) {
				tot += sungjuk[j][i];
			}
			System.out.println(tot);
		}
		
		System.out.println("---avg----");
		for(int j = 0; j <= 2; j++) {
			double avg = 0;
			for(int i = 0; i <= 2; i++) {
				avg = (sungjuk[j][i]) * 100 / 3 /100.0;
			}
			System.out.println(avg);
		}
		
	}

}
