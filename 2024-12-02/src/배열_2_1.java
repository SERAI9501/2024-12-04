
public class 배열_2_1 {
		public static void main(String[] args) {
		char[] alpha=new char[26];
		char c='A';
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c++;
		}
		for(char cc:alpha)
		{
			System.out.print(cc+" ");
		}
		System.out.println();
		int index=0;
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]=='Z')
			{
				index=i;
				break;
			}
		}
		System.out.println("Z 의 위치는 "+index);
}
}
