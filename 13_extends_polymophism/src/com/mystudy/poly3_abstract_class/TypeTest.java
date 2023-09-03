package com.mystudy.poly3_abstract_class;

class TypeTest {

	public static void main(String[] args) {
		//AbstractAnimal animal = new AbstractAnimal(); -> Cannot instantiate the type AbstractAnimal
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		System.out.println("-------------");
		sound(cat); //animal 타입에게 상속받은 Cat에 있는 sound() 호출
		sound(dog);
	}
	
	//부모 클래스인 추상클래스 타입으로 받아서 처리
	static void sound(AbstractAnimal animal) {
		animal.sound(); //animal 타입의 sound() 호출 
	}
}
