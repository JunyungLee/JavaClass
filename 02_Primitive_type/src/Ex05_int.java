
public class Ex05_int {

	public static void main(String[] args) {
		// 정수형 int : 4 byte, 범위(-2147483648 ~ 2147483647)
		System.out.println("---- int 타입 최소값/최대값 ---");
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 최소값 : " + Integer.MAX_VALUE);
		
		int num1 = 70000;
		int num2 = 30000;
		int sum = num1 +num2;
		
		// 사칙연산 : +, -, *, / 
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println(num1 + " + " + num2 + " = " + sum); //70000 + "+" + 30000 + "=" + sum
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
		// % 연산자 : 나누기 연산 후 남은 나머지 값을 구함
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		//---------------
		// 0 으로 나누는 경우 (100 / 0)에는 예외발생(Exception)
		int num3 = 0;
		//System.out.println(num1 / num3);
		
		
		

	}

}
