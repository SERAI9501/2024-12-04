
// => 정수 2개 => 사용자 요청 => 계산
//            + , - , * , /
//간단한 계산기 (사칙연산만 사용)
import java.util.Scanner;
public class 자바제어문_단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자 입력(+(43,-(45),*(42),/(47)):");
		char op=(char)scan.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(op);

		System.out.println((int)'+');
		System.out.println((int)'-');
		System.out.println((int)'*');
		System.out.println((int)'/');
	}

}
