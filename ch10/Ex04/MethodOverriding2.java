package ch10.Ex04;
class Animal2{
	void run() {	}
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}
class Egle extends Animal2{
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void egleEat() {
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�.");
	}
}
class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		//��� ��ü�� animal Ÿ������ ��ĳ�����ؼ� ����
		Animal2 animal=new Animal2();
		Animal2 tiger=new Tiger();
		Animal2 egle=new Egle();
		Animal2 snake=new Snake();
		//animal �迭�� �� ��ü ����
		Animal2[] animals= {tiger,egle,snake};
		//for������ �迭�� ��ü ���
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
		}
		//enhanced for���� ����ؼ� ��ü�� run() �޼ҵ� ���
		for (Animal2 k : animals) {
			k.run();
		}
		//�ٿ�ĳ����(instanceof ���) tigerEat(), egleEat() ���
		if (tiger instanceof Tiger) {
			Tiger tiger2=(Tiger)tiger;
			tiger2.tigerEat();
		}
		if (egle instanceof Egle) {
			Egle egle2=(Egle)egle;
			egle2.egleEat();
		}
		
	}

}
