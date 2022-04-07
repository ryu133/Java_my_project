package ch12.Ex01;
abstract class Abc{
	abstract void cry(); 
	abstract void fly(); 
}
class Cat extends Abc{
	@Override
	void cry() {
		System.out.println("cat meow");
	}
	@Override
	void fly() {
		System.out.println("cat can't fly");
	}
}
class Eagle extends Abc{
	@Override
	void cry() {
		System.out.println("eagle ?");
	}
	@Override
	void fly() {
		System.out.println("eagle can fly");
	}
}
public class AbstractClassEx {
	public static void main(String[] args) {
		// �ڽ� Ŭ���� cat, eagle ���� �� ���
		Abc c1=new Cat();
		Abc e1=new Eagle();
		
		c1.cry();
		c1.fly();
		e1.cry();
		e1.fly();
		
		//�͸� Ŭ���� ���� �� ���
		Abc a1=new Abc() {
			@Override
			void cry() {
				System.out.println("cry");
			}
			@Override
			void fly() {
				System.out.println("fly");
			}
		};
		a1.cry();
		a1.fly();
	}
}
