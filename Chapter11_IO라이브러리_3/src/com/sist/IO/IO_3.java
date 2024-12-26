package com.sist.IO;
import java.io.*;
import java.util.*;
// Buffered InputStream / BufferedOutputStream
// String StringBuffer

// 한글을 가지고 파이 ㄹ자체를 제어 한다면 => FileReader / FileWraiter
//사용하는게 더 좋아                  BufferedReader / BufferedWriter
//                                 => 한줄씩 읽기 ,   한줄씩 저장
//                                => readLine() , writeLine()
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
     	// jar / zip / png / mp3 ....
     	FileInputStream fis=
     		new FileInputStream("c:\\javaDev\\mydata.jar");
     	BufferedInputStream bis=
     			new BufferedInputStream(fis);
     	
     	FileOutputStream fos=
     		 new FileOutputStream("c:\\java_data\\mydata.jar");
     	BufferedOutputStream bos=
     			new BufferedOutputStream(fos);
     	
     	int i=0;
     	byte[] buffer=new byte[1024];
     	while((i=bis.read(buffer, 0, 1024))!=-1)
     	{
     		bos.write(buffer, 0, i);
     	}
     	fis.close();
     	fos.close();
     
     	System.out.println("파일 복사 완료!");
     }catch(Exception ex) {ex.printStackTrace();}
	}

}