package com.sist.main;
/*
 *  DAO => 오라클 , Manager => 파일
 *  ----------------------------
 *  => 예외처리 를 정리해야함
 *  => 사용자 정의 데이터형 => VO를 참고할 것 무슨데이터가 필요한지 찾아낼 수 있어야함 => 캡슐화 또한 필요
 *  => 멤버변수 / 상수 / Static 이중에 어느걸 써야하는지 왜인지 알아야 한다.
 *  => 메소드
 *     ---- 리턴형 / 매개변수
 *          ----   ----- 사용자가 보내준 값
 *          결과값 => 1. 목록 ===> List
 *                  2. 상세보기 => VO
 *                  3. 총페이지 => int
 *                  ----------------
 *   컬렉션
 *   ---- IO => 2차 (문법=>형식)을 다 안다고 가정함 => DAO (웹)
 *                                            -------- JSP/Spring
 *       
 *       컬렉션 (Collection)
 *         => 배열 (고정적) => 데이터추가 => 새로운 배열
 *            => 동적 배열 => 저장 갯수 확인
 *            ----------------------- 가변
 *            => 많은 데이터를 저장 할 수 있다
 *            => 표준화 => 개발자 모두가 같은 코딩을 한다
 *            => 단점 : 모든 데이터를 저장할 수 있다
 *                    --------- 데이터형이 틀린 경우도 있다
 *                    => 형변환 / 제어문이 어렵다 이런것들을 해결하기 위해 나온게 제네릭스이다
 *                    => 같은 데이터만 첨부 => 배열형식으로 만들어 주는 것이다.
 *                      --------------
 *                      명시적 => 어떤 데이터가 들어가는 알려준다
 *                      ==> 이렇게 만드는것을 제네릭
 *                      ex List<String> : 가독성이 좋다
 *                      ==> 저장되는 모든 데이터가 통일이 된다.
 *                    Collection(CRUD) => 자료구조
 *                       |
 *           ---------------------------------
 *           |                 |             |
 *           List             Set          Map
 *           =ArrayList      =HashSet      =HashMap
 *           |단순한 목록        |장바구니        |관리(클래스 관리, 회원관리)
 *                             중복이 없는 데이터
 *           List
 *             ***add() : 추가
 *             remove() : 삭제
 *             ***set() : 수정
 *             ***get() : 데이터 가지고 오기
 *             isEmpty() : 값이 있느냐 여부
 *             ***clear() : 전체 삭제
 *             ***size() : 저장 갯수
 *             
 *            Set
 *               **add()
 *               remove
 *               **isEmpty
 *               **clear
 *               **size
 *           
 *            Map
 *             put("key","value") : 추가
 *             get(key) : 값읽기
 *             isEmpty()
 *             clear()
 *             size()
 *             keySet()
 *             values()
 *             
 *    --------------------------------------
 *    복사 => addAll() : Set / List
 *    교집합 => retainAll()
 *    차집합 => removeAll()
 *    --------------------------------------
 *    
 *    java.lang
 *      Object / String / StringBuffer
 *      Wrapper / System / Math
 *    java.util
 *      Date / Calendar / StringTokenizer
 *      ArrayList / HashSet / HashMap
 *    java.text
 *      SimpleDateFormat
 *      DecimalFormat
 *    ------------------------
 *    ***java.io : 파일입출력 => 업로드 / 다운로드
 *    ***java.sql : 데이터베이스 입출력
 *    java.net : 네트워크 입출력
 *               => 웹(네트워크) => 한글 변환
 */
import java.util.*;
public class 컬렉션정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("aaa");
		list.add(10);
		list.add('A');
		list.add(120.5);
	}

}
