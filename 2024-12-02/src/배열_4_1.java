import java.util.Arrays;

public class 배열_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		boolean bCheck=false;
		int wjwkd=0;
		for(int i=0;i<arr.length;i++)
		{
		bCheck=true;
		while(bCheck)
		{
			wjwkd=(int)(Math.random()*45)+1;
			bCheck=false;
			for(int j=0;j<i;j++)
				if(arr[j]==wjwkd)
				{
					bCheck=true;
					break;
				}
		}arr[i]=wjwkd;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
	
	}

}
