package ch0607.Ex06;

class Cde{
	//�ν��Ͻ� �ʵ�: ��üȭ�ؾ� ��� ����
	String name;
	int age;
	
	//���� �ʵ�: ��üȭ �ʿ����(Ŭ������.�ʵ��), ��ü ���� �� ��� ����
	static String email;
	static int num;
}

public class Static4 {
	public static void main(String[] args) {
		Cde cde1=new Cde(); //��üȭ
		cde1.name="ȫ�浿";
		cde1.age=10;
		
		cde1.email="aaa@aaa.com";
		cde1.num=4;
		
		//static �ʵ� ȣ��: Ŭ���������� ȣ�� ����. ��� ��ü���� ������
		Cde.email="cde@ccd.com";
		Cde.num=3;
		
		Cde cde2=new Cde();
		Cde cde3=new Cde();
		Cde cde4=new Cde();
		
		//�ν��Ͻ� �ʵ�: �� ������ ����. �� ��ü���� �������� �ʴ� ������ ���� ������
		
		cde2.name="������";
		cde2.age=50;
		
		cde3.name="������Ȳ";
		cde3.age=60;
		
		cde4.name="�Ż��Ӵ�";
		cde4.age=50;
		
		//�ν��Ͻ� �ʵ� �� ���
		System.out.println(cde2.name+", "+cde2.age);
		System.out.println(cde3.name+", "+cde3.age);
		System.out.println(cde4.name+", "+cde4.age);
		
		//���� �ʵ� �� �����ϴ� ��� ��ü�� ���ؼ� ��� ����
		cde2.email="kkk@kkk.com";
		cde2.num=55;
		
		System.out.println(cde2.email+", "+cde2.num);
		System.out.println(cde3.email+", "+cde3.num);
		System.out.println(cde4.email+", "+cde4.num);
		
	}
}
