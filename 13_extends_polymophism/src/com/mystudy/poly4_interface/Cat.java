package com.mystudy.poly4_interface;

public class Cat extends AbstractAnimal{
	
	public Cat() {
		super("고양이");
	}
	
	@Override
	public void sound() {
		System.out.println(super.getName() + " : 야옹 야옹");
		//System.out.println(getName() + " : 야옹 야옹"); -> super는 없어도 가능 명시적으로 표시해줄 수 있다
		
	}
	
	public void test() {
		System.out.println(">> 테스트용 메소드 실행 ");
	}

}
