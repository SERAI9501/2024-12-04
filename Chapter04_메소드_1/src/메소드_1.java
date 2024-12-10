/*
 * 1.객체지향 프로그램
 *   기능별 분리해서 클래스와 클래스간의 연결해서 처리
 *                              ---------- 메소드(클래스와 클래스같의 소통하기 위해 만듬)
 *   => 조립식 기능별로 나눠놨을뿐이지 따로 있는것 아니다.	
 *   예) 컴퓨터
 *     CPU / 하드디스크 / 모니터 / 메모리 ...
 *     --------------------------------- 클래스
 *     메인보드에 조립
 *     -----------
 *    => 클래스
 *        1) 사용자 정의 데이터형 => 데이터형 클래스
 *                             ------------
 *                             => 관련된 데이터를 모아서 관리
 *                             => ~VO, ~DTO
 *        2) 한개의 기능 (메소드) => 액션 클래스
 *                             => 데이터를 활용하는 메소드
 *                             => ~DAO , ~Model
 *     =>JSP => 사라지는 경향
 *     => Front / Back
 *         |       |
 *                Spring=Boot
 *       VueJs ==> 소규모
 *       **ReactJs ==> 대규모 => 최적화 NextJS
 *       --------- 개인 프로젝트
 *       => 스타트업 : 5인 => 500
 * class ClassName
 * {
 *   구성요소
 *   ----------------------
 *    **변수 : 멤버젼수 , 공유변수 => 다른 클래스에서 사용이 가능
 *     기본형(정수,실수,논리,문자,문자열,배열)
 *   ----------------------
 *    생성자 : 멤버변수에 초기화 , 시작과 동시에 처리 기능
 *           => 자동 로그인 , 데이터베이스 연결 ,
 *           => 서버연결(1:1채팅시)
 *           => 메모리 저장시 호출
 *   ----------------------
 *    **기능 설계 => 메소드
 *   ----------------------
 *   
 *   메소드
 *    => 정의 : 한개의 기능을 수행하는 명령문의 집합
 *            ---------
 *            => 조립 : process
 *            => main에서 코딩을 하지 않는다.
 *              =>process()만 호출
 *            => 로그인 처리 / 회원 가입 / 회원 수정 / 회원 탈퇴
 *            => 목록 / 글쓰기 / 상세보기 / 수정 / 삭제 / 검색
 *    => 1. 반복적인 문장이 있는 경우 (반복 제거)
 *      예) 오라클 연결
 *         ---------
 *         목록 읽기 기능
 *         오랔르 연결
 *         목록 읽기
 *         오라클 닫기
 *         
 *         글쓰기 
 *         오라클 연결
 *         글쓰기
 *         오라클 닫기
 *         
 *         상세보기
 *         오라클 연결
 *         글쓰기
 *         오라클 닫기
 *         \2_.명령문을 기능별 =:얀믹알 ; >하==탕
 *           =가독성 : 보
 *           기가벽ㅇ====
 *           유지보수
 *           데이터 저장 => 저장된 데이터 가공 =>  => 데이터 출력
 *           |변수
 *           
 *           배열
 *           
 *           메소드 구성요소
 *           1_ 결과 =값 5ㅏ됻2ㅏ 됴얻데 #ㅏ가 결과값 추출 (리턴형)
 *            Matn.random() => 난수를 추출
 *           2 사용자 요청 : 매개변수
 *             예) 로그인 => id,pwd
 *                + [ㅖ ㅑid
 *                
 *           3 메소드명 => 가능에 맞게 이름부여
 *           =         =>plus() , minus()
 *                     =>변수 식별자와 동일
 *                     1)알파벳, 한글 => 알파벳 대소문자 구분
 *                     2)숫자 사용 가능 => 앞에 사용 할 수 있다   
 *                     3)키워드는 사용이 불가능
 *                     4)특수문자 사용 => $ , _
 *                     5)공백이 있으면 안된다
 *                     6)=>문법 사항은 아니다 => 소문자로 시작한다
 *                     
 *             메소드 형식 : 선언부 / 구현부
 *             [접근지정어][옵션] 리턴형 메소드명(매개변수...)//선언부
 *                                         --------
 *                                         여러개 사용이 가능
 *                        |     | 기본형|배열|클래스 => 결과값은 반드시 1개 사용이 가능
 *                        static|final|abstract
 *                        ------ ----- --------
 *                         |자동 메모리 저장 |종단 |선언만
 *             public|private|protected|default
 *               |       |       |         |
 *                                       같은 폴더
 *                             같은 폴더|상속
 *                     자신의 클래스
 *               모든 클래스
 *             {
 *               구현부
 *               return 값 => 결과 값
 *             }
 *             -------------------
 *               리턴형 매개변수
 *             ----------------------
 *               1) O      O
 *                String substring(int begin)
 *                  |리턴형              |매개변수
 *             ------------------------
 *               2) O      X
 *               double random()
 *              -------      --- 
 *             -----------------------
 *               3) X      O
 *                void println(String s)
 *                ---- 결과값 없다
   *             ------------------------
 *               4) X      X(사용빈도는 거의 없다)
 *                 void System.out.println()
 *               ------------------------
 *               3),4) 결과값을 자체에서 출력
 *               =결과값을 받아서 출력
 *               =메소드안에서 출력
 *               =return => void 는 => void 생략이 가능
 *               
 *    자동생성
 *    -----
 *    impirt java.loan.*=> String,System...
 *    =>메소드  void일경우에 생략을 하면 자동 첨부 
 *           
 *    메소드는 반드시 호출을 해야 사용이 가능
 *    void display()
 *    int display()
 *    int display(int a)
 *    void display(int a,int b)
 *    
 *    호출하는 방법
 *    public static void main(String[]  arg)
 *    {
 *    display();
 *    
 *    int a=display();
 *    
 *    int a=display(10);
 *    
 *    display(10,20);
 *    }
 * 
 * 
 */
public class 메소드_1 {
//	4) 리턴형 / 매개변수가 없는 경우
	//=> 메소드안에서 구구단을 출력
	static void gugudan()
	{
		 // void => 메소드 안에서 출력 => 전체 처리를 한다.
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++) {
				System.out.println("%2d%*%2d=%2d\t");
			}
		}System.out.println();
	}
	public static void main(String[] args) {
		gugudan();
		// TODO Auto-generated method stub
		return;//컴파일시에 return이 없는 경우에는 자동으로 생성
		//return => 메소드 종료
	}

}
