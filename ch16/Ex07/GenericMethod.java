package ch16.Ex07;
//���ʸ� Ŭ����: Ŭ������ ������ �� Ÿ�� ������ ���� <T> <<����, ��ü�� ������ �� T�� ������ Ÿ���� ����

//���׸� �޼ҵ�: �Ϲ� Ŭ���� ���ο� �޼ҵ� ���� �� ���׸� Ÿ�� ���� ���

class GenericMethod1{ //�Ϲ� Ŭ����
	public <T> T method1(T t) { //���ʸ� �޼ҵ�
		return t;
	}
	
	public <T> boolean method2(T t1,T t2) {
		return t1.equals(t2); //�� ���� ���ؼ� true or false ����
		//�⺻ �ڷ����� ��� ���� ��, ���� �ڷ����� ��� ��ü�� �ּ� ��, 
		//string�� ��� �������̵� �Ǿ��ֱ�(equals()�� �����ǵ�) ������ ���� ��
		//integer,double equals()�� ������ �Ǿ�����
	}
	public <K,V> void method3(K k,V v) {
		System.out.println(k+", "+v);
	}
	public <K,V> void method4() {
		System.out.println("�Ű������� ��ǲ ������ ���� ��� ������ ����");
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		//�Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		GenericMethod1 gm=new GenericMethod1();
		String str1=gm.<String>method1("�ȳ�"); 
		String str2=gm.method1("�ȳ�"); //Ÿ���� �� �� �ִ� ��� ���� ����(ȣ���� ��) �Ű������� ���� �� �� ���� ����
		System.out.println(str1);
		System.out.println(str2);
		
		Integer integer1=gm.<Integer>method1(1523);
		Integer integer2=gm.<Integer>method1(1327);
		System.out.println(integer1);
		System.out.println(integer2);
		
		Boolean b1=gm.<Boolean>method1(true);
		Boolean b2=gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		
		Boolean bd1=gm.<Double>method2(2.55, 6.45); //false
		Boolean bd2=gm.<Double>method2(2.55, 2.55); //true
		System.out.println(bd1);
		System.out.println(bd2);
		
		gm.<String,Integer>method3("����", 90);
		gm.method3("����", 80);
		gm.<Integer,String>method3(500, "���� ����");
		gm.method3(402, "������ ã�� �� �����ϴ�.");
		
		gm.method4();
		
	}

}
