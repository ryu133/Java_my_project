package Ch11.Ex04;
//�߻� Ŭ������ ������� �ʴ� ��� 
// �ڽ� Ŭ�������� �޼ҵ� �������̵� �� �������̵��� ��Ÿ�� ���� �߸� ������ �� ����
//
class Animal{
	void cry() {} 
}
class Cat extends Animal{
	void cRy() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void Cry() {
		System.out.println("�۸�");
	}
}
public class AbstractModifier2 {
	public static void main(String[] args) {
		Animal a1=new Cat();
		Animal a2=new Dog();

		a1.cry();
		a2.cry();
		
	}
}
