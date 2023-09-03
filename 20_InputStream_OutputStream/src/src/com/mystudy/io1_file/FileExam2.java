package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		//파일명 : "temp.txt" - 파일명, 확장자(명) 
		File file1 = new File("temp.txt"); //  = ./temp.txt
		//File 객체 생성은 파일의 존재여부와 관계없이 객체생성이 가능하다
		System.out.println("file1 : " + file1);

		// 상대경로 방식 (. : 현재위치, .. : 상위디렉토리(폴더)) 
		// 현재위치에 따라서 경로가 다르게 변함  //-> 현재 내 위치가 어디냐에 따라 경로가 다 다르다 
		File file2 = new File("./file/temp.txt");
		System.out.println("file2 : " + file2);
		
		// 절대주소방식 : Root 디렉토리로 부터 전체 경로를 표시 (위치 불변)
		File file3 = new File("c:\\temp\\aaa\\temp.txt"); // 경로 작성시 \\ 두개 겹쳐서 사용해야 한다 
		System.out.println("file3 : " + file3);
		
		System.out.println("---- getAbsolutePath() : 절대경로 -------"); // -> 나의 위치가 어디냐에 따라 상관없이 절대적으로 변하지 않는 경로  
		System.out.println("절대경로 file1 : " + file1.getAbsolutePath()); //file의 위치가 어디인지 알수 있음
		System.out.println("절대경로 file2 : " + file2.getAbsolutePath()); //현재 경로 + 문자열 붙이기 
		System.out.println("절대경로 file3 : " + file3.getAbsolutePath()); 
		
		System.out.println("------getCanocicalPath() : 정식경로 -------");
		System.out.println("정식경로 file1 : " + file1.getCanonicalPath());
		System.out.println("정식경로 file2 : " + file2.getCanonicalPath()); //현재 경로 + 위치
		System.out.println("정식경로 file3 : " + file3.getCanonicalPath());
		
		
		System.out.println("---- exists() : 파일의 물리적 존재여부 ----");
		System.out.println("file1 존재여부 : " + file1.exists());
		System.out.println("file2 존재여부 : " + file2.exists());
		System.out.println("file3 존재여부 : " + file3.exists());
		
		System.out.println("---- File 속성정보 ----");
		System.out.println("file1.length() : " + file1.length()); //file1.length() : 4 byte
		System.out.println("file1. canRead() : " + file1.canRead());
		System.out.println("file1. canWrite() : " + file1.canWrite()); //file을 탐색기에서 이동 및 수정 시 새로고침(refresh) 해주어야 eclipse내에서 인식 가능!
		System.out.println("file1.canExecute() : "  + file1.canExecute());
		
		System.out.println("--- getName() : 파일명만  ----");
		System.out.println("file1.getName() : " + file1.getName()); //file명 만 ! 
		System.out.println("file2.getName() : " + file2.getName());  
		System.out.println("file3.getName() : " + file3.getName());  
		
		System.out.println("--- isDirectory(), isFile() ----");
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		System.out.println("file1.isFile() : "+ file1.isFile());
		
		System.out.println("==========================");
		File file4 = new File("file/temp4.txt");
		System.out.println("file4.delete() : " + file4.delete()); //형상만 남아있고, 물리적으로는 삭제 처리 됨 
		
		file4.createNewFile();//새로만들기(경로까지 만들어주지는 않는다) //elipse내에 보이진 않지만 물리적으로는 만들어준 상태 ->탐색기 통해서 찾을 수 있음
		
		System.out.println("===================");
		File file5 = new File("temp1/temp2/temp3");
		System.out.println("file5.mkdirs() : " + file5.mkdirs()); //make directory
		
		
		
		
		
		
		
		
		
		
		
	}

}
