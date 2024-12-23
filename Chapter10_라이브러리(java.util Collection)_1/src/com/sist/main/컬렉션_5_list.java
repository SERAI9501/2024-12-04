package com.sist.main;
import java.util.*;
public class 컬렉션_5_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names=new ArrayList<String>();
//		
//		names=new LinkedList<String>();
//		
//		names=new Vector<String>();
//		
		// 인터페이스 => MyBatis / JPA => 리턴형 => List
		// 데이터를 모아서 순차적으로 접근 => 크롤링
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML/CSS");
		list.add("JavaScript");
		list.add("JSP");// Jquery / Ajax
		list.add("Spring");// VueJS
		list.add("Python");// Numpy / Pandas / MatplotLib
		list.add("ElasticSearch");
		list.add("AWS");// Linux
		
		for(String subject:list)
		{
			System.out.println(subject);
		}
		System.out.println("=============");
		
		// 데이터를 모아서 순차적으로 출력
//		Iterator<String> iter=list.iterator();
//		while(iter.hasNext())//애가 데이터를 가지고 있는 동안
//		{
//			System.out.println(iter.next());
//			System.out.println(iter.next());
//		}
		//next()로 종료가 되면 => 2번을 읽지 못한다
//		while(iter.hasNext())//애가 데이터를 가지고 있는 동안
//		{
//			System.out.println(iter.next());
//		}
		
		ListIterator<String> iter=list.listIterator();
		while(iter.hasNext())//위 => 아래
		{
			System.out.println(iter.next());
			
		}
		System.out.println("=========");
		while(iter.hasPrevious()) //아래서부터=>위 출력해라hasPervious
		{
			System.out.println(iter.previous());
		}
		//set이나 map을 사용
		
		
		//생성자 안에서 new=list 사용하지 말것 왜냐하면 구현해야 하는 목록이 많다
	}

}
