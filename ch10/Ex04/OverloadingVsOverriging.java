package ch10.Ex04;
//�����ε��� �������̵�
/* �޼ҵ� �����ε�: ������ �޼ҵ� �̸����� �Ű����� Ÿ��,������ ���� �ش� �޼ҵ尡 ȣ��(��� ����x)
 *	�����ڿ��� ���� ����
 * 
 * �޼ҵ� �������̵�: �ݵ�� ��� ���迡�� ���
 * 	�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���
 * 		1 ��Ӱ��� 2 �޼ҵ��� �ñ״�ó�� ���ƾ� ��(�޼ҵ��, �Ű����� ����, �Ű����� Ÿ��)
 * 		3 �ڽĿ��� �θ��� ���������ڿ� ���ų� �� ���� �������� ��
 * */

class Ab{
	void print1() { //overriding
		System.out.println("AbŬ������ print1");
	}
	void print2() { //overloading
		System.out.println("AbŬ������ print2");
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("Bc class print1");
	}
	void print2(int a) { //overloading
		System.out.println("Bc class print2");
	}
}

public class OverloadingVsOverriging {
	public static void main(String[] args) {
		//Ab Ÿ�� ����, Ab Ÿ�� ������ ȣ��
		Ab aa=new Ab(); 
		aa.print1(); //Ab class print1
		aa.print2(); //Ab class print2
		
		//Bc Ÿ�� ����, Bc Ÿ�� ������ ȣ��
		Bc bb=new Bc();
		bb.print1(); //Bc class print1
		bb.print2(); //Ab class print2   �θ�
		bb.print2(2); //Bc class print2
		
		//Ab Ÿ�� ����, Bc Ÿ�� ������ ȣ��
		Ab cc=new Bc();
		cc.print1(); //�������̵���. ���� ���ε��� ���ؼ� Bc print1 ȣ��
		cc.print2(); //Ab Ŭ������ ȣ�� ����
		
	}
}
