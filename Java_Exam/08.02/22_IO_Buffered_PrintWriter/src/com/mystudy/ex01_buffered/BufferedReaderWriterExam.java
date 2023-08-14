package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		// 버퍼(buffer) 기능이 구현되어 있는 클래스 
		// 버퍼 : 데이터를 저장하는 공간 (메모리상에)
		// BufferedReader, BufferedWriter 
		// File --> FileReader --> BufferedReader (주입)
		//--------------------------
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			// 파일로부터 읽기 위한 객체(인스턴스) 생성 
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			br = new BufferedReader(fr); //버퍼기능 + 파일읽기 기능 
			
			// 파일에 쓰기 위한 객체 생성
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bw = new BufferedWriter(fw); //버퍼기능 + 파일쓰기 기능
			
			// 파일에 먼저 쓰기
			bw.write("안녕하세요. 자바공부중입니다.\n"); //write ->옆으로 계속 출력 Print와 똑같
			bw.write("Hello Java!!!");
			bw.newLine(); //줄바꿈 처리 의미 
			bw.write("재미있나요????");
			bw.newLine();
			bw.write("----------------");
			bw.newLine();
			
			
			bw.flush();
			
			// 파일로부터 읽고, 파일에 쓰기(버퍼기능 이용)
			// 파일에서 읽기 (한 번 읽기)
			String str = br.readLine(); //한줄(라인) 읽기
			System.out.println("readLine() 읽은 값 : " + str);
			
			//파일에 쓰기(한 번 쓰기)
			bw.write(str); //문자열 출력 
			bw.newLine(); //출력하고 줄바꿈처리 
			
			// 남은 데이터 모두 읽고 쓰기 
			str = br.readLine(); //EOF : null 리천
			while (str != null) {
				bw.write(str); //문자열 출력
				bw.newLine();
				str = br.readLine();
				if (str != null) {
					bw.newLine(); //줄바꿈 처리					
				}
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {}
			try {
				if (bw != null) bw.close();
			} catch (IOException e) {}
		}
		
		System.out.println("--- main() 끝 ---");
	}

}
