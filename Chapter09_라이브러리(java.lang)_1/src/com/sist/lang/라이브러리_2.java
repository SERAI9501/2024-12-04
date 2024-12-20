package com.sist.lang;
/*
 *  java.lang
 *   1. Object
 *      : 최상위 클래스여서 모든 클래스의 상위 클래스이며, 상속을 내리는 애이다.
 *        ---------
 *        관리하는 기능 : 객체와 관련
 *        객체 소멸 / 객체 복제 / 객체 비교 / 객체 생성
 *        ------   -------  -------   -------
 *       finalize***clone ***equals()  getClass
 *   2. String : 문자열을 관리하는 클래스
 *      => 웹에서 많이 나오는 3대 클래스
 *         String / ArrayList / Integer
 *      => 오라클 연동 3대 클래스
 *      Connection / ResultSet / Statement
 *      
 *      기능
 *        1 trim() : 공백제거 (좌우)
 *        2 length :문자 갯수
 *        3 substring() : 문자를 자르는 경우
 *        4.indexOf : lastondexOf
 *        5 equals() : 문자 비교
 *        ------------------- 로그인
 *        6 contains() : 포함 문자열
 *        7.  sattsWind() : 시작문자열 =>방문한 맛집
 *           
 *           food_1 food_2   
 *        ***8. vaueOf()=>다른 데이터형을 문자열로 변환
 *        9. replace() / reappaceAll()
 *        10 split()
 *   3. StringBuffer : 문자열 결합 => append()가 주로 사용된다.
 *   4. Math : random(),Ceil()
 *   5. System : println() / print() / printf(). gc() / exit(0) / println()
 *   6. Wrapper
 *      : 기본형(데이터형)을 클래스화 시켜서 사용이 편리하게 만든 클래스
 *        byte ===> Byte
 *        short ===> Short
 *        ***int ===> Integer
 *        ***long ===> Long
 *        float ===> Float
 *        ***double ===> Double
 *        char ===> Character
 *        ***boolean =-=> Boolean
 *        -------------------------- 기능 (메소드)
 */
import java.io.*;

public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//이런 코딩은 log파일 만들때 많이 사용 된다.
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;//문자를 받는 경우
			//String data="";// 문자열 결합
			StringBuffer sb=new StringBuffer();
			//스트링 버퍼는 문자열 결합의 최적화
			//파일읽기 => 웹사이트 => HTML
			//이렇게 문자가 많을때 append를 사용한다.
			while((i=fr.read())!=-1)
			{
			//	data+=(char)i;
				sb.append((char)i);
				
			}
			fr.close();
			String data=sb.toString();
			System.out.println(data);
			//문자열 제어는 String이 더 편하고
			//문자열 결합은 => StringBuffer (비동기적) 데이터 크롤링 할때 쓰레드로 나눠서 처리한다. /비동기화가 속도가 빠른편이다 
			//             StringBuilder (동기적)
			long end=System.currentTimeMillis();
			System.out.println("걸린시간:"+(end=start));

		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
