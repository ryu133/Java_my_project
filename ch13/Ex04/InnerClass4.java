package ch13.Ex04;

//���� �̳�Ŭ���� : Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
//�޼ҵ� ������ �ʵ�� final Ű�� ������. �� ���� �Ұ�
//���� �̳�Ŭ�������� ���Ǵ� ���� ������ �ڵ����� final�� ����ȴ�. ���� �� �����Ϸ��� �ڵ����� �Ҵ���

class A{
	int a=3;//�ʵ�: �� ������ ����(�ʱ�ȭ �ʼ�)
			//�ʵ��� �ʱⰪ�� �Ҵ� �� ������ ���� ��üȭ�Ͽ� ���� �����ؾ� ��
			//�����ڴ� setter�� ���� �ʱⰪ �Ҵ� �� ��ü �����ؼ� �����ڸ� ���� �ʱⰪ �Ҵ�
	
	A (){}
	A(int a){
		this.a=a;
	}
	public void setA(int a) {//setter�� ���ؼ� �ʵ��� ���� �ʱ�ȭ��
		this.a=a;
	}
	void ccc() {
		//��������: �޼ҵ� ������ ����, �޸��� ���� ������ ����
		int a=3; //�ʱ�ȭ
		a=4;//�������� �� ����
		a=10;
	}
	void abc() {
		int b=5; //�������� : �޼ҵ� ���� ����� ����
		//���� �̳�Ŭ�������� ���� �� �ڵ����� final Ű�� �����Ϸ��� ���ؼ� �Ҵ��
//		b=10;	
		int c=10;
		c=10;
		class B{
			void bcd() {
				System.out.println(a);//�ʵ�
				System.out.println(b);//��������(final ������)
				a=5; //�ʵ� �� ���� ����
//				b=7; //���� �̳�Ŭ�������� ���Ǵ� ���������� �ڵ����� final Ű�� �����Ϸ��� ���� �Ҵ� 
			}
		}
		B bb=new B();
		bb.bcd();
	}
}
public class InnerClass4 {
	public static void main(String[] args) {
		A a=new A();
		a.abc();
		
	}
}