package ch12.Ex02;
//�������̽�(interface): �ܺο� ���θ� ��������ִ� ����
//��ü ���� �Ұ�. Ÿ���� ���� ����
//��� �ʵ�� �ݵ�� �տ� public static final�� �ִ�
//��� �޼ҵ�� public abstract ������(java 1.8) (default �޼ҵ� ����)

interface A{ //���� ǥ��
	public static final int A=3; //�������̽� �ʵ��� ���� ǥ��
	public abstract void abc(); //�������̽� �޼ҵ��� ���� ǥ��
}
interface B{ //�������̽��� ������ ǥ��(���� ��)
	int A=3; 
	void abc();
}
abstract class C{ //�߻�Ŭ������ abstract ���� �Ұ�
	abstract void abc(); //���� �� ���� �߻�
}


public class Interface1 {
	public static void main(String[] args) {
		//�������̽��� ��ü ���� �Ұ�(�̿ϼ� �޼ҵ带 �����ϹǷ�). Ÿ�� ���� ����
//		A a=new A();//A�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		
		//1 interface�� static �ʵ� ���
		System.out.println(A.A); //�������̽��� �ʵ� ���, A <== static
		System.out.println(B.A);
		
		//2 final �������� �� ���� �Ұ�
//		A.A=5; //final�� �����Ǿ��ֱ� ������ ���� ������ �� ����
//		B.A=6; 
	}
}
