package ch13.Ex08.Ex1;
//3 �޼ҵ��� �Ű������� ����: 
// 3-1 ��ü ���� �� �Ű������� ����(Ŭ������o, ��������o)
// 3-2 ��ü ���� �� �Ű������� ����(Ŭ������o, ��������x)

interface A{ //�������̽� , �߻� �޼ҵ带 ����
	void cry(); //�߻� �޼ҵ�, (public abstract)
	void fly();
}
class B implements A{ //B�� A�������̽��� �����ϴ� Ŭ����
	@Override
	public void cry() {System.out.println("�۸�: �Ű����� ���� �� ���");}
	@Override
	public void fly() {System.out.println("���� ����: �Ű����� ����");}
}
class C{ //C ��ü�� abc() ȣ�� �� A Ÿ���� �Ű������� ����
	void abc(A a) { //���� �ڽ� Ŭ������ �Ű������� ���� ��� A Ÿ������ �ڵ� ��ĳ���õ�
		a.cry();
		a.fly();
	}
}
public class AnonymousClass3_1 {
	public static void main(String[] args) {
		//1 Ŭ������ ���� o + �������� o
		C c=new C();
		A a=new B(); //B�� ��üȭ�ؼ� AŸ������ ����. a: ��������
		
		c.abc(a);
		
		System.out.println("=====================");
		
		//2 Ŭ������ ���� o + �������� x
		c.abc(new B());
		
	}
}
