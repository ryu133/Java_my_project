package ch0607.Ex06;

class Abc{ //�ܺ� Ŭ����: public �����ڸ� ����� �� ����. default�� �⺻���� �����
		//class: public, default
		//���� �����ڰ� ���� �� �ִ� Ű����: class ��, �ʵ�, �޼ҵ�, ������
		//�ݵ�� ���� �����ڰ� �Ҵ�Ǿ� �ִ�. �����Ǿ� ������ default
		//���� ������
			//public: �ٸ� ��Ű������ ���� ����
			//protected: �ٸ� ��Ű������ ���� ����(��Ӱ��踸)
			//default: ���� ��Ű������ ���� ����, ���� ��Ű���� �����ϴ� Ŭ������ import ���� ���
			//private: ���� Ŭ���� ���ο����� ��� ����
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	
	//Abc(){ } //<==�⺻ ������: �ʵ��� �ʱⰪ�� �Ҵ��Ͽ� ��ü�� ����
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ����: public");
	}
	protected void print2() {
		System.out.println("�ٸ� ��Ű������ ���� ����: protected(��Ӱ����� ��)");
	}
	void print3() {
		System.out.println("���� ��Ű������ ���� ����: default");
	}
	private void print4() {
		System.out.println("���� Ŭ�������� ���� ����: private");
	}
}

public class Ex06All {

	public static void main(String[] args) {
		Abc abc1=new Abc(); //�⺻ ������ ȣ��
		//Abc: Ŭ������, abc1: �޸𸮿� �ε��� ��ü��, new: ��ü�� �� ������ ����, Abc(): ������ ȣ��
		//Abc(): �⺻ ������. ���� ����. Abc(){ }
		//������: Ŭ������� ������ �޼ҵ�. ����Ÿ���� ���� �޼ҵ� ������
		
		abc1.a=100; //public
		abc1.b=200; //protected
		abc1.c=300; //default
//		abc1.d=400; //private �ٸ� Ŭ���������� ���� �Ұ�
		
		abc1.print1(); //public
		abc1.print2(); //protected
		abc1.print3(); //default
//		abc1.print4(); //private
		
	}

}
