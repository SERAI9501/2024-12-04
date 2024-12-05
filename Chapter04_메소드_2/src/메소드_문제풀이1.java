import java.text.ChoiceFormat;

import java.util.Scanner;
public class 메소드_문제풀이1 {
//	
//	1.1~10까지 출력하는 메소드를 구현하시오 / 매개변수 x , 리턴형 x
	
//	static void print()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i+" ");
//		}
//	}
//
//	2.1~10까지 합을 구하는 메소드를 구현하시오
//	static int print2()
//	{
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
//	
//	3.1~n까지 합을 구하는 메소드를 구현하시오
//	static int print3(int n)
//	{
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
//	static int print3(int n)
//	{
//		int sum=0;
//		for(int i=0;i<n;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
//	
//	4.두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
//	static String print4(int a,int b)
//	{
//		if(b==0)
//			return "0으로 나눌수 없다";
//		return String.valueOf(a/(double)b);
//	}
	// 메소드 종료 => 메소드안에서 return은 여러개 사용이 가능
	/*
	 *  메소드가 종료하는 시점은 return
	 *  반복문은 break
	 *  =>메소드는 원하는 위치에서 종료가 가능하다
	 *  
	 *  => 입력이 안된 경우
	 */
//	
//	5.문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
//	static void change(String s)
//	{
//		//자체에서 처리 => 영역에서 출력
//		s=s.toUpperCase();
//		System.out.println(s);
//	}
//	static String change2(String s)
//	{
//		return s.toUpperCase();
//	}
//	6.문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오.[코딩테스트 자주 나옴]
	/*
	 *  경우의 수 : 3개
	 */
//	static String change3(String s)
//	{
//		if(s.length()%2!=0)
//			return "문자열 갯수가 짝수이여야 합니다";
//		String res="";//둘중에 한개만 전송
//		boolean bCheck=true;
//		
//		for(int i=0;i<s.length()/2;i++)
//		{
//			char start=s.charAt(i);
//			char end=s.charAt(s.length()-1-i);
//			if(start!=end)
//			{
//				bCheck=false;
//				break;
//			}
//		}
//		if(bCheck==true)
//			res="좌우대칭 입니다";
//		else
//			res="좌우대칭이 아닙니다";
//		return res;
//	}
//	
//	7.문자열을 거꾸로 출력하는 메소드를 구현하시오
//	static void reverse(String s)
//	{
//		System.out.println(new StringBuilder(s).reverse());
//	}
//	static void reverse(String s)
//	{
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//	}
//	
//	8.학점을 구하는 메소드를 구현하시오
//	static void hakjum(int kor)
//	{
//		char c='A';
//		switch(kor/10)
//		{
//		case 10: case 9:
//			c='A';
//			break;
//		case 8:
//			c='B';
//			break;
//		case 7:
//			c='C';
//			break;
//		case 6:
//			c='D';
//			break;
//			default:
//				c='F';
//		}
//		System.out.println("학점"+c);
//	}
//	static void hakjum2(int kor)
//	{
//		double[] limit= {50,60,70,80,90};
//		String[] grade= {"F","D","C","B","A"};
//		ChoiceFormat cf=new ChoiceFormat(limit, grade);
//		System.out.println(cf.format(kor));
//	}
//	   java.text => DecimalFormat => 1,000,000,000
//	                SimplDateFormat => 날짜변환
//	                ChoiceFormat => 값 선택
//	                MessageFormat => 오라클 insert 형식 만들때
	//학점 구하는 메소드
	//평균을 구하는 메소드
	//총점을 구하는 메소드
	//순위를 구하는 메소드
//	static int[] display()
//	{
//		int[] arr= {10,20,30};
//		return arr;
//	}// Call By Reference 
//	static void display2(int[] arr)
//	{
//		arr[0]= 10;
//		arr[1]= 20;
//		arr[2]= 30;//선언하고 쓰는 방식
//	}
//	
//	//=>입력을 하는 메소드
//	static int input(int[] kor,int[] eng,int[] math)
//	{
//	for(int i=0;i<kor.length;i++)
//	{
//		System.out.print((i+1)+" 학생 국어 점수:");
//		kor[i]=scan.nextInt();
//		
//		System.out.print((i+1)+" 학생 영어 점수:");
//		eng[i]=scan.nextInt();
//		
//		System.out.print((i+1)+" 학생 수학 점수:");
//		math[i]=scan.nextInt();
//	}
//	}
//	static int sum(int kor,int eng,int math)
//	{
//		return kor+eng+math;
//	}
//	static double avgs(int total)
//	{
//		return total/3.0;
//	}
	//=>결과출력
	//=>조립
//	
//	9.년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오.
//	
//	10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
//	
//	11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
//	
//	12. 3의 배수를 판별하는 메소드를 구현하시오
//	static int (int a)
//	{
//		int a=scan.nextInt();
//		if(a%3==0)
//		{
//			System.out.println("3의 배수가 맞습니다.");
//		}
//		else
//		{
//			System.out.println("3의 배수가 아닙니다.");
//		}
//		return a;
//	}
//	
//	13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
//	
//	14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print();
//		hakjum2(80);
//		Scanner scan=new Scanner(System.in);
//		String ss=change3("abba");
//		reverse("safsfasfd");
//		change("dsaSDF");
		
//		print();
//		String print4(10, 3);
//		System.out.print("첫번째 정수 입력:");
//		int num1=scan.nextInt();
//		
//		System.out.print("두번째 정수 입력:");
//		int num2=scan.nextInt();
		//메소드는 리턴형과 매개변수를 어떻게 할 것인지.
		//3명의 국어,영어,수학, 점수를 받아서 학점,평균,총점,순위를 출력
//		int[] kor=new int[3];
//		int[] eng=new int[3];
//		int[] math=new int[3];
//		int[] total=new int[3];
//		char[] score=new char[3];
//		double[] avg=new double[3];
//		int[] rank=new int[3];
//		Scanner scan=new Scanner(System.in);
//		// 국어 영어 수학 입력
//		
//			total[i]=kor[i]+eng[i]+math[i];
//			avg[i]=total[i]/3.0;
//		
//		//출력
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.printf("%-5d-5d%-5d-7.2f%=5d\n"
//					,kor[i],eng[i],math[i],avg[i],total[i]);//구분자로 쓰려고 -5
//			
//		}	
//		/*
//		 * 주소값이 전송되면 => 해당주소에 값을 채운다
//		 * 얕은 복사
//		 * 
//		 * int[] arr=new int[3];
//		 * int[] arr2=arr;
//		 * => 메모리 주소가 같은 경우에는 같은 메모리를 제어 위 방법이 같은 콜 바이 레퍼런스 라고 불린다. 같은 주소를 사용하기 때문이다.
//		 */
////			int [] arr=new int[3];
////			display2(arr);
////			int[] arr=display();
////			for(int i=0;i<arr.length;i++)
////			{
////				System.out.println(arr[i]);
////			}
//		 int[] arr= {10,20,30};
//		 int[] a=arr;//별칭 => arr대신 => a라는 이름으로 사용하겠다
//		 a[0]=1000;
//		 a[1]=2000;
//		 a[3]=3000;
//		 System.out.println("arr="+arr);
//		 System.out.println("a="+a);
		 //매개변수 전송=> 값만 전송 (복사본)
//		                ------ 기본형 , String(일반 기본형 취급 => Call By Value
		 //매개변수 전송 => 메모리 주소값 전송 (원본) => Call By Reference
		 //             ---------- 배열 / 클래스
		 //매개변수명 => 별칭 => 얕은복사
		
		//총점
//		(for int i=0;i<total.length;i++)
//		{
//			total[i]=sum()
//		}
//		for(int i=0;i<avg.length;i++)
//		{
//			avg[i]=avgs(total[i]);
//		}
}
}
