package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		// (실습) FileReader_Exam1_내용을 반복문으로 변경 처리 
		
		File file = new File("file/test_char.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			while(true) {
				int readChar = fr.read();
				if (readChar == -1) break;
				System.out.println("int : " + readChar + ", Char : " + (char)(readChar));
			}
			/*
			 2번째
			 int readChar = fr.read();
			 while(readChar != -1) {
				System.out.println("int : " + readChar + ", Char : " + (char)(readChar));
			}
			 */
			/*
			 3번째
			 int readChar;
			 while((readChar = fr.read())!= -1) {
				System.out.println("int : " + readChar + ", Char : " + (char)(readChar));
			}
			 */
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[예외] 파일 없음");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("[예외] 파일을 읽지 못함");
		} finally {
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {}
		}
	}

}
