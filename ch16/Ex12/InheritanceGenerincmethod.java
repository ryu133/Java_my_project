package ch16.Ex12;
//���׸� �޼ҵ��� ���: �Ϲ� Ŭ���� ���� ���׸� �޼ҵ�

class Parent {
	//Number: Boolean,Charactor�� ������ Wrapper Ÿ���� Ŭ������ �� �� �ִ�(�⺻ �ڷ����� Ŭ����)
	<T extends Number> void Print(T t) {
		System.out.println(t);
	}
}
class Child extends Parent{//���׸� �޼ҵ� ����� �Ϲ� ��Ӱ� ����
	
	
}

public class InheritanceGenerincmethod {
	public static void main(String[] args) {
		//�θ� Ŭ������ ���ʸ� �޼ҵ� ���
		Parent p=new Parent();
		p.<Integer>Print(100);
		p.<Double>Print(4.33);
//		p.<String>Print("asdf"); //����. Number Ÿ�Ը� ����
		p.Print(300); //�Ű������� ������ Ÿ���� �� �� �ִ� ��� ���� ����
		
		//�ڽ� Ŭ�������� ���׸� �޼ҵ� ���
		Child c=new Child();
		c.<Integer>Print(200);
		c.<Double>Print(200.1234);
		
		
	}
}
