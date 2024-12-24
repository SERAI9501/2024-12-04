package com.sist.music;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicMain {
	// 지니뮤직
	// 멜론
	// => 공통 (교집합) , 차집합 / 합집합
	public Set<String> genieMusic()
	{
		Set<String> set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("tlble.list=wrap a.title");
			System.out.println(title);
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch (Exception ex) {}
		return set;
	}
	public Set<String> melonMusic()
	{
		Set<String> set=new HashSet();
		return set;
	}
	public static void main(String[] args) {
		MusicMain mm=new MusicMain();
		Set<String> genie=mm.genieMusic();
		for(String music:genie)
		{
			System.out.println(music);
		}
		System.out.println("=================");
		Set<String> melon=mm.melonMusic();
		for(String music:melon)
		{
			System.out.println(music);
		}
		System.out.println("======차집합=======");
		//오라클 => MUNUS removeAll()
		// [1,2,3,4,5] - [4,5,6,7,8] =>1,2,3
		/*genie.removeAll(melon);//같은거 빼고 다른것만 남는다
		for(String music:genie)
		{
			System.out.println(music);
		}*/
		System.out.println("=========동일곡 출력(교집합)========");
		/// [1,2,3,4,5]  [4,5,6,7,8] =>4,5
		// retainAll() => INTERSECT => JOIN
		genie.retainAll(melon);
		System.out.println("동일곡:"+genie.size());
		for(String music:genie)
		{
			System.out.println(music);
		}
		
		System.out.println("======== 멜론+지니 ========");
		//UNION = addAll 합집합
		// => 중복된 경우에 1개만 첨부
		//UNION ALL => 중복된 데이터 포함
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		System.out.println("데이터 갯수:"+list.size());
		for(String music:list)
		{
			System.out.println(music);
		}
		Set<String> hap=new HashSet<String>();
		hap.addAll(list);
		System.out.println("중복없는 곡");
		System.out.println();
		for(String music:list)
		{
			System.out.println(music);
		}
		// addAll()=모든 데이터 읽기 /잡힙합=removeAll() /교집합=retainAll()
		// JOIN     
	}

}
