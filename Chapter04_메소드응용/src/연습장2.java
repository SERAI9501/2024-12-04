import java.util.Scanner;
public class 연습장2 {
	static int input(String c)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(c+"입력:");
		int a=scan.nextInt();
		return a;
	}	
	
	static void process() {
		int d=input("년도");
		int f=input("월");
		int week=weeek(d,f);
		print(d,f,week);
	}
	static int weeek(int a, int b)
	{
		
		int total=(a-1)*365+
				(a-1)/4-
				(a-1)/100+
				(a+1)/400;
		int[] lastday={31,28,31,30,31,30,
				31,31,30,31,30,31};
		if((a%4==0 && a%100!=0||a%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<b-1;i++)
		{
			total+=lastday[i];
		}
		total++;
		
		int week=total%7;
		return week;
	}
	static void print(int a,int b,int week)
	{
		String[] c= {"일" ,"월" ,"화" ,"수" ,"목" ,"금" ,"토"};
		System.out.println(a+"년도"+" "+b+"월");
		int[] lastday={31,28,31,30,31,30,
				31,31,30,31,30,31};
		for(int i=0;i<c.length;i++)
		{
			if(i==0)
			System.out.print(c[i]+"\t");
			else
				System.out.print(c[i]+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[b-1];i++) 
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)//해당 요일까지 공백주기
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
				
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int a=scan.nextInt();
//		System.out.print("월 입력:");
//		int b=scan.nextInt();
//		
//		String[] c= {"일" ,"월" ,"화" ,"수" ,"목" ,"금" ,"토"};
//		int total=(a-1)*365+
//				(a-1)/4-
//				(a-1)/100+
//				(a+1)/400;
//		int[] lastday={31,28,31,30,31,30,
//				31,31,30,31,30,31};
//		if((a%4==0 && a%100!=0||a%400==0))
//			lastday[1]=29;
//		else
//			lastday[1]=28;
//		for(int i=0;i<b-1;i++)
//		{
//			total+=lastday[i];
//		}
//		total++;
//		
//		int week=total%7;
//		System.out.println(a+"년도"+" "+b+"월");
//		for(int i=0;i<c.length;i++)
//		{
//			if(i==0)
//			System.out.print(c[i]+"\t");
//			else
//				System.out.print(c[i]+"\t");
//		}
//		System.out.println();
//		for(int i=1;i<=lastday[b-1];i++) 
//		{
//			if(i==1)
//			{
//				for(int j=0;j<week;j++)//해당 요일까지 공백주기
//				{
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
//				
//			week++;
//			if(week>6)
//			{
//				week=0;
//				System.out.println();
//			}
//		}
		
	}

}
