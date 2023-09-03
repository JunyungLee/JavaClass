package com.mystudy.ex03_isr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_Exam {

	public static void main(String[] args) {
		File file = new File("file/test_osw.txt");
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		//(실습) OutputStreamWriter 객체 생성해서 텍스트 출력해보세요
		try {
			System.out.println(">> main() 시작---->");
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			
			fos.write('H');
			fos.write('E');
			//fos.write('대'); -> 한글은 1byte 처리 X
			osw.write("L");
			osw.write("LO Java~~\n");
			osw.write("안녕!!!");
			
			osw.flush(); // flush 처리 또는 close() 처리 해주어야지 출력 가능!!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">> main() 끝 <----");
		

	}

}
