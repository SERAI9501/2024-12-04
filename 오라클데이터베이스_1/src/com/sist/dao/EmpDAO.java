package com.sist.dao;
/*
 *    ==> 자바 12장
 *    오라클 연동
 *    --------
 *    1. 드라이버 설정
 *       => 한번만 설정
 *       => 생성자 이용
 *       => Class.forName("드라이버명")
 *                        --------- oracle.jdbc.driver.OracleDriver
 *                        --------- com.mysql.cj.jdbc.Driver / mhsql에서 드라이버
 *    2. 오라클 연결
 *       Connection conn=DriverManager.getConnection(URL,"hr","happy")
 *    3. 오라클로 SQL문장 전송
 *             ----------
 *       PreparedStatement ps=conn.preparedStatement(sq)
 *    4. 오라클에서 SQL실행하고 결과값 요청
 *       ResultSet rs=ps.executeQuery();
 *       
 *       rs
 *       ----------------------------
 *           id      pwd     name
 *       ----------------------------
 *          aaa      1234    홍길동  |   => next() ==> 가장 많이 사용
 *       ----------------------------
 *          bbb      1234    심청이
 *       ----------------------------
 *          ccc      1234    박문수
 *       ----------------------------
 *          ddd      1234    이순신  |   => previous()
 *       ----------------------------
 *       | cursor위치
 *       
 *       => rs.close()
 *       => ps.close()
 *       => conn.close()
 *       
 *       *** rs.next() => record단위 => 한줄에 있는 모든 데이터를 읽는다
 */
import java.util.*;
import java.sql.*;
import com.sist.vo.*;//값을 저장해야하니까
/*
 *  => SQL => ;을 사용하지 않는다
 *  => 변경 => LIKE
 *  => LIKE '%' || 문자열 || '%' => 문자열 결합
 *     LIKE CONCAT('%',문자열,'%') => MYSQL
 *  => JOIN => Oracle JOIN / ANSI JOIN 
 *                           --------- 오라클과 MYSQL을 사용 가능하다
 */
public class EmpDAO {
	// 1. 오라클 연결
	private Connection conn;
	// 2. 오라클 SQL전송 객체=SQL 송수신
	private PreparedStatement ps;
	/*
	 *  SQL 문장을 전송
	 *  오라클 실행 결과 읽기
	 *  ---------------
	 *  Statement : 데이터와 동시에 SQL문장을 전송
	 *  PreparedStatement : SQL먼저 전송
	 *                      나중에 데이터를 채운다 (***)
	 *  CallableStatement : Procedure 호출 => 함수
	 *                      | SQL문장이 노출되지 않는다
	 *                      | 보안
	 *                      | ERP = 관리 프로그램
	 *                        E4NET = ERP로 뛰어난 업체
	 *  EmpVO
	 *  String sql="INSERT INTO emp VALUES('
	 *             +vo.getEmpno()+",'"vo.getEname()
	 *             +"','"vo.getJob()+"','"
	 *             +vo.getHiredate()+"',"
	 *             +vo.getSal()...
	 *  String sql="INSERT INTO emp VALUES(?,?,?,?,?....)"
	 *      => MyBatis / JPA
	 */
	// => 클래스 전체에서 사용 하려고 함
	// 3. DAO => 오라클 연동 => 사용자 한명당 1개만 사용 (싱글턴)
	private static EmpDAO dao;
	// 3-1 URL
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// TCP Socket을 이용해서 오라클로 SQL문장을 전송
	// => 오라클 서버 => 자바응용프로그램 : Client
	public  EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ojdbc8.jar
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	// 4. 기능
	// 모든 메소드에서 공통으로 사용되는 기능
	// 4-0 : 오라클 연결 / 오라클 연결 해제
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			//conn hr/happy => 오라클에 이렇게 연결하는 것
		}catch (Exception ex) {}
	}
	
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch (Exception ex) {
		}
	}
	
	// 4-0-1 : 싱글턴 => 반드시 static을 줘야한다 = 메모리 공간을 1개만 생성하겠다.
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	// ----------------------------------- 여기까지 필수사항 항상=>jar
	
	// 2차 프젝 JSP : MyBatix(XML)
	// 3차 프젝 Spring = Mybatis (aAonnotation)=> VueJS
	
	// 4-1 : 목록 => SELECT column_list
	public List<EmpVO> empListData(int type)
	{
		List<EmpVO> list=
				new ArrayList<EmpVO>();
		String order="";
		if(type==1)
			order="ORDER BY empno ASC";
		else if(type==2)
			order="ORDER BY hiredate DESC";
		else if(type==3)
			order="ODER BY ename ASC";
		try
		{
			getConnection();
			//1.오라클 연결
			//2. SQL문자 제작
			String sql="SELECT empno,ename,job,hiredate "
					  +"FROM emp "
					  //= "SELECT empno,ename,job,hiredate FROM emp";
					  +order;
			//3.오라클 전송
			ps=conn.prepareStatement(sql);
			//4. SQL을 실행후에 결과값을 가지고 온다
			ResultSet rs=ps.executeQuery();
			// 정수 => getInt() 실수 => getDouble()
			// 문자열 => getString() 날짜 => getDate()
			// => 커서의 위치 변경
			while(rs.next())//처음부터 마지막까지 데이터를 읽어온다
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				list.add(vo);
			}
			rs.close();
		}catch (Exception ex) {
			// 오류확인
			ex.printStackTrace();
		}
		finally
		{
			//오라클 해제
			disConnection();
		}
		return list;
	}
	// 4-3 : 상세보기 => WHERE
	/*
	 *  List ==> 여러명
	 *  EmpVO==> 1명 => 상세보기
	 *  AAA 1
	 *  AAA 2
	 *  AAA 3 => 이상현상 (수정 , 삭제) => 기본키 그리고 기본키는 숫자로 만든다
	 *  AAA 4
	 *  AAA 5
	 *  이렇게 이름이 같더라도 한명을 불러 올 수 있다 
	 *  3번을 지워라.. 하면 구분자를 통해서 한명을 지울 수 있다. 이런것을 무결성원칙이라고 한다.
	 */
	public EmpVO empDetailData(int empno)//empno가 기본키이다
	{
		EmpVO vo=new EmpVO();// 사원 한명의 정보를 담는다
		try
		{
			getConnection();
			// SQL제작
			String sql="SELECT * FROM emp WHERE empno="+empno;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); //결과값 가져오기
			rs.next(); //와일문은 여러개 있을때 사용 지금은 첫번재 위치값을 읽어 와라 = next
			// 순서 
			/*
			 *  EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO
			 *  => 내부변환 오류 => 데이터형이 다른 경우
			 *  순서가 틀리면 안된다 순서에 따른 데이터형을 잘 보자
			 */
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
		
	}
} 









