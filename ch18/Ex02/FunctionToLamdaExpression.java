package ch18.Ex02;

//���ٽ� ����

@FunctionalInterface //�Լ��� �������̽� ����
interface A{
	void method1();
}

@FunctionalInterface
interface B{
	void method2(int a);
}

@FunctionalInterface
interface C{
	int method3();
}

@FunctionalInterface
interface D{
	double method4(int a, int b);
}

public class FunctionToLamdaExpression {
	public static void main(String[] args) {
		//�������̽��� �������� ���� �Լ��� ���� ==> ���ٽ�
		//1 �Է�x, ����x
		//1-1 �͸� �̳�Ŭ������ ó��
		A a1=new A() {@Override public void method1() {System.out.println("a1 method1");}};
		a1.method1();
		//1-2 ���ٽ����� ó��
			//���ٽ��� ���� Ÿ��,�޼ҵ���� ����� 
			//(��ǲ) -> {������;};
		A a2=()->{System.out.println("a2 method1");}; //��ü
		A a3=()->System.out.println("a3 method1"); //�������� �ڵ尡 �� ���� ��� {}; ���� ����
		a2.method1();
		a3.method1();

		//2 �Է�o, ����x
		//2-1 �͸� ����Ŭ������ ó��
		B b1=new B() {@Override public void method2(int a) {System.out.println("b1 method2 "+a);}}; 
		b1.method2(0);
		//2-2 ���ٽ����� ó��
		B b2=(int a)->{System.out.println("b2 method2 "+a);}; //��ü ����
		//���� ����(�Ű����� Ÿ��, �Ű������� �ϳ��� ��� (),�������� �ڵ尡 �� ���� ��� {}; ���� ����)
		B b3= a -> System.out.println("b2 method2 "+a); 
		
		b2.method2(0);
		b3.method2(0);
		
		//3 �Է�x, ����o
		//3-1 �͸� ����Ŭ����
		C c1=new C() {
			
			@Override
			public int method3() {
				
				return 4;
			}
		};
		System.out.println(c1.method3());
		//3-2 ���ٽ����� ó��
		C c2=() ->{return 4;}; //��ü ����
		C c3=() -> 6; //������ �ڵ尡 ������ ��� return ���� ����, �ݵ�� �߰�ȣ�� �Բ� ����
		System.out.println("c2 method3 �������� ���� "+c2.method3());
		System.out.println("c2 method3 �������� ���� "+c3.method3());
		
		//4 �Է�o, ����o
		//4-1 �͸� �̳�Ŭ����
		D d1=new D() {@Override public double method4(int a, int b) {return a+b;}};
		System.out.println("d1 method4 �� ���� ���� "+d1.method4(1, 3));
		//4-2 ���ٽ�
		D d2=(int a, int b) -> {return a+b;}; //��ü ����
		D d3=(a, b) -> a+b; //��� ���� (�Ű����� Ÿ��,������ �� ���� ��� return�� �Բ� {}; ���� ���� )
		
		System.out.println("d2 method4 �� ���� ���� "+d2.method4(3, 2));
		System.out.println("d2 method4 �� ���� ���� "+d3.method4(5, 1));
		
	}
}
	
