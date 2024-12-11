/*
 *  114page ~ 116page
 *    객체 구성
 *      = 속성(변수) / 동작 (메소드)
 *      = 여러개의 독립적인 단위 => 부품 => 조립
 *                                 ----프로그래밍
 *                          ----프로그램
 *    객체를 만들때 사용하는 키워드 (설계)
 *    -------------------- 클래스
 *    메모리에 저장후 사용
 *    ---------인스턴스
 *    118page
 *      => 객체에 대한 설계
 *      => 클래스의 구성요소
 *      class className
 *      {
 *      	-----------------
 *      	멤버변수
 *      	  = 인스턴스변수 : 객체 생성시마다 메모리가 다른 공간에 저장되는 상태
 *      	  = 정적변수 : 메모리 공간 1개만 생성 => 공유
 *      	  = 구분 : static => 이거면 정적변수다.
 *                    ----- 공통으로 사용 메소드 , 싱글턴 : 한개의 객체 생성
 *                                            => 데이터베이스 연동
 *                                            => 스프링은 모든 클래스가 싱글턴으로 되어있다.
 *            = 적용 (객체지향 권장 사항) : 데이터를 보호 하려고 : 캡슐화
 *              변수=데이터를 은닉화 => 메소드를 이용해서 접근하는 방식 = 캡슐화
 *              변수의 역할
 *                = 읽기 (메모리에서 가지고 온다)
 *                  getXxx()
 *                = 쓰기 (메모리 저장)
 *                  setXxx()
 *                = 자동 생성 => lombok = 캡슐화 자동생성하는 MIT에서 만든 프로그램
 *              변수의 사용범위 : 프로그램 종료시 유지
 *                           => Heap공간에 저장
 *                           => 다른 클래스에서도 사용이 가능 
 *      	-----------------
 *      	생성자 : 변수에 대한 초기화 담당 , 시작과 동시에 처리 기능이 있는 경우만 사용한다.
 *               => 생성자는 생략이 가능하다
 *                 ---------> 컴파일러에 의해 자동으로 추가
 *                            매개변수가 없는 생성자 (디폴트 생성자)
 *               => 특징
 *                  1) 클래스명과 동일한다
 *                  2) 리턴형이 존재하지 않는다
 *                    ** void 는 리턴형의 일종 => 결과값이 없는 경우
 *                  3) 여러개의 생성자를 만들 수 있다
 *                     ----------같은 이름으로 생성 => 오버로딩이라한다.
 *                  *** 한개이름으로 여러개를 생성하는것 오버로딩 : 중복 메소드 생성
 *                     => 한개의 클래스안에서 만든다
 *                     => 메소드명이 동일
 *                     => 매개변수가 다르다 (갯수,데이터형이 달라야한다)
 *                     => 리턴형은 관계없다.=리턴형은 무엇이 와도 상관없다.
 *               *** 초기화시에는 주로 생성자를 이용한다
 *                               -----
 *                               인스턴스변수,static변수를 사용할 수 있다
 *               *** static 변수에 대한 초기화는 static{}을 이용한다.
 *                   => 초기화 블럭 : static변수만 초기화가 가능
 *      	-----------------
 *      	메소드 : 메소드가 하는것 기능 설계
 *                            ------ 설정된 변수를 어떻게 사용
 *                            ------ 동작
 *                            ------ 자바의 단점 => CallBack을 만들 수 없다
 *                                              ---------
 *                                              시스템에 의해 자동 호출
 *                                              => 사용자 정의 메소드는 반드시 호출
 *                                              => 스프링에서는 AOP
 *           == 구성요소
 *              리턴형 : 사용자 요청을 처리한 결과값
 *                     => 리턴형은 1개만 사용 가능하다.
 *                     => 기본형 / 배열 / 클래스
 *                                      | 상세보기
 *                               | 정렬
 *              메소드명 : 구분자 (메소드명이 메모리 주소)
 *                      => 변수 식별자와 동일하다
 *                      => 소문자로 시작한다
 *              매개변수 : 사용자가 요청한 값 => 여러개 사용이 가능하다
 *                      매개변수 3개 이상이면 => 배열이나 클래스를 이용
 *                      => 갯수를 모르는 경우
 *                      system.out.printf
 *                      => 가변매개변수(몇개인지 모를때) => ...
 *                          (String a...)
 *                
 *                메소드의 형태
 *                [접근지정어][제어어]리턴형 메소드명(매개변수..) => 선언부
 *                {
 *                	=> 구현부
 *                }
 *      	-----------------
 *      
 *      
 *      => 객체 지향 프로그램 장단점
 *         장점
 *          코드 재사용 : 상속 / 포함을 이용한 것
 *          유지 보수시에 사용이 용이
 *          대형 프로젝트에서 주로 사용 : 금융권 / 증권 / 공기업 / 국세청 / 국민연금
 *          => 클래스 단위로 모듈화 => 업무 분담이 용이하다. 
 *         
 *         단점
 *          절차적 언어보다 처리속도가 상대적으로 느리다 그래서 가급적 독립적으로 사용을 권장한다. => POJO방식
 *                                                    ----------
 *                                                    |상속이나 포함을 없앤다.
 *                                                    |인터페이스 : 연결
 *          => 결합성이 높다 => 클래스 수정시에 다른 클래스에 영향 = 유지보수가 어려워진다
 *             --------- 반대로 낮은것 스프링 (로드존슨이 만듬)
 *          객체가 많으면 용량이 커질 수 있다 (메모리에 부하)
 *          설계시에 많은 시간이 투자
 *          
 *          
 *         --------------------------------------------------------------------------
 *          개발 => 7개월
 *            3개월 : 요구사항 분석
 *            1개월 : 데이터베이스 설계
 *            1개월 : 화면UI
 *            2개월 : 구현 => 테스트 까지 끝냄
 *            ------------------------
 *            CBD => 컴포넌트 베이스
 *                   ----- 만들어진 기능을 조립
 *            => 프로그래머 (이미 만들어진걸 조립) 자바
 *            => 개발자 (없는 것을 만드는 사람들)= 컴포넌트 개발
 *          ---------------------------------------------------------------------------
 *           
 *           this / this() =>
 *           this => 클래스 자신의 메모리 주소를 설정
 *           ---- 멤버변수와 지역변수가 같은 경우 구분하기 위해서 사용
 *           ---- JVM => 객체 생성될때 자동으로 주소값을 저장
 *           ---- 모든 멤버관련 => 메소드 , 변수 앞에 반드시 this.
 *                최근에는 this. 컴파일러에 의해 자동 생성
 *                
 *                컴파일러가 자동 처리해주는 것들
 *                => import java.lang.*;
 *                => 모든 클래스는 objct 상속
 *                class A extends Object
 *                       ---------------
 *                => 메소드 안에서 void => return 추가
 *                => 생성자를 사용하지 않으면 디폴트 생성자 추가
 *                => this.을 생략시에 자동 추가
 *                => 생략이 가능
 *           
 *           this()=> 자신 클래스의 생성자를 호출시에 주로 사용
 *           ------ 사용빈도는 거의 없다
 *           = 사용위치 => 생성자안에서 다른 생성자를 호출할때 사용
 *                      생성자의 첫줄에 위치해야 한다.
 *                      -------------- 안하면 문법상에 오류 발생
 *   
 *      122page : 객체 생성과 사용
 *      객체의 생명주기 (생성~소멸)
 *                 --------- 알아서 해주는건 없을까? 스프링 => 클래스 관리자
 *      =>new이용하면 결합성이 높은 프로그램
 *        --- 객체 생성 방법이 있다 => 리플렉션 (클래스명만 있으면 처리가 가능)
 *                               -----
 *                               스프링 =>웹에 핵심 스프링가능자를 찾기 때문에
 *      => class A
 *      {
 *      	int a;
 *      	double d;
 *      }
 *      
 *      A aa=new A();
 *      
 *      Stack
 *      
 *      --aa-- Heap
 *            ------
 *            
 *      ------
 *            ------
 *      설계 (class작성) ===> 메모리 저장 ===> 활용 ===> 메모리 회수
 *       class className => new 생성자()   ---
 *       {                                .메소드()
 *        	변수 / 메소드 / 생성자             .변수명
 *       }
 *       *** 변수만 가지고 있는 경우
 *           => 데이터형 클래스 = 사용자 정의 데이터형
 *              => 관련된 데이터를 모아서 한번에 관리
 *       *** 메소드만 가지고 있는 경우
 *       *** 변수+메소드를 가지고 있는 경우
 *       => 관련된 내용을 모아서 관리 (누가 더 잘 묶느냐?)
 *       => 데이터(상태) 관리
 *          -------- 변수 / 배열 / 클래스 / 파일 / RDBMS
 *                   웹 / 모바일 => 한번 전송
 *                   
 *                   
 *       
 *       
 *      수업 진행 순서
 *      => 1) 메소드 2) 접근지정어 3) 상속 4) 포함
 *         5) 클래스의 종류(추상클래스 , 인터페이스)
 *      => 예외처리 => 라이브러리 (Collectin,IO,SQL,NetWork)
 *      => 프로젝트 / 오라클 => 크롤링을 하고 시작
 *      => 브라우저 (HTML/CSS/JavaScript)
 *      => 서버연결 => JSP (1차)
 *      => 스프링 (2차) => 파이썬 (데이터분석) , ElasticSearch
 *      => 개인 => 최신 기술 => 취업 모걱
 *      => AWS => 리눅스 기반이라 명령어를 배운다. => 운영체제를 빌려서 사용 (1년 무료)
 *         EC2
 *      => 옵션 (MSA=> Cloud => CI/CD)
 *    
 *                          
 */
class A
{
	void disp(int a)
	{
		System.out.println("disp호출:"+a);
	}
}
public class 객체지향_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		aa.disp(100);
		A bb=new A();
		bb.disp(1000);
		/*
		 * =>123page
		 * A aa; // 선언
		 * 
		 * aa=new A() // 저장
		 * 
		 * A aa=new A();// 선언과 동시에 저장
		 */
	}

}
