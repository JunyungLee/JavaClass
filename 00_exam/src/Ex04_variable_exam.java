
public class Ex04_variable_exam {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples /sizeOfBucket) + 1;
		
		System.out.println("필요한 바구니의 수: " + numOfBucket);
		System.out.println("-----------------------");
		//변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드 
		int num = 333;
		System.out.println((num / 10) * 10 + 1);
		
		//변수 num의 값 중에서 백의 자리 이하를 버리는 코드 
		int num2 = 456;
		System.out.println((num2 / 100) * 100);
		
		// 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드
		int num3 = 24; 
		System.out.println(10 - num3 % 10);
	}

}
