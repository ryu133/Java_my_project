package ch0607.Ex06;
class Aaa{
	int m=3; //�ν��Ͻ� �ʵ� : ��ü�� ���� �Ŀ� ��� ����
	static int n=4; //static �ʵ� : ��ü �������� ��� ����. ��ü ���� �Ŀ��� ��� ����(��� ��ü�� �����ϴ� ����)
	
	void print1() { //�޼ҵ�(�ν��Ͻ� �޼ҵ�): ��ü�� ���� �� ȣ�� ����
		System.out.println("�ν��Ͻ� �޼ҵ� ��� m: "+m+", n:"+n);
	}
	static void print2() { //�޼ҵ� (static �޼ҵ�): ��ü�� �������� ȣ�� ���� , ��ü ���� �Ŀ��� ȣ�� ����
		//static �޼ҵ� �������� �ν��Ͻ� �ʵ尡 �� �� ����
		System.out.println("static �޼ҵ� ��� "+"n:"+n);
	}

}
public class Static1 {

	public static void main(String[] args) {
		//1. ��ü ���� �� �ʵ�� �޼ҵ� ȣ��(�ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ�, static �޼ҵ�)��� ȣ��
		Aaa aaa=new Aaa();
		aaa.m=10; //�ν��Ͻ� �ʵ� ȣ��
		aaa.n=20; //static �ʵ� ȣ��
		aaa.print1(); //�ν��Ͻ� �޼ҵ�
		aaa.print2(); //static �޼ҵ�
		
		//2. ��ü �������� Ŭ���������� �ʵ�� �޼ҵ� ȣ��(static �ʵ�� static �޼ҵ常 ȣ�� ����)
		Aaa.n=100; //static �ʵ�
		Aaa.print2(); //static �޼ҵ�
		
		Aaa bbb=new Aaa();
		System.out.println(bbb.n); //100
		
		Aaa ccc =new Aaa();
		System.out.println(ccc.n); //100
		
		Aaa ddd =new Aaa();
		System.out.println(ddd.n); //100
		
		Aaa eee=new Aaa();
		System.out.println(eee.n);
		
		eee.n=300;
		System.out.println("===static �ʵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ����===");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
		
	}

}
