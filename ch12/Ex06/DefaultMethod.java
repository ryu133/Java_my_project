package ch12.Ex06;
//interface�� default �޼ҵ�: �������̽� ������ �����ΰ� �ִ� �޼ҵ带 ������ �� ���(�ڹ� 1.8 ���� ���Ӱ� �߰��� ���)
//������ �����Ǿ��ִ� �������̽����� ���ο� ����� �߰��� �� ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰��� �� ���
	//public default void bcd(){}
//default Ű���带 �־����(���� ������ �ƴ�)

interface A{
	void abc(); //2005 ���� �޼ҵ�. public abstract ������. �����ΰ� ���� �߻� �޼ҵ�
	
	default void bcd() { //2020 ���� �޼ҵ�
		System.out.println("A interface bcd()");
	}
//	void ttt(); //���� Ŭ�������� ���ο� �߻� �޼ҵ带 �߰��ϸ� ��ӵ� ��� ���� Ŭ������ ���� �߻�
}
class B implements A{ //2005 ���� Ŭ����
	public void abc() { 
		System.out.println("B class abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C class abc()");
	}
	public void bcd() { //default �޼ҵ� �������̵� ����
		System.out.println("C class bcd()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		//��ü ����
		A a1=new B();
		A a2=new C();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
