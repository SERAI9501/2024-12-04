package com.sist.exception;

import java.util.Arrays;
//Check Exception 예시
public class 예외처리_CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	try
	//	{
			int [] lotto=new int[6]; // 지역변수의 문제 때문에 트라이 밖에서 사용하는 경우가 많더라
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			//정렬
			Arrays.sort(lotto);
			
			//출력
			for(int i:lotto)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //예외처리 하고 사용해야만 하는 애로 선언되어있다. => throws
				System.out.print(i+" ");
			}
		//}catch (InterruptedException e) 
		//{
		//	e.printStackTrace();
		//}
		//finally
		//{
		//	System.out.println("프로그램 종료");
		//}
	}

}
