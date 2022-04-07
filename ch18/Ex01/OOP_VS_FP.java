package ch18.Ex01;

//자바는 객체지향프로그램(OOP)object oriented programming : 모든 함수(메소드)는 객체 내부에 존재해야 함. 함수는 클래스, 인터페이스 안에 있을 수 있다.
	//람다식: 자바에서 함수형 프로그래밍이 가능하도록 지원해주는 하나의 기능
		//기존의 구현된 메소드를 재정의하는 것이 아니라 구현부가 없는 메소드에 람다식으로 기능을 부여해서 작동시키는 문법
		//람다식은 가능한한 축약된 문법을 사용(생략 가능한 것을 최대한 생략해서 표현함) 문법이 굉장히 간결함
		//람다식은 자바에서 내부적으로 익명 클래스로 변환되어 처리됨
		//람다식은 함수형 인터페이스에서 익명 클래스로 변환이 가능하다
		//람다식은 함수형 인터페이스에 구현된 익명 클래스를 람다식으로 축약함
		//함수형 인터페이스: 인터페이스에 단 한개의 추상 클래스가 정의된 인터페이스를 함수형 인터페이스라 한다
		//자바는 새로운 함수 문법을 정의한 것이 아니라 이미 존재하는 인터페이스를 빌어서 람다식으로 표현

@FunctionalInterface  //@ : 어노테이션  @FunctionalInterface: 함수형 인터페이스를 선언, 추상 메소드가 1개
interface A{ //함수형 인터페이스 
	void abc(); //public abstract 생략됨
	
}
//인터페이스의 지ㅓㅇ의된 메소드를 구현하는 방법
//1. 인터페이스의 메소드를 구현하는 클래스를 생성
class B implements A{
	@Override
	public void abc() {
		System.out.println("메소드 내용 1");
	}
}

public class OOP_VS_FP {
	public static void main(String[] args) {
		//자바는 객체 지향 크로그램이므로 모든 함수(메소드)는 클래스 내부에 있고 객체 생성 후 호출 가능, 객체 생성없이 함수명으로 바로 호출 불가능
		
		//객체 지향 프로그래밍 문법
		//1 class를 생성해서 사용: 모든 메소드는 객체 내부에 존재하며 객체를 생성 후 호출이 가능
		A a1=new B();
		a1.abc();
		
		
		//2 익명 이너클래스를 생성해서 사용
		A a2=new A() { //인터페이스의 추상 메소드를 직접 구현한 클래스를 생성하지 않고 익명 내부클래스를 사용해서 메소드 호출함
			@Override
			public void abc() {
				System.out.println("메소드 내용 2");
			}
		};
		a2.abc(); //OOP는 객체 생성 후 메소드 호출
		
		
		//3 람다식(함수적) 프로그래밍 문법
		A a21=new A() {@Override public void abc() {System.out.println("메소드 내용 2");}}; //익명 이너클래스
		A a3=() -> {System.out.println("메소드 내용 3");}; //람다식
		//람다식에 사용되는 인터페이스는 함수형 인터페이스여야 함
		a3.abc();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
