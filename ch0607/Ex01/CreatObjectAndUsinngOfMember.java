package ch0607.Ex01;

//class: ���赵, ��ü�� �����ϱ� ���� Ʋ(���ø�)
//��ü(Object): Ŭ������ �����ؼ� �޸𸮿��� �۵��Ǵ� �����ڵ�(��, ��)
//	��ü=�ν��Ͻ�
//�ν��Ͻ�(��ü)ȭ ��Ų��. (���� �޼��忡�� �ؾ���) ==> A a =new A(); //Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�
		
class A{ //�ܺ� Ŭ����
	int m=3; // �ʵ�(����): Ŭ���� ������ ����� ������ �ʵ�� ȣĪ
	//�ʵ�� �ν��Ͻ�ȭ ���Ѿ� ��� ����. �ʵ�� �޸��� �� ������ ������.
	void print() { //�޼���: ������������ �Լ�. ��ü������� �Լ��� �޼���� ȣĪ
		System.out.println("��ü ���� �� Ȱ��");
	}
}
class B{//�ܺ� Ŭ����
	String name="ȫ�浿";
	int age=24;
	String phone="010-1111-1111";
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreatObjectAndUsinngOfMember { //public class�� �ϳ��� ������. �����̸�==�ۺ�Ŭ������
	public static void main(String[] args) {
		A a=new A(); //Class A�� ��üȭ(�ν��Ͻ�ȭ) ��Ų��. RAM�� �ε��Ų��. 
		System.out.println(a.m);
		a.print();
		
		A b=new A(); //Class A�� ��üȭ ��Ŵ ~����~
		System.out.println(b.m);
		b.print();
		
		A c=new A();
		System.out.println(c.m);
		c.print();
		
		
		B d=new B(); //B Class�� d��� �̸����� ��üȭ ��Ų��.
		d.printName(); //d��ü�� �޼��� ȣ��
		d.printAge();
		d.printPhone();
		
		B e=new B();
		e.printName();
		e.printAge();
		e.printPhone();
	}
}
