package ch13.Ex07;
//�͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����
class A{
	C b=new C() { //�͸� �̳� Ŭ����
		public void bcd() {
			System.out.println("�͸� �̳�Ŭ����");
		};
	};
	void abc() {
		b.bcd();
	}
	
}

interface C{ //�߻� �޼ҵ� ���� void bcd()
	public abstract void bcd();
}

public class AnonymousClass2 {
	public static void main(String[] args) {
		A a=new A();
		a.abc(); //�͸� �̳�Ŭ����
		
		
		
	}
}
