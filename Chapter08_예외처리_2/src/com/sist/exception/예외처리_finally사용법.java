package com.sist.exception;
// try~catch~finally
// finally는 생략이 가능
// 사용처 => 파일 닫기 , 오라클 연결 해제 , 서버 연결 해제
// try (정상수행) catch(오류발생) 상관없이 무조건 수행
import java.io.*;//파일 읽기 => CheckException
public class 예외처리_finally사용법 {
/*
 * 	try
		{
			FileReader fr=new FileReader()
		}catch(IOException e)
		{
		}
		finally
		{
			fr(X)
		}
		
	}
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader fr=null;//메모리주소를 가지고 있지 않은 상태
//		//모든 클래스의 초기값은 null 
//		try
//		{
//			fr=new FileReader("c:\\javaDev\\seoul_nature.txt");
//			int i=0;// => 한글자씩 읽어온다
//			// => 정수형으로 
//			while((i=fr.read())!=-1)
//			{
//				
//				System.out.print((char)i); // 숫자를 캐릭터로 변경해서 읽어라
//			}
//		}catch(IOException ex)// 
//		{
//			ex.printStackTrace();//에러 확인
//		}
//		finally// 무조건
//		{
//			try
//			{
//				fr.close(); //파일을 닫아라	
//			}catch (IOException e) {
//				// TODO: handle exception
//			}
//			
//		}
		
		// 자동 => resource // 자동으로 파일을 닫게 만들 수 있다.
		try(FileReader fr=new FileReader("c:\\\\javaDev\\\\seoul_nature.txt"))
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
