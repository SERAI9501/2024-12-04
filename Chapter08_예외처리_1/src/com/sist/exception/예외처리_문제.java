package com.sist.exception;

public class 예외처리_문제 {
//	문제 1
//
//	다음 중 인터페이스의 장점이 아닌 것은? (390page 참조) e
//
//	a. 표준화를 가능하게 해준다.
//	b. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
//	c. 독립적인 프로그래밍이 가능하다.
//	d. 다중상속을 가능하게 해준다.
//	e. 패키지간의 연결을 도와준다.
//
//	문제 2
//
//	다음 중 틀린 것은? a
//
//	a. 필드는 초기화하지 않아도 된다.
//	b. 클래스에 생성자가 없어도 된다.
//	c. 생성자는 일반적으로 필드를 초기화한다.
//	d. 필드는 생성자보다 먼저 선언해야 한다.
//
//	
//	문제 3
//
//	상속을 설명한 것이다. 틀린 것은? b
//	 
//	a. 모든 클래스의 최상위 클래스는 Object이다.
//	b. 부모 객체를 자식 클래스 타입의 변수에 대입할 수 있다.
//	c. 부모 클래스의 private 메소드를 자식 클래스가 오버라이딩할 수 없다.
//	d. 부모 클래스를 상속하려면 extends 키워드가 필요하다.
//	
//	문제 4
//
//	다음 코드가 있다. 밑줄 그은 곳에 적절하지 않은 코드는? c
//	 
//	class Car {
//	    public String name;
//	    protected String color;
//	    private  int model;
//	}
//	 
//	class SportsCar extends Car {
//	    boolean turbo;
//	}
//	 
//	public class CarTest {
//	    public static void main(String[] args) {
//	        SportsCar s = new SportsCar();
//	        ______________________
//	    }
//	}
//	 
//	a. s.name = "ferrari";
//	b. s.color = "red";
//	c. s.model = 105;
//	d. s.turbo = true;
//
//	문제 6
//
//	다음과 같은 부모 클래스와 자식 클래스가 있다 틀린 곳을 찾으시오
//	 
//	class Person {
//	    void name() { }
//	    protected void number() { }
//	    private void secret() { }
//	}
//	 
//	class Student extends Person {
//	    public void name() { }
//	    void number() { } // protected는 default보다 하위다
//	    private void secret() { }
//	}
//
//	문제 7
//
//	인터페이스를 설명한 것이다. 틀린 것은? c
//	 
//	a. 인터페이스는 인스턴스 변수를 포함할 수 없다.
//	b. 인터페이스는 생성자를 포함할 수 없다.
//	c. 인터페이스는 상수를 포함할 수 없다.
//	d. 인터페이스의 모든 멤버는 public으로 공개된다.
//
//	문제 8
//
//	다음은 인터페이스와 구현 클래스를 정의한 코드이다. 빈칸에 적절한 내용은? implements A
//	 
//	interface A{
//	    void isPrint();
//	}
//	 
//	class B __________ {
//	    public void isPrint() {
//	        System.out.println(“OK");
//	    }
//	}
//
//	문제 9
//
//	Printable는 인터페이스이다. 다음 코드에서 잘못된 행을 모두 찾으시오. extends new , PrintableTest();
//	 
//	interface Printable {
//	    String toner;
//	    abstract void print();
//	}
//	 
//	public class PrintableTest extends Printable {
//	    public static void main(String[] args) {
//	        new Printable();
//	        new PrintableTest();
//	    }
//	 
//	    void print() {}
//	}
//
//	문제 10
//
//	예외에 대한 설명 중 틀린 것은 무엇입니까? 2
//
//	① 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.
//
//	② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 
//	   체크하지 않는다.
//
//	③ 예외는 try-catch 블록을 사용해서 처리된다.
//
//	④ 자바 표준 예외만 프로그램에서 처리할 수 있다.
//
//	문제 11
//
//	try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까? 3
//
//	① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
//
//	② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.
//
//	③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.
//
//	④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.
//
//	문제 12
//
//	throws에 대한 설명으로 틀린 것은 무엇입니까? 4
//
//	① 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.
//
//	② throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
//
//	③ 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성 할 수 있다.
//
//	④ 새로운 예외를 발생시키기 위해 사용된다.
//
//	문제 14
//
//	다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?
//
//	public void method1() throws NumberFormauException, ClassNotFoundException { ... }
//
//	① try{ method1(); } catch (Exception e) { }
//	② void method2() throws Exception { method1();  }
//	③ try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { }
//	④ try{ method1(); } catch (ClassNotFoundException e) { } catch (NumberFormauException e) { }
//
//	문제 15
//
//	다음 코드가 실행되었을 때 출력 결과는 무엇입니까?
//	public class TryCatchFinallyExample {
//		public static void main(String[] args){
//	    	String[] strArray = { "10" , "2a" };
//	        int value = 0;
//	        for(int i = 0; i <= 2; i++ ){
//	        	try{
//	            	value = Integer.parseInt(strArray[i]);
//	            } catch(ArrayIndexOutOfBoundException e){
//	            	System.out.println("인덱스를 초과했음");
//	            } catch(NumberFormatException e) {
//	            	System.out.println("숫자로 변환할 수 없음");
//	            } finally {
//	            	System.out.println(value);
//	            }
//	        }
//	    }
//	}
//
//	문제 13
//
//	4. throw에 대한 설명으로 틀린 것은 무엇입니까? 
//
//	① 예외를 최초로 발생시키는 코드이다.
//	② 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.
//	③ throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
//	④ throw 키워드 뒤에는 예외 객체 생성 코드가 온다.
//


}
