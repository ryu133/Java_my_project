package ch0607.Ex02;

public class A {
	//1 ���� Ÿ���� ���� �޼ҵ�-void �޼ҵ��(){�����ڵ�}
	public void print() {
		System.out.println("�ȳ�");
	}
	
	//2 ���� Ÿ���� �ִ� �޼ҵ�-�ڷ��� �޼ҵ��(){�����ڵ�}
	public int data() {
		return 3; 
	}
	
	//3 ���� Ÿ��: double
	public double sum(int a, double b) {
		return a+b;
	}
	
	//4 ���� Ÿ���� void + �޼ҵ� ���ο��� ������ ����: (�Լ� ������ �ǹ�)
	public void printMethod(int m) {
		if (m<0||m>12) {
			System.out.println("�߸��� �Է°��Դϴ�. 1~12������ �Է��� �����մϴ�.");
			return ;//�޼ҵ� ���Ḧ �ǹ�
		}System.out.println(m+"���Դϴ�. ");
	}
	
}
