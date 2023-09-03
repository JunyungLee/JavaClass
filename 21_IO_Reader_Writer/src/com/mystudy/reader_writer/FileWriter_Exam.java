package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Exam {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---- ");
		// FileWriter : 파일에 문자단위 출력(쓰기)
		File file = new File("file/test_char_out.txt");
		//FileNotFoundException =>folder가 없을땐 예외 발생
		FileWriter fw = null; //FileWriter 에는 1024 byte - buffer 기능을 가지고 있다 
		
		try {
			//1. 객체(인스턴스) 생성
			fw = new FileWriter(file);
			
			//2. 객체 사용 (파일에 문자단위 출력)
			fw.write('대');
			fw.write("한"); //문자열 출력이 가능하다
			fw.write("민국");
			
			fw.flush(); //버퍼에 있는 데이터를 강제로 Output 처리 
			
			fw.write("Hello Java!!!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			try {
				if (fw != null) fw.close(); //close() : buffer에 있는 데이터 출력하고 종료 => close를 안하고 데이터를 출력시키면 출력이 안된다!!(buffer기능이 있기 때문)
			} catch (IOException e) {}
		}
		
		System.out.println("--- main() 끝 ---- ");
		

	}

}
