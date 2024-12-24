package com.sist.map;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		Model model=c.getBean("member");
		model.excute();
		System.out.println(model);
		model=c.getBean("food");
		System.out.println(model); // 메모리 절약 => 싱글턴 = 하나의 메모리에 저장하는 것
	}
}
