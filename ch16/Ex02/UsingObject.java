package ch16.Ex02;

//Object�� ��� ��ü�� ������ �� �ִ�
//��ǰ�� �����ϴ� Ŭ������ object Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�
//object�� ����: ��� ��ü�� ���� �� �ִ� (ĳ����)
		//����: �Ź� �ٿ�ĳ������ �ؾ���
			//:���� Ÿ�� üũ: ����� ClassCastException�� �߻��� �� �ִ�. 

class Apple{
	String name;
	int price;
	Apple(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void abc() {
		System.out.println("abc() print");
	}
	@Override
	public String toString() { //��ü ��ü�� ��½� ��ü�� �ּ� ��� �ʵ��� ������ ����ϰ� ����
		return "�̸�: "+name+", ����: "+price;
	}
}
//object�� ����ؼ� ��� ��ǰ�� �����ϴ� Ŭ���� ����
class Goods1{
	private Object object=new Object(); //��� Ŭ������ object Ÿ������ ��ȯ

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) { //object Ÿ������ ��ĳ���õ�
		this.object = object;
	}
	
}

class Pancil{
	String name;
	int price;
	Pancil(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+", ����: "+price;
	}
}


public class UsingObject {
	public static void main(String[] args) {
		Goods1 goods1=new Goods1();
		goods1.setObject(new Apple("apple3", 4000) );
		System.out.println((Apple)goods1.getObject());
		((Apple)goods1.getObject()).abc();
		
		Goods1 goods2=new Goods1();
		goods2.setObject(new Pancil("pancil3", 4000) );
		System.out.println((Pancil)goods2.getObject());
		
	}
}
