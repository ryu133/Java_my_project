package ch13.Ex03;
//�����̳�Ŭ�������� �ܺ�Ŭ������ ���� �ʵ峪 ���� �޼ҵ�� ���� ����
class A{
	int a=3; //�ν��Ͻ� �ʵ�, ��üȭ �� ���� ����
	static int b=4; //static �ʵ�, ��ü �������� ���� ����&���� �� ���� ����
	void method1() { //�ν��Ͻ� �޼ҵ�: ��ü ���� �� ���� ����
		System.out.println("instance method");
	}
	static void method2() { //���� �޼ҵ�: ��ü�� �������� �ʰ� ���� ����&���� �� ���� ����
		System.out.println("static method");
	}
	static class B{ //���� �̳� Ŭ����: �ܺ� ��ü�� �������� �ʰ� ��ü ���� ����	
		void bcd() {
			//1 ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� ���� �Ұ�
//			System.out.println(a); //a: �ܺ� Ŭ������ �ν��Ͻ� �ʵ�
			System.out.println(b); //static �̳�Ŭ�������� �ܺ�Ŭ������ static �ʵ峪 �޼ҵ� ���� ����
			//2 �޼ҵ� ȣ��
//			method1(); //�ν��Ͻ� �޼ҵ� ȣ�� �Ұ�
			method2(); //���� �޼ҵ� ȣ�� ����
			
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		//static�̳�Ŭ���� ��ü ����
		A.B b=new A.B(); //�����̳�Ŭ������ �ܺ� ��ü �������� ��ü ����
		b.bcd();
		
		
//		�̳�Ŭ������ ���� Ŭ������ �ƴ� ��
//		A a=new A();//�ܺ�Ŭ���� ��ü ���� ��
//		A.B b=a.new b();//�̳�Ŭ���� ��ü ����
		
	}
}
