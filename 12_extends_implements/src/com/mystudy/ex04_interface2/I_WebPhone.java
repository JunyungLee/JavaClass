package com.mystudy.ex04_interface2;

// Phone 기능(정보보기, 전화걸고, 받고, 메시지 송신, 수신)
// Mp3Phone 기능 (음악플레이)
// 웹검색 기능
interface I_WebPhone extends I_Phone, I_Mp3Phone {

	//WebPhone 고유기능 -------------------
	void searchWeb();
	
	//I_Phone 기능 ---------------------
	//public abstract void view(); //전화정보 확인
	//public void call();  //전화걸기 
	//void receiveCall(); //전화 받기 기능
	//void sendSms(); 
	//void receiveSMS();
	
	//I_Mp3Phone 기능 ------------------
	//void playMusic();
	
}
