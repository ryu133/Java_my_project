package ch13.Ex06;

//�������̽��� ����� Ŭ������ ������ ��ü ���
class A{
	C b=new B(); //cŸ�� 
	void abc() {
		b.bcd();
	}
	//�̳�Ŭ����
	class B implements C{ //�������̽� c�� �߻� �޼ҵ� �����ϴ� b Ŭ����
		@Override
		public void bcd() {
			System.out.println("�ν��Ͻ� ����Ŭ����");
		}
	}
}

interface C{ //�߻� �޼ҵ� ���� void bcd()
	public abstract void bcd();
}

public class AnonymousClass {
	public static void main(String[] args) {
		A a=new A();
		a.abc(); //�ν��Ͻ� �̳�Ŭ����
		
	}
}
