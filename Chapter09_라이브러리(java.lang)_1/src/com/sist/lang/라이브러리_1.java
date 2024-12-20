package com.sist.lang;
/*
 * 라이브러리 쓰는 용도를 알아야 하는게 핵심이다.
 *  java.lang
 *   => Object / String / StringBuffer / Math / Wrapper
 *  java.util
 *   => Random / StringTokenizer / Date / Calendar
 *   => Collection (List , Map , Set)
 *  java.io
 *   => File / FileInputStream / FileOutputStream
 *    FileReader / FileWriter / BufferReader
 *    BufferedInputStream / BufferedOutputStream
 *    ObjectOutputStream / ObjectInputStream
 *  java.sql
 *    => Connection / Statement / ResultSet
 *    
 *   => 외부 라이브러리 (웹) => 파싱 (XML,HTML,JSON,CSV)
 *   
 *   StringBuffer : 임시로 문자열을 저장해서 => 한번에 출력
 *    => append() => 문자열 결합
 *       -------
 *    Math
 *     => random() : 입의 발생 => 0.0~0.99
 *     => ceil() : 올림 => 총페이지
 *     
 *    Wrapper
 *     => 데이터를 쉽게 다루기 위해서 클래스화한 클래스
 *     => 제네릭스 : 데이터형의 통일화 => 형변환없이 사용하는 장점이 있다
 *       => Collection
 *     => int => Integer : 문자열을 정수형으로 변환해준다
 *                Integer.parseInt("10")
 *        long => Long : 문자열을 long으로 변경
 *                 Long.parseLong("")
 *        double => Double : 문자열을 실수로 변경
 *                 Double.parseDouble()
 *        boolean => Boolean : 문자열을 논리형으로 변경
 *                Boolean.parseBoolean()
 *      ------------------------------------------
 *       혼합이 가능
 *       예
 *       Integer i=100; 클레스 안에 일반 데이터를 넣는것 = 오토박싱
 *       int ii=i; = 언박싱
 *      -------------------------------------------
 *      
 *     =>
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=135;
		// SELECT CEIL(COUNT(*)/10.0) FROM emp; 이렇게 오라클에서 나눌 수 있다
		int totalpage=(int)(Math.ceil(count/10.0));
		System.out.println(totalpage);
		/*
		 * 가끔 이런경우
		 * 
		 *   게시판
		 *   10
		 *   9
		 *   8
		 *   6
		 *   .
		 *   .
		 *   .
		 */
		// 유틸안에 들어가면 Random 클래스가 있다
		// Random => nextInt(100) = 0부터 99까지
	}

}
