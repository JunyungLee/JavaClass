package com.mystudy.bean_vo;

// 자바빈(Java Bean) 형태의 클래스 작성
// VO(Value Object) : 값(데이터)을 저장하기 위한 클래스(객체) - Oxxxx, OxxxVO, OxxxVo
// DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체)
//    Oxxxx, OxxxxDTO, OxxxxDto 
public class StudentVO { //extends object
	//필드(변수)선언 -----------
	//성명 - name : String
	//국어 - kor : int
	//영어 - eng : int
	//수학 - math : int
	//총점 - tot : int
	//평균 - avg : double
	

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	//생성자 작성 --------------
	//생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자 
	
	public StudentVO() {};
	
	public StudentVO (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	

	//메소드 작성 -------------
	// setters, getters 모두 작성
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//국어
	public void setKor (int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	//영어
	public void setEng (int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	//수학
	public void setMath (int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	//총점
	public void setTot (int tot) {
		this.tot = tot;
	}
	public int getTot() {
		return tot;
	}
	//평균 
	public void setAvg (double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
	
	public void printData() {
		System.out.println(name + "\t" + kor + "\t" + eng +"\t"+ math +"\t"+ tot +"\t"+ avg +"\t");
	}
	
	private void computeTotAvg() {  
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
}
