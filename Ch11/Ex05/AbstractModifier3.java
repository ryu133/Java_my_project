package Ch11.Ex05;

import ch10.Ex01.Animal;

//�߻� Ŭ�������� ����ؼ� ����� �����ϴ� ���
abstract class Aninal{
	abstract void cry(); //�߻� �޼ҵ� : ���� �Ǿ��ְ� �����ΰ� ���� �޼ҵ�
}
class Cat extends Aninal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Aninal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}
public class AbstractModifier3 {
	public static void main(String[] args) {
		Aninal a1=new Cat(); //�߻� Ŭ������ Ÿ������ ������ �� �ֵ�.
		Aninal a2=new Dog();
		
		a1.cry();
		a2.cry();
		
		//�߻� Ŭ������ ��üȭ�� �� ����
//		Aninal a3=new Animal(); 
	}
}
