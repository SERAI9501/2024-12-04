package com.sist.exception;
// 임의 발생은 한개만 사용이 가능하다 => if를 사용하는게 더 쉽다
import java.util.Scanner; 
/*
 * 	웹은 무조건 전송받은 데이터형은 String이다
 *  웹 에서 받아서 전송 a.jsp?no=1
 *  IllegalArgumentException  위 오류가 생긴다
 *  public void display(int no) => String no로 받아야 오류가 없다 int는 웹에 없기 때문이다.
 *  {
 *      => 정수형 변환 Integer.parseInt(no)
 *                  ------- 데이터형 클래스 => Wrapper
 *  }
 */

public class 예외처리_임의발생_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("국어 점수 입력:");
			int kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				// 잘못된 입력 => 직접처리 하거나
				// catch를 불러 올 수 있다
				// throw는 예외발생을 알려준다
				// 테스트 (배포)
				throw new IllegalArgumentException("점수는 0~100까지 입력가능합니다");
				// catch로 이동
				// throw => 필요시에 의해 catch를 호출 할 수 있다
				// throw 아래는 코딩이 무시된다
			}
		}catch (IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		}
	//
	}

}
