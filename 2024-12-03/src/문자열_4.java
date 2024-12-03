
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello Java";
		String s2="Hello Java";//s1과 s2는 같은 주소이다. String 자체가 주소이기 때문에
		String s3=new String("Hello Java");//new가 들어가면 새로운 주소를 할당한다.
		//equalsIgnoreCase =>대소문자 구분이 없이 비교
		//나머지 String모든 메소드는 대소문자를 구분
		if(s1.equals(s3))// ==은 메모리 주소 비교
		{
			//equals 는 저장되어 있는 문자열이 같은지 확인
			//메모리 주소보다는 문자열 자체를 비교
			System.out.println("s1==s3");
			
		}
		else
		{
			System.out.println("s1!=s3");
		}
	}

}
