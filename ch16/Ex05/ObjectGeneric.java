package ch16.Ex05;


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

class Pancil{
	String name;
	int price;
	Pancil(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void bcd() {
		System.out.println("bcd() print");
	}
	@Override
	public String toString() {
		return "�̸�: "+name+", ����: "+price;
	}
}

//generic class�� ����ؼ� ��ü�� ���� �� �� �о����
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class ObjectGeneric {
	public static void main(String[] args) {
		Goods<Apple> goods1=new Goods(); //goods1�� apple ������ Ÿ���̴�
		goods1.setT(new Apple("apple1", 1000) );
		System.out.println(goods1.getT()); //generic�� �ٿ�ĳ������ ���ʿ�
		(goods1.getT()).abc(); //
		
		Goods<Pancil> goods2=new Goods(); //goods1�� apple ������ Ÿ���̴�
		goods2.setT(new Pancil("pancil1", 1100) );
		System.out.println(goods2.getT());
		(goods2.getT()).bcd();
		
		
	}
}
