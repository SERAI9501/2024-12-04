//같은 곳의 주소가 있으면 같은 값을 제어 할 수 있다 = Call By Reference 하지만 String은 제외가 된다.
//125 page
class B
{
	int a;
	int b;
}
public class 객체지향_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a;// b=10 => 주소를 이용하는 것이 아니라 값만 이용
		B aa=new B();
		aa.a=100;
		aa.b=200;
		B bb=aa;// 별칭 => 같은 주소를 가지고 있으면 같은 주소를 제어한다
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		System.out.println("bb.a"+bb.a);
		System.out.println("bb.a"+bb.b);
		// 이런식의 코딩은 웹 / 윈도우 가 있다.
		/* MVC => SpringMVC
		 *  사용자 요청 ==> 요청값 받는다 ==> 요청 처리
		 *   결과값 브라우저 전송<=== 결과값을 받는다 <== 처리 완료
		 */
		bb.a=1000;
		bb.b=2000;
		// 클래스나 배열 => 주소를 넘겨주면 => 같은 메모리를 제어
		// 별칭
		// => 클래스에서 제외 => String은 제외가 된다. => 일반 변수 취급
		
		String s1="Hello";
		String s2=s1;
		System.out.println("s2="+s2);
		s2="Java";
		System.out.println("s1="+s1);
		//같은 주소를 제어 / 다른 메모리 생성 => new
	}

}
