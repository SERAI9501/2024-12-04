//10개의 정수를 임의로 추출해서 (1~100) max ,min
// => max의 위치 / min의 위치

import java.util.Arrays;

public class 배열_3_1 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		int min=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		int maxIndex=0;
		int minIndex=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				maxIndex=i;
			}
			if(arr[i]==min)
			{
				minIndex=i;
			}
			
		}
		System.out.println("max값의 인덱스"+maxIndex);
		System.out.println("min값의 인덱스"+minIndex);
	}
}
