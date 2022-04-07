package ch13.Ex09.Ex1;

interface A{
	void cry();
	void fly();
}
class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}
public class AnonymousClass4_1 {
	public static void main(String[] args) {
		C c=new C();
		//1 �����ϴ� Ŭ���� ����, �������� o
		A a=new A(){ //�������� a ����
			@Override
			public void fly() {
				System.out.println("fly");				
			}
			@Override
			public void cry() {
				System.out.println("cry");
			}
		};
		c.abc(a);
		
		
		
		//2 �����ϴ� Ŭ���� ����, �������� x  (���� ���� ���)
		c.abc(new A() {
			@Override
			public void fly() {
				System.out.println("fly");				
			}
			@Override
			public void cry() {
				System.out.println("cry");
			}
		});
		
	}
}
