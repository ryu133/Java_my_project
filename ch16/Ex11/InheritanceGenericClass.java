package ch16.Ex11;

//���׸� Ŭ������ ���
///�ڽ� Ŭ������ �θ� Ŭ������ ���׸� ����(K,V,T,E)�� ���� Ÿ���� ���ų� �� ���ƾ� ��

class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T>{
	
}

class Child2<T,V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	
}


public class InheritanceGenericClass {
	public static void main(String[] args) {
		//�θ� ���׸� Ŭ���� ����
//		Parent<String> p=new Parent<String>();
//		Parent<String> p=new Parent();//���� ����
		Parent<String> p=new Parent<>();//���� ����
		
		p.setT("�θ� ���׸� Ŭ����");
		System.out.println(p.getT());
		
		Parent<Integer>i1=new Parent();
		i1.setT(1);
		System.out.println(i1.getT());
		
		//�ڽ� Ŭ���� 
		Child1<String>c1=new Child1();
		c1.setT("�ڽ�1 ���ʸ� ��Ŭ����");
		System.out.println(c1.getT());
		
		//�ڽ� Ŭ���� 2
		Child2<String, Integer> c2=new Child2();
		
		c2.setT("�ڽ�2 = ���׸� Ŭ����");//�θ�
		c2.setV(100);				//�ڽ�
		System.out.println(c2.getT());//�θ�
		System.out.println(c2.getV());//�ڽ�
		
		
		
		
	}

}
