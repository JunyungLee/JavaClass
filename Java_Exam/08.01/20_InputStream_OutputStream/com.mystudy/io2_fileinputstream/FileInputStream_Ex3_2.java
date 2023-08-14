package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		//(실습) Ex3_1 파일을 반복문으로 변경
		//0. 사용할 파일 객체 생성
		File file = new File("file/test01.txt");
		
		//1. 파일을 읽어서 작업할 객체 생성(FileInputStream) 
		FileInputStream fis = null; //null값으로 초기화, try-catch문 바깥에서 선언해주어야지 객체 닫을때 사용 가능하다
		try {
			fis = new FileInputStream(file);
			byte[] bytes = new byte[10];
			
			//2. 객체 사용 파일데이터 읽어서 화면 출력 
			//	(byte[] 사용, 반복문으로 반복처리)
			while(true) {
				int readCnt = fis.read(bytes);
				if (readCnt == -1) break;
				System.out.println("readCnt : " + readCnt); 
				System.out.println("bytes : " + Arrays.toString(bytes));
				for(int i = 0; i < readCnt; i++) {
					System.out.println("int : " + bytes[i] + ", Char : " + (char)(bytes[i])); 
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file이 존재하지 않습니다");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			//3.객체 닫기 (close)
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
