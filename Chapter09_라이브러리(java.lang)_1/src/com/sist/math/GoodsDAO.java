package com.sist.math;
import java.sql.*;
/*
 *  데이터형
 *    => 기본형
 *    => 참조형
 *       --- 클래스 / 배열
 *           ----
 *           | 라이브러리
 *           | 사용자 정의
 *    멤버변수 => 기본형 / 클래스 / 배열
 */
public class GoodsDAO {
	//클래스 전체영여겡서 사용하는 변수 / 클래스 / 배열 => 멤버변수
	private Connection conn;//오라클연결하는 클래스
	private PreparedStatement ps; //오라클 명령문
	// => 변경이 되면 안되는 값 : 상수 => 오라클 주소 (상수: 변경하면 안되는 값)
	// hr1 hr2 hr3 hr4 조별 계정을 만들 것
	private final String URL="jdbc:oracle:thin@211.238.142.124:1521:XE";
	/*
	 *  오라클 실행 명령어
	 *  ------------- SQL
	 *   
	 *  DQL : 데이터 검색 => 데이터 읽기
	 *        => SELECT
	 *  DML : 데이터 조작
	 *        => INSERT => 데어터를 오라클에 추가 
	 *        => UPDATE => 데이터 수정
	 *        => DELETE => 데이터 삭제
	 *  DCL : 데이터 제어
	 *        => GRANT : 권한 부여 
	 *        => REVOKE : 권한 해제
	 *  DDL : 저장장소,함수 ...
	 *           CREATE , ALTER , DROP , RENAME , TRANCATE
	 *  TCL : 트렌잭션 제어
	 *        COMMIT : 정상 저장
	 *        ROLLBACK : 모든 명령 취소
	 *        
	 *  => JOIN / Subquery
	 */
	//오라클 연결 => 드라이버 설치 는 생성자를 사용한다. => 1번만 수행
	// 싱글턴 = 데이터 베이스가 나오면 싱글턴으로 코딩해야 한다 = 싱글턴은 한번만 수행하는 것이다. = static 메모리 공간이 하나
	private static GoodsDAO dao;
	
	public GoodsDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	// GoodsDAO dao=GoodsDAO.newInstace()
	// 싱글턴 패턴
	public static GoodsDAO newInstace()
	{
		if(dao==null)
			dao=new GoodsDAO();
		return dao; // dao가 null이라면 새로 만들고 아니라면 dao를 가져다 쓰겠다.
	}
	// => 자바 / 오라클 / 스프링 => 단순화 라이브러리 (Mybatis,JPA)
	// 공통모듈 => 메소드마다 공통으로 사용
	// => 오라클 연결 (트라이 켓치 연습하기 좋다)
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	// => 오라클 닫기 ==> 반복 코딩 => 메소드화
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	// => 자동화 (스프링 => AOP) => 실시간 Task
	// 기능
	// 총페이지
	public int goodsTotalPage()
	{
		int count=0;
		// 마이바티스는 "slectList(String sql)"만 넣으면 된다.
		try
		{
		// 	1.연결
			getConnection();
			//2.오라클 명령문 전송
			String sql="SELECT COUNT(*) FROM goods_all";
			//3.오라클로 전송
			ps=conn.prepareStatement(sql);
			//4. 실행 결과값 읽기
			ResultSet rs=ps.executeQuery();
			//5. 데이터가 있는 메모리 위치에 커서를 이동
			rs.next();
			//6. 읽어온 값을 저장
			count=rs.getInt(1);
			//7. ResultSet 메모리를 닫는다
			rs.close();
		}catch (Exception ex) {
			//에러 확인만 한다
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return count;
	}
	// 목록
	// 추가
	
}
