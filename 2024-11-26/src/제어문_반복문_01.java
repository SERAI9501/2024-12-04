/*/
 * while / do while
 *             | 반드시 한번 이상 수행시에 주로 사용 => 자바에서 사용빈도 없음
 *   | 반복 횟수가 없는 경우에 주로 사용
 *  반복 제어문
 *   |
 *    break : 반복 종료
 *    continue : 특정부분을 제외
 *    ======== for : 증가식으로 이동 / while : 조건식으로 이동
 *                                ------ continue는 처음부터 다시 시작 할 때
 *                                
 *   형식)
 *   while
 *   
 *   초기식----------1
 *   while(조건식)---2 = true : 반복문장 수행, false : 종료
 *   {
 *    반복 실행 문장---3
 *    증가식---------4
 *   }
 *   do while : while을 보완
 *   초기식---------1
 *   do
 *   {
 *    반복 실행문장---2
 *    증가식--------3
 *   }while(조건식)-4=>2번으로 이동(true)
 *                   false면 종료
 */
public class 제어문_반복문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		System.out.println("==========for========");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			/*
			 *  i=1 i<10=>1 i++ => i=2
			 *  i=2 i<10=>1 i++ => i=3
			 *  ...
			 *  ...
			 *  i=9 i<10=>1 i++ => i=10
			 *  i=10 i<10=>1 =>종료
			 */
		}
		System.out.println("\n========while========");
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
			
		}
		System.out.println("\n===== do~while======");
		do
		{
			System.out.print(i+" ");
			i++;
			//증가된 값을 조건으로 검색
		}while(i<=10);
	}

}
