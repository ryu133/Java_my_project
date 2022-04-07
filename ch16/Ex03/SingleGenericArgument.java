package ch16.Ex03;
//Object: ��� ��ü�� ������ �� ������ �Ź� �ٿ�ĳ������ �ʿ���, ĳ���� �� ���� �߻� ����(���� Ÿ�� üũ)
//generic class: �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�
	//���ʸ� Ÿ�� ���� : T(Ÿ��), K(key) ,V(value) , N(number) , E(element)
	//A~Z ���Ƿ� ���� �� ����

	//wrapper Ŭ����: �⺻ Ÿ���� ��üȭ���ѳ��� Ŭ����
		//- int(�⺻Ÿ��)==> Integer(��ü),boolean==> Boolean, char==> Character, double==>Double, float==>Float ���

class MyClass<T>{ //���ʸ� Ŭ����
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}


public class SingleGenericArgument {
	public static void main(String[] args) {
		//���ʸ� Ŭ���� ��ü ����
		MyClass<String> mc1=new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2=new MyClass<Integer>();
		mc2.set(100);
		System.out.println(mc2.get());
		
		MyClass<Double> mc3=new MyClass(); //�������� �ڷ����� ���� ����
		mc3.set(2.56);
		System.out.println(mc3.get());
		
		MyClass<Boolean> mc4=new MyClass();
		mc4.set(true);
		mc4.set(false);
//		mc4.set("�ȳ�"); //���� Ÿ�� üũ, ���� �� ���� ����
		System.out.println(mc4.get());
	}
}
