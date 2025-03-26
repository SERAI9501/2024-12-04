package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * class : 중복이 가능
		 * id : 중복이 없다
		 */
        String html="<html>" /*html 문서 시작*/
        		+"<body>" /*브라우저에 출력*/
        		+"<div id=aaa>" /*구분자 class / id**/
        		+"<div>Java</div>" /*Element*/
        		+"<div>Oracle</div>"
        		+"<div>HTML/CSS</div>"
        		+"</div>"
        		+"<div class=bbb>"
        		+"<div>JavaScript</div>"
        		+"<div>JSP</div>"
        		+"<div>Spring</div>"/*Elements*/
        		+"</div>"
        		+"<img src=http//www.daum.net>"
        		+"</body>"/*화면 출력 종료*/
        		+"</html>";/*문서 종료*/
        try 
        {
			// Element => text() , attr() : 속성값
        	// html() => HTML 태그 , data() : JavaScript읽기
        	// Elements => get() => 태그를 1개씩 읽기
        	// ------ 태그 갯수 확인 => size()
        	Document doc=Jsoup.parse(html);
        	//System.out.println(doc);
        	Elements div=doc.select("div.bbb div");// id=# , class=.
        	// ==> 후손 태그
        	//System.out.println(div); 모으기
        	//System.out.println("div몇개?"+div.size());
        	//Element div1=div.get(0);
        	//System.out.println(div1.text());
        	for(int i=0;i<div.size();i++)
        	{
        		System.out.println(div.get(i).text());
        	}
        	Element img=doc.selectFirst("img");// 상세
        	System.out.println(img.attr("src"));
		} catch (Exception ex) {}
	}

}
