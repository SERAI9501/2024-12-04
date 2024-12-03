/*
 *  가위바위보 게임을 10번 수행 => 5승 1부 3패
 */
import java.util.Scanner;
public class 제어문_반복문_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,same=0,lose=0;
		
		int i=1;
		Scanner scan=new Scanner(System.in);
		while(i<=10)
		{
			System.out.println("===="+i+"번째 게임====");
			// com는 가위 바위 보 설정
			int com=(int)(Math.random()*3);
			// 사용자 가위 바위 보 
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("잘못된 입력입니다!!");
				//처음부터 다시 게임을 시작한다..
				continue; // => 조건식으로 이동 // 컨티뉴 밑에는 코딩하면 안된다.
				//break면 종료=> 단for이면=> 증가식으로 이동
			}
			// 누가 이겼는지 확인
			System.out.print("컴퓨터:");
			if(com==0)
				System.out.println("가위");
			else if(com==1)
				System.out.println("바위");
			else if(com==2)
				System.out.println("보");
			
			//사용자 확인
			System.out.print("사용자:");
			switch(user)
			{
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
			}
			int result=com-user;
			/*
			 *  com : 가위(0)
			 *   사용자 :가위(0) =>0
			 *         바위(1) => 1
			 *         보(2) =>2
			 *  com : 바위(1) 
			 *   사용자 :가위(0) =>-1
			 *         바위(1) =>0
			 *         보(2) =>1
			 *  com : 보(2)
			 *   사용자 :가위(0) =>-2
			 *         바위(1) =>-1
			 *         보(2) =>0
			 */
			if(result==-1 || result==-2)
			{
				lose++;
				System.out.println("컴퓨터 win!!");
			}
			else if(result==1 || result==2)
			{
				win++;
				System.out.println("사용자 win");
			}
			else if(result==0)
			{
				same++;
				System.out.println("사용자 win");
			}
			System.out.print("게임을 종료할까요?(y/n)");
			char c=scan.next().charAt(0);
			if(c=='y')
			{
				System.out.println("게임을 종료합니다!!");
				break;
			}
			
			//사용자가 이기는 경우 => -1, 2
			//컴퓨터가 이기는 경우 => 1, -2
			//비기는 경우 => 0
			i++;
		}//for == while , 다중조건문 == switch~case
	}

}
