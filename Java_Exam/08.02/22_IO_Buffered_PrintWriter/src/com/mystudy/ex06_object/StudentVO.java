package com.mystudy.ex06_object;

import java.io.Serializable;

/* 
 직렬화 (Serialization)/ 역직렬화(Deserialization)
 	- 직렬화 : JVM 메모리에 있는 객체를 바이트스트림으로 변환하는 작업
 	- 역직렬화 : 바이트스트림 데이터를 자바 객체로 변환하는 작업
 --------------------
 데이터 전송을 위해서는 직렬화 처리가 가능해야 하는데, Serializable 형식만 가능
 	- Serializable 인터페이스를 구현하면 된다
 데이터 직렬화 처리시 제외 할 데이터는 
 	-transient 처리 
 transient 처리해도 전달되는 데이터 : static, final 처리된 데이터 
 */



public class StudentVO implements Comparable<StudentVO>, Serializable {
	// serialVersionUID 가 다른 경우에 
	// 데이터가 사용될때 InvalidClassException 발생할 수 있다 
	// private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 111L;
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//transient :  데이터 전송시 값 전달 제외 
	transient private String phoneNO;
	//-------------------------------
	public StudentVO() {
		super();
	}
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	//--------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	//-------------------------------
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + ", phoneNO=" + phoneNO + "]";
	}
	@Override
	public int hashCode() {//hashCode = int값 //source -> Generate hashcode()
		System.out.println(":: hashCode 실행");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {// source -> Generate equals() => 이름 중복
		System.out.println(":: equals 실행");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(StudentVO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
