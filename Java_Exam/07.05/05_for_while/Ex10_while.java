public class Ex10_while {

	public static void main(String[] args) {
		// 반복문 : while, do ~ while
		/* while 반복문 사용 형태 
		 반복인자의 선언 및 초기값 설정;
		 while (실행 조건식 - 비교, 논리 연산 다 올수 있음//true or false) {
				반복인자값 증감설정(선택적);
				실행문(들);
				반복인자값 증감설정(선택적);
		 }
		 -----------------------*/
		//1~10까지 화면출력
		System.out.println("----for문 사용-------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		//System.out.println("-----while문 사용--------");
		//while문으로 작성
		/*
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		*/
		System.out.println("--- 초기값 0 일때 ---");
		
		int i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println("------------------");
		
		System.out.println("====== while break문 =======");
		// break : 현재 실행중인 반복문을 종료하고 빠져나감
		// while 무한반복
		int num = 1; 
		//for (;;) { }
		while (true) {
			System.out.println(num);
			if (num >= 10) break; // 반복중단
			num++;
		}
		
		System.out.println("------ while continue 문-------");
		//위치 중요
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; // 증감식이 continue문 앞에 위치하도록
			System.out.println(num);
		}
		
		System.out.println("---------for continue--------");
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue;
			System.out.println(m);
		}
		
		System.out.println("=== do ~ while =======");
		//무조건 1번은 실행된다
		/*do ~ while 반복문 사용 형태 
		 반복인자의 선언 및 초기값 설정;
		//do {
				반복인자값 증감설정(선택적);
				실행문(들);
				반복인자값 증감설정(선택적);
		 } while (실행 조건식);
		 -----------------------*/
		//1 ~ 10 까지 출력
		
		num = 1;
		do {
			System.out.println("do~while : " +num);
			num++;
		} while (num <= 10);
		
		System.out.println("================");
		
		System.out.println("---내부 반복문에서 break 처리시 ------");
		for (int out = 1; out <= 3; out++) {
			System.out.println(":: out : " + out);

			for (int in = 1; in <= 5; in++) {
				System.out.println("out : " + out + ", in : " + in);
				if (out == 2) break; // 내부 반복문만 종료 처리됨
			}
			System.out.println("------------------");
		}
		System.out.println("==============================");
		
		System.out.println("==== 중첩 반복문 한번에 모두 중단하기 =====");
		//중첩 반복문을 모두 종료해야 하는 경우 (위치 지정 break문 사용)
		//라벨 지정
		outFor: for (int out = 1; out <= 3; out++) {
			System.out.println(":: out : " + out);
			
			for (int in = 1; in <= 5; in++) {
				System.out.println("out : " + out + ", in : " + in);
				if (out == 2)
					break outFor; // 외부반복문 중단처리
			}
			System.out.println("----------");	
		}
		System.out.println(">>> 프로그램 끝");
		
		
		System.out.println("============+++================");
		//+) 1~10까지 합계 화면 출력
		System.out.println("-----for 문 활용-----");
		
		int sum = 0; 
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("합계: " + sum);

		System.out.println();
		System.out.println("-----while문 사용------");
		
		sum = 0;
		int n = 1;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println("합계: " + sum);
		
	}
	

}
