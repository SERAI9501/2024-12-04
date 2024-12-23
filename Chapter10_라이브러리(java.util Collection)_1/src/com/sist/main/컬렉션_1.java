package com.sist.main;
/*
 * 	335page
 *    자바 컬렉션
 *    --------
 *    1. 프로그램 => 데이터관리 (효율적)
 *                --------------
 *                1) 스프링/JSP(MVC) => 데이터관리
 *                   => 데이터베이스 (오라클,MySql)
 *                2) VueJS/React/Next/node
 *                   => 상태관리 (데이터 변경을 상태라고 한다.)
 *    2. 데이터베이스 : 데이터를 저장하는 공간
 *       --------
 *        변수/상수 => 데이터 한개 저장후 관리 => 데이터 많으면
 *       --------
 *        배열 => 고정적 / 데이터가 증가되면 다른 배열을 생성
 *       --------
 *        => 가변적 : 데이터가 증가되면 자동으로 메로리 공간 확장
 *        ***컬렉션
 *       ------------> 여기까지를 메모리 공간을 활용한다 (데이터가 사라진다)
 *       --------
 *         파일 => 종속적이다 다른 파일을 연결해서 사용이 어렵다
 *       --------
 *        ***RDBMS => 오라크 (관계형 데이터베이스 => 연결성)
 *       --------
 *       => 웹에서 가장 만힝 사용되는 클래스 : ArrayList/String/Integer
 *       => ArrayList는 데이터를 메모리에 저장후에 브라우저로 전송
 *       => 웹은 대부분이 Map형식으로 만들어져 있다
 *          request / response / session / cookie
 *                                         ------ 브라우저
 *                               ------- 서버에 저장
 *                    --------응답
 *          ------- 요청
 *      
 *      1. Collection 개요
 *         =>결과적으로 배열의 단점을 보완한 클래스 (고정 => 가변) 가변형이란? 값이 커질때마다 메모리도 자동으로 커지는 것을 말한다.
 *                   -------------------
 *         데이터를 효율적으로 저장하고 관리하기 위한 라이브러리
 *         표준화가 되어 있다 (모든 개발자가 같은 메소드를 사용)
 *         --- 개발이 쉽다
 *         --- 프레임워크 => 개발 형식을 통일할때 사용
 *                        ----------- 분석이 쉽다 = 가독성이 좋다
 *             ------ 스프링/React/JQuery/Vue... 등이 있다
 *             ------ MyBatis / JPA
 *             ------ 장바구니 / 예약
 *                    ----------- 오라클 /  Session / Cookie
 *         컬렉션은 저장 => Object만 저장 (객체만 저장)
 *                      -----------
 *                      최상위 데이터형 => 항상 형변환
 *                      
 *                      예)
 *                          class Sawon
 *                          => ArrayList list=new ArrayList()
 *                             list.add(new Sawon())
 *                             
 *                             => Sawon s=list.get(0); => 오류 발생
 *                                        Object get()
 *                             
 *      2. Collection 종류
 *                   Iterable
 *                      |
 *                  Collection
 *                      |
 *       -------------------------------------
 *       |                     |             |
 *      List                  Set           Map => interface
 *       |                     |             |
 *     ArrayList            HashSet        HashMap
 *     Vector               TreeSet        Hashtable
 *     LinkedList 
 *       |                                   |
 *     Queue                              Properties
 *                                        ----------
 *                                           |XML
 *                                           
 *       *** List => 337Page
 *           1) 순서가 존재 (자동으로 인덱스를 설정)
 *                           ---- 0
 *           list.add(1) = 0
 *           ======> 인덱스번호는 자동으로 조절
 *                   0번부터 순차적으로 유지
 *           2) 데이터 중복 허용
 *           3) 가장 많이 사용되는 컬렉션
 *           4) 비동기적인 방식
 *              => 데이터베이스 (오라클)
 *              => 데이터에 접근하는 속도가 빠르다
 *           5) 단점 : 데이터가 많은 경우에 추가/삭제시 속도가 느리다
 *                     ==> 인덱스번호 조절
 *                     ==> 데이터 추가시 마지막에 추가하는것을 권한다.
 *                     
 *        => Vector => 보완한게 ArrayList
 *           => 동기적 => 네트워크 사용자 정보 정보
 *        => LinkedList
 *              => 단점으로 접근 속도가 늦다
 *              => 장점으로 추가나 삭제가 빠르다
 *              => 게시판 같은거 만드는것은 LinkedList를 사용하는게 좋다
 *        =========== List라는 인터페이스 구현 (메소드가 동일)
 *        
 *        ***List list=new ArrayList() : 데이터베이스 연동
 *        
 *        list=new LinkedList() : 파일연동
 *        
 *        list=new Vector() : 네트워크에서 주올 사용
 *             ArrayList      LinkedList
 *             -------------------------
 *   데이터접근 속도     빠름        느림
 *   데이터(추가/삭제)   느림        빠름
 *   메모리 사용       효율적       비효율적
 *   구조           배열기반       연결리스트 기반
 *   	                       C언어 개발자 => 자바
 *               -------
 *                객체줏
 *                ------        ---------
 *                              이전 대체 주소
 *                                --- 대이터
 *        
 *        
 *      3. 제네릭스 => 338page
 *      ----------------------------------------------- 오늘 내용
 *      4. 활용 => 크롤링 / 중복 제거 / ArrayList와 ArrayList
 *                                ---------------------
 *                                1. 교집합 2. 차집합 3. 합집합
 *                                                  => 중복제거
 *                                1. Intersect , Minus , Union
 *                                => 자바 메소드로 되어 있다
 *          
 *          ArrayList의 주요 메소드=>341page
 *          1) 데이터 추가
 *             add(Object obj)=> 마지막 추가
 *             addd(int index, onj) => 원하는 인덱스에 추가
 *          2) 저장된 갯수 : int size()
 *          3) 데이터 추출 => Object get(int index)
 *          4) 데이터를 삭제 => remove(int index)
 *          5) 데이터를 수정 => set(int index,Object obj)
 *          ===> CRUD : 자료구조 (효율적으로 사용)
 *          ===> import를 사용한다
 *               java.util.ArrayList
 *          ===> List => 구현한 클래스 변경이 쉽게 인터페이스를 이용하는
 *          ===> 단점은 형변환
 *               Object => 최상위 클래스
 *                      => 데이터형중에 가장 큰 데이터형
 *               예)
 *                    Object obj=1;
 *                    obj=0.1;
 *                    obj="aaa";
 *                    obj='A';
 *                    obj=new A();
 *                    ------------ => 원하는 데이터형으로 변경
 *                                    =================
 *                                    데이터형을 Object가 아닌 데이터형으로 통일
 *                                    --------------------------------
 *                                    제네릭스 ==> 338page
 *          
 */
// ArrayList사용법
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//경고 => 제네릭스 => 모든 return / 매개변수가 Object
		// 추가
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("강감찬"); // 2
		list.add("이순신"); // 3
		list.add("박문수"); // 4
		
		System.out.println("현재 등록된 인원:"+list.size());
		// 출력에 이용하는 메소드 size() => get()
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		System.out.println("====== 원하는 위치에 데이터 추가 ======");
		
		/*
		 * list.add("홍길동"); // 0
			list.add("심청이"); // 1
			===> 추가
			list.add("강감찬"); // 2
			list.add("이순신"); // 3
			list.add("박문수"); // 4
			
			추가나 삭제시 자동으로 인덱스번호가 변경된다
		 */
		list.add(2,"춘향이");
		System.out.println("현재 등록된 인원:"+list);
		
		System.out.println("=======삭제========");
		list.remove(3);
		
		//인덱스 번호는 자동 처리가 되지만 오라클은 자동처리가 안된다(출력)
		System.out.println("====수정=====");
		list.set(2, "심청이 수정");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		list.clear(); // 전체 삭제
		
		System.out.println("=====데이터 존재 여부=======");
		// isEmpty() => 장바구니에 많이 쓰인다
		if(list.isEmpty())
		{
			System.out.println("저장공간이 비워있다");
			
		}
		else
		{
			System.out.println("저장곤간에 데이터가 존재합니다");
		}
		/*
		 *  메소드
		 *   1) 데이터 추가 => add()
		 *   2) 데이터 갯수 => size
		 *   3) 데이터 읽기 => get(int index)
		 *   4) 데이터 존재 여부 => isEmpty()
		 *   5) 데이터 수정 => set(int index,데이터)
		 *   6) 데이터 삭제 => remove(int index)
		 *   7) 데이터 전체 삭제 => clear()
		 */
		
				
	}

}
