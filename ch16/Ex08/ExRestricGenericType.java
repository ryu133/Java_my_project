package ch16.Ex08;

abstract class Fruit{ //pancil�� Ÿ������ ������ �� ������ �����ϱ�
	public abstract void print();
}

//DTO(Data Transfer Object): getter,setter
//VO(Value Object): getter
//�����͸� �޾Ƽ� �����ϴ� �߰��� ����
//�������� ���� �޾Ƽ� ����, �߰��� ����
class Generic<T extends Fruit>{ //T: B,C Ŭ������ �� �� �ִ�
	
	public T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public String toString() {
		return t.toString();
	}
	public void printing() {
		t.print();
	}
}
class Apple extends Fruit{
	String name;
	int price;
	Apple(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"�̰� ������ "+price;
	}
	@Override
	public void print() {
		
	}
	
}

class Strawberry extends Fruit{
	String name;
	int price;
	Strawberry(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"�̰� ������ "+price;
	}
	@Override
	public void print() {
		
	}
}
class Banana extends Fruit{
	String name;
	int price;
	Banana(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"�̰� ������ "+price;
	}
	@Override
	public void print() {
		
	}
}
class Pancil{
	String name;
	int price;
	Pancil(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"�̰� ������ "+price;
	}
}


public class ExRestricGenericType {
	public static void main(String[] args) {
		Generic<Apple> applePrinter=new Generic();
		applePrinter.setT(new Apple("a1", 1000));
		
		Apple apple=applePrinter.getT();
		System.out.println(apple);
		apple.print();
		
		Generic<Banana> bananaPrinter=new Generic();
		bananaPrinter.setT(new Banana("b1", 1000));
		
		Banana banana=bananaPrinter.getT();
		System.out.println(banana);
		banana.print();
		
		Generic<Strawberry> strawberryPrinter=new Generic();
		strawberryPrinter.setT(new Strawberry("s1", 1000));
		
		Strawberry strawberry=strawberryPrinter.getT();
		System.out.println(strawberry);
		strawberry.print();
		
//		GenericPrinter<Pencil> pancilPrinter=new GenericPrinter();
//		pancilPrinter.setT(new Pancil("p1", 1000));
//		
//		Pancil pancil=pancilPrinter.getT();
		
//		pancil.print();
		
	}
}
