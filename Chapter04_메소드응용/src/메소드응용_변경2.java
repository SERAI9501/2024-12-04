import java.util.Scanner;

public class 메소드응용_변경2 {
	static int Input(String b)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(b+" 입력:");
		int a=scan.nextInt();
		return a;
	}	
	
	static void process()
	{
			int year=Input("년도");
			int month=Input("월");
			
			int week=getweek(year,month);
			print(week,year,month);
			
	}
	static int getweek(int year, int month)
	{
		
		//요일 구하기
		//1. ~전년도까지 총 날수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2. 전달까지 총 날수
		int[] lastday= {
			31,28,31,30,31,30,
			31,31,30,31,30,31
		};//각 달의 마지막 날
		if((year%4==0 && year%100!=0||year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		//3. +1
		total++;
		int week=total%7;
		
		return week;
	}
	static void print(int week, int year,int month)
	{
		int[] lastday= {
				31,28,31,30,31,30,
				31,31,30,31,30,31
			};
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도"+" "+month+"월");
		for(int i=0;i<strWeek.length;i++)
		{
			if(i==0)
			System.out.print(strWeek[i]+"\t");
			else
				System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) 
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
		process();
	}

}
