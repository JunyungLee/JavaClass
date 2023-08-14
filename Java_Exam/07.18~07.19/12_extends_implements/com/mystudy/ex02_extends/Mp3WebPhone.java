package com.mystudy.ex02_extends;

class Mp3WebPhone extends Mp3Phone {

	public Mp3WebPhone(String phoneNo) {
		super(phoneNo);
	}
	public Mp3WebPhone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	public void Mp3WebWebSearch() {
		System.out.println(">> Web Search");
	}

}
