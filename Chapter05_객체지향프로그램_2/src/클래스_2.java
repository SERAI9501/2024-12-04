// 멤버변수 , 공유 변수의 초기화 => 값 주입
/*
 *   구성요소 => 설계 => 메모리에 저장후에 사용
 *                  -----------------\
 *                  \
 *    클래스
 *     = 멤버변수만 가지고 있는 경우 => 데이터형 클래스
 *       사용자 정의 데이터형 : ~VO , ~DTO
 *     = 메소드만 가지고 있는 경우 => 액션 클래스(기능)
 *       연결용 : 오라클 연결 / 브라우저 연결
 *            ~DAO           ~Model(~Controller,~action)
 *            브라우저 ==== 자바 ==== 오라클
 *            => Front + Back => Spring -Framework 3.ver
 *            => Front / Back     | 지원하지 않는다
 *              -------------
 *                        |Spring=Boot 4ver
 *              |VSCode / Web Storm (AI)
 *     => MyBatis(SQL) / JPA
 *     => Jquery(ajax) ==> 최근에 사라짐 => 1차 (JSP)
 *     => VueJs ==> 2차 프로젝트
 *     =>
 *              
 *     = 혼합형 : 변수+메소드 (크롤링 , OpenApi)
 *              ~Manager , ~Service
 *      class className
 *      {
 *        --------------
 *        변수 설정 => 클래스안에서 필요한 데이터를 설정
 *        //기본형 / 클래스 / 배열 / 열거형 ...
 *        --------------
 *        변수 => 사용하기 위해서 초기값 (초기화)
 *        1) 명시적 초기화 <= 우선
 *        2) 생성자
 *           1. 클래스를 메모리에 저장할때 호출하는 메소드
 *              new 생성자()
 *              --- ----- 초기값을 주입
 *              저장할 메모리 공간
 *              => 멤버변수의 초기화 담당
 *           2. 특징
 *              = 클래스명과 동일
 *              class A => A()
 *              class B => B()
 *              = 리턴형이 없다
 *              class A
 *                => void A()
 *                => int A()
 *               = 여러개를 만들 수 있다.
 *                 --------------- 오버로딩
 *                 오버로딩의 조건
 *                 ----------
 *                 1. 메소드명이 동일
 *                 2. 리턴형은 관계없다.
 *                 3. 매개변수 => 갯수나 데이터형이 다른 경우
 *                 4. 접근지정어는 관계 없다
 *                 5. 한개 클래스 안에서 존재
 *                 class A
 *                 
 *               = 상속에서 예외
 *               = 생성자가 필요한 위치
 *                 ***생성자가 없는 경우에는 컴파일러에 의해 생성
 *                     ----------- 디폴트 생성자
 *                     
 *               = 생성자의 용도
 *                  = 변수 초기화 (명시적인 초기화가 안되는 경우)
 *                               => 구현후에 데이터 처리
 *                  = 시작과 동시에 처리하는 기능이 있는 경우
 *                    윈도우 초기화 (화면 UI)
 *                    파일 읽기 ...
 *                = 생성자 호출
 *                  new 생성자() = 메모리가 생성
 *                  new 생성자() /new를 넣을때마다 메모리를 따로 생성하기에 한번만 호출하는게 좋다.
 *                  new 생성자()
 *                  
 *        3) 초기화 블록
 *           = 인스턴스 블록
 *           = static 블록
 *        --------------
 *        메소드 : 기능처리
 *        --------------
 *      }
 */
class Student
{
	//1. 저장 => 명시적인 초기화
	int hakbun=1;
	String name="홍길동";
	String sex="남자";
	//초기화
	//자동 생성 => 디폴트 생성자
	//변수값 변경 ... 사용자로부터 값을 받아서 저장
	//2. 생성자
	Student() {
		
		hakbun=1;
		name="심청이";
		sex="여자";
	}
	Student(int h,String n, String s) //오버로딩기법
	{
		hakbun=h;
		name=n;
		sex=s;
	}
	Student(int h,String n)
	{
		//생성자 => 자신의 생성자 호출
		this();//자신의 생성자 호출하는 것 // 주의점 => 반드시 첫줄에 사용한다 // super() => 상속 내린 클래스의 생성자
		hakbun=h;
		name=n;
	}
	Student(String n,String s)
	{
	this(5,"이산");
	name=n;
	sex=s;
	/*
	 * 오버로딩 기법 = 생성자 여러개를 쓰는 것
	 */
	}
	Student(int a,int b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Student(char a,double b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Student(double a,double b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student hong=new Student(); 
//		System.out.println("이름:"+hong.name);
//		System.out.println("성별:"+hong.sex);
//		System.out.println("학번:"+hong.hakbun);
//		
//		Student shim=new Student();
//		System.out.println("이름:"+hong.name);
//		System.out.println("성별:"+hong.sex);
//		System.out.println("학번:"+hong.hakbun);
		Student hong=new Student(1,"홍길동","남자");
		System.out.println("이름:"+hong.name);
		System.out.println("성별:"+hong.sex);
		System.out.println("학번:"+hong.hakbun);
		Student shim=new Student(2,"심청이","여자");
		System.out.println("이름:"+shim.name);
		System.out.println("성별:"+shim.sex);
		System.out.println("학번:"+shim.hakbun);
		Student park=new Student(3,"박문수","남자");
		System.out.println("이름:"+park.name);
		System.out.println("성별:"+park.sex);
		System.out.println("학번:"+park.hakbun);
		
		Student lee=new Student(4, "이순신");
		System.out.println("이름:"+lee.name);
		System.out.println("성별:"+lee.sex);
		System.out.println("학번:"+lee.hakbun);
		
		Student kim=new Student("김두한","남자");
		System.out.println("이름:"+kim.name);
		System.out.println("성별:"+kim.sex);
		System.out.println("학번:"+kim.hakbun);
		
		Student d=new Student(10.5,'A',100);
		System.out.println();
		//=> 같거나 작은 데이터형을 보내면 된다.
		//=> 권장 : 같은 데이터 전송
	}

}
