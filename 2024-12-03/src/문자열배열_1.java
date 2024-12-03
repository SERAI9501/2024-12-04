/*
 *  변수 => 데이터를 모아서 관리 => 배열 / 클래스
 *  연산자 / 제어문
 *  => 연산자 응용 => 제어문
 *  => 제어문 응용 => 배열
 *  => 배열 응용 => 메소드
 *  => 메소드 => 클래스
 *  => 클래스 => 라이브러리
 *  ------------------------------------
 *  =>처리하는 기능이 많은 경우 => 소스코딩이 많다 // 소스가 많은 경우 가독성 때문에 단락을 나누는것을 메소드 라고 한다.
 *                          ---------- 조립하는 과정을 객체지향 프로그램이라고 한다.
 *                          
 *   1) 문자열 => 웹,윈도우 프로그램은 대부분 문자열로 만들어 진다.
 *              가장 많이 사용되는 데이터
 *              문자 여러개를 모아서 저장
 *              --------char[] => String 은 char 배열이다.
 *   2) String : 일반 데이터형 / 클래스형 두가지 다 가능
 *      사용하는 방법
 *      = 일반 데이터형 (가장 많이 사용)
 *        String 변수명="";
 *      = 클래스형
 *        String 변수명=new String("저장 데이터","UTF-8")
 *        ------------------------ 한글변환 (브라우저 => char => 1byte)
 *   3) String의 디폴트는 null (주소가 없는 상태)
 *      => 모든 클래스의 디폴트는 => NullPointerExeption = 저장 안했을시 나타나는 오류
 *   4) String 기능 (메소드)
 *      ** String,Math,Scanner,System는 final class
 *                                     ------------
 *                                     | 변경을 할 수 없다
 *                                     | 있는 그대로 사용
 *                                     | 표준화
 *      ** java.lang.* => import를 생략할 수 있다
 *      = 변환
 *        toUpperCase() : 대문자 변환
 *          => 메소드
 *             결과값 : String
 *             배개변수 : X
 *             메소드명 : tOuPPERcASE
 *             기능
 *             =>String toUpperCase()=> 원형
 *             =>String name=tlUpperCase[]
 *        toLowerCase() : 소문자 변환
 *          String toLowerCase
 *        ***valueOf() : 모든 데이터형을 문자열로 변환
 *        
 *         **오버로딩:같은 이름을 같고 다른 기능을 해주는것
 *        	 String
 *        
 *        ***replace() : 문자,문자열 변환
 *         String replace()
 *         String replace(String old,String new)
 *        replaceAll() : 패턴을 이용한 문자열 변환
 *                       -------- regex (정규식)
 *           String replaceAll(String,
 *      = 문자열 분해
 *        ***substring() : 문자를 자르는 경우
 *         String substring[int begin)]
 *        ***split() : 단어별로 나눠서 배열에 저장
 *        
 *      = 비교
 *        ***equals() : 같은경우에 true( == )
 *        startsWith() : 시작하는 문자열이 같은 경우
 *        boolearn ernW
 *        endsWith() : 끝나는 문자열이 같은 경우
 *        ***contains() : 포함된 문자열
 *        주로 => IF 문에서 사용
 *      
 *      = 위치 찾기
 *        ***indexOf() : 처음부터 찾기 : 문자/문자열
 *        Iint indexOf
 *        int indsOf
 *        ***
 *        cxat9
 *        lastIndexOf() : 끝에서부터 찾기
 *        
 *      = 문자열 결합
 *        concat() : 문자열 결합
 *        String concat
 *          +      : 문자열 결합
 *          
 *      = 기타
 *        ***trim() : 좌우의 공백 제거
 *        String trim()
 *        charAt() :문자 위치=>문자 읽기
 *        toCharArray() : String을 char[]
 *      => 문자열 배열
 *      형식)
 *         string[] arr={"","","",""} => 명시적 초기화
 *         String[] arrsplig();
 *  
 */
import java.util.Scanner;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

String[] nameStrings= {"홍길동","심청이","박문수","이순신","강갑찬"};
		
		System.out.print("이름 입력:");
		String name=scan.next();
		for(String n:nameStrings)
		{
			if(n.equals(name))
			if(n.contains(name))
			{
				//equalsIgnoreCase : 대소문자 구분 없음
				System.out.print(name+" ");
			}
		}
	}

}
