public class Ex06_for_star {

	public static void main(String[] args) {
		// ***** 화면 출력
		System.out.println("*****");
		System.out.println("-------------");
		
		System.out.print("*****");
		System.out.println(); //줄바꿈 역할
		System.out.println("-------------");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("---반복문 print *(별) 찍기 반복 ---");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("==============");
		/*문제) 4개 행 출력처리 (각 행별로 * 5개 출력)
		 *****
		 *****
		 *****
		 *****
		 */
		System.out.println("---for문 적용----");
		//1번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//2번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//3번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		//4번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("====중첩(이중) 반복처리=====");
		for(int line = 1; line <= 3; line++) {
			for(int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======방법 1==========");
		
		System.out.print("*****");
		System.out.println();
		System.out.print("*****");
		System.out.println();
		System.out.print("*****");
		System.out.println();
		
		System.out.println("------방법 2-------");
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("*****");
			System.out.println();
		}
		System.out.println("-------방법 3-------");
		for (int i = 1; i <= 3; i++) {
			for(int star = 1; star <= 5; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==== 삼각형 * 찍기 ========");
		
		/* 화면(콘솔창)에 삼각형 모양을 출력
		 *
		 **
		 ***
		 ****
		 *****
		 ------------------*/
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("--------------------");
		
		System.out.println("*");
		
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("-----for문 활용 반복 1--------");
		//(5번 반복)
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		} 
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		} 
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		} 
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		} 
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		} 
		System.out.println();
		System.out.println("--------반복 2-------------");
		
		int count = 1; //cnt
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		} 
		System.out.println();
		count++;
		
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		} 
		System.out.println();
		count++;
		
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		} 
		System.out.println();
		count++;
		
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		} 
		System.out.println();
		count++;
		
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		} 
		System.out.println();
		count++;
		
		System.out.println("======================");
	
		int cnt = 1;
		for(int line = 1; line <= 5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
		System.out.println("==========================");
		
		/* 화면(콘솔창)에 삼각형 모양을 출력 (분석)
		 *          1라인 : * 1개 + 줄바꿈
		 **         2라인 : * 2개 
		 ***        3라인 : * 3개 
		 ****       4라인 : * 4개
		 *****		5라인: * 5개
		 ------------------*/
		
		//외부 반복문 반복인자 값을 내부 반복문에 연동 사용하는 경우 
		//변수 j <= i 로 하지 않고 다른 변수를 사용해야 숫자가 변해도 변하지 않음
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
			
	}	
	}
