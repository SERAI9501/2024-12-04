package com.sist.util;
/*
 *  java.lang : 자바 기본이 되는 클래스의 집합
 *  --------- Object/String/StringBuffer
 *            Math/Wrapper(Integer/Double/Boolean)
 *  java.util : 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *    =>util부터는 반드시 import를 사용하다
 *    1) 날짜
 *       Data => Calendar(보완)
 *       ----    ------------
 *    2) 문자열 분리
 *       StringTokenizer : split=> 정규식
 *    3) 랜덤
 *       Random
 *    4) Collection => 자료 구조 => 어레이 리스트를 쓰는 순간 배열은 사용하지 않는다
 *         Collection
 *             |
 *      ---------------------
 *      |          |        |
 *      List      Set      Map
 *      |          |        |    
 *      |          |   **HashMap/Hashtable
 *  **ArrayList **HashSet/TreeSet
 *    LinkedList=Queue
 *    Vector
 *    
 *  java.io : 입출력(메모리/네트워크/파일)
 *  java.net : 네트워크 (Socket,URL)
 *  java.text : 변환 (문자열 , 날짜 , 숫자)
 *  java.lang.reflect : 정규식 *******
 *  java.sql : 데이터베이스 연동
 *  -----------------------------------
 *  웹 / 오픈 소스(외부 라이브러리)
 *     org / com
 *     
 *  list.add("a") 0
 *  list.add("a") 1
 *  list.add("a") 2
 *  list.add("a") 3 중간에 첨부하거나 삭제해도 자동으로 번호를 초기화 시켜서 0~부터 순차적으로 정렬해준다.
 *  
 */
import java.util.*;
// 지금부터는 특별한 경우가 아니면 Scanner는 사용하지 않는다
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		/*
		 *  r.netxInt() 이렇게 쓰면 인트 전체를 의미하고
		 *  r.nextInt(100) => 0~99까지
		 *            --- 100-1
		 *  Math.random()(X)
		 */
		//int i=r.nextInt(100)+1;//1부터 100까지 난수 하나 발생
		//System.out.println(i);
		//랜덤은 게임 만들거나 / 예약일 랜덤발생 시킬 예정
		int[] com=new int[6];
		for(int i=0;i<com.length;i++)
		{
			com[i]=r.nextInt(45)+1;
			// nextInt(int bound)=> 
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		//정렬
		Arrays.sort(com);//배열에 대한 제어
		// Arrays도 java.util안에 있다
		// ORDRE BY no DESC(ASC)
		// => 50:50  50은 자바라이브러리/ 50은 오라클라이브러리 사용하게 된다.
		//출력
		//
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		for(int i=com.length-1;i>=0;i--)
		{
			System.out.print(com[i]+" ");
		}
	}

}
