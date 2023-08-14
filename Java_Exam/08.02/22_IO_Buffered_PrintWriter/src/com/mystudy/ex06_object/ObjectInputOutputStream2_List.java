package com.mystudy.ex06_object;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputStream2_List {

	public static void main(String[] args) {
		//(실습) StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고 
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 데이터를 화면 출력
		// 사용할 파일명 : file/object_io_list.data
		//--------------------------------------
		// VO 데이터 생성 --> List에 저장 ---> List를 파일에 출력
		// 파일에서 List 읽기 ---> List에 있는 VO 가져다 화면 출력
		
		StudentVO stu1 = new StudentVO("김유신", 95, 100, 80);
		StudentVO stu2 = new StudentVO("홍길동", 100, 90, 81);
		
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		list.add(stu1);
		list.add(stu2);
		System.out.println(list);
		
		//파일에 List 쓰고, 파일에서 List 읽어와서 담긴 데이터 화면 출력
		System.out.println("=== List 파일에 출력 (Output) ===");
		File file = new File("file/object_io_list.data");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			//파일에 list 쓰기
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {}
		}
		
		System.out.println("=== 파일에서 List 읽기 (Input) ====");
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			// 파일에서 일기 
			ArrayList<StudentVO> listin =(ArrayList<StudentVO>) ois.readObject();
		
			System.out.println("---- ArrayList에 저장 후 저장되었는지 확인 출력 ----");
			System.out.println(listin);
			System.out.println(listin.get(0));
			System.out.println(listin.get(1));
			
			//전체데이터 화면 출력 => list.get()사용
			for (int i = 0; i < listin.size(); i++) {
				if (i == 0) {
					System.out.print(listin.get(i));
				} else {
					System.out.print(", " + listin.get(i));
				}
			}
			
			System.out.println();
			
			//김유신 데이터 화면출력 - 향상된 for문 
			System.out.println("---------향상된 for문 활용 전체 데이터 화면 출력---------");
			for (StudentVO students : listin) {
				System.out.println(students.getName() + ": " + students.getKor() + ", " + students.getEng() + ", "
						+ students.getMath() + ", " + students.getTot() + ", " + students.getAvg());
			}
			System.out.println();
			
			//원하는 데이터만 추출
			System.out.println("---- 원하는 데이터만 추출 ----");
			for (StudentVO students : listin) {
				System.out.println(students.getName() +": " +  students.getTot() + ", " + students.getAvg());
			}
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (IOException e) {}
		}
		
		
		
		
		
		
		
	}

}
