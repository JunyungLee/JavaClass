
public class Ex03_while_exam {

	public static void main(String[] args) {
		//1~10까지 출력 while문 break 이용
		int num = 0;
		while (num <= 10) {
			System.out.println(num);
			if (num == 5) continue;
			num++;
		}
	}
		
}
