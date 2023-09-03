package com.mystudy.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		// 프로토콜 ://호스트(서버) :포트번호/ 경로(패스)?질의(query)
		// https://sports.news.naver.com/news?oid=311&aid=0001623503

		URL url = new URL("http", "mystudy.com", 8080, "/aaa/bbb/index.jsp?id=hong&password=1234#content");
		//http://mystudy.com:8080/aaa/bbb/index.jsp?id=hong&password=1234#content
		System.out.println("url : " + url);
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int portNum = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery(); //물음표 뒤쪽에 작성한다 
		String ref = url.getRef();
		
		System.out.println("프로토콜(protocol) - 약속, 규약 : " + protocol);
		System.out.println("호스트(host)" + host);
		System.out.println("포트번호(port) : " + portNum);
		System.out.println("기본포트(defaultPort): " + defaultPort);
		System.out.println("경로-패스(path): " +  path);
		System.out.println("쿼리-질문(query): " +  query);
		System.out.println("참조(reference) : " +  ref);
	
		System.out.println("----------------------------------");
		url = new URL("https://sports.news.naver.com/news?oid=311&aid=0001623503");
		
		System.out.println("url : " + url);
		
		protocol = url.getProtocol();
		host = url.getHost();
		portNum = url.getPort(); //포트번호를 알고 있으면 서비스되고 있는 프로그램에 도달할 수 있다 
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host)" + host);
		System.out.println("포트번호(port) : " + portNum);
		System.out.println("기본포트(defaultPort): " + defaultPort);
		System.out.println("경로-패스(path): " +  path);
		System.out.println("쿼리-질문(query): " +  query);
		System.out.println("참조(reference) : " +  ref);
	}

}

