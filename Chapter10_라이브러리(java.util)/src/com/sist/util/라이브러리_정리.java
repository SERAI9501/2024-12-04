package com.sist.util;
/*
 *  java.lang : 자바의 기본 라이브러리
 *              => import 생략
 *       1) Object
 *            clone() : 복제
 *            equals() : 객체 비교
 *            toString() : 객체 주소 문자열 변환
 *       2) StringBuffer : 문자열 결합 => 제어
 *                          ------
 *                         append()를 사용하더라
 *       3) Math : 수학관련
 *          ceil() : 올림
 *          random() : 난수 발생
 *       4) System
 *            println() : 화면 출력
 *            gc() : 메로리 회수 (즉시)
 *            exit() : 프로그램 종료
 *       5) Wrapper : 데이터형 => 클래스화 / 제네릭스 (다음주에 나옴)
 *          Integer => parseInt()
 *          Double => parseDouble()
 *          Boolean => parseBoolean()
 *          ------------------- 윈도우 / 웹 / 크롤링 => 문자열
 *       6) String : 이전 예제를 참조해 볼 것
 *  java.util : 프로그램 개발 유용하게 사용하는 라이브러리
 *     1) Random : 임의수를 추출
 *        => nextInt(100) => 0~99
 *     2) StringTokenizer : 구분자별 문자를 잘라서 저장
 *        => countTokens() : 자른 갯수
 *        => hasMoreTokens() : 루프
 *        => nextToken() : 자른 데이터 읽기
 *     3) Date : 시스템의 시간 / 날짜 읽어옴
 *               기능은 거의 없다 => 오라클 날짜 데이터와 호환 때문에 Date를 사용
 *     4) Calendar : Date보완
 *             => 날짜 관련 기능
 *             => 오늘 날짜 / 오늘 시간 / 오늘 요일 / 마지막 날
 *   -----------------------------------------------------------------
 *     Collection : => util의 핵심
 *     ---------- 표준화 / 가변형 / 항상 0번부터 순서를 유지하고 있다
 *     ArrayList : 비동기 => 데이터베이스
 *     Vector : 동기 => 네트워크 :접속자 정보 저장
 *     Map : 웹 => 클래스 과나리 => MyBatis / Spring
 *     Set : 중복 제거
 *     
 *     => LinkedList => C언어 호환때문에 나온게 아닌가?
 *           |
 *         Queue
 *     => 배열 대신 사용 : 고정
 *     
 *     => 데이터형 (Object) => 프로그램에 맞게 데이터형 변경 = 제네릭스 <String>
 *                                                  정수형 <Integer>
 *     ---------------------------------------------------------------
 *     *** SQL (웹의 핵심)
 */
public class 라이브러리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
