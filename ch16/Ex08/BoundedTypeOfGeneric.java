package ch16.Ex08;

class A{}
class B extends A{}
class C extends B{}
//���׸� Ÿ������ ������ ��ü�� ������ ��
class D<T extends B>{ //T: B,C Ŭ������ �� �� �ִ�
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
//		D<A> d1=new D<A>(); //�Ұ��� 
		D<B> d2=new D<B>(); 
		D<C> d3=new D<C>(); 
		
		D d4=new D(); //Ÿ���̸� �������� �ʰ� ��ü ���� �� �ֻ��� ��Ī����;;
		
		d2.setT(new B());
		d2.setT(new C());
//		d2.setT(new A());//����
		
		//d3�� c Ÿ�Ը� ���� �� �մ�
//		d3.setT(new B());//����
		d3.setT(new C());
//		d3.setT(new A());//����
		
//		d4.setT(new A()); //error
//		d4.setT(new B)); //error
		d4.setT(new C()); //error
		
	}
}
