package ch13.Ex05;
//���� ���� Ŭ������ ������ ���� ���� Ŭ���� ����
//���� ���� Ŭ����: �޼ҵ� ���ο� ����� Ŭ����
class A{
	void abc() {
		class B{} //A$1B.class
		class C{} //A$1c.class
	}
	void bcd() {
		class C{} //A$2C.class ������ �̸��� ������ ��� �޼ҵ� ���ڰ� ��
		class D{} //A$1D.class
	}
	void cde() {
		class B{} //A$2B.class
		class C{} //A$3C.class
		
	}
}
public class InnerClass5 {
	public static void main(String[] args) {
		
	}
}
