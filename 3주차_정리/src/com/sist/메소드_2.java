package com.sist;
import java.util.Scanner;
import java.io.*;//io는 인풋 아웃풋을 줄임말이다 io는 예외처리를 무조건 해야하는 단점이 있다.
/*
 *  마지막장 12장
 *  -----
 *  |자바 관련 모든 문법 => 응용
 *    = 데이터베이스    => 웹
 *    = 네트워크      => 온라인 게임
 *    웹 => 쓰레드 , 네트워크 => 흐름
 *  ---------------------------
 */
public class 메소드_2 {
	static String seoulData;//자동 초기화 클레스 변수 안에 들어갔기 때문에 => null로 초기화 된다.
	//초기화 (자동) => 초기화 블럭 => 자동 로그인 / 쿠키 읽기 / 오라클 연동
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			seoulData=sb.toString();
			fr.close();
		}catch (Exception ex) {
			// TODO: handle exception
		}
		
	}
	static void menu()
	{
		System.out.println("==========메뉴==========");
		System.out.println("1.명소 목록");
		System.out.println("2.명소 상세 보기");
		System.out.println("3.명소 검색(명소명)");
		System.out.println("4.명소 검색(주소)");
		System.out.println("5.종료");
		System.out.println("=======================");
	} 
	static String[] find(int type,String findData)
	{//확인 섬색된 갯수?
		String[] datas=seoulData.split("\n");//
		int count=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				count++;//배열의 갯수 확인
			}
		}
		//////배열 크기 확인
		String[] data=new String[count];//동적 => 정적인데 동적으로 바뀜
		int i=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				data[i]=sd[1]+"--"+sd[3];
			}
		}
		return data;
	}
	static void movieDetail(int movieNo)
	{
		String[] movie=seoulData.split("\n");//영화 정보 전체
		
		for(String s:movie)
		{
			String[] info=s.split("\\|");//영화 한개 => 정보
			if(info[0].equals(String.valueOf(movieNo)))//String.valuOf는 데이터형을 문자형으로 바꾸는것 parseInt()는 스트링형을 정수형으로 바꾸는 것
			{
				System.out.println("영화명:"+info[1]);
				System.out.println("장르:"+info[2]);
				System.out.println("출연:"+info[4]);
				System.out.println("개봉일:"+info[5]);
				System.out.println("등급:"+info[6]);
				System.out.println("감독:"+info[7]);
				break;
			}
		}
	}
	static void List(int page)
	{
		
		String[] sd=seoulData.split("\n");
		int i=0;// for 횟수
		int j=0;// 20개씩
		final int ROWSIZE=20;//시작점
		int pagecnt=(page*ROWSIZE)-ROWSIZE;
		
		for(String s:sd)
		{
			//System.out.println(s);
			if(j<20 && i>=pagecnt)
			{
			String[] ss=s.split("\\|");
			System.out.println(ss[0]+"."+ss[1]);
			j++;
			}
			i++;
			
		}
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.print("메뉴선택:");
			int m=scan.nextInt();
			switch(m)
			{
			 case 5:
				System.out.println("프로그램 종료!!");
				System.exit(0);
			 case 1://고
				 System.out.print("페이지를 입력하세요");
				 int list=scan.nextInt();
				 List(list);//
				 break;
			 case 2:
				 System.out.print("명소 번호를 입력하세요");
				 int 
				 
				 break;
			 case 3: case 4:
				 System.out.print("명소(1),주소(2):");
				 int type=scan.nextInt();
				 System.out.print("검색어 입력:");
				 String fd=scan.next();
				 String[] ss=find(type,fd);
				 for(String s:ss)
				 {
					 if(s!=null)
					 System.out.println(s);
				 }break;
				 
				 
				 
			}
		}
	}
	//메인은 시작점이라 자동으로 호출 메소드 => 전체 프로젝트에 한개 이상의 main 존재해야만 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
