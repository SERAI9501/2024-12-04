import java.util.Arrays;

public class 배열_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					i--;
					break;
				}
		
			}
			
		}for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println(Arrays.toString(arr));
				
	}

}
