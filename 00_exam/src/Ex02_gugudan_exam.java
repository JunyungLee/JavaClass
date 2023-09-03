
public class Ex02_gugudan_exam {

	public static void main(String[] args) {
		/* 구구단 2단~ 9단 출력 = 옆으로
		 ex) 2 * 1 = 2   3 * 1 = 3 ...   9 * 1 =9
		     2 * 2 = 4   3 * 2 = 6 ...   9 * 2 = 18
		     ....
		 */
		for(int line = 1; line <= 9; line++) {
			for(int i = 2; i <= 9; i++) {
				System.out.print(i + " * " + line + " = " + (i * line) +"\t" );
			}
			System.out.println();

		}
		

	}

}
