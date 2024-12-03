import java.util.Arrays;

public class 문자열배열_아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
//		1번 학생 : 100점  
//		2번 학생 : 90점  
//		3번 학생 : 85점  
//		
//		2) 학생들의 총점을 출력하시오.
//			int[] score= {100,90,85};
//		int[] score= {100,90,85};
//		int sum=0;
//		for(int i=0;i<score.length;i++)
//		{
//			System.out.println(+(i+1)+"번 학생 :"+score[i]+"점");
//			sum+=score[i];
//		}
//		System.out.println("총점:"+sum);
			
//			2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다.
//			(실적 0~100)1) 사번별 실적을 출력하시오. 
//			사원(1) 50..
//			2) 1월 실적의 총점과 평균을 출력하시오.
//			3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
//			int[] arr= {50,45,35,12,70};
//			int[] s= {50,45,35,12,70};
//			int total=0;
//			double avg=0.0;
//			for(int i=0;i<s.length;i++)
//			{
//				System.out.println("사원"+(i+1)+" "+s[i]);
//				total+=s[i];
//			}
//			System.out.println("1월 실적:"+total);
//			System.out.printf("평균%.2f\n",total/(double)s.length);
//			int max=s[0];
//			int min=s[0];
//			int maxi=0;
//			int mini=0;
//			for(int i=0;i<s.length;i++)
//			{
//				if(max<s[i])
//					max=s[i];
//					maxi=i;
//				if(min>s[i])
//					min=s[i];
//					mini=i;
//			}
//			System.out.println();
			

			
//			 3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기

			
//			 4. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//	        public static void main(String[] args)
//		{
//			int[] arr = {10, 20, 30, 40, 50};
//			int sum = 0;
//			/*
//		           (1) 알맞은 코드를 넣어 완성하시오.
//			 */
//			System.out.println("sum="+sum); // 결과 : sum=150

			
//			5. 1~100사이의 정수를 10개 저장하고  
//			 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장 정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
//			int[] arr=new int [10];
//			int evenTotal=0;
//			int oddTotal=0;
//			for(int i=0;i<arr.length;i++)
//			{
//				arr[i]=(int)(Math.random()*100)+1;
//				if(arr[i]%2==0)
//					evenTotal+=arr[i];
//				if(arr[i]%2!=0)
//					oddTotal+=arr[i];
//			}System.out.println(Arrays.toString(arr));
//			System.out.println(oddTotal);
//			System.out.println(evenTotal);
			
			
//			
//			6. 0~9사이의 난수를 100개 발생해서 
//			   빈도를 구해서 출력하시오 
//			   예)
//			   0의 개수: 1
//			   1의 개수: 1
//			   ..
//			   9의 개수: 0
//			int[] B=new int[100];
//			for(int i=0;i<B.length;i++)
//			{
//				B[i]=(int)(Math.random()*10);
//			}System.out.println(Arrays.toString(B));
//			int temp=0;
//			int[] C=new int[10];
//			{
//			for(int j=0;j=C.length;j++)
//			{
//				
//			}
//			}System.out.println(temp);


			
//			7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
//		    A C D H J
//		    A C D H J
//		    J H D C A
			char[] A=new char ['A'];
			for(int i=0;i<A.length;i++)
			{
				A[i]=(char)((Math.random()*26)+65);
			}System.out.print(Arrays.toString(A));
			
			

		
		
	}

}
