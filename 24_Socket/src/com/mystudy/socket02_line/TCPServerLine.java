package com.mystudy.socket02_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLine {

	public static void main(String[] args) {
		// 서버쪽 : 클라이언트가 보내온 메시지를 1번 읽어서 화면 출력
		// BufferedReader 사용해서 라인단위로 읽기(1번 읽기)
		// BufferedReader <-- InputStreamReader <-- InputStream
		//--------------------------------------
		
		System.out.println(">> 서버 시작 ----");
		ServerSocket server = null;
		
		try {
			//1. ServerSocekt 객체 생성 - 서비스할 포트 번호(portNum) 지정 
			server = new ServerSocket(10000);
			System.out.println("서버/IP : " + InetAddress.getLocalHost());
			System.out.println(">> 서버(ServerSocket) 대기중~~~");
			
			//2.서버 소켓 대기중 접속한 Socket과 통신할 수 있는 Socket 객체 생성 
			
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨 : " + socket);
			
			//3.Socket으로 부터 InputStream, OutputStream 객체 생성 
			OutputStream os = socket.getOutputStream();
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//4. 받을 메시지가 있으면 읽기 
			String msg = br.readLine();
			System.out.println(">> 서버에 받은 메시지 : " + msg);
			
			//5.보낼 메시지가 있으면 보내기(쓰기)
			//구현안함
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) {
					server.close();
					System.out.println("close> ServerSocket close 완료");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("서버가 종료되었습니다.");
		
		
		
	}

}
