package com.sist.main;
/*
 *  Collection Framework
 *  1) 다수의 데이터를 쉽고 효율적으로 처리가 가능하게 만든
 *     ---------
 *     표준화된 클래스 집합(자바에서 지원 라이브러리)
 *  2) 자료구조 => CRUD (읽기 / 추가 / 삭제 / 수정)
 *  3) 배열의 단점 보완 => 고정 => 가변
 *     => 동적으로 변환 (메모리 추가,삭제 자동 조절)
 *  4) 단점 => 모든 데이터를 저장할 수 있다
 *            ------- 제어하기 어렵다 (Object)
 *            | 한가지 데이터만 저장해서 사용하는 것을 권장
 *              --------------
 *              | 제네릭이다.
 *  => 제네릭
 *     1) 데이터형 통일화 (Object => 원하는 데이터형으로 변경)
 *     2) 소스가 간결하다
 *     3) 어떤 데이터를 저장하는지 확인이 가능 (명시적)
 *     4) 형변환이 필요없다
 *     5) 컬렉션에서 주로 사용
 *     6) 제네릭을 지정시에는 반드시 클래스형으로만 사용이 가능
 *        => 기본형은 사용 할 수 없다
 *           ----------------- 자바에서 지원하는 Wrapper 클래스를 사용해야 한다.
 *           Wrapper : 기본형을 클래스화 시켜줌
 *           형식) List<int> => X
 *               List<Integer>
 *               List<double => List<Double>
 *             => T / E / K / V
 *                            value => Object
 *                        key => 문자열
 *                    element => 클래스를 의미
 *                type => 클래스
 *                
 *               class Box<T>
 *               {
 *               	T t;
 *               	public void setT(T t)
 *               	{
 *               	}
 *               	public T getT()
 *               	{
 *               		return t;
 *               	}
 *               }
 *               
 *               Box box=new Box(); => T (object)
 *               Box<String> box new Box<String>() => T => String
 *               => T가 한번에 지정된 데이터형으로 변경
 *               => 사용자 정의 클래스로 변경
 *               Box<Sawon> => T =>
 *               
 *               컬렉션이 뭔가 제네릭스가 뭔지
 *               
 *               Collection => interface
 *                 |
 *    ----------------------------------------
 *    |                     |                |
 *    List                 Set              Map
 *    순서가 있다            순서가 없다          Key,value를 동시에 저장
 *    (인덱스)              데이터 중복X         Key는 중복이 없다/중복하면? 덮어씌워진다
 *    데이터 중복허용                           value는 중복이 가능
 *    |
 *    구현된 클래스
 *    => ***ArrayList
 *       데이터베이스 : 목록
 *       => 브라우저로 전송
 *       => 웹
 *    => LinkedList
 *       수정 /삭제 / 추가시 속도가 빠르다
 *       => 일반 윈도우에 게시판 만들기 등
 *       => 예제
 *    => Vector
 *       동기화 => 네트워크
 *       => Vector를 보완한 클래스
 *          ArrayList
 *    => 같은 기능을 가지고 있다
 *       ----------------
 *       add() : 추가
 *       set() : 수정
 *       get() : 읽기
 *       remove : 삭제
 *       ---------------- 이 4가지를 CRUD라 한다/4가지를 가지고 있는 것을 자료구조라 한다.
 *                       Create / Read / Update / Delete
 *             오라클에서는? INSERT  SELECT  UPDATE  DELETE
 *       size() : 저장 갯수
 *       isEmpty() : 저장된 데이터가 있는지 확인
 *       clear() : 전체 삭제
 *       ----------------------------------
 *       addAll() => 다른 List,Set에 있는 데이터를 복사
 *       subList / retain / contains() ....
 *       ----------------------------------
 *        => 오라클 : MINUS / INTERSECT / UNION / UNIONALL
 *        
 *     Set
 *      ***=> HashSet
 *      
 *      => TreeSet
 *      1) List에 데이터중에 중복을 제거할때 사용됨
 *         ------------------------------ DITINCT(오라클에서는 SET보다 이 명령어를 주로 사용한다)
 *      2) 순서가 없다 = 인덱스가 없다
 *      3) 데이터 중복을 허용하지 않는다
 *        => id / 장바구니 등을 만들 때 주로 사용한다
 *           ---------- Map에서도 자주 쓰인다
 *        => 장르 / 부서 / 직위
 *      4) HashSet : 속도가 빠르다
 *         TreeSet : 정렬 / 검색
 *      5) 주요 메소드
 *         add() : 추가
 *         remove() : 삭제
 *         clear() : 전체 삭제
 *         iterator() : 한번 데이터를 모아서 출력
 *         ----------
 *         headSet() / tailSet()
 *         ---------- 최신방문
 */
//클래스를 모을때 인터페이스 중에서 Map을 활용하는게 좋다.

// set의 단점 객체 저장 => 재정의
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
// setter/getter/hashCode/equlas를 @Data가 재정의 해준다
class Sawon
{
	private int sabun;
	private String name;
//	public int getSabun() {
//		return sabun;
//	}
//	public void setSabun(int sabun) {
//		this.sabun = sabun;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Sawon(int sabun, String name) {
//		super();
//		this.sabun = sabun;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return (sabun+name).hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Sawon)
//		{
//			Sawon s=(Sawon)obj;
//			return name.equals(s.name)&& sabun==s.sabun;
//		}
//		return false;
//	}
	
}
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon(1,"홍길동"); //객체 생성
		Sawon s2=new Sawon(1,"홍길동");
		// => 같게 만드려면 hashCode(), equlas() 재정의 해야한다.
		Set<Sawon> set=new HashSet<Sawon>();
		System.out.println();
		System.out.println();
		set.add(s1);
		set.add(s2);
		System.out.println("저장 갯수:"+set.size());
		
		/*
		 *  HashSet<Sawon> set=
		 *  new HashSet<Sawon>
		 *  
		 *  Set<Sawon> set=new HashSet<Sawon>();
		 *  ==== 인터페이스
		 *  ==== 유연성
		 *  set=new TreeSet<Sawon>();
		 *  
		 *  //ArrayList<String> list=
		 *  //new ArrayList<string>();
		 *  LinkedList<String> list=
		 *  new LinkedList<String>();
		 *  List<String> list=
		 *  new AarryList<String>();
		 */
	}

}
