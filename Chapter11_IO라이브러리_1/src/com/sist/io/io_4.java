package com.sist.io;
//리플렉션
import java.awt.SystemTray;
import java.util.Scanner;

public class io_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Container c=new Container();
        Scanner scan=new Scanner(System.in);
        System.out.print("클래스 호출:");
        String cmd=scan.next();
        
        I i=c.getBean(cmd);// 클래스를 모아서 관리 => Map
        i.execute();
        // 한개의 클래스로 통일 => 인터페이스 
	}

}