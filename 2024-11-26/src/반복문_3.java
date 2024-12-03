/*
 * ABCD
 * EFGH
 * IJKL
 * MNOP
 * 
 * ABCD
 * ABCD
 * ABCD
 * ABCD
 * 
 * AAAA
 * BBBB
 * CCCC
 * DDDD
 * 
 * #123
 * 1#23
 * 12#3
 * 123#
 * 
 * ★
 * ★★
 * ★★★
 * ★★★★
 * i   j
 * 줄수 별표 => i=j => j=i
 * 1   1
 * 2   2
 * 3   3
 * 4   4
 * 
 * => 정렬 , 빈도수 구하기 => 알고리즘
 * 
 * => 주사위 2개를 던져서 6이 나올 경우수를 출력
 * 
 *     *
 *    **
 *   ***
 *  ****
 *   i=j+1 => j=i-1
 *   i   j  k i+k=5 ==> k=5-i
 *  줄수 공백 별표 
 *  1    3  4
 *  2    2  3
 *  3    1  2
 *  4    0  1
 *  
 *  ****
 *   ***
 *    **
 *     *
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char b='A';
//		for(char i=1;i<=4;i++)
//		{
//			for(char j=1;j<=4;j++)
//				System.out.print(b++);
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i=1;i<=4;i++)
//		{
//			char c='A';
//			for(int j=1;j<=4;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		char c='A';
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				System.out.print(c);
//			}
//			c++;
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				if(i==j)
//					System.out.print("#");
//				else
//					System.out.print(j);
//			}
//			
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//			
//		}
//		System.out.println();
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=6;j++)
//			{
//				if(i+j==6)
//				{
//					//System.out.println("["+i+","+j+']');
//					System.out.printf("[%d,%d]\n",i,j);
//				}
//			}
//		}
		for(int i=1;i<=4;i++)
		{
			System.out.println();
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
				System.out.print("*");
			for(int k=1;k<=4;k++)
			{
				
			}
			}
		}
		for(int i=1;i<=4;i++)
		{
			System.out.println();
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
				System.out.print("*");
			for(int k=1;k<=5-i;k++)
			{
				
			}
			}
		}
	}
	

}
