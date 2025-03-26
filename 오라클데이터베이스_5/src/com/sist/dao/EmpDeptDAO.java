package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDeptDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static EmpDeptDAO dao;
	
	public EmpDeptDAO()
	{
		try {
			Class.forName("orcle.jdbc.driver.OracleDriver");
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public static EmpDeptDAO newInstatce()
	{
		if(dao==null)
			dao=new EmpDeptDAO();
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
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public void sqlExecute()
	{
		try {
			getConnection();
			// 인라인 뷰 
			String sql="SELECT empno,ename,job,hiredate,sal,rank,dname,loc,grade "
					+"FROM (SELECT empno,ename,job,hiredate,sal,"
					+ "RANK() OVER(ODER BY sal DESC) rank,"
					+ "dname,loc,grade "
					+"FROM emp,dept,salgrade "
					+"WHERE emp,deptno=dept.deptno "
					+"AND sal BETWEEN losal AND hisal)";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(
						rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getDate(4).toString()+" "
						+rs.getInt(5)+" "
						+rs.getInt(6)+" "
						+rs.getString(7)+" "
						+rs.getString(8)+" "
						+rs.getInt(9)
						);
			
			}
		} catch (Exception ex) {ex.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			
		}
	}
	public void viewExecute()
	{
		try {
			//소스를 간결화
			getConnection();
			String sql="SELECT * FROM empAllData";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(
						rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getDate(4).toString()+" "
						+rs.getInt(5)+" "
						+rs.getInt(6)+" "
						+rs.getString(7)+" "
						+rs.getString(8)+" "
						+rs.getInt(9)
						);
			
			}
		} catch (Exception ex) {ex.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			
		}
	}
}
