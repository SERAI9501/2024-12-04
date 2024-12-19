package com.sist.lib;
/*
 *  Equals() => Object에서 객체 비교
 *              String => equals() 문자열 비교 => 오버라이딩
 *  객체는 주소만 갖고 있다
 *  밤색 매개 지역 변수 / 파란색 맴버변수
 *  스태틱은 필기체로 나온다 
 */
class Human
{
	String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Human(String n)
	{
		name=n;
	}
	
	//h1                       h2 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human)
		{
			Human s=(Human)obj;// 메소드 역할 => 형변환
			return name==s.name;
		}
		else
			return false;
	}
	//문자열만 비교하는 방식
	
}
public class 라이브러리_Object_4 {
	public static void main(String[] args) {
		Human h1=new Human("홍길동");
		Human h2=new Human("홍길동");
		//Human h2=h1;
		if(h1.equals(h2))
		{
			System.out.println(h1+"=="+h2);
		}
		else
		{
			System.out.println(h1+"!="+h2);
		}
	}
}
