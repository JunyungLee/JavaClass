package com.mystudy.scanner3_cafe;

public class ScannerCafeTest2 {

	public static void main(String[] args) {
		System.out.println("-----영업시작------");
		ScannerCafe2 cafe = new ScannerCafe2();
		//System.out.println("Americano price : " + ScannerCafe2.AMERICANO); -> 단가확인 가능
		cafe.start();
		System.out.println("----영업종료 ----");
		

	}

}
