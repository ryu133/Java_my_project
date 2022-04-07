package ch16.Ex09;

import ch0607.Ex05.ExternalAbc;

//generic method�� ���� ����

class A{ //�Ϲ� Ŭ���� ���� ���ʸ� �޼ҵ�
	
	//Number: boolean,char�� ������ 6���� �⺻ �ڷ��� Ÿ���� �ǹ���
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue()); //number Ÿ���� �޼ҵ� , ������ ��µ� 
	}
}
interface MyInterface{
	void print(); //public abstract ������
}
class B{ //���׸� Ÿ�� ���ο��� �������̽��� ������ ���� extends Ű�� ����Ѵ�
	public <T extends MyInterface> void method2(T t) {
		//T t(Ÿ��): ��ӵ� �������̽��� ������ Ŭ������ �� �� �ִ�
		t.print(); 
	}
}
class C implements MyInterface{ //�������̽��� ������ Ŭ����
	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
}
class D{
	public <T extends String>void abc(T t){
		System.out.println(t); //string�� tostring() ������ �Ǿ�����
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a=new A();//�Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		a.<Double>method1(5.8);
		a.method1(22.5); //�Ű������� Ÿ���� �ĺ��� �� �ִ� ��� ���� ����
		a.<Long>method1(100000L);
		a.<Float>method1(100.12345F);
//		a.<Boolean>method1(true); //number Ÿ���� �ƴϹǷ� ����
		
		B b=new B();
		//method2�� �Ű������� �������̽��� �������̽��� ������ Ŭ������ �� �� �ִ� 
		b.<MyInterface> method2(new MyInterface() {
			//�������̽��� ������ ���� �͸� Ŭ���� 
			@Override
			public void print() {
				System.out.println("print() �͸� Ŭ������ ���");
			}
		});
		b.<MyInterface> method2(new C());
		
		//�͸� Ŭ������ ���׸� �޼ҵ带 ȣ�� �� �Ű�����
		b.method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ���� ���");
			}
		});
		
		D d=new D();
		d.<String>abc("�ȳ�");
		d.abc("�ϼ���");
		
	}
	
}
