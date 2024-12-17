package com.sist.exception;
import java.util.Scanner;
/*
 *  UnCheck
 *  -------
 *     Throwable : 에러까지 잡는다
 *         |
 *     Exception : 예외처리의 모든 것을 잡을 수 있다
 *         |
 *   RuntimeException
 *         |
 *   -----------------
 *   |
 *   ArryayIndexOutOfBoundsException => 배열범위 초가
 *   ArithmeticException => 0으로 나누는 경우
 *   NumberFormatException => 정수변환
 *   ClassCastException => 형변환
 *   
 *   정상수행을 하면 catch절은 수행하지 않는다.
 *   try 안에서 오류발생시 수행 catch수행
 *   int a=0,b=0;
 *   try
 *   {
 *   	int a=10;
 *   }catch(Exception e)
 *   {
 *   	int b=20;
 *   }
 *   
 *   a,b => 사라진다
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2];// 배열범위 , 0
		try
		{
			System.out.print("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.print("두번째 정수 입력:");
			String s2=scan.next();
			
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
					
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
			
		
		}catch (NumberFormatException e)//기타적인 에러를 자벡ㅆ다 
		{
		{ e.printStackTrace(); // 권장
			System.out.println("정수 변환 문제 발생");
			// TODO: handle exception
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
			
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
		
		}
		catch (RuntimeException e)//기타적인 에러를 잡겠다다 
		{
			{
		System.out.println("에러발생");
		// TODO: handle exception
			}
		System.out.println("정상수행");
		}
	}
}
