package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import java.sql.*;
// 로그인 처리 => COUNT
// 회원가입
// JDBC => DBCP => ORM (MyBatis,Hibernate,JPA)
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static MemberDAO dao;
	
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdvc.driver.OracleDriver");
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public static MemberDAO newInstance()
	{
		if(dao==null)
			 dao=new MemberDAO();
		return dao;
		
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	//===================================오라클 연결 필수사항
	//기능 처리
	// COUNT(*) => 로그인
	public String isLogin(String id,String pwd)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			//2.sql문장 정송
			String sql="SELECT COUNT(*) FROM member WHERE id=?"; // 0(아이디가 없는 경우) 1(아이디가 있는 경우)
			ps=conn.prepareStatement(sql);
			
			//?에 값을 채운다
			ps.setString(1, id); // 
			
			//실행후 결과값 받기
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			rs.close();
			
			if(count==0)//아이디가 없는 상태
			{
				vo.setMsg("NOID");
			}
			else //아이디가 있는 상태
			{
				sql="SELECT pwd,name,sex,address FROM member WHERE id=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				String name=rs.getString(2);
				String sex=rs.getString(3);
				String address=rs.getString(4);
				rs.close();
				
				if(db_pwd.equals(pwd))
				{
					vo.setMsg("OK");
					vo.setName(name);
					vo.setSex(sex);
					vo.setAddress(address);
				}
				else//비밀번호가 틀린상태
				{
					 vo.setMsg("NOPWD");
				}
			}
		}catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
}
