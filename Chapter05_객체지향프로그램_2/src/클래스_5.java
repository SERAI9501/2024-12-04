/*
 *  멤버변수의 초기화
 *  = 생성자 => 인스턴스 변수 , static 변수의 초기화
 *   => 반드시 호출 해야 한다.
 *  -------------------------------------------
 *  = 인스턴스 블럭 => 인스턴스 변수 , static 변수의 초기화
 *  = static 블럭 => static 변수의 초기화만 가능
 *  ---------------------------------호출없이 자동 처리
 *  -----------> 멤버의 초기화 , 시작 동시에 처리 하는 기능
 *               구현이 가능 , 상속은 예외가 된다
 *               
 *  => 기본 초기화 => 명시적 초기화 => static블럭 => 인스턴스 블럭 => 생성자
 *                     |          |static변수 초기화|         |
 *                     -------------------------------------- 동시에 사용하는 것은 없다
 *  생성자로 바뀌는 거니 굳이 생성자로 초기화 할거면 다른건 할 필요가 없다.
 *  => 우선시 명시적 초기화 가능
 *  => 불가능 => 생성자 ,static블럭을 이용한다
 *  =>--------------------------------
 *    구현 때문에 난수값 5개 사용을 못한다. 명시적 초기화를 한다면 사용 가능
 *  => int[] arr=new int[5];
 *     난수값 5개를 초기화
 */
class Movie
{
	int movieNo=1;//명시적 초기화
	static int id=1;
	{//인스턴스 블럭
		System.out.println("인스턴스 블럭 진입");
		movieNo=2;
		System.out.println("movieNo변수 저장 완료!!");
	}
	Movie()
	{
		System.out.println("생성자 호출!!");
		movieNo=3;
		System.out.println("생성자에서 movieNo 저장 완료");
	}
	static
	{
		System.out.println("static 블럭 진입...");
		id=100;
		System.out.println("저장완료");
	}
}
public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		System.out.println(m.movieNo);
		System.out.println(Movie.id);
		//stataic은 메모리 할당이 필요없다 => 생성자 호출이 필요없다
	}

}
