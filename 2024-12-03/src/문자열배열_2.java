import com.sist.data.*; // 사용자 정의
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fdata=ArrayData.korEng;//데이터 읽기
		Scanner scan=new Scanner(System.in);
		System.out.print("과일명을 입력:");
		String f=scan.next();
		for(String ff:fdata)//데이터 확인
		{
			// 클래스가 있으면 지금같은 오류를 없앨 수 있다 '감'을 쳐보면 어떤오류인지 알 수 있다.
			if(ff.contains(f))
			{	
				String chage=ff.substring(ff.indexOf(":")+1);
				System.out.println(f+"는()은 영어는 "+chage);	
				break;
			}
			
		}
	}

}
