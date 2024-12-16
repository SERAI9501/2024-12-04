package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dept extends DataBase{
// driverConfig() getConnection() => 그냥 사용이 가능한 것들
// listPrint(); findPrint();  => 
	@Override
	public void listPrint() {
		// TODO Auto-generated method stub
		driverConfig();
		Connection conn=getConnection();
		try {
			//오라클 전송
			String sqp="SELECT * FROM dept";
			PreparedStatement ps=conn.prepareStatement(sqp);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Override
		public void findPrint() {
			// TODO Auto-generated method stub
			
		}
}
