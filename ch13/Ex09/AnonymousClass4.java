package ch13.Ex09;
//4 �������̽��� �����ϴ� Ŭ������ ���� ���, �޼ҵ��� �Ű������� ����
interface A{
	void abc(); //public abstract
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass4 {
	public static void main(String[] args) {
		C c=new C();
		//1 Ŭ���� x (�������̽��� �����ϴ� Ŭ������ ����)+�������� ���� o
		A a=new A() {//�������̽��� �����ϴ� �ڽ� �͸� ��ü ���� �� Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����(x)+��������(o)");
			}
		};
		c.cde(a);//���������� �Ű������� ����
		
		//2 Ŭ���� x (�������̽��� �����ϴ� Ŭ������ ����)+�������� x <<==���� ���� ���(�ӽ÷� �ѹ��� ����K��)
		c.cde(new A () {
			@Override
			public void abc() {
				System.out.println("Ŭ����(x)+��������(o)");
			}
			
		});
		
		}
		
	}

