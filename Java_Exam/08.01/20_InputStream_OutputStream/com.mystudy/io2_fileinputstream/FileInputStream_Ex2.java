package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			// 1. 사용할 객체 생성
			//fis = new FileInputStream(file); //File 객체 주입(전달)받아 사용
			fis = new FileInputStream("file/test01.txt");
			
			// 2.객체 사용
//			int readValue = fis.read();
//			while (readValue != -1) {
//				System.out.println("read() int 값 : " + readValue);
//				System.out.println(">> char : " + (char)readValue);				
//				readValue = fis.read();	
//			}
			int readValue; 
			while ((readValue = fis.read()) != -1) { //data를 다 읽었으면 -1을 반환한다 
				System.out.println("read() int 값 : " + readValue);
				System.out.println(">> char : " + (char)readValue);				
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[주의] : file이 존재하지 않습니다" + e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 닫기 (close)
			if (fis != null) {				
				try {
					fis.close();
				} catch (IOException e) { }
			}
		}
		System.out.println("---- Main() 끝 ----");
	}

}
