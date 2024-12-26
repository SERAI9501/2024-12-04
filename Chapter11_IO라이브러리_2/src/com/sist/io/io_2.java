package com.sist.io;
import java.io.*;
public class io_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			// 파일 복사 => 파일 전송
			// 파일 자체ㅓ
			
			fis=new FileInputStream("c:\\javaDev\\movie.txt");
			fos=new FileOutputStream("c:\\java_data\\movie.txt");
			                        //=> 파일이 없는 경우에 자동으로 생성
			      /*
			       * mode
			       *  r => read
			       *  w => write => create
			       *  a => append
			       *  fos=new FileOutputStream("c:\\java_data\\movie.txt");
			       */
			int i=0;// i라는 애는 글자 한글자
			// 읽은 바이트수
			byte[] buffer=new byte[1024];// TPC(1024) / UDP(512)
			// read() / read(byte[],start,end)
			while((i=fis.read(buffer,0,1024))!=-1)
				{
				fos.write (buffer,0,1);
				
				}
			System.out.println("복사 완료");
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		finally
		{
			try
			{
				 fis.close();
				 fos.close();
			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}

}
