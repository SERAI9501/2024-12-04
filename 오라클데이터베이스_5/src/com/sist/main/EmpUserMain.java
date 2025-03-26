package com.sist.main;
import com.sist.dao.*;

public class EmpUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDeptDAO dao=EmpDeptDAO.newInstatce();
		dao.sqlExecute();
		System.out.println("=======================");
		dao.viewExecute();
	}

}
