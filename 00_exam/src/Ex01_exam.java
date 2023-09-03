
public class Ex01_exam {

	public static void main(String[] args) {
		/* re challenge
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5
		 */
		int num = 1;
		for(int i = 1; i <= 1; i++) {
			System.out.println(num);
			num++;
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 2; i++) {
			System.out.print(num + " ");
			num++;
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 3; i++) {
			System.out.print(num + " ");
			num++;
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 4; i++) {
			System.out.print(num + " ");
			num++;
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 5; i++) {
			System.out.print(num + " ");
			num++;
		}
		for(int j = 1; j <= 5; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("--------------");
		int spaceCnt = 1;
		for(int line = 1; line <= 5; line++) {
			num = 1;
			for(int i = 1; i <= spaceCnt; i++) {
				System.out.print( num + " ");
				num++;
			}
			for(int j = 1; j <= 5; j++) {
				System.out.print(" ");
			}
			System.out.println();
			spaceCnt++;
			
				
		}

	}

}
