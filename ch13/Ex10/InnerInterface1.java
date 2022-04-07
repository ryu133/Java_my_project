package ch13.Ex10;
//�̳��������̽�: Ŭ���� ���ο� �������̽��� ����, �ܺ� Ŭ���� �ȿ��� �����ϰ� ����� �������� Ŭ���� ���ο� ����
// static�� �ڵ����� �����Ϸ��� ���ؼ� ���� <<==����

class A{
	interface B{ //static ������
		void bcd();//public abstract
	}
}
//�̳��������̽��� ������ Ŭ���� C
class C implements A.B {  //A.B: A class�� �̳��������̽� B    //A,B: A�� B �������̽�
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ���� C");
	}
	
}
public class InnerInterface1 {
	public static void main(String[] args) {
		
		C c=new C(); //�ڽ��� �޼ҵ带 ���� ȣ��
		c.bcd();
		
		//1 �ڽ� ��ü�� ���� ���� �� ���(�ڽ�Ŭ������ ������ ���)
		A.B ab=new C();//�θ��� Ÿ������ ��ĳ���� �� �������̵� ��
		ab.bcd();
		
		//2 �͸��̳�Ŭ������ ���(�ڽ� Ŭ�������� ���)
		A.B b=new A.B() { //A.B: A Ŭ���� ������ �������̽� B
			@Override
			public void bcd() {
				System.out.println("�͸��̳�Ŭ������ ��ü ���� �� ���");
			}
		};
		b.bcd();
	}
}
