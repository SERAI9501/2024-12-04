package com.sist.main;
/*
 * 	객체지향 프로그램 : 하드웨어 (집척회로=> 모방)
 *  ------------ 조립식 (한개 클래스 => 부품) => CBD
 *  => 이미 만들어진 클래스 : 변경 (요구사항) => 오버라이딩
 *  1차 ===> 2차 오버라이딩
 *  ------------------ 재사용 방법을 알기 위한 방법
 *  
 *  1. 목적 => 재사용
 *           ----- 변경이 가능 , 추가가 가능
 *                 ---       ---
 *                 오버라이딩   오버로딩
 *                 면접 : 정의 => 부연 (프로젝트)
 *  2. 신뢰성이 좋다 : 검증을 거친다
 *  3. 대규모 프로젝트 => 재사용을 많이 사용한다.
 *     안산시청 ==> 서울시청
 *  4. 클래스 => 추상화 => 구체화
 *             ----설계  ----구현
 *              |공통적인 데이터나 기능을 모아서 설계
 *              ----------------
 *                벤치마킹 (CGV , 메가박스 , 롯데시네마)
 *                      -----------------------
 *                      | 불편한 점 => 사용자 편리성
 *              | 단순화 : 시뮬레이션
 *              | 공통적인 데이터 / 기능
 *                             ---메소드
 *                                ---- 동작
 *                                메뉴 / 버튼 / 마우스
 *                                ---  --- 메뉴나 버튼을 눌러보면 메소드 동작을 금방 잡을 수 있다.
 *                -----------변수
 *                           --- 눈에 보이는 데이터 : 명사형
 *   1. 변수 설정
 *      => 기능(메소드에서 공통으로 사용되는 변수)
 *      예)
 *         달력
 *         사용자로부터 입력값 :  year/month
 *         요일을 구한다 : week
 *         달력 출력 : week부터 => 1.... year/month
 *         => 전역변수 = 멤버변수
 *       => 어떤 기능 => 사용되는 변수 => 중복
 *       =>요구사항 분석 =>기능을 잡는다 (메소드 처리) => 사용되는 데이터 찾기
 *                                            |관련된 데이터 여러개
 *                                            |클래스로 사용자 정의 데이터형
 *                                            |~VO
 *   ================================================================
 *   클래스의 구성요소
 *   class ClassName
 *   {
 *   ----------------------------------
 *   변수 설정
 *   ***저장데이터 다른 경우 =>따로 저장 (인스턴스)
 *   저장데이터 1개 사용 => 정적 static
 *   => 보안 => 데이터 손실없게
 *   => private
 *   => 접근이 가능 => 변수이다 기능부여
 *                 getter setter
 *   ----------------------------------
 *   변수 초기화 여부 : 생성자 쓸지 말지 생각해봐야한다.
 *   생성자 : 윈도우 , 데이터베이스 , 서버 연결 이럴때 사용한다.
 *   *없는 경우 => 자동 생성 (디폴트 생성)
 *   하나만 쓰는게 아니고 여러개 사용 가능하다
 *                  ------- 오버로딩
 *   => 생성자는 클래스명과 동일하다/리턴형이 없다
 *   ** void도 리턴형이라 생성자로 호출을 못한다.
 *   => 다른 클래스에서 사용이 가능하게 만든다 그래서 접근 지정어를 public을 사용한다.
 *   
 *   ----------------------------------
 *   메소드 = 기능처리
 *   => 다른 클래스와 통신을 담당 => public을 사용하는게 기본이다.
 *   => 형식)
 *           [접근지정어][제어어] 리턴형 메소드명(매개변수..)
 *           {
 *            return 값;
 *           }
 *           
 *           리턴형 ==> 처리한 결과값 : 아래중에 1개만 설정 가능하다.
 *                     기본형 / 배열 / 클래스가 다 들어갈 수 있다
 *           매개변수 ==> 사용자가 보내준 값
 *           ------------------------
 *           여러개 사용이 가능 => 가급적이면 3개이상이면 배열/ 클래스 이용
 *       
 *       	=> 호출 방법
 *             인스턴스
 *               객체 생성후 처리
 *               객체.메소드(값..)
 *             static
 *               클래스명.메소드()
 *           *** 인스턴스 메소드,생성자
 *                => 인스턴스변수, 메소드 , static변수 , static메소드 사용이 가능하다
 *           *** static메소드 , static 블록
 *                => static 변수,static메소드만 사용이 가능
 *                => 인스턴스 사용시에는 반드시 객체 생성후 사용
 *   }
 *   접근지정어
 *   public : 모든 클래스에서 사용이 가능
 *            클래스/생성자/메소드
 *   protected 거의 사용하지 않는다 같은 페키지안에서 사용이 가능 다른 패키지 안에 상속을 받은 클래스
 *   default : 같은 패키지 안에서 사용이 가능
 *             Component 사용시에 주로 사용한다. =Button,textField 등
 *   private : 개인 정보 보호
 *             일반 멤변수
 *             
 *   제어어
 *     static : 공통으로 사용하는
 *     abstract : 추상적인 => 구현이 안된
 *       => 버튼 / 마우스 / 키보드 
 *       => 프로그램에 맞게 구현해서 사용
 *       => 인터페이스
 *     final : 마지막인
 *     변수 = 상수
 *     메소드 => 중단 클래스
 *     클래스=> 종단 클레스 => 표준화
 *     --------------------------- 확장이 불가능(상속이 안됨)
 *     5장이 핵심이다.
 *     객체지향의 3대 특성 => 권장사항이지 문법사항은 아니다
 *     1.캡슐화 : 데이터 보호
 *     2.상속 : 재사용
 *     3.다형성 : 변경 / 추가 => 구현
 */
public class 정리_6장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
