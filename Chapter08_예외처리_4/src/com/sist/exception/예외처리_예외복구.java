package com.sist.exception;
/*
 *  1) 예외방법과 형식
 *   ------------
 *   CheckException
 *     => java.io / java.net / java.sql 에서 나올법함
 *     => 반드시 예외처리를 사용
 *     => 컴파일시에 예외처리를 작성했는지 확인
 *   UnCheckException => 런타임=실행시
 *     => java.lang / java.util
 *       => Object => clone() => 예외처리가 필요
 *                   -------- 메모리 복제 (prototype)
 *     => 예외처리를 필요시에만 작성
 *               ---- 사용자가 자주 발생하는 에러가 있는 경우
 *               
 *    => 예외 종류 / 형식
 *          웹 개발 => network (c/s) 는 반드시 예외처리를 해야한다.
 *       1) 직접처리 (예외복구)
 *          try
 *          {
 *             실행이 가능한 소스 코딩 (정상 수행)
 *             => 에러가 발생할 수 있다 => 사전에 방지하는 목적
 *             => 에러가 난 경우 => 복구가 아니라 스킵을 한다
 *             => if 에서 else로 넘어가는 것처럼 스킵하고 catch로 이동을 한다
 *          }catch(예외 클래스)
 *          {
 *            1. 에러확인이 가능
 *               getMessage() => 에러메세지 확인
 *               printStackTrace() => 실행과정 => 에러위치 확인
 *            2. 복구 여부 => 에러에 대한 영역
 *          }
 *          finally = 생략이 가능
 *          {
 *          	try ~ catch와 상관없이 무조건 수행
 *              ----------- 에러 없어도 있어도 상관없이 수행한다.
 *              => 보통적으로 서버 닫기, 오라클 닫기, 파일 닫기에 사용
 *          }
 *          
 *          **catch => 에러가 발생시 처리하는 영역
 *            ----- 다중 catch가 가능
 *            ----- 에러 종류에 따라 따로 잡는 경우도 있다
 *            ----- 한개로 통합 할때 최상위 예외 클래스를 이용한다
 *                       -------------------- Exception / Throwable
 *                                            ---------   ---------
 *                                             예외만 가능      예외+에러
 *            ----- 순서가 존재 => 작은 예외 클래스 ~ 큰 예외 클래스
 *                  -------- 계층도 (클래스 ㅡ기가 정해진다)
 *                  
 *                  Throwable
 *                      |
 *              ----------------
 *              |              |
 *            Error        Exception
 *                             |
 *                      ----------------------------
 *                      |                          |
 *                 IOException              RunTimeException
 *                 SQLException                    |
 *                 ClassNotFoundException     NullPointerException
 *                                            NumberFormatException
 *                                            
 *           *** try에서 정상수행을 하면 catch는 수행하지 않는다
 *               ------------ finally가 있는 경우에는 finally는 수행
 *           *** catch는 try가 있는 문장을 수행하는 과정에서 에러가 난 경우에만 수행한다.
 *           
 *           예)  
 *               보통 변수선언 / 클래스 객체 선언 등은 에러 확률이 없어서 try 밖으로 빼놓는다.
 *               try
 *               {
 *                 문장 1
 *                 ---------------
 *                 문장 2 => 에러발생
 *                 문장 3
 *                 --------------- 건너뛴다	
 *               }catch()
 *               {
 *                 문장 4
 *               }
 *               종료문장 ==> 수행 (정상 종료)
 *               
 *        2) 간접 처리 (예외회피) = 컴파일러는 통과한다 (그렇다고 예외가 안발생했다고 볼 순 없다)
 *          => 특별한 경우가 아니면 사용자 정으에서는 만힝 사용하지 않는다
 *            --------- 소스가 많은 경우 (try설정이 어려운 경우)
 *                      -----------
 *                      | 유지보수 => 추가하는 기능에 예외처리가 필요하다
 *                        ----- 기능 추가 / 기능 수행
 *          => 시스템 자체에서 처리하기 때문에 => 복구 불가능, 정상수행도 불가능
 *          
 *          예) 
 *             public void display() throws Exception
 *             {
 *             
 *             }
 *             public void main() throws Exception
 *             {
 *               문장1
 *               display(); ==> 에러 발생
 *               문장2
 *             }
 *             ** try ~ catch를 주로 사용해라 예외를 잡는게 아니기 때문이다. 
 *             
 *           static은 변수,메소드 상관없이 컴파일시에 메모리에 저장된다
 *           instance는 변수 , 메소드
 *                      객체가 생성이 되면 => 메모리에 저장
 *                      
 *           => 메소드() throws 예외클래스,예외클래스,예외클래스,예외클래스...
 *                     ----------------------------------------
 *                      =>순서는 상관이 없다
 *                      컴파일러에 알려준다 =이런 경우 '예외 선언' 이라고 부른다
 *                      -------------
 *                      다음 호출시에 처리한 다음에 사용하겠다
 *           => 예외처리가 많이 선언 => 한개로 통합
 *                                --------
 *                                가장 큰 예외처리 클래스로 통합
 *                                   -------- Exception,Throwable
 *           => 라이브러이에서 주로 제공 : 개발자에게 맡긴다
 *                                 예외처리후에 사용
 *           => 형식)
 *           [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *           throws 예외클래스1, 예외클래스2....
 *                  --------------------
 *                  예상되는 예외 등록
 *           => 처리 메소드()
 *           => 처리 메소드()
 *           {
 *               try
 *               {
 *               }catch
 *           	 {
 *               }
 *            }
 *            *** 자바에서 예외처리는 전체를 제공하지 않는다
 *            *** 필요에 따라 사용자 정의 예외처리 제작이 가능
 *                        --------------
 *                        사용자 정의의 단점은
 *                        | 자바시스템에서 인식이 안됨
 *                        | 자바 예외처리를 불러서 사용
 *                        |throw : 임의 호출
 *             ---------------------- 자주 사용하지 않는다 if가 있기 때문이다.
 *             
 *        => throws = 예상되는 에러를 선언만 해준다
 *        => throw = 고의로 예외를 발생(테트트) => 견고성을 검사하기 위해서임
 */
public class 예외처리_예외복구 {
	public void display() throws Exception
	{
		System.out.println(10/0);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 인스턴스는 사용이 불가능 => 사용시에는 반ㄴ드시 객체생성후 
		// static은 바로 사용이 가능 / 스테틱은 바로 메모리에 저장되기에 바로바로 사용이 가능하다
		예외처리_예외복구 a=new 예외처리_예외복구();
		// a는 메모리 주소 이것을 '객체' 라고 부른다
		// a=> display가 저장됨
		a.display();
//		try
//		{
//		a.display(); // 이처럼 메소드 호출시에는 예외처리후 사용해야 한다.
//		}catch (Exception ex) {
//			// TODO: handle exception
//			ex.printStackTrace();
//		}
		System.out.println("정상수행");
	}
	/*
	 *  웹
	 *  메뉴 = 여기서 에러가 나면?
	 *  메인 화면
	 *  푸터
	 */

}

