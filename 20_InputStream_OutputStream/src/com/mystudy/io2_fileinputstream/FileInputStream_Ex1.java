package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		System.out.println("----- 시작 -----");
		File file = new File("temp.txt");
		
		FileInputStream fis = null;
		try {
			//파일로 부터 읽기 위한 작업 진행
			//1. 사용할 객체 생성
			fis = new FileInputStream(file);

			//2. 객체 사용 작업처리 
			int readValue = fis.read();
			System.out.println("read() int값 : " + readValue); //A : 65 -> 아스키코드
			System.out.println("char() read() : " + (char)readValue); 
			
			System.out.println("----- 전체 데이터 읽어서 화면출력 ---");
			while(true) {		
				// EOF (End Of File) 를 만나면(더이상 읽을 것이 없으면) -1 return
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝(EOF)면 읽기종료 =>-1 인 이유: 데이터가 더 이상 읽을것이 없으면 -1을 반환하기 때문
				System.out.println("read() int값 : " + readValue);
				System.out.println("char() read() : " + (char)readValue); 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다" + e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 사용 후 닫기(close)
			if (fis != null) {				
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("------- 끝 -------");
		
	}

}
