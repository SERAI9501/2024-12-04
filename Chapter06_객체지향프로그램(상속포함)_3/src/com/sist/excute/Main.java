package com.sist.excute;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A=1 ,B=2 ,C=3,D=4
		Scanner scan=new Scanner(System.in);
		System.out.print("A(1),B(2),C(3),D(4):");
		int select=scan.nextInt();
		I[] i= {null,new A(),new B(),new C(),new D()};
		i[select].excute();
//		if(select==1)
//		{
//			A a=new A();
//			a.excute();
//		}
//		else if(select==2)
//		{
//			B a=new B();
//			b.excute();
//		}
//		else if(select==3)
//		{
//			C a=new C();
//			c.excute();
//		}
//		else if(select==2)
//		{
//			D a=new D();
//			d.excute();
//		}
	}

}
