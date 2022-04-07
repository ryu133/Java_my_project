package Ch11.Ex06;
abstract class Animal{ //�߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ� �̻� ���ԵǾ��ִ� �Ͽ�, ��ü ���� �Ұ�, Ÿ���� ��� ����
						//�ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 ���� �� ������ ����
						//�߻� Ŭ������ �߻� Ŭ���� ���� �߻�޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ��� �������
	String name;
	int age;
	
	abstract void cry(); //�߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
//	void cry(){} //�Ϲ� �޼ҵ� : ����Ÿ�� �޼ҵ��̸� (�Է¸Ű�����) {�����ڵ�}
	abstract void run();
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}
class Cat extends Animal{ //abstract �޼ҵ带 �Ϻθ� ����� ��� abstract Ŭ������ ��
							//�߻� �޼ҵ带 ��� ������ ���� ��ũ��Ʈ(������ ������) Ŭ������ ��
	Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	void cry() {
//		System.out.println(name+"�� ���� : "+age);
		System.out.println("�߿�");
	}
	@Override
	void run() {
		System.out.println("11�޸���");
	}
}
class Tiger extends Animal{
	Tiger(String name,int age){
		this.name=name;
		this.age=age;
		}
	@Override
	void cry() {
//		System.out.println(name+"�� ���� : "+age);
		System.out.println("����");
	}
	@Override
	void run() {
		System.out.println("22�޸���");
	}
}
class Eagle extends Animal{
	Eagle(String name,int age){
		this.name=name;
		this.age=age;
		}
	@Override
	void cry() {
//		System.out.println(name+"�� ���� : "+age);
		System.out.println("���");
	}
	@Override
	void run() {
		System.out.println("33����");
	}
}
public class AbstractModifier4 {
	public static void main(String[] args) {
		Animal a1=new Cat("�����",10);
		Animal a2=new Tiger("ȣ����",5);
		Animal a3=new Eagle("������",15);
		
		//animal �迭 ��ü�� ���� �� for���� enhanced for���� ����� ��ü ���. cry(), run()
		Animal[] arr= {a1,a2,a3};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println();
		}
		for (Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println();
		}
		
	}
}
