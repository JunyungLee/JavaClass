
package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : file/test_char_copy.txt
		// 처리 : 원본파일에서 읽고, 대상파일에 쓰기/저장(문자단위 처리)
		//--------------------------
		
		//0. 사용할 파일(File) 객체 생성
		String sourceFile = "file/test_char.txt";
		String targetFile = "file/test_char_copy.txt";
		
		//1-1. FileReader, FileWriter 객체를 저장할 변수 선언
		FileReader fr = null;
		FileWriter fw = null;
		try {
			//1-1. FileReader, FileWriter 객체를 생성
			fr = new FileReader(sourceFile);
			fw = new FileWriter(targetFile);
			
			//2.반복작업(원본파일에서 읽고, 대상파일에 쓰기 반복)
			int readValue = fr.read();
			while(true) {
				if (readValue != -1) {
					fw.write(readValue);
					System.out.println((char)readValue);
					readValue = fr.read();
				}		
			fw.flush(); //버퍼에 있는 데이터를 강제 중지처리 
			}
		} catch (FileNotFoundException e1) {
			System.out.println("[예외] 파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("[예외] 파일을 읽을 수 없습니다");
		} finally {
			//3.사용객체 닫기(close)
			try {
				if (fr != null)	fr.close();
			} catch (IOException e) {}
			try { 
				if (fw != null) fw.close();
			} catch (IOException e) {}
		}
		
	}

}








