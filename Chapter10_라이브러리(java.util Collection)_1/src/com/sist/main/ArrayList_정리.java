package com.sist.main;
/*
 * 335pge ~ 348page set까지 map은 포함아님
 * 
 *  멜론 / 지니뮤직
 *  ----------- 따로 저장
 *  => JOIN => 고집합
 *  => UNION => 합집합
 *  => MINUS => 차집합
 *  ----------------
 *  
 *  컬렉션 = 배열의 단점을  보완한 것
 *        고정 => 가변
 *        => 모든 개발자가 동일한 메소드를 사용한다 => 표준화가 되어있다. => 가독성이 좋다
 *        => 처리 기능이 편리하다
 *  ------------
 *  List : ArrayList / Vector / LinkedList
 *     => 순서를 가지고 있다 (인덱스)
 *     => 데이터의 중복을 허용
 *  Set : HashSet / TreeSet
 *     => 순서가 없다
 *     => 데이터 중복을 허용하지 않는다
 *     => 중복 제거
 *  Map : HashMap / Hashtable
 *     => 두개를 동시에 저장
 *        (키,값)
 *        => 키는 중복할 수 없다 / 값은 중복이 가능하다
 *        => 웹 => 클래스 관리자
 *        => HttpServletRequest
 *           HttpServletResponse
 *           HttpSesiion
 *           Cookie
 *           -------------------- Map
 *           => 스프링 / MyBatis
 *    
 *    ArrayList
 *      => 복사
 *         addAll()
 *      => 순차적으로 출력하는 방법
 *         iterator()
 *         listIterator
 *         => 출력이 어려운 경우
 *      => Set <=> 복사가 가능
 *      
 *      ==> ArrayList
 *          단순한 목록형 데이터를 관리하기 용이
 *          -------------- 데이터베이스 (오라클)
 *          |추가/삭제/수정
 *           ----------
 *           => LinkedList
 */
import java.util.*;
public class ArrayList_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("심청이");
		list.add("박문수");
		list.add("홍길동");
		list.add("강감찬");
		list.add("박문수");
		list.add("홍길동");
		list.add("강감찬");
		System.out.println();
		
		// => 코딩 테스트
		System.out.println("=======복사======");
		Set set=new HashSet();
		set.addAll(list);
		//중복을 허용하지 안흔다 =>순차적(X) 관리하기 어렵다
		// Set (중복 제거) => ArrayList로 이동
		ArrayList<String> list2=new ArrayList<String>();
		list2.addAll(set);
		for(String name:list2)
		{
			System.out.println(name);
		}
	}

}
