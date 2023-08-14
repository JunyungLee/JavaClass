package com.mystudy.scanner6_bank;

public class BankATM_Test {

	public static void main(String[] args) {
		System.out.println("Bank Processing Start");
		System.out.println("----------------------");
		BankATM bank = new BankATM();
		bank.start();
		System.out.println("Bank Processing Finished");
		System.out.println("--------------------------");

	}

}
