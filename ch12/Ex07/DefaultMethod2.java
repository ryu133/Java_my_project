package ch12.Ex07;
interface A{ //�θ� �������̽�
	default void abc() { //�������̽����� �����ΰ� �ִ� �޼ҵ带 ������ �� default �ʿ�
		System.out.println("A interface abc()");
	}
}
class B implements A{ //extends Object ������
	public void abc() { //overriding
		A.super.abc(); //super.abc();�� object Ŭ������ abc()�� ȣ��
		System.out.println("B class abc()");
	}
}
public class DefaultMethod2 {
	public static void main(String[] args) {
		B b=new B();
		b.abc(); //B class abc() ȣ��
		
		A a=new B(); //��ü ������ �Ұ�, Ÿ���� ����
		a.abc();
	}
}
