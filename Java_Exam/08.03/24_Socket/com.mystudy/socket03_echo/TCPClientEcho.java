package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) throws UnknownHostException {
		// 클라이언트 : 쓰고, 읽기
		// 서버 접속 후 메시지를 1번 보내고, - PrintWriter
		// 서버에서 보내온 메시지를 받아서 화면출력 - BufferedReader
		// PrintWriter <-- OutputStream 
		// BufferedReader <-- InputStreamReader <-- InputStream
		//--------------------
		//(추가) 보내는 메시지를 Scanner 사용 화면에서 직접 입력하여 처리 
		
		System.out.println(">>>> 클라이언트 시작");
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
	
		try {
			socket = new Socket("192.168.18.31", 10000);
			//socket = new Socket("localhost", 10000); (위와동일)
			
			System.out.println(">> 서버 연결 성공!!!");
			
			//서버쪽으로 쓰고, 읽기 위한 객체 만들기
			pw = new PrintWriter(socket.getOutputStream());
			br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
			
			//Scanner 사용해서 보낼 메시지 화면에서 입력처리
			Scanner scan = new Scanner(System.in);
			
			while(true) { //쓰고 읽기 반복!	
				//쓰기 
				System.out.print("메시지를 입력해주세요 : ");
				String msg = scan.nextLine();
				
				
				pw.println(msg);
				pw.flush(); //버퍼에 있는 데이터 강제로 출력(사용)
				
				if (msg.equals(""))break;
				
				//읽기
				msg = br.readLine(); 
				System.out.println(">> 서버 받은 메시지: " + msg);
				
			}
				scan.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close(); //선언 Try-catch 문 위에서 진행 후 finally 에서 close 가능 
			try {
				if (br != null) br.close();//close 반복문 안에 들어가지 않게 주의!
			} catch (IOException e1) {} 
			try {
				if (socket != null) {					
					socket.close();
				}
			} catch (IOException e) {}
		}
		
		System.out.println("클라이언트 종료 =====> ");		
	}

}
