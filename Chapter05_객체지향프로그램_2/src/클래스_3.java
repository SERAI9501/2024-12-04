class Member2
{
	int no=100;
	int id=300;//Heap => 멤버변수
	Member2() {
		System.out.println("this="+this);
		int no=200;//Stack => 지역변수
		
		System.out.println("no="+(no+this.no));
		System.out.println(id);// this는 생략이 가능하다.
		// 1. 지역변수 우선 순위
		// 지역변수,매개변수 => 멤버변수
		// 생성자 this
		// 자신을 가져올때 this
		// this => 클래스 자신이 가지고 있는 멤버(변수,메소드)를 가져 온다.
		
	}
	/*
	 *  this => 자신의 객체
	 *  ---- 지역변수와 매개변수 == 멤버변수가 동일한 이름을 가지고 있는 경우
	 *                         구분자
	 *  ---- 모든 클래스는 this를 가지고 있다
	 *  class A
	 *  {
	 *  	this
	 *  }
	 *  class B
	 *  {
	 *  	this
	 *  }
	 *  ----------------- this는 static 변수
	 *  
	 *  JVM
	 *   => 
	 */
	/*
	 *  int a=10;
	 *  static int b=20;
	 *  
	 *  static void display() => 공통으로 사용하는 기능이 많을때 사용한다.
	 *  {
	 *  b만 사용이 가능
	 *  A a=new A();
	 *  a.b
	 *  }
	 *  void display2()
	 *  {
	 *  a,b => 사용이 가능
	 *  }
	 */
}
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m=new Member2();
		System.out.println(m);
		//static에서는 this를 사용할 수 없다
		//this는 인스턴스에서만 사용이 가능하다
		//static은 공유다
	}

}
