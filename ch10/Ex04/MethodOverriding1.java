package ch10.Ex04;
//�޼ҵ� �������̵�
class Animal{
	void cry() {	}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("±±");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		//1 ������ Ÿ������ ����, ������ Ÿ������ ����
		Animal aa=new Animal();
		Bird bb=new Bird();
		Cat cc=new Cat();
		Dog dd=new Dog();
//		aa.cry(); //animal class cry()
		bb.cry(); //bird class cry()
		cc.cry(); //cat class cry()
		dd.cry(); //dog class cry()
		System.out.println("====");
		
		//2 animal Ÿ������ ����, �ڽ� Ÿ������ ����: ���� ���ε��� ���ؼ� 
		//�θ��� cry()�� ȣ���� ��� �ڽ��� �����ε��� �޼ҵ�� ���ε���
		Animal ab=new Bird(); //ab�� animal,bird Ÿ���� ����. animal�� �ʵ�� �޼ҵ� ���� ����
		Animal ac=new Cat(); //ac�� animal,cat Ÿ���� ����. animal�� �ʵ�� �޼ҵ� ���� ����
		Animal ad=new Dog(); //ad�� animal,dog Ÿ���� ����. animal�� �ʵ�� �޼ҵ� ���� ����
		
		ab.cry();//animal cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� bird cry()�� ȣ���Ѵ�
		ac.cry();//animal cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� cat cry()�� ȣ���Ѵ�
		ad.cry();//animal cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� dog cry()�� ȣ���Ѵ�
		System.out.println("====");
		
		//3 ��ü �迭�� ����
		Animal[] animal= {ab,ac,ad};
		//��ü Ÿ��[] �迭 �̸� = {��ü, ��ü, ��ü};
		
		for (Animal k : animal) {
			k.cry();
		}
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
	}

}
