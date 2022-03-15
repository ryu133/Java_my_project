package ch10.Ex01;

class DogSub extends Dog{
	int dogsub;
	void dogsub() {
		System.out.println("Dog�� �ڽ� Ŭ�����Դϴ�.");
	}
}
class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��ƸԽ��ϴ�.");
	}
}
class Dog extends Animal{
	int dog;
	void dogEat() {
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Egle extends Animal{
	int egle;
	void egleFly() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}

public class Animal {
	
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}
	
	public static void main(String[] args) {
		//��ĳ������ ���������� ó���ϱ⶧���� ���� ȿ�������� ���α׷��� ó�� ����
		//������: �������̵�-��ӵ� �ϳ��� ������ ������ �޼ҵ�-���� ���� ������ ó���� �� ����
		
		//1 animal class ��üȭ
		Animal a1=new Animal();
		
		//2 dog class ��üȭ
		Dog d1=new Dog(); //animal, dog�� �ʵ�� �޼ҵ� ���� ����
		
		//3 dog class �� animal Ÿ������ ��ĳ����
		Animal a2=new Dog(); //a2�� animal,dog ����, animal�� �ʵ�� �޼ҵ� ���� ����
		
		//4 dogsub class�� animal Ÿ������ ��ĳ����
		Animal a3=new DogSub(); //a3�� animal,dog,dogsub ����, animal �ʵ�� �޼ҵ� ���� ����
		a3.name="��Ƽ��"; //animal field
//		a3.dog=1; //dog field ���� �Ұ�
		
		//5 dogsub class�� dog Ÿ������ ��ĳ����
		Dog d2=new DogSub(); //d2�� animal,dog,dogsub ����,   animal,dog�� �ʵ�� �޼ҵ� ���� ����
		d2.name="���۵�"; //animal field
		d2.dog=5; //dog field
//		d2.dogsub=3; //dogsub�� ���� �Ұ�
		
		//animal <== dog <== dogsub
		//6 dogsub�� dogsub ������ Ÿ������ ��üȭ
		DogSub ds1=new DogSub();
		//ds1�� animal,dog,dogsub �߿� animal,dog,dogsub �ʵ�� �޼ҵ� ��� ���� ����
		ds1.name="������"; //animal �ʵ�
		ds1.age=4; //animal field
		ds1.dog=2; //dog field
		ds1.dogsub=1; //dogsub field
		
	//��ӿ��� ��ĳ����, �ٿ� ĳ����
		
		//��ĳ����: �ڽ� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ�ϴ� �� (��ü�� Ŭ����(Ʋ)�� �ٲ�?�̰� ���� ����)
		//�θ� Ÿ���� �ʵ�� �޼ҵ常 ���� ����
		//���� Ÿ�� ��ȯ���� �ڵ����� ��ĳ���õ� 
		//ds1�� dogsub ������ Ÿ���� ������ �ְ� animal,dog,dogsub �ʵ�� �޼ҵ� ��� ���� ����
		
		Dog ds1c1=ds1; //��ĳ����  dogsub ==> dog : animal,dog ���� ����
		Dog ds2c1=(Dog)ds1; //��ĳ������ ���� Ÿ�� ��ȯ ���� ���� 
		Animal ds1c2=ds1; //��ĳ���� dogsub ==> animal : animal ���� ����
		
		//ds1 : dogsub (animal,dog,dogsub)
		//ds1c1 : dog (animal,dog)
		//ds1c2 : animal (animal)
		
		//�ٿ� ĳ����: �θ� ������ Ÿ���� �ڽ� ������ Ÿ������ ��ȯ
		//���� Ÿ�� ��ȯ �ʿ�. �������� �ٿ�ĳ���õ� 
		//a3�� animal,dog,dogsub �� animal�� ���� �����ϵ��� ��ĳ���� ��
		Dog a3down1=(Dog)a3; //a3 [animal] ==> a3down1 [dog]
		DogSub a3down2=(DogSub)a3; //a3 [animal] ==> a3down2 [dogsub]
		
		
	}

}
