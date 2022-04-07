package ch14.Ex06;
//���� ó�� 2����
//1 ���� ó��: try catch
//2 ���� ����(�̷��): throws  (�޼ҵ带 ȣ���ؼ� ó����)

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);//�Ϲ� ���� : interruptedException
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("���� �߻� 1");
		}
	}
}
class B{
	void abc() {//bcd()�� ���� ó�� �ǹ��� ����
		try {
			bcd();
			
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("���� �߻� 2");
		}
	}
	void bcd() throws InterruptedException { //bcd()���� ���ܸ� ó���ϵ��� �̷��
		Thread.sleep(1000); //�Ϲ� ���� : interruptedException
	}
}

public class ThrowsExeption1 {
	public static void main(String[] args) {
		A a1=new A();
		a1.abc();
		B b1=new B();
		b1.abc();
	}
}
