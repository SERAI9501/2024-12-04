import java.util.Scanner;
// toString() : 객체의 주소 => 오버라이딩
/*
 *  length()
 *  substring()
 *  equals()
 *  contains()
 *  indexOf() / lastIndexOf()
 *  valueOf()
 *  trim()
 *  -------------------------
 *  replace()
 *  -------------------------
 *  split()
 *  ------------------------- 필요적으로 암기
 *  AI ==> 데이터 수집 ==> 데이터 분석 => 교육
 *         ------- 전처리기
 */
public class 문자열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//(   startsWith         ) : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)

//(   endsWith          ):문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)

//(     equals        ):두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
		
//(     indexOf       ):지정한 문자가 문자열에 몇번째에 있는지를 반환한다.

//(     lastIndexOf       ):문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.

//(   length         ):문자열의 길이를 반환한다.
		
//(   replace        ):문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
		
//(    replaceAll       ):정규표현식을 지정한 문자로 바꿔서 출력한다.
		
//(           ):지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
		
//(    substlength            ):문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)

//(     toUpperCase            ):문자열에 대문자를 소문자로 변환한다.

//(      toLawerCase            ):문자열에 소문자를 대문자로 변환한다.
		
//(    trim        ):문자열에 공백을 없에준다.

//(            ):지정한 개체의 원시 값을 반환

//(        contains          ):두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.

//(                  ):지정한 index번째에 문자를 반환한다.

//1. 대소문자가 있는 문자열을 입력받아서 대문자는 소문자로 소문자는 대문자 변경
//		System.out.println("대소문자를 입력하시오:");
//		String a1=scan.nextLine();
//		while(true)
//		{
//			if
//			System.out.println();
//		}
		
//		System.out.print("영문 입력:");
//		String msg=scan.next();
//		System.out.println("변경 전:"+msg);
//		String change="";
//		for(int i=0;i<msg.length();i++)
//		{
//			char c=msg.charAt(i);
//			if(c>='A' && c<='Z')
//			{
//				
//			}
//		}
//		
		
		
		
//2. 문자열을 입력받아서 역순으로 출력하는 프로그램 작성
//		System.out.print("영문 입력:");
//		String msg=scan.next();
//		
//		for(int i=msg.length()-1;i>=0;i--)
//		{
//			System.out.print(msg.charAt(i));
//		}



	}

}
