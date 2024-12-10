import java.util.*;
import java.io.*;
public class MovieSystem {
//영화 전체 정보 => 모든 사용자가 공유
	static Movie[] movies=new Movie[1938];
	
	//초기화
	static
	{
		try
		{
			// 파일 전체 읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 한글자씩 읽어 온다 => 정수형으로 읽는다
			StringBuffer sb=new StringBuffer();
			//문자열 결합의 최적화 => 데이터가 많은 경우 
			//String data="";
			while((i=fr.read())!=-1)//파일이 끝날때까지 읽어와라
			{
				sb.append((char)i);
			}
			fr.close();
			//System.out.println(sb.toString());
			String data=sb.toString();
			
			//분리
			String[] temp=data.split("\n");
			//영화 한줄에 대한 정보
			int j=0;
			for(String s:temp)
			{
				movies[j]=new Movie();
				// movies[0] => no.titl,actor...
				String[] ss=s.split("\\|");
				movies[j].no=ss[0];
				movies[j].title=ss[1];
				movies[j].genre=ss[2];
				movies[j].poster=ss[3];
				movies[j].actor=ss[4];
				movies[j].regdate=ss[5];
				movies[j].grade=ss[6];
				movies[j].director=ss[7];
				j++;
			}
			
		}catch (Exception ex) {}
	}
	//목록 => 페이지를 나눠서 처리
	public Movie[] movieListData(int page)
	{
		final int ROWSIZE=20;
		
		//int pagecnt=(ROWSIZE*page)-ROWSIZE;
		int start=(page=1)*ROWSIZE;
		int end=page*ROWSIZE;
		int totalpage=(int)(Math.ceil(movies.length/20.0));
		int ARRSIZE=20;
		if(page==totalpage)
		{
			end=page*ROWSIZE-2;
			ARRSIZE=18;
		}
		Movie[] movieData=new Movie[ARRSIZE];
		int j=0;
		for(int i=start;i<end;i++)
		{
			movieData[j]=movies[i];
			j++;
		}
		return movieData;
		//                       올림함수
		/*
		 *  1page => 0 ~ 19
		 *  2page => 20 ~ 39 => while ,for => 처음부터
		 */
		// (page=1)*ROWSIZE => 시작위치
	}
	//상세보기
	public Movie movieDetail(int no)
	{
		return movies[no-1];
	}
	//검색
}
