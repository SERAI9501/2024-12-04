package com.sist.main;
/*
 *  1. 인터페이스 사용 목적
 *    = ***서로 다른 클래스를 묶어서 한개의 인터페이스명으로 연결
 *      리모콘의 역할
 *    = 결합성이 낮은 프로그램
 *      --------- 수정시에 다른 클래스가 오류...(영향이 없는 프로그램)
 *      ====> 스프링 (로드존슨)
 *    = 개발자들이 같은 메소드를 사용 : 표준화
 *    = 독립적으로 사용이 가능
 *    = 확장이 가능
 *      ------- JDK1.8	
 *      default / static => 구현된 메소드 처리가 가능
 *      => 추상 클래스 대체 인터페이스를 만힝 사용
 *  2. 여러개의 기능을 동시에 상속이 가능
 *     ------------------------ 다중 상속
 *  3. 인터페이스는 자신이 메모리 할당이 불가능하다
 *     
 *     
 *  문법
 *  2. 구현후 객체 생성
 *    interface A
 *    class B implements A
 *       하위클래스       상위클래스
 *    => A a=new B();
 *    => 확인 : instanceof 
 *     
 *  
 */
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
