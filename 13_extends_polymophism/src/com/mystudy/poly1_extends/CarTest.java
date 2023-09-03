package com.mystudy.poly1_extends;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car 클래스 ===");
		Car car = new Car();
		car.type = "자동차(Car)";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=====Ambulance 클래스 ====");
		Ambulance am = new Ambulance();
		am.type = "구급차(Ambulance)";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		
		am.siren();
		
		System.out.println("=== FireEngine 클래스 ===");
		FireEngine fe = new FireEngine();
		fe.type = "소방차(FireEngine)";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		
		fe.siren();
		fe.water();
	
		System.out.println("=== 타입확인====");
		Car carTemp = car; // Car <-- Car
		carTemp = am; // Car <-- Ambulance
		carTemp = fe; // Car <-- FireEngine
		System.out.println("Car Type : " + carTemp.type);
		System.out.println("---- 타입 확인 (instance Of 연산자 활용) ----");
		if (carTemp instanceof Object) {
			System.out.println("----Object 타입이다----");
		}
		if (carTemp instanceof Car) {
			System.out.println("----Car 타입이다----");
			carTemp.drive();
			carTemp.stop();
		}
		if (carTemp instanceof Ambulance) {
			System.out.println("---- Ambulance 타입이다----");
			carTemp.drive();
			carTemp.stop();
			((Ambulance) carTemp).siren(); //자동 형변환 처리해줌 
		}
		if (carTemp instanceof FireEngine) {
			System.out.println("---- FireEngine 타입이다----");
			carTemp.drive();
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
		System.out.println("============");
		System.out.println("--- Car 타입 객체 전달시 (타입체크) ----");
		typeCheck(car); //Car 타입
		
		System.out.println("--- Ambulance 타입 객체 전달시 (타입체크) ----");
		typeCheck(am); //Ambulance 타입
		
		System.out.println("--- FireEngine 타입 객체 전달시 (타입체크) ----");
		typeCheck(fe); //FireEngine 타입
		
		System.out.println("--- main() 끝 ---");
	}
	static void typeCheck(Car car) { 
		System.out.println(":: Car 타입입니다");
		car.drive();
		car.stop();
		
		//구조: 비교할(확인할) 객체 instanceof 비교할 클래스명(타입명) //확인 -> 형변환
		if (car instanceof Ambulance) {
			System.out.println("---- Ambulance 타입이다----");
			((Ambulance) car).siren(); //자동 형변환 처리해줌 
		}
		if (car instanceof FireEngine) {
			System.out.println("---- FireEngine 타입이다----");
			((FireEngine) car).siren();
			((FireEngine) car).water();
		}
	}

}
