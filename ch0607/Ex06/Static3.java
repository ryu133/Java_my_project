package ch0607.Ex06;
//���� �ʱ�ȭ ���: �����ڿ� ���� static �ʵ��� ���� ȣ�� �� �ʱ�ȭ�ϴ� ����

//�����ڿ� static ���
//-������: �ν��Ͻ� �ʵ带 �ʱ�ȭ, ���� �ʵ��� ���� �ʱ�ȭ
//-static ���: static �ʵ��� ���� �ʱ�ȭ. �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ�� �� ����
class E{
	int a;
	static int b;

	static { 	//���� �ʱ�ȭ ���(��ü �������� Ŭ���������� ȣ���� �� �ʱ�ȭ)
		b=5;
		System.out.println("Ŭ���� E�� �ε��Ǿ����ϴ�. b:"+b);
	}
	E(){ //������: ��üȭ�� �� �� �ʵ��� ���� �ʱ�ȭ
		a=3;
	}
}
public class Static3 {
	public static void main(String[] args) {
		System.out.println(E.b); //��ü �������� E.b ȣ��� �� static ����� �۵���: static�� ���� �ʱ�ȭ ��
	}
}
