package Ch11.Ex03;
//abstract(�߻�) �޼ҵ� : ���� ������ ���� �޼ҵ�, ���� �Ǿ��ִ� �޼ҵ�
// �߻� Ŭ������ ��üȭ�� �� ����, Ÿ������ ������ ���� ����
// ((������ �޼ҵ带 ��������-> ȸ���� ��ɱ��� �޼ҵ带 ����
// ������ �������� �߻� �޼ҵ带 �������̵��ؼ� �����θ� ����� ��
// ���� Ŭ�������� �޼ҵ� �������̵� �� ������ �����ϱ� ����))
// �ڽ� Ŭ�������� �������ؼ� ���������� �����ؾ� ��
//ex)) �޵��� �⺻ ���� : void print(){}
//		abstract void print();
//		�߻� Ŭ����: abstract class A{�߻�޼ҵ带 �ϳ� �̻� �����ϸ�}
//
abstract class A{ //�߻� Ŭ���� : �߻� �޼ҵ带 �ϳ��� �����ϸ� �ݵ�� �߻� Ŭ�������� ��
	abstract void print(); //�߻� �޼ҵ�
	abstract void cry();
}
class B extends A{ //��ũ��Ʈ Ŭ���� : �߻� Ŭ�������� ������ �޼ҵ带 ��� ������ Ŭ����
	@Override
	void print() {
		System.out.println("��ũ��Ʈ Ŭ���� : �߻� Ŭ������ �߻� �޼ҵ带 ��� ������ Ŭ����");
	}
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
abstract class C extends A{ //�θ��� �߻� �޼ҵ� �� �Ϻθ� ������ ��� : �߻� Ŭ����

	@Override
	void print() {
		
	}
}
class D extends C{ //��ũ��Ʈ Ŭ���� : �߻� Ŭ�������� ������ �޼ҵ带 ��� ������ Ŭ����
	@Override
	void cry() {
		
	}
}

public class AbstractModifier1 {
	public static void main(String[] args) {
		
	}

}
