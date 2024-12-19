package com.sist.main;
/*
 *  290page
 *  자바에서 지원하는 라이브러리
 *               ------ 프로그램에 피룡한 클래스를 모아서 개발시에 사용이 가능하게 만들어 주는 것
 *  => 라이브러리중심 => 조립
 *  => Scanner / System / String ... 이런 것들이 다 라이브러리이다.
 *  
 *  => 많이 사용하는 라이브러리
 *     1) 자바에서 지원 : 
 *     java.lang = 9장
 *      **Object
 *      System
 *      **String
 *      StringBuffer
 *      Math
 *      **Wrapper : 데이터형을 클래스화
 *      ------
 *        ***=> Integer
 *        ***=> Double
 *        ***=> Boolean
 *        => Byte
 *        => Float
 *        ***=> Long
 *     java.util = 10장
 *        => Scanner
 *        => Date / Calendar
 *        => Collection
 *          ----------> 배열대체
 *          List / Set / Map
 *          -----------------interface
 *          List : ***ArrayList,Vector,LinkedList,Stack
 *                                      |
 *                                    Queue
 *          Set : TreeSet / ***HashSet : 중복없는 데이터
 *          Map : ***HashMap / Hashtable
 *     java.io = 11장
 *         => FileReader / FileWriter
 *         => InputStream / OutputStream
 *         => BufferedReader / BufferedWriter
 *         => BufferedInputStream / BufferedoutputStream
 *         => 입출력 : 파일 / 메모리 / 네트워크
 *         => ~Stream , Reader/Writer
 *            -------   -------------
 *            1byte        2byte(한글포함)
 *              | 네트워크 , 파일업로드/다운로드
 *         => File
 *     java.sql = 12장
 *         => Connection
 *         => Statement
 *         => ResultSet
 *     --------------------
 *     java.net
 *         => URL / ServerSocket / Socket
 *     java.text
 *         => SimpleDateFormat / MessageFormat / DecimalForma
 *     java.lang.reflect
 *         => 리플렉션 => 메소드 / 클래스 / 변수 / 생성자 를 제어할때
 *      **** Annotation, 열거형
 *           ----------
 *      J2SE
 *      웹 라이브러리 : JSP / Servlet / Spring => 2차 자바
 *      J2EE
 *      
 *      J2ME (X) => Kotlin => Dart(Flutter)
 *            java.은 1.0버전  javax.~ 은 2.0버전
 *     2) 외부업체 지원 : Jsoup / lombok / Spring / simple-json / bson 
 *         => mvnrepository.com 위 사이트에서 주로 받는다
 *     3) 사용자 정의 = 우리가 만든 것 : 잘 만들어진 클래스 / 자주 사용하는 클래스
 *         => .jar로 묶으면 편해진다
 *         => 1차 => JSP (MVC => Spring 형식)
 *     ================================================================
 *     9장
 *     	    java.lang패키지
 *          1) import를 생략할 수 있다 => 자동 추가
 *             => 가장 많이 사용 라이브러리 (String,System)
 *          2) 대표클래스
 *             = Object : 모든 클래스의 상위 클래스
 *                        ------- Object 상속을 ㅂ다는다
 *              public class A extends Object
 *                             -------------
 *                              생략이 가능
 *             = 모든 클래스에서 사용하는 기능 (메소드)
 *             = toString() : 객체 주소를 출력함
 *               => 명시적 / 묵시적
 *                  A a=new A();
 *                  => System.out.println(a.toString())
 *                  => System.out.prontln(a)
 *             => 자주 사용이 된다 / 객체의 값이 정상적으로 처리 확ㅇㄴ
 *             => 객체를 무자열화 지킨다
 *            = clone 객체
 *             finalize() : 소멸자 => 메모리 해제시에 자동 호출한다
 *             ------------- System.gc() : 바로 사용
 *            = equals() => 객체 비교 => 
 *             = hashCode() => 비교
 */	
class Student
{
	private String name;
	private String phone;
	private String address;
	
	// 접근 가능 => 메소드
	public Student(String name,String phone,String address)
	{
		/*
		 *  1.지역변수 / 매개변수
		 *   1.지역변수 , 매개변수 찾기
		 *   2.멤버변수
		 *   **지역변수 우선 순위
		 */
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public void print()
	{
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		System.out.println("전화: "+phone);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Student s1=new Student("홍길동", 010-1111-1111, "서울");
	    Student s2 new Student("심청이", 010-2222-2222, "경기");
	    // 객체 출력시에 => toString()을 
	    s1.print();
	    System.out.println(s1);//메모리 주소 묵시적
	    System.out.println(s1.toString());
	    
	}

}
