package com.sist.lib;
import java.util.*;
/*
 * 5장
 *   클래스 구성 요소
 *   => 멤버변수 / 메소드 / 생성자
 *   => static 안에 인스턴스를 뭐쓴다 등등 정리해야함
 * 6장
 *   상속 / 포함
 *     => 상속 권한 (보통 상속 받은애(클래스)가 권한이 많다)
 * 7장
 *   추상클래스 / 인터페이스
 *             ------ 오버라이딩 기법 중요!
 * 8장
 *   try ~ catch
 *   throws
 * --------------------------------------------------
 * 9장
 *  Object
 *  String
 */
class Movie
{
	private int mno;
	private String title;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Movie(int mno,String title)
	{
		this.mno=mno;
		this.title=title;
	}
}
//getClass() => 클래스 타입 (패키지명 클래스명을 찾는 경우)
//=> 객체 생성 => 복제 => 소멸 => 비교 => 타입 = 오브젝트 역할
//모든 클래스는 오브젝트 상속이다
public class 라이브러리_Object_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie(1, "홍길동전");
		System.out.println(m1.getClass());//데이터형
		String s="";
		System.out.println(s.getClass());
		//ArrayList<Movie> list=new ArrayList<Movie>();
//		list.add(new Movie(1, "홍길동전"));
//		list.add(new Movie(2, "심청전"));
//		
//		Movie m1=list.get(0);
	}

}
