/*
 *  2*1=2 3*1=3... 9*1=9
 *  ..
 *  ..
 *  ..
 *  ..
 *  2*9=2 3*9=3... 9*9=81
 */

public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) 
		{
			for(int j=2;j<=9;j++)
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
		}
		System.out.println();
	}	

}
