// char 배열 사용법 / double / String
// => 응용 => 정렬 / 달력 .../ 중복없는 난수 (오늘 공부 내용)
// => 지니뮤직 , 서울 여행 , 맛집 (내일 배열로 만들고 찾기)
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[26];//선언
		//초기화
		char c='A';
		//인덱스 번호
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c++;//A~Z까지 입력
		}
		//처리x
		//출력
		for(char cc:alpha)
		{
			System.out.print(cc+" ");
		}
		System.out.println();
		int index=0;
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]=='K')
			{
				index=i;
				break;
			}
		}
		System.out.println("K 의 위치는 "+index);
		// => 'K'가 있는 인덱스번호를 출력 
		
	}

}
