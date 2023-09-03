
public class Ex02_for_exam {

	public static void main(String[] args) {
		// for (초기값설정 ; 실행(종결) 조건식 ; 증감설정) {  }
		
		//(실습1) 1~5까지의 숫자 화면출력
		for(int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
		}
		System.out.println("---------------");
		
		//(실습2) 11, 12, 13, 14, 15 화면출력(11~15까지의 숫자)
		for(int i = 11; i <= 15; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		//(실습3) 1, 3, 5, 7, 9 화면출력
		for (int i = 1; i <= 9; i += 2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		//(실습4) 2, 4, 6, 8, 10 화면출력
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		int num= 2; //0;
		for(int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
			System.out.println(num); //num += 2
			num += 2;
		}
		System.out.println("---------------");
		
		//(실습5) 5, 4, 3, 2, 1 화면출력
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		num = 5;
		for (int i =1; i <= 5; i++) {
			System.out.println("i : " + i);
			System.out.println(num--);
		}
		System.out.println("--------------------");
	}

}
