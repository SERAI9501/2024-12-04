/*
 *  웹 개발
 *  자바 : 변수/연산자/제어문/메소드/예외처리 => 라이브러리
 *  오라클 : JDBC => DBCP => MyBatis => JPA
 *  
 *  HTML / CSS => 태그 / CSS 속성
 *  JavaDcript=> Jqueru(Ajax) => VueJs => ReactJS => NextJS
 *              ------------- NodeJS
 *  SpringFramework => Spring-Boot -> Spring Security
 *  Python => Numpy , Pandas , MatplotLib , 머신러닝 , 딥러닝
 *  -----------------------------------------------------
 *  ElasticSearch : CRUD => NoSQL
 *  -----------------------------------------------------
 *  AWS
 *  -----------------------------------------------------
 *  
 *  메소드
 *  ----
 *    => 객체지향
 *        => 구성요소
 *        => 메소드 => 동작,행위 => 동적
 *        **변수 => 메소드 : 메뉴 , 버튼 , 마우스 , 키보드 입력
 *        ** 다른 클래스와 연결
 *           ------------- 메세지=메소드=통신 같은 말
 *        ** 유지보수 (메소드를 변경) , 재사용
 *                 ------------ 오버라이딩=수정 , 오버로딩=기능추가
 *        ** String : 웹/모바일
 *        class (계산기)
 *        {
 *         -------------
 *         변수
 *         -------------
 *         메소드 => 연산자+제어문
 *         plus,minus,div,gop
 *         -------------
 *         생성자
 *         -------------
 *        }
 *        class 게시판
 *        {
 *          글쓰기,수정,삭제,찾기,목록 등등..
 *        }
 *        class 자판기 extends 온음료
 *        {
 *          동전 / 커피 / 음료수
 *          동전투입 , 음료수선택...
 *        }
 *         => 설계
 *            이런 기능 .... 인터페이스 , 추상클래스 => 7장
 *        ------------------------------------
 *        불안전 => 종료(X) => 사전의 오류 방지 => if => 예외처리 =8장
 *        ---------------------------------------
 *        => 메소드 : 특정 작업을 수행하는 일련의 명령문의 집합
 *                  ------한가지 기능을 수행하게 만드는 것을 권장
 *                  글쓰기()
 *                  {
 *                    사용자 입력 내용 읽기
 *                    오라클 연결
 *                    데이터 추가
 *                    오라클 닫기
 *                    
 *                    => 목록으로 이동
 *                  }
 *         =>메소드 : 가독성 (소스가 간결 => 수정)
 *         => 주로 사용처 : 클래스와 클래스의 연결 설정
 *                       ---------------------
 *         => 사용하는 이유
 *             1) 재사용
 *             2) 유지보수(수정 ,추가)
 *             3) 중복코드 제거
 *             4) 구조적인 프로그램
 *         => 메소드 구조
 *            1) 선언부 
 *               리턴형 (결과값)
 *               매개변수 (사용자가 요청한 값)
 *               메소드명
 *            2) 구현부
 *               {
 *                 ---
 *                 ---
 *                 if(...)
 *                  return
 *                 ---처리
 *                 return=>메소드 종료점 => 없는 경우 컴파일러 자동으로 추가
 *               }
 *               void 일때는 return 값이 추가가 필요 없다.
 *               메소드 형식        | 1개 설정 => 없는 경우에는 void를 선택한다.
 *               [접근지정어][옵션] 리턴형 메소드명(매개변수...)
 *                                         =>갯수와 상관이 없다
 *                                         =>3개 이상이면 배열/클래스 이용한다.
 *                              ---------------------
 *                                          | 사용자 요청값
 *                                          | 아이디중복체크
 *                                          | 로그인 => id,pwd,boolean
 *                                            remember-me
 *                                          | 회원가입 => id,pwd,name,sex...
 *                                          매개변수는 여러개를 쓸 수 있다.
 *                                     => 변수 식별자
 *                                     => 소문자로 시작
 *                              1. 기본형
 *                              2. 클래스 (String)
 *                              3. 배열
 *                  static : 공유 => 자동 메모리 할당
 *                  final : 종단 => 확장 불가능(변경이 불가능)
 *                  abstract : 추상 => 공통적인 ... => 구현은 없고 선언만 가능한 메소드
 *               리턴형 / 매개변수 => 기본형
 *               int plus(int a,int b)
 *               =>사용자로부터 2개의 정수를 받아서 더한 값을 보내준다
 *               2.리턴형이 배열
 *               int[] getdata()
 *               {
 *                int[] arr=new int[3];
 *                return arr;//배열명만 전송
 *               }
 *               3. 리턴형/매개변수 => 배열
 *               int[] getData(int[] arr)
 *               {
 *                 return arr;
 *               }
 *               4.클래스
 *               String getData(String s)
 *               {
 *                 return s;
 *               }
 *               5.경우의 수가 많은 경우
 *                 => 로그인
 *                    = 아이디가 없는 경우
 *                    = 비밀번호가 틀린 경우
 *                    = 로그인
 *                 => String / int => 상수 =>noid/nopwd/login
 *             =>메소드 호출
 *             리턴형이 없는 경우
 *             void print(int a)
 *             {
 *             
 *             }
 *             
 *             =>print()=> 매개변수가 있는 경우에 값을 채워서 처리
 *             =>print(100) => a=100
 */
public class 메소드_1 {
	static int display()
	{
		return 10L;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
