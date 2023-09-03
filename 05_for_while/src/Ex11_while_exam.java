
public class Ex11_while_exam {

	public static void main(String[] args) {
		//while문 사용해서 처리 
		//(실습) 문제 1 : 1~10까지의 합을 구하고 화면 출력
		int sum = 0;
		System.out.println("---for문 사용---");
		for (int i = 1; i <= 10; i++) {
			sum += i; 
		}
		System.out.println("1 ~ 10까지의 합계 :" + sum );
		
		System.out.println("---- while문 사용------");
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합계 : " + sum);
		System.out.println("====합계 계산 끝=======");
		
		System.out.println("----2번문제----");
		
		/*(실습) 문제 2 ------
		*****
		*****
		*****
		------------------ */
		int star = 1;
		int j = 1;
		while(star <= 3) {
			j = 1;
			while (j <= 5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			star++;
		} 
		System.out.println("------3번문제-------");
		
		/* (실습) 문제 3----
		 *
		 **
		 ***
		 ****
		 --------------*/
		/*int starCnt = 1;
		int line = 4;
		while(starCnt <= 4) {
			while (i <= line) {
				System.out.print("*");	
				i++;
			} 
			i = 1;
			System.out.println();
			line++;
			starCnt++;
		}
		*/
		i = 1;
		while (i <= 1) {
			System.out.print("*");	
			i++;
		}
		System.out.println();
		
		i = 1;
		while (i <= 2) {
			System.out.print("*");	
			i++;
		}
		System.out.println();
		
		i = 1;
		while (i <= 3) {
			System.out.print("*");	
			i++;
		}
		System.out.println();
		
		i = 1;
		while (i <= 4) {
			System.out.print("*");	
			i++;
		}
		System.out.println();
	}
}


