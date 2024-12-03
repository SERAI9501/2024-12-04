
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];//선언
		//초기값
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])// 중
				{
					i--; // 현재 위치값을 변경한다.
					break;
				}
			}
		}
		//처리 => 출력
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}

}
