package com.sist.main;
/*
 *  재네릭
 *  ----
 *  1) 데이터형을 변경해서 사용이 쉽게 만든다
 *     => 리턴형 / 매개변수 => Object => 원하는 데이터형으로 변경
 *  2) 한번에 데이터형을 변경할 수 있다 = 통일시킨다
 *  3) 형변환 없이 사용이 가능 => 소스 간결 / 가독성
 *  4) Object 단점
 *     =>  데이터 읽기가 어렵다
 *     ArrayList list=new ArraList();
 *     list.add(1);
 *     list.add(10.5);
 *     list.add('A');
 *     list.add("AAA");
 *     list.add(new A());
 *     list.add(2);
 *     list.add(10.5);
 *     list.add('B');
 *     list.add(new B());
 *     => 위처럼 데이터의 통일성이 없다면 반복문을 사용할 수 없다
 *             --------- 통일이 된다면 반복문 사용이 가능 => 데이터형을 통일 시키는 것을 제네릭 이라고 한다
 *     => 배열과 동일시 => 같은 데이터형만 
 *                     ---------- 제어가 쉽다
 *     => 사용자 정의가 없다 => 표준화가 좋다
 *     => 사용법 <클래스형>
 *             <int> X = <Initeger> , <Double>
 *                      ----------------------
 *                      | Wrapper
 *     => 임시 데이터형
 *       T /E / K / V
 *       => T/e => 클래스
 *        tyep/element
 *       => K/V => Map
 *          Key/ value
 *         
 */
/*
 *  Box<String> b=new Box Box<String>();
 *  Box b=new Box() = 설정안한다면 Object이다
 *  
 *  => 객체의 데이터형 안정성 => 제어문사용이 편리하다
 *  => 형변환을 하지 않기 때문에 소스가 간결
 *  => 명시적으로 코딩 => 유지보수시 어떤데이터가 첨부하는지 확인이
 *  => 사용법
 *  	ArrayList(String)
 *		ArrayList(integer)
 *		ArrayList(String)
 */
class Box<T>
{
	T t;// String t
	public void setT(T t) // String t
	{
		this.t=t;
	}
	public T get() // String 
	{
		return t;
	}
	
}
public class 제네릭_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box<String> b=new Box<String>();
        b.setT("Hello");
        String s=b.get();
        System.out.println(s);
	}

}