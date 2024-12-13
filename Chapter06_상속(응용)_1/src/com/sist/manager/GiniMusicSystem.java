package com.sist.manager;
import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.sist.vo.*;
public class GiniMusicSystem {
	public MusicVO[] musics=new MusicVO[50];
	public String title="지니뮤직 Top50";
	// 인스턴스 초기화 블록 => 호출(O) , 상속(X)
	{
		// 예외처리 => 파일관련 , 네트워크 , 데이터베이스
		// URL => 웹 네트워크 ==>8장
		/*
		 *  예외 복구
		 *  예외 회피
		 *  예외 임의로 발생 => 견고성
		 *  
		 *  = 가독성
		 *  = 최적화
		 *  = 견고성
		 *  ------
		 */
		try
		{
			// 정상적으로 수행하는 문장
			//int a=10/0; // 프로그램 종료
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			org.jsoup.select.Elements title=doc.select("table.list-wrap a.title");
			org.jsoup.select.Elements singer=doc.select("table.list-wrap a.artist");
			org.jsoup.select.Elements album=doc.select("table.list-wrap a.albumtitle");
			
			for(int i=0;i<50;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("===================");
				musics[i]=new MusicVO();
				musics[i].setNo(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
		}catch (Exception ex) {
			// TODO: handle exception
		}	// 에러 발생시에 복구 / 에러출력
			//에러를 건너 뛴다
	}
	public MusicVO[] musicAllData()
{
		return musics;
}
	public MusicVO[] musicFindData(String fd)
	{
		int count=0;
		for(MusicVO vo:musics)
		{
			if(vo.getTitle().contains(fd))
			{
				count++;
			}
		}
		// 동적 배열 생성 => 가변 collection
		MusicVO[] music=new MusicVO[count];
		// 배열의 단점 => 메모리 갯수를 고정한다
				int i=0;
				for(MusicVO vo:musics)
				{
					if(vo.getTitle().contains(fd)) {
					music[i]=vo;
					i++;
					}
				}
				return music;
	}
}
