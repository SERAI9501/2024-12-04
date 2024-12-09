/*
 * <ul class="common_sp_list_ul ea4" style="padding:0 0 0 8px;">
            <li class="common_sp_list_li">
                <div class="common_sp_thumb">
                    <a href="/recipe/7039214" class="common_sp_link">
                                                <img src="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/24/565de119b099835a80ffdfc4006583621_m.jpg">
                    </a>
                </div>
                <div class="common_sp_caption">
                    <div class="common_sp_caption_tit line2">치킨너겟 교촌 허니콤보 만들기</div>
                    <div class="common_sp_caption_rv_name" style="display: inline-block; vertical-align: bottom;">
                        <a href="/profile/recipe.html?uid=59304070"><img src="https://recipe1.ezmember.co.kr/cache/rpf/2024/10/24/1455cb2a66c286ac31d1c570f1276de11.jpg">태형제맘</a>
                    </div>
                    <div class="common_sp_caption_rv">
                                                    <span class="common_sp_caption_rv_star"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"></span>
                            <span class="common_sp_caption_rv_ea">(2)</span>
                                                <span class="common_sp_caption_buyer" style="vertical-align: middle;">조회수 1,853</span>
                    </div>
                </div>
            </li>
 */

import javax.print.Doc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
class Recipe
{
	int rno;//이것이 구분자
	String title;
	String chef;
	String poster;
}//이 부분이 사용자 정의 데이터 필요한 부분을 묶어서 하나로 만든 것


class RecipeSite
{
	static Recipe[] recipes=new Recipe[40];
	//사용자 정의 데이터는 일반 데이터형과 사용하는 방법 유사
	static 
	{
		try
		{
		 int j=0;
		 Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
		 Elements title=doc.select("li.common_sp_list_li div.common_sp_caption_tit");
		 for(int i=0;i<title.size();i++)
		 {
			 recipes[j]=new Recipe();
			 recipes[j].title=title.get(i).text();
			// System.out.println(title.get(i).text());
			 j++;
		 }
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
// JSP
public class 클래스_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RecipeSite rs=new RecipeSite();
			System.out.println("=======레시미 목록=======");
			for(Recipe r:rs.recipes)
			{
				System.out.println(r.title);
			}
	}

}
