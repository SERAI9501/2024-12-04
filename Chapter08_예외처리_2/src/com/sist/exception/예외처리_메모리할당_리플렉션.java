package com.sist.exception;
class Movie
{
	public void display()
	{
		System.out.println("Movie:display() Call...");
	}
}
public class 예외처리_메모리할당_리플렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Movie m=new Movie();
//		m.display();
		
		try
		{
			Class classname=Class.forName("com.sist.ecxeption.Movie");
			Object obj=classname.getDeclaredConstructor().newInstance();
					
			Method[] methods=classname.getDeclaredMethods();
			
			methods[0].invoke(obj, null);
		}catch (Exception ex)
		{
			
		}
	}

}
