package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  1. 파일 => IO
 *  2. URL => URL주소 
 *  3. SQL => 네트워크
 *  --------------- CheckException
 *                  --------------
 *                  컴파일시에 예외처리 확인
 *  
 */
public class MusicSystem {
	/*
	  top50
	  가요
	  pop
	  OST
	  트롯
	  jazz
	  classic
	 */
	private String[] url={
			"",
			"https://www.genie.co.kr/chart/top200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0100",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0300",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0107",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0500",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0600"
		};
	
	public MusicVO[] musicData(int type)
	{
		MusicVO[] music=new MusicVO[50];
		try
		{
			Document doc=Jsoup.connect(url[type]).get();
			// 필요한 값 => HTML (태그) <> => 자바 : Element
			Elements title=doc.select("table.list-wrap td.info a.title");
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			for(int i=0;i<50;i++)
			{
				music[i]=new MusicVO();
				music[i].setTitle(title.get(i).text());
				music[i].setSinger(singer.get(i).text());
				music[i].setAlbum(album.get(i).text());
			}
		}catch (Exception e) 
		{
			
		}
		return music;
	}
}
