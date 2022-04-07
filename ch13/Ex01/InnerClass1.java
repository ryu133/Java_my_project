package ch13.Ex01;
//�̳�Ŭ����(inner class): Ŭ���� ������ Ŭ����
	//1 �ν��Ͻ� �̳�Ŭ����: static�� ���� ���� Ŭ����
		//�ܺ� ��ü�� ���� ���� �� �ڽ��ǰ�ü ���� �� ��� ����
		//A a=new A(); �ܺΰ�ü(a)
		//A.B b=a.new B(); ���ΰ�ü(b)
	//2 static �̳�Ŭ����: static�� �ִ� ���� Ŭ����
	//3 ���� �̳�Ŭ����: Ŭ������ �ν��Ͻ� �޼ҵ� ���ο� �ִ� Ŭ����

	//Ư¡: 1 outer class�� ���� ����� ���� ���� ���� 
//2 �ٸ� ��ü�� �������� �ʰ� ��ü�� �ʵ峪 �޼ҵ� ������ ������ �ϱ� ���� �̳�Ŭ������ ���
//
//Ŭ���� ����: A.class A$B.class (bin�� ����) <= byte�ڵ�(�߰����� �����ϵ� ����)
class A{ //outer class : ��� ���� �����ڸ� ���� Ŭ�������� ���� ����
	public int a=3; 		//�ٸ� ��Ű������ ���� ����
	protected int b=4; 		//�ٸ� ��Ű������ ���� ����(���)
	int c=5; 				//���� ��Ű������ ���� ����
	private int d=6; 		//���� Ŭ�������� ���� ����
	
	void abc() {
		System.out.println("A Ŭ������ �޼ҵ� abc()");
	}
	
	//Inner class
	class B{ //�ν��Ͻ� ���� Ŭ����: �ܺ� Ŭ������ ��üȭ �Ǿ�� ��� ����
		void bcd() { //outer class�� �ʵ� ���� ���� ���� Ȯ��
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc(); //outer class�� �޼ҵ� ���� ���� ����
		}
	}
}
public class InnerClass1 {
	public static void main(String[] args) {
		//�ܺ� ��ü ���� - �̳�Ŭ������ ����ϱ� ���ؼ��� �ܺ� Ŭ���� ��ü�� ���� ����
		A a=new A();
		//���� Ŭ���� ��ü ����
		A.B b=a.new B();//A.B: �ܺ�Ŭ����.����Ŭ����  b: ����Ŭ���� �ν��Ͻ� ����
							//a.new B();  �ܺ��ν��Ͻ���.new ���� Ŭ���������� ȣ��
		//����Ŭ���� �޼ҵ� ȣ��
		b.bcd();
		
		
		
	}
}
