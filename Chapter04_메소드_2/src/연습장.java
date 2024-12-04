import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a<=0 || a>=12)
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
