import java.util.Arrays;

public class 배열_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		String result=String.format("%,2f", sum/10.0);
		System.out.println(result);
	}

}
