package ch0607.Ex06;
import ch0607.Ex05.Bb; //class B�� Ŭ���� ���� �����ڰ� default�̱� ������ �ٸ� ��Ű������ ���� �Ұ�
public class ExternalClass2 {

	public static void main(String[] args) {
//		B b=new B(); //����
		
		//�ٸ� ��Ű���� Ŭ�������� BbŬ������ �����ϴ� ���
			//1. import ���� ���
		//2. Bb Ŭ������ ���� �����ڴ� public
		//3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ���� ����:protected(��Ӱ���),public /�Ұ���: private, default
		
		Bb bb=new Bb(); //�ٸ� ��Ű���� Ŭ����(���� ����: Ŭ���� ���� �����ڿ� public)
		
//		bb.a=10; //(private)���� Ŭ���� �������� ���� 
//		bb.b=20; //(default)���� ��Ű�� ������ ����
//		bb.c=30; //(protected)�ٸ� ��Ű������ ����(��Ӱ����� ����)
		bb.d=40; //(public)�ٸ� ��Ű������ ����
		
//		bb.print1(); //private
//		bb.print2(); //default
//		bb.print3(); //protected
		bb.print4(); //public
	}

}
