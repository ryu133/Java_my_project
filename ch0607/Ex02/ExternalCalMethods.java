package ch0607.Ex02;
//�޼ҵ� �����ε�: �ϳ��� �޼ҵ� ������ �Ű������� Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� (Java)
//�޼ҵ� �������̵�: ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������ؼ� ���

//���� ��Ű�� �ȿ� ���� �̸��� Ŭ���� �ߺ��Ͽ� �� �� ����
	

//�پ��� Ÿ���� �޼ҵ� ����(���� Ÿ���� �ִ� ���(int, double, String...), ���� Ÿ���� ���� ���(void)
public class ExternalCalMethods {
	public static void main(String[] args) {
		A a=new A();
		
		a.print();
		int k=a.data();
		System.out.println(k);
		double result=a.sum(3, 5.2);
		System.out.println(result);
		a.printMethod(5);
		a.printMethod(25);
		
		//����! ��±����� ȣ�� ������ �޼ҵ�(return�� �ִ� �޼ҵ�)
		System.out.println(a.data());
//		System.out.println(a.print()); //���� �߻�
		a.print();
		System.out.println(a.sum(4, 10.5));
//		System.out.println(a.printMethod(1)); //���� �߻�
		
		a.printMethod(a.data());
	}
}
