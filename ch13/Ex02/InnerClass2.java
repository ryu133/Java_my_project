package ch13.Ex02;
//�̳� Ŭ�������� �ܺ� Ŭ������ �ʵ�� �޼ҵ� ���� ���
/*�������̵� : 1 �θ�� �ڽ��� ��� ����
			2 <<�ν��Ͻ� �޼ҵ� �������̵�>>
			3 �ν��Ͻ� �ʵ�, ����(static) �ʵ�, ����(static) �޼ҵ�� �������̵� �Ұ�
*/

class A{
	int a=3;
	int b=4;
	int c=33;
	int d=44;
	void abc() {
		System.out.println("A Ŭ������ �޼ҵ� abc()");
	}
	class  B{ //�̳�Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼ҵ带 ȣ���� ��� A.this.
		int a=5;
		int b=6;
		void abc() { // ����! �������̵��� �ƴ� ������ �޼ҵ�. �ܺο� ���� Ŭ������ ������ �޼ҵ�� ������ ������ ��ġ
			System.out.println("B Ŭ������ �޼ҵ� abc()");
		}
		void bcd() {
			//1 �ڱ� �ڽ��� �ʵ�� �޼ҵ� ȣ��(�̳�Ŭ������ �ʵ�� �޼ҵ�) 
			System.out.println(a); //5 this.a
			System.out.println(b); //6 this.b
			abc(); //B Ŭ������ �޼ҵ� abc()  this.abc()
			
			//2 �ƿ��� Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(A.this.a); //3  A.this.a: outer class�� �ʵ尪 ȣ��
			System.out.println(A.this.b); //4  <<����! ����� �ƴϹǷ� super�� �ƴ�>>
			
			A.this.abc(); //A Ŭ������ �޼ҵ� abc()
			//3 �ƿ��� Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(c); //33
			System.out.println(d); //44
			
		}
	}
	
}
public class InnerClass2 {
	public static void main(String[] args) {
		A a=new A();
		A.B b=a.new B();
		
		b.bcd();
		
		System.out.println("============");
		
		//���� Ŭ������ �ʵ�� �޼ҵ� ȣ��
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
				
	}
}
