package ch12.Ex01;
abstract class D{ //Ŭ���� ���ο� �߻�޼ҵ尡 ���� ��� abstract Ŭ������ �Ǿ�� ��
					//�ڽ� Ŭ�������� �ݵ�� �������� �޼ҵ带 �������ϴ� ���� ����
	abstract void print(); //�߻� �޼ҵ�
}
class E extends D{ //�߻� Ŭ������ �޼ҵ带 �������ϴ� �ڽ� Ŭ����
	@Override
	void print() {
		System.out.println("class E - print()");
	}
}
public class AbstractClass3 {
	public static void main(String[] args) {
		D e=new E();
		e.print();
		D ee=new E();
		ee.print();
		D eee=new E();
		eee.print();
		
		D d=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		D dd=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		D ddd=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		d.print();
		dd.print();
		ddd.print();
	}
}
