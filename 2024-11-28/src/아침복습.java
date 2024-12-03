import java.io.PrintStream;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 아침복습 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
/*
 *1. 로그인
 *2.스크랩/라이브러리 Jsoup 불러오기
 *3. 문자열 갯수 length()
 *4. 문자열 좌우 대칭 대칭이 아니다. data=scan.nextLine(); 문자열 입력 /for(int i=0;i<data.length()/2;i++)
 *5.  *  indexOf(문자) => 문자열 처음부터 -- 지정된 문자를 찾는다
 *  lastIndexOf(문자) 문자열 뒤에서부터 -- 지정된 문자를 찾는다
 *  *** 없는 경우 -1
 *문자열 6.  *****x1000000  substring(1,4) = ell 
 *             --endIndex-1 = 맨 마지막 하나를 제외한다는 의미
 *  공백 제거 : trim()
 *7.*  = toUpperCase() : 대문자 변환
 *  = toLowerCase() : 소문자 변환
 *  = replace() : 지정된 데이터 변경
 *  = replaceAll() : 전체를 변경 ===> 정규식
 *  
 */
		Scanner scan=new Scanner(System.in);
		
		Document doc = Jsoup.connect("https://namu.wiki/w/%EC%88%98%EC%84%A0%ED%99%94%EC%97%90%EA%B2%8C").get();
		
		Elements title = doc.select("div.BFRYGzrO");
		//System.out.println(title.text());
		
		String str="  나 보기가 역겨워 가실 때에는 말 없이 고이 보내드리오리다   ";
		
	}
	
}
