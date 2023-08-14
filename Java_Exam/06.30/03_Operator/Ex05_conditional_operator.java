
public class Ex05_conditional_operator {

	public static void main(String[] args) {
		// ? : - 조건연산자 또는 삼항연산자 
		// 조건 ? 실행문1 : 실행문2;
		// 조건 ? true일때 실행문 : false일때 실행문;
		int num1 = 30;
		int num2 = 20;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		String str = (num1 > num2) ? "num1이 크다"  : "num 1이 크지 않다";
		System.out.println("num1 > num2 결과는? " + str);
		System.out.println("-------------------------");
		
		//제어문 분기처리 
		if (num1 > num2) {
			str = "num1이 크다";
		} else {
			str = "num1이 크지 않다";
		}
		System.out.println("if num1 > num2 결과는? " + str);
		
		
				

	}

}
