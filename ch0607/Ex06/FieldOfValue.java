package ch0607.Ex06;

//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ���
//1. �ʵ忡 ���� ���� �ο��ϴ� ��� <- ��ü�� ���� �� 
//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο� <- ��ü�� ���� �� 
//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� <- ��ü�� ������ �� �ʱⰪ���� �Ҵ� 

class Aa{ //1. ��ü ���� �� ���� �ʵ忡 �� �Ҵ�
	String name; //�̸�
	int age; //����
	String mail; //�����ּ�
	
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
class Bb{ //2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name; //�̸�
	int age; //����
	String mail; //�����ּ�
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
class Cc{ //3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name; //�̸�
	int age; //����
	String mail; //�����ּ�
	
	Cc(String name,int age, String mail){
		this.name=name;
		this.age=age;
		this.mail=mail;
	}
	
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
public class FieldOfValue {
	public static void main(String[] args) {
		Aa aa=new Aa();

		aa.name="����";
		aa.age=10;
		aa.mail="aa@aaa.com";
		aa.print();
		
		Bb bb=new Bb();
		bb.setName("����");
		bb.setAge(20);
		bb.setMail("bb@bbb.com");
		bb.print();
		
		Cc cc=new Cc("�ٴ�",30,"cc@ccc.com");
		cc.print();
		
		
		
	}
}
