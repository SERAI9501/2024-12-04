package com.sist.main;
/*
 *  메소드 오버라이딩 => 메소드의 기능 변경 => 유지보수 204page
 *  ----------------------------------------------
 *  오버라이딩의 조건 ***** 인터페이스
 *  1. 상속 => 상속받은 메소드를 변경해서 사용
 *  2. 메소드명이 동일하다
 *  3. 매개변수가 동일 => 오버로딩은 달랐다 / 클래스에서 처리했다
 *  4. 리턴형이 동일
 *  5. 접근지정어가 확대 가능 , 축소 불가능
 *   => 실무 (입사)
 *      --------
 *      1) 변수
 *      2) 연산자
 *      3) 제어문
 *      ------------
 *      4) 메소드
 *      5) 멤버변수
 *      6) 생성자
 *      ***7) 오버라이딩
 *      ***8) 인터페이스
 *      ***9) 예외처리
 *   class A
 *   {
 *   	void display(){}
 *   }
 *   class B extends A
 *   {
 *   	1. void display(){}
 *   	2. public void display(){} => 확장
 *   	3. protected void display(){} => 확장
 * 		4. private void display(){} **** 오류 (축소가 되어서 오류가 난다)
 *   }
 *   
 *   interface A
 *   {
 *   	(public abstract)void display();
 *   	int a; ==>오류 => 상수형
 *   }
 *   class B implements A
 *   {
 *   	void display(){} ==> 오류 위에 퍼블릭이 생략되어있다.
 *   }
 */

class Animal
{
	public void run()
	{
		System.out.println("걷는다");
	}
}
class Dog extends Animal
{
	public void run()
	{
		System.out.println("4발로 걷는다");
	}
}
class Human extends Animal
{
	public void run()
	{
		System.out.println("2발로 걷는다");
	}
}
/*
 * ==> 정적 바인딩 => 한개의 주소를 유지
 * ==> 동적 바인딩 => new 주소변경 *** 자바
 * ==> 가상함수
 */
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련 클래스가 여러개 있는 경우 => 상위 클래스로 이용
		// 객체를 한개만 생성해서 사용
		Animal ani=new Dog();//new가 생성자이다.
		ani.run();
		ani=new Human(); // 객체 1개를 가지고 2개를 생성한다.
		ani.run();
		//상위 클래스로 모을때 사용하는 것
		/*
		 *  변수 찾기
		 *  -------- 선언되는 클래스형
		 *  메소드 찾기
		 *  -------- 생성자
		 */
	}

}
