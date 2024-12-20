package com.sist.util;

import java.util.StringTokenizer;

// StringTokenizer 문자를 구분자로 짜르는 애
/*
 *  1. 자른 데이터를 읽기 => nextToken()
 *  2. 총 자른 갯수 : counterTokens()
 *  3. 자른 데이터가 있는 동안 : hasMoreTokens()
 *   ------------------------------------- 3개 매소드는 기억해둘 것
 *  4. 일반 데이터형 => 사용빈도가 많다
 *  5. 네트워크 입출력 
 */
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개만 잘 기억해 놓자

//		String data="현빈 ,  박정민 ,  조우진 ,  전여빈 ,  박훈 ,  유재명 ,  릴리 프랭키 ,  이동욱";
//		StringTokenizer st=new StringTokenizer(data,","); //data에 ,별로 짤라라 뒷부분은 구분자인 것을 잊지말자
//		System.out.println("출연 총인원:"+st.countTokens());
//		while(st.hasMoreTokens())//자른 갯수만큼만 루프를 돌려달라
//		{
//			System.out.println(st.nextToken().trim());
//		}
		String make="그릭요거트 4 큰 술, 땅콩버터 1 큰 술을 고르게 섞어 줍니다.^https://recipe1.ezmember.co.kr/cache/recipe/2024/12/05/c608f60aeb98bbd3116a764c0dde400e1_m.jpg";
		StringTokenizer st=new StringTokenizer(make,"^");
		System.out.println("레시피 제작법:"+st.nextToken());
		System.out.println("레시피 이미지:"+st.nextToken());
		/*
		 *  1. 클라이언트 => 서버로 데이터 전송
		 *     100|admin|1234
		 *     Switch=(protocol)
		 *     {
		 *     case 100:
		 *           로그인 한다
		 *     }
		 *     
		 *     200| 
		 */
	}

}
