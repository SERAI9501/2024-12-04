

/*
 *  메소드 형식
 *  
 *  static 리턴형 메소드명(매개변수...)=>선언부
 *  {
 *    => 구현부 => 메모리에 저장
 *  }
 *  static 리턴형 메소드명(매개변수...); 메모리에 저장이 안된다
 *  =>추상메소드 : 설계단
 *  
 */
import java.io.*;//단점 => char X ,int로 읽어온다
import java.util.Scanner;
public class 메소드_1 {
	//화면에 출력 => 결과값이 없다 => void
	static String movieData="";//전역변수
	/*
	 * 예외처리
	 *  =>예외 복구 try~catch(복구)
	 *  =>예외 회피 => 컴파일러에 예외 => 알려주는 역할
	 *  => 프로그램을 유지 
	 */
	static
	{
		try
		{
			//정상수행
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)// -1 
			{
				sb.append((char)i);
			}
			movieData=sb.toString();
			fr.close();
		}catch(Exception ex) {
			//에러발생 => 복구
		}//예외처리
	}
	static void menu()
	{
		System.out.println("=========menu==========");
		System.out.println("1 영화 목록");
		System.out.println("2 영화 상세");
		System.out.println("3 영화 검색(영화명)");
		System.out.println("4 영화 검색(출연진)");
		System.out.println("5 종료");
		System.out.println("========================");
	}
	//조립
	//다른 클래스 연결해서 사용 / 재사용
	static void movieList(int page)
	{
		
		String[] movie=movieData.split("\n");
		int i=0;// for 횟수
		int j=0;// 20개씩
		final int ROWSIZE=20;//시작점
		int pagecnt=(page*ROWSIZE)-ROWSIZE;
		
		for(String s:movie)
		{
			//System.out.println(s);
			if(j<20 && i>=pagecnt)
			{
			String[] md=s.split("\\|");
			System.out.println(md[0]+"."+md[1]);
			j++;
			}
			i++;
			
		}
	}
	//상세보기
	static void movieDetail(int movieNo)
	{
		String[] movie=movieData.split("\n");//영화 정보 전체
		
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

	static void movieFind(String mn)	//영화명으로 찾기
	{
		String[] movie=movieData.split("\n");//영화 정보 전체
		
		for(String s:movie)
		{
			String[] info=s.split("\\|");
			if(info[1].contains(mn))
			{
				System.out.println(info[1]+"("+info[4]+")");
			}
		}
	}
	static void actorFind(String actor)	//출연진으로 찾기
	{
		String[] movie=movieData.split("\n");//영화 정보 전체
		
		for(String s:movie)
		{
			String[] info=s.split("\\|");
			if(info[4].contains(actor))
			{
				System.out.println(info[1]+"("+info[4]+")");
			}
		}
	}

	static void process()
	{
		//System.out.println(movieData);
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.print("메뉴 선택:");
			int m=scan.nextInt();
			if(m==5)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(m==1)
			{
				System.out.print("페이지 입력:");
				int page=scan.nextInt();
				movieList(page);
				
			}
			else if(m==2)
			{
				System.out.print("영화선택(1~1938):");
				int no=scan.nextInt();
				movieDetail(no);
			}
			else if(m==3)
			{
				System.out.print("영화명 입력:");
				String mn=scan.next();
				movieFind(mn);
			}
			else if(m==4)
			{
				System.out.print("출연자 입력:");
				String mn=scan.next();
				actorFind(mn);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
