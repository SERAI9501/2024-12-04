import java.util.Arrays;
import java.util.Scanner;

public class 아침복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 다음 중 배열 선언이 잘못된 것은? 4
//
//1) int[] n = {1, 2, 3, 4, 5};
//2) int n[] = {0};
//3) int[] n = new int[3];
//4) int n[3] = new int[3];
		
//		2. 배열을 선언하고 생성하는 다음 물음에 답하라.
//		1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
// 		char[] c=new ch[10];
//		​
//		2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
// 		int[] n={0,1,2,3,4,5}
		
//		​
//		3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//		char[] day={'일', '월', '화', '수', '목', '금', '토'}
//		​
//		4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
//		boolean[] bool={true, false, false, true};
		
//		3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
//char[] alpha = {'a', 'b', 'c', 'd'};

//for(int i: arr)
//     System.out.print(alpha[i]);


		
//		4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		for(int i:arr)
//		{
//			if(i%3==0)
//			{
//				System.out.println(i+" ");
//			}
//		}
//		Scanner scan=new Scanner(System.in);
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print("숫자 입력:");
//			arr[i]=scan.nextInt();
//		} 	
//		System.out.print("3의 배수의 숫자는");
//		for(int i:arr)
//		{
//			if(i%3==0)
//			{
//				System.out.print(i+" ");
//			}
//		}
		
//
//		5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//		그리고 배열에 든 숫자들과 평균을 출력하라. 
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10)+1;
//		}
//		int sum=0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}	System.out.printf("평균%.2f",sum/10.0);
		
		
//		6. int[] num = { 94, 85, 95, 88, 90 };다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
//		int[] num={104,105,110,200,300};
//		int max=0;
//		int min=100;
//		for(int i:num)
//			{
//			if(max<i)
//				max=i;
//			if(min>i)
//				min=i;
//			}
//		System.out.println(max);
//		System.out.println(min);
		
//		int[] num= {94,85,95,88,90};
//		int max=0;
//		int min=0;
//		for(int i=0;i<num.length;i++)
//		{
//			if(min>num[i])
//			{
//				min=num[i];
//			}
//			if(max<num[i])
//			{
//				max=num[i];
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);
			


//		7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
//		그리고 배열에 든 숫자들과 평균을 출력하라.
//	    예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 평균은 5.4
//		[Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
//		int i  = (int)(Math.random()*10)+1;
//		int[] arr=new int[10];
//		int sum=0;
//		for(int i=0; i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10)+1;
//			
//		}System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.printf("평균:%.2f",sum/10.0);
		
//		int[] abc=new int[10];
//		int sum=0;
//		for(int i=0;i<abc.length;i++)
//		{
//			abc[i]=(int)(Math.random()*10)+1;
//		}System.out.println(Arrays.toString(abc));
//		
//		for(int i:abc)
//		{
//			sum+=i;
//		}
//		System.out.printf("평균:%.2f",sum/10.0);

		
//		8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//		 int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
//		int[] arr={10,20,30,50,3,60,-3};
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]+=0;
//		}
//		System.out.println(arr[0]);
		
//		int[] arr= {10,20,30,50,3,60,-3};
//		for(int i=0;i<arr.length;i++)
//		{
//		}
//		System.out.println(arr[0]);
			
		

//		9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
//		int[] arr={10,20,30,50,3,60,-3};
//		int index=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==60)
//			{
//				index=i;
//				break;
//			}
//		}
//		System.out.println(index);
//		int[] arr= {10,20,30,50,3,60,-3};
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==60)
//			{
//				System.out.println(arr[i]);
//				break;
//			}
//		}
//
		int[] arr= {10,20,30,50,3,60,-3};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				System.out.println(arr[i]);
				break;
			}
		}
			
			}
		
	}


