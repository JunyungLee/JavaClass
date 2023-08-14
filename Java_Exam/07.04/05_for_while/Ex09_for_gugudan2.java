
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단 2~9단 출력
		 2*1 = 2    3*1 = 3     ...    9*1 = 9
		 2*2 = 4    3*2 = 6     ...    9*2 = 18
		 2*3 = 6    3*3 = 9     ...    9*3 = 27
		 ... 
		 2*9 = 18   3*9 = 27           9*9 = 81
		============================================ */
		System.out.println("*" + " " + "*" + " " + "*");
		System.out.println("*" + "\t " + "*" + "\t " + "*");
		System.out.println("2*1=2" + "\t " + "3*1=3" + "\t " + "*");// \t tab 위치로 가라
		System.out.println("----------------------------------");
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.print(" * " + "\t");
		} 
		System.out.println();
		
		System.out.println("---구구단 2 ~ 9단 출력---");
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
			} 
			System.out.println();
		}
		System.out.println("====================");
		
		System.out.print(2 + "*" + 1 + "=" + (2 * 1) + "\t");
		System.out.print(3 + "*" + 1 + "=" + (3 * 1) + "\t");
		System.out.print(4 + "*" + 1 + "=" + (4 * 1) + "\t");	
		
		
		
			}
	}
		
		
	
