package com.sist.util;
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red|yellow|green|pink|magenta|blue|black|cyan";
		StringTokenizer st=new StringTokenizer(color,"|");
		//String[] colors=color.split("\\|"); 이것 보단 토큰이 더 편하다
		System.out.println("컬러 갯수:"+st.countTokens());
		// 초과시에는 오류
		while(st.hasMoreTokens())//짤린 갯수만큼 = hasMoreTokens // while 루프를 돌려라
		{
			System.out.println(st.nextToken());
		}
		/*
		 * hasMoreTokens // 다음 토큰이 있는지 확인 하다가 after last가 걸리면 false가 나오면서 종료된다.
		 * --------------
		 *  => before First
		 * --------------
		 * red => st.nextToken() => 다음 데이터가 있으면 true 
		 * --------------
		 * yellow st.nextToken() true
		 * --------------
		 * ...    st.nextToken() false
		 * --------------
		 * => 맨 마지막은 after last가 들어가 있다
		 * --------------
		 */
	}

}
