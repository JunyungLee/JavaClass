package com.mystudy.ex05_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream_Exam {

	public static void main(String[] args) {
		// DataInputStream, DataOutputStream
		// 기본 데이터 타입 데이터 읽고(InputStream), 쓰기(OutputStream)
		//---------------
		// 파일에 기본데이터 타입 값을 파일에 쓰고, 읽어서 화면 출력
		File file = new File("file/data_io_stream.txt");
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			// 파일에 쓰고, 저장된 데이터 읽어서 화면출력
			FileOutputStream fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//기본 데이터 타입 값을 파일에 쓰기(출력)
			dos.writeBoolean(true); //1byte로 데이터 처리한다
			dos.writeByte(127);
			dos.writeInt(12000);
			dos.writeDouble(Math.PI);
			dos.writeUTF("대한민국~~~");
			dos.writeUTF("Hello Java!!!");
			
			System.out.println(">> 파일에 출력이 완료되었습니다");
			
			
			//파일에 저장된 데이터를 읽어서 화면출력
			dis = new DataInputStream(new FileInputStream(file));
			System.out.println(dis.readBoolean()); //같은 타입으로 읽기!
			System.out.println(dis.readByte()); 
			System.out.println(dis.readInt()); 
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			//System.out.println(dis.readShort()); 
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
