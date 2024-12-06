import java.util.Scanner;
public class 연습장 {
	//1. 입력 년도, 달
	static int input (String a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(a+" 입력:");
		return scan.nextInt();
	}
	static int caw(int year,int month)
	{//2. 해당 년도랑 해당달의 1일의 요일을 알아야함
	
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
	
	//요일구하기
	int week=total%7;
	return week;
	}
	
	//3. 달력을 출력해야합니다.
	static void print(int year,int month,int week)
	{
		String[] strWeek= {"일","월","화","수","목","금","토"};
		int[] lastday= {
				31,28,31,30,31,30,
				31,31,30,31,30,31};
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
	//4. 조립
	static void process() 
	{
		int year=input("년도");
		int month=input("월");
		int week=caw(year, month);
		print(year,month,week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	String b = "년도";
//	input(b);
//	스트링 b는 년도야
//	input(b)는 메소드를 실행하는데 안에 들어간거는 년도가 들어가있어
//	a=년도야
		process();
	}
}