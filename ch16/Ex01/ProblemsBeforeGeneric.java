package ch16.Ex01;

//��ü�� ���� Ŭ������ ���� ��� �Ź� ��ü�� ������ ������ �� ��ü�� ���� Ŭ������ �����ؾ���

class Apple{
	String name;
	int price;
	Apple(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() { //��ü ��ü�� ��½� ��ü�� �ּ� ��� �ʵ��� ������ ����ϰ� ����
		return "�̸�: "+name+", ����: "+price;
	}
}
//apple Ŭ������ ����� Ŭ���� ����
class Goods1{
	private Apple apple=new Apple("���1" , 5000);
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple=apple;
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

//pancil�� ����� Ŭ���� ����
class Goods2{
	private Pancil pancil=new Pancil("����1", 2000);

	public Pancil getPancil() {
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}
	
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
	
		Goods1 goods1=new Goods1();
		goods1.setApple(new Apple("apple2", 4000) );
		System.out.println(goods1.getApple());
		
		
		Goods2 goods2=new Goods2();
		goods2.setPancil(new Pancil("����2", 4000));
		System.out.println(goods2.getPancil());
		
	}	
}
