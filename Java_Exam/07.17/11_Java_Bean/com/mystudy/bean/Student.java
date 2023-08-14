package com.mystudy.bean;

/*
 ■ 자바빈(Java Bean)
  - 멤버변수(property)의 접근제어자는 private (선언 - 숨기고)
  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
  - get/set 메소드는 public (공개)
  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
 */
//public class Student extends Object{ //Public -> 모든 곳에서 접근 가능 
class Student {  // extends Object 생략하면 컴파일러가 자동 삽입 // student 타입의 부모 객체 -> object 
	private String name; //private -> class 내부에서만 사용 가능 
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//=== 생성자 ========= -> 접근제한자 사용 가능
	public Student () {
		//super : 부모클래스 객체(인스턴스) // super : 현재 만들어진 객체의 부모클래스 접근 하기 위한 keyword
		//super() : 부모클래스 객체(인스턴스)의 기본 생성자 호출하는 것  //() -> 기본 생성자 호출  
		super();  // 생략시 컴파일러가 자동 삽입해서 처리한다.
	} //-> 생성자 직접 작성시 자동 생성되었던 기본생성자 삭제 -> StudentMain 에서 사용하기 위해 기본 생성자 직접 생성 해주어야 한다  
	
	public Student (String name) {
		//super(); 생략되어있음 -> 없어도 출력 가능 
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) { //직접 생성한 생성자
		//현재객체(인스턴스)의 생성자 호출
		this(name); // 생성자의 재사용(호출) -> 생성자 코드 중 맨 처음 작성되어 실행되어야 함
		//this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	//===== 자동생성 =====
	public Student(String name, int kor, int eng, int math, double avg, int tot) {
		this(name, kor, eng, math); //-> 최상단 위치 : 생성자 호출
		this.tot = tot;
		this.avg = avg; //: 메소드 호출
	}

	//===== 메소드 작성 영역 =====
	// 외부에서 사용할 수 있도록 메소드 제공 (public)
	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터를 저장하는 용도로 사용 -> set 메소드
	// 명칭(호칭) : set 메소드, setter, set property(속성값 설정-쓰기) - 데이터 저장 
	public void setName(String name) { //set(값 설정) 짝꿍 - get(데이터 가져다 쓰기)
		this.name = name;
	}
	//외부에서 데이터를 읽어가기 위한 get 메소드
	//명칭(호칭) : get 메소드, getter, get property(속성값 읽기)
	public String getName() {
		return name; //데이터 읽어오기 - return!
	}
	//kor : setter, getter
	public void setKor(int kor) {
		// 적절한 값인지 데이터 여부 확인
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;			
		} else {
			System.out.println("[예외발생] 국어 0~100 값이 아님 : " + kor);
		}
	}
	
	public int getKor() {
		return kor;
	}
	
	//(실습) eng, math : setters, getters 작성
	//eng _ setters, getters
	public void setEng (int eng) { //-> 값설정 해야 하는 것이므로 return값 필요 없음(void)
		if (eng >= 0 && eng <= 100) {
			this.eng = eng; //this. -> 현재 객체에 있는 eng!
		} else {
			System.out.println("[예외] 영어 0~100 값이 아님 : " + eng);
		}
	}
	
	public int getEng() {
		return eng;
	}
	//math _ setters, getters
	/*public void setMath (int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
		} else { 
			System.out.println("[예외] 수학 0~100 값이 아님 : " + math);
		}
	}
	
	public int getMath() {
		return math; 
	}
	*/ //-자동생성-//
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	//--자동생성--
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	//---------------------------------------
	public void printData() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
	}
	
	private void computeTotAvg() { //private -> 내부에서만 사용 가능 
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
}
