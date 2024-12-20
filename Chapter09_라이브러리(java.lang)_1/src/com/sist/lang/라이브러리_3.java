package com.sist.lang;
/*
 * Wrapper
 *      : 기본형(데이터형)을 클래스화 시켜서 사용이 편리하게 만든 클래스
 *        byte ===> Byte
 *        short ===> Short
 *        ***int ===> Integer
 *        ***long ===> Long
 *        float ===> Float
 *        ***double ===> Double
 *        char ===> Character
 *        ***boolean =-=> Boolean
 *        
 *      => 변환 (문자열)
 *      => 데이터형의 통일화 : 제네릭스
 *         <이 안에는 클래스형만 들어 갈 수 있다>
 *          =><int> 이런건 못들어간다. => <integer> 이건 들어간다.
 *      => 기능 많다
 *      => 일반 기본형과 호환
 *         Integer i=10 / int i=10
 *         
 *         Integer i=(int)10.5;
 */
import java.util.Scanner;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 진법변환 8,2,16진법 변환이 가능하다
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수입력:");
		Integer i=scan.nextInt();
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		// ***이진법
		System.out.println(Integer.toBinaryString(i));
		//2.범위 : 데이터형의 범위
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.print("첫번째 문자열 입력:");
		String s1=scan.next();
		System.out.print("두번째 문자열 입력:");
		String s2=scan.next();
		// 3. 변환 : 문자열 => 정수형
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	}

}
