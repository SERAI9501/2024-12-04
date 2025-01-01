package com.sist.main;
import java.util.*;
public class Properties_1 {
	void main(String[] args) {
		// TODO Auto-generated method stub
//		Properties props=System.getProperties();
//		System.out.println(props.getProperty("java.version"));
//		System.out.println(props.getProperty("user.laguage"));
		EmpDAO dao=new EmpDAO();
		List<Emp> list=dao.empListData();
		for(Emp e:list)
		{
			System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob());
		}
	}
}
