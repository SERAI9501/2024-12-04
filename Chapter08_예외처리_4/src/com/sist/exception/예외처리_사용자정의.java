package com.sist.exception;
// 사용자 정의 예외처리 => 호출 => throw: 예외를 찾아라
// => 1. 기존에 만들어져 있는 예외처리 , 사용자 정의는 찾지 못한다
/*
 *  1. 데이터형 = 클래스 => new 
 *     int / double / long =>메모리 크기 확인이 가능하다
 *     class A
 *     {
 *     ??
 *     }
 *     => new 의 역할은 메모리 크기를 확인해준다.
 *     => new 전에는 int molloc(sizeof()) 메모리 크기를 만들었었다.
 *   2. 사용자 정의 
 *   
 *   => 283page
 *      => 사용자 정의 예외처리 : 기존의 예외처리 클래스를 상속을 받아야 한다
 *         보통 Exception / Throwable
 *              상속 가능      상속 의미없음
 *      => class MyException extends Exception
 *         {
 *         }
 *         
 *      3가지가 있다
 *      => try catch = 에러처리를 하는구나
 *         => 일반적인 경우는 이게 많다
 *      => throws = 선언하는구나 어떤 에러가 발생할지 선언 하는구나
 *         => 라이브러리에서 주로 나온다
 *      => throw = 직접 예외를 발생하는구나 = 사용자 정의 예외를 발생하는구나
 *         => 사용자 정의 예외처리를 만들때 나오는 형식이다. => 실무에서 보안관련해서 가끔 나올 수 있다.
 *     ----------------------------------------------------------------------
 *     
 *     에러 처리 => if 우선시
 *            => if이 안되는 경우 => 자바지원하는 예외사용
 */
import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class 예외처리_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("점수입력:");
			int score=scan.nextInt();
			if(score<0 || score>100)
			{
				throw new MyException("잘못된 입력입니다");
				// catch를 호출 한다
				// 사용자 정의 예외처리가 있는 경우
			}
		}catch (MyException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
