package com.mystudy.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {

	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP 주소 관련 클래스 
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println("iaddr : " + iaddr);
		System.out.println("호스트명 : " + iaddr.getHostName());
		System.out.println("호스트 IP 주소 : " + iaddr.getHostAddress());
		
		System.out.println("---- 네이버 주소 검색 ----");
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("naver : " + naver);
		System.out.println("naver : " + naver.getHostName());
		System.out.println("naver : " + naver.getHostAddress());
		
		System.out.println("--- 네이버 IP 주소들 검색 ---");
		InetAddress[] iaArray = InetAddress.getAllByName("www.naver.com"); //InetAddress[] 
		
		for (InetAddress ia : iaArray) {
			System.out.println("호스트명 : " + ia.getHostName());
			System.out.println("IP주소 : " + ia.getHostAddress());
		}
		
		
		
		
	}

}
