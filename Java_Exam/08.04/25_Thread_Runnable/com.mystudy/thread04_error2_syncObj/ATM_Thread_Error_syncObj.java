package com.mystudy.thread04_error2_syncObj;

class Bank {
	int money = 0;
}
class ATM extends Thread {
	Bank bank; //참조형 데이터 타입 사용 
	//int money;
	
	public ATM() {}
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	// 입금처리 
	// synchronized (사용객체) {} : 사용객체(인스턴스) 동기화 처리 
	void deposit(int money) {
		synchronized(bank) {
			bank.money += money;
			System.out.println(Thread.currentThread() + "-" + "입금 : " + money + ", 잔액" + bank.money);
		}
	}
	// 출금처리
	 void withdraw(int money) {
		synchronized (bank) {			
			bank.money -= money;
			System.out.println(Thread.currentThread() + "-" + "출금 : " + money + ", 잔액" + bank.money);
		}
	}
	
	@Override
	public void run() {	
		//입금 후 계속 출금
		deposit(1000);
		bankSleep(1000);
		withdraw(500);
		bankSleep(1000);
		withdraw(300);
		bankSleep(1000);
		withdraw(200);
	}
	
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class ATM_Thread_Error_syncObj {

	public static void main(String[] args) {
		System.out.println("---main() 시작 ---");
		Bank bank = new Bank();
		
		ATM atm1 = new ATM(bank);
		ATM atm2 = new ATM(bank);
		
		atm1.start();
		atm2.start();
		
		System.out.println("---main() 끝 ---");
	}

}
