// char
// 버블 정렬
/*
 *  char => 문자열은 불가능
 *          ==== compare() / equals()
 *                 > <
 *    => 정수형 취급한다
 *       연산자를 사용하면 정수로 변경
 *       'A' <'B'
 *       =>65<66
 *       
 *       B C A E D
 *       
 *       i=0
 *       B C A E D
 *       - -
 *       C B
 *       -   -
 *       C   A
 *       -     -
 *       E     C
 *       -       -
 *       E       D
 *       -----------
 *       (E) B A C D
 *       i=1
 *       (E) B A C D
 *           - -
 *           B A
 *           -   -
 *           C   B
 *           -     -
 *           D     C
 *       (E D) A B C
 *       i=2
 *       (E D C) B A
 *       i=3
 *       (E D C B) A => length-1  
 *       i=4
 *       종료
 *       int a1~a10;
 *       max
 *       if(max<a1) => 3개이상 한개의 변수명으로 제어
 *                           ------------ 배열
 *                           arr[0] ~ arr [9] 
 */
import java.util.Arrays;
public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		char[] arr=new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
			// Math.random()*26 0!26 + 65
		}
		System.out.println("정렬 전:");
		for(char c:arr)
		{
			System.out.println(c+" ");
		}
		System.out.println("\n정렬 후:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
							arr[j]=temp;
				}
			}
			System.out.println((i+1)+"round:"+Arrays.toString(arr));
			
		}
		
	}

}
