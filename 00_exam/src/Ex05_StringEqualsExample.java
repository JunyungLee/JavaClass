
public class Ex05_StringEqualsExample {

	public static void main(String[] args) {
		String name1 = "신민철";
		String name2 = "신민철";
		
		if(name1 == name2) {
			System.out.println("name1과 name2는 참조가 같음");
		} else {
			System.out.println("name1과 name2는 참조가 다름");
		}
		
		if(name1.equals(name2)) {
			System.out.println("name1과 name2는 문자열이 같음");
		}
		
		String name3 = new String("신민철"); //new String은 새로 생성하는 문자열로 참조가 같다해도 다른 참조로 구분된다
		String name4 = new String("신민철");
		
		if(name3 == name4) {
			System.out.println("name3와 name4는 참조가 같음");
		} else {
			System.out.println("name3와 name4는 참조가 다름");
		}
		
		if(name3.equals(name4) ) { //동일한 객채이건 다른 객채이건 상관없이 내부 문자열을 비교하고 싶을때 equals()메소드 사용
			System.out.println("name3와 name4는 문자열이 같음");
		}
	}

}
