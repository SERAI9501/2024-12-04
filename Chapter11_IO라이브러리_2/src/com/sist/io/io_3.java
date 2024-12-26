package com.sist.io;
import java.io.FileWriter;
// 파일 제어 => 파일에 읽기/쓰기
//           -----------
import java.util.*;
public class io_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// true => append모드 => 이어서 저장하게 만듬
		//FileWriter 파일에
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("c:\\java_data\\sawon.txt");
			fw.write("1|홍길동|개발부|서울|3000\r\n");
			System.out.println("등록완료");
		}catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		finally
		{
			
		}
	}

}
