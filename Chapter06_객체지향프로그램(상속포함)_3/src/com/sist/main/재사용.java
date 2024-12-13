package com.sist.main;
/*
 *  논리적 관계
 *  1. 상속 : is-a
 *     동물 ani=new 개() => 개는 동물이다
 *  2. 포함 : has-a : 클래스안에 클래스를 포함
 *  --------------------------------- 클래스 크기
 *  객체가 전체가 4byte를 가지고 있다
 *  => 형변환
 *     ----
 *      자동 형변환 (묵시적 형변환)
 *      상위클래스 객체=new 하위클래스생성자()
 *      double d=10 => 10.0
 *      강제 형변환 ()
 *      int a=()int10.5
 *      하위클래스 객체=(하위클래스)new 상위클래스() => 오류나는 코드 // 클래스도 데이터형중 하나이다.
 *      ----------------------------------------------
 *       => 라이브러리는 클래스를 리턴할 경우
 *       ---------------------------
 *                   | Object / 매개변수가 Object 
 *                   221page ~ 231page
 */
import java.util.*;
class Sawon{
	String name;
	String dept;
	
	public void display()
	{
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
}
public class 재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		Sawon s1=new Sawon();
		s1.name="홍길동";
		s1.dept="개발부";
		list.add(s1);
	}

}
