package ch13.Ex07.Ex1;

//2 �������̽��� �߻� �޼ҵ带 ������ �͸� ����Ŭ������ ����� ȣ��: �ѹ��� ����ϴ� ���

interface A{ //�������̽� , �߻� �޼ҵ带 ����
	void cry(); //�߻� �޼ҵ� (public abstract)
	void fly();
}
class B{ 
	A a=new A() { //�������̽��� ��üȭ�� �� ������ �͸� ���� Ŭ������ �����ؼ� ���� ����
		//A �������̽��� ������ �ڽ� Ŭ���� ���: Ŭ���� �̸��� ����(�����Ϸ��� ������ �̸����� �ڵ� �Ҵ���)
		@Override
		public void cry() {
			System.out.println("�п�");
		}
		@Override
		public void fly() {
			System.out.println("�ϳȳ�");
		}
	}; 
	void abc() {
		a.cry();
		a.fly();
	}
	
}
public class AnonymousClass2_1 {
	public static void main(String[] args) {
		B b=new B();
		b.abc();
	}
}
