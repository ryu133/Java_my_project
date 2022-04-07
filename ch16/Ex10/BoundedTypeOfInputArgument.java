package ch16.Ex10;

//���׸� �޼ҵ��� �Ű����� ����

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test{ //�Ϲݸ޼ҵ�. �Ű������� ������ Ÿ���� ���ʸ� Ÿ��
	void method1(Goods<A> g) {} //A Ŭ���� (��ü����) Ÿ��
	void method2(Goods<?> g) {} //A,B,C,D
	void method3(Goods<? extends B> g) {} //B,C,D
	void method4(Goods<? super B> g) {} //A,B9+ 
	
}

public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test t=new Test();
		
		//method1 / A
		t.method1(new Goods<A>());
//		t.method1(Goods<B>());
//		t.method1(Goods<C>());
//		t.method1(Goods<D>());
		
		//method2 / ? : all
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//method3 / extends B : B~
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//method4 / super B : ~B
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
		
		
		
	}
}
