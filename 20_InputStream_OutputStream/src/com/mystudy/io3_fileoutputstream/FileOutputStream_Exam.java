package com.mystudy.io3_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStream_Exam {

	public static void main(String[] args) {
		// FileOutputStream : byte 단위로 파일에 저장(출력, 쓰기)
		File file = new File("file/test_out_01.txt");
		
		FileOutputStream fos = null;
		try {
			//1. 사용할 객체(인스턴스) 생성
			fos = new FileOutputStream(file); //새로작성(내용 삭제후 쓰기) 
			//fos = new FileOutputStream(file, false); // 내용추가모드 true => 실행 할때마다 내용 추가되어 txt에 출력 , false => 내용 지운 후 새로쓰기 
			
			//2. 객체 사용해서 작업처리 
			fos.write('H');
			fos.write('E');
			fos.write('L');
			fos.write('L');
			fos.write('O');
			
			byte[] bytes = "Hello Java!!!".getBytes();
			System.out.println("bytes : " + Arrays.toString(bytes)); //"Hello Java!!!" => bytes에 저장
			
			fos.write(bytes); //->txt에 출력 
			fos.write('\n');
			
			//             시작위치, 사용갯수
			fos.write(bytes, 0, bytes.length);
			fos.write('\n');
			
			fos.write(bytes, 6, 7);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			if (fos != null) {				
				try {
					fos.close();
				} catch (IOException e) { }
			}
		}
	}

}
