package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		// 서버쪽 : 읽고, 쓰기 
		// 클라이언트가 보내온 메시지를 1번 받고(읽기) - BufferedReader
		// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <-- InputStreamReader <-- InputStream
		// PrintWriter <-- OutputStream 
		//--------------------
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(10000);
			System.out.println(">> IP 주소:포트번호 - " + InetAddress.getLocalHost().getHostAddress());
			Socket socket = server.accept();
			
			System.out.println(">> 클라이언트 접속됨!!!");
			System.out.println(":: 접속정보 : " + socket.getInetAddress());
			
			//접속 완료 => 데이터를 받고, 받은 데이터 돌려주기(읽고, 쓰기)
			BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream())); //byte -> 문자계열로 변환하기(BufferedReader 사용을 위해 InputStreamReader 계열 사용해야함!!)
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			while (true) {				
				String msg = br.readLine();
				System.out.println(">>클라이언트 받은 메시지 : " + msg);
				
				if (msg.equals("")) break;
				
				pw.println(msg);
				pw.flush();
				
			}
				pw.close();
				br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(server != null) {					
					server.close();
					System.out.println("close> ServerSocket close 완료");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("서버 종료--------> ");
		
	}

}
