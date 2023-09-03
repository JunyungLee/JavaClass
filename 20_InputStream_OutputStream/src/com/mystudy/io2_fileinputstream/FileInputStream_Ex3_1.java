package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. 파일을 읽기 위한 객체 생성 (File객체 입력(주입) 받음)
			fis = new FileInputStream(file);
			
			
			//2. 객체 사용(파일에서 읽고 화면출력)
			byte[] bytes = new byte[10];
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			// read(byte[] b) method 사용
			int readCnt = fis.read(bytes);
			System.out.println("readCnt : " + readCnt); //읽은 갯수 
			System.out.println("bytes : " + Arrays.toString(bytes));
			for	(int i = 0; i < readCnt; i++) {				
				System.out.println("int: " + bytes[i]
									+ ", char : " + (char)bytes[i]);
			}
			System.out.println("--------");

			readCnt = fis.read(bytes);
			System.out.println("readCnt : " + readCnt); 
			System.out.println("bytes : " + Arrays.toString(bytes));
			//for (int i = 0; i < bytes.length; i++) { => returnValue 는 : 9
				// 9개까지는 유의미한 데이터 but 뒤에는 전에 읽었던것을 가져와서 사용하게 된다 
				// length 사용 -> 데이터가 남아있으면 가능하지만,(즉, 위의 상황에서는 사용 가능) but 데이터가 없다면 유의미하지 않은 데이터를 사용한다			
				// 따라서 유의미한 데이터만 사용하기 위해서는 return 받은 값까지만 사용해야 한다 
			for	(int i = 0; i < readCnt; i++)  {	
				System.out.println("int: " + bytes[i]
						+ ", char : " + (char)bytes[i]);
			}
			System.out.println("--------");
			
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3.사용객체 닫기 (Close)
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
