package ch0607.Ex03;
//������ �����ε�: �ϳ��� �����ڸ� ���� ������ Ÿ�԰� ������ ���� �ٸ� �����ڰ� ȣ���
//����! ������ Ÿ�԰� �Ű������� ���� ��� ���� �����ڸ� ��������� ��� ���� �߻�
class Abc{
	int a,b,c;
	String d;
	
	Abc(){System.out.println(a+", "+b+", "+c);} //�⺻ ������
	Abc(int a){ //�Ű������� 1���� ������
		this.a=a;
		System.out.println(a);
	}
	Abc(int a,int b){//�Ű������� 2���� ������
		this.a=a;
		this.b=b;
		System.out.println(a+", "+b);
	}
	Abc(int a,int b,int c){//�Ű������� 3���� ������
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+", "+b+", "+c);
	}
	Abc(String d){
		this.d=d;
		System.out.println(d);
	}
	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		
		Abc abc=new Abc(); //�⺻ ������ ȣ��
		Abc abc1=new Abc(1);
		Abc abc2=new Abc(2,3);
		Abc abc3=new Abc(4,5,6);
		Abc abc4=new Abc("aaa"); //�Ű������� ���� ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ��
		
		
		
	}
}
