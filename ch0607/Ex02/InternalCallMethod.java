package ch0607.Ex02;
//�⺻Ÿ���� �޼ҵ�
public class InternalCallMethod {
	public static void main(String[] args) {
		//���� Ŭ���� �ȿ��� ���� �޼ҵ� ȣ�� static�� ������� ���� ��� ��üȭ ���������
		InternalCallMethod aaa=new InternalCallMethod();
		aaa.print(); //aaa ��ü�� print �޼ҵ� ȣ��
		int a=aaa.twice(3);
		System.out.println(a);
		
		double b=aaa.sum(a, 5.8);
		System.out.println(b);
		
	}
	
	void print() { //static ���� �޼ҵ� ����. ��üȭ ���Ѽ� �޼ҵ� ȣ����
		System.out.println("HI");
	}
	int twice(int k) {
		return k*2;
	}
	double sum(int m, double n) {
		return m+n;
	}
	
}
