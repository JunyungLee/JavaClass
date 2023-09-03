
public class Ex02_char {

	public static void main(String[] args) {
		// 문자형(char) : 2 byte 사용, 문자 1글자 저장(0 ~ 65535)
		// 자바 문자처리 방식은 유니코드(Unicode) 형태
		char char1 = 'A'; // "A"는 문자열(String), 'A'는 문자(char)
		System.out.println("char1 : " + char1);
		System.out.println("char1 다음문자 : " + (char1 + 1)); //66
		System.out.println("char1 다음문자 : " + (char)(char1 + 1)); //65+1 -> char 형변환, int 타입 char타입으로
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00'; //유니코드 값으로 설정
		System.out.println("char3 : " + char3);
		
		System.out.println("----------------");
		System.out.println("char1 : " + char1); // A, 65
		
		char1 = (char)(char1 + 1); //char <- int 강제 형변환
		System.out.println("char1(다음값) : " + char1);
		
		
		
	}

}
