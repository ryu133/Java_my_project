package ch10.Ex04;
class Animal3{	//��� Ŭ������ Object Ŭ������ �����
	String name;
	int age;
	void cry() {
		System.out.println("animal cry");
	}
	@Override //Object.toString �޼ҵ�� ��ü ��ü�� ����� �� ȣ���
	public String toString() { //��ü�� �ּ� ���. [��Ű����.Ŭ������@��ü�� �޸��� �ؽ��ڵ�]
		return "�̸��� : "+name+", ���̴� : "+age+"�Դϴ�.";
	}
}
class Tiger3 extends Animal3{
	Tiger3(){} //�⺻ ������ : ������ �ʱ�ȭ ���� �Ҵ����� �ʰ� �ʱ�ȭ.  �ٸ� �����ڰ� ��ü ���� ������ �� �⺻�����ڸ� �ܺο��� ȣ�� �� �����ϸ� �ȵ�.
	Tiger3(String a, int b) { //Tiger3 ������: Ŭ������� ����, ���� Ÿ�� ����  ��ü�� �����ؼ� �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.name=a; //super: �θ�(super)Ŭ������ �θ� �� ���
		super.age=b; //this: �ڱ� �ڽ��� ��ü
	}
	@Override
	void cry() {
//		super.cry(); //super : �θ�Ŭ������ ����, ��Ӱ����� �� �θ�Ŭ����
		System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
	}
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String a, int b){
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		System.out.println("���� �۸��ϰ� ��ϴ�.");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Animal3 a3=new Animal3();//a3 ��ü ����
		
		System.out.println(a3); //��ü ��ü�� ����� ���, Object Ŭ������ toString() ȣ���
									//Object.toString() :��ü�� �޸� �ּ��� �ؽ��ڵ带 ��� [��Ű����.Ŭ������@��ü�� �޸��� �ؽ��ڵ�]
		System.out.println(a3.toString());
		
		System.out.println("=======================");
		//��ü ��ü�� ����ϸ� ��ü�� Object class�� toString �޼ҵ带 ȣ��
		
		Tiger3 t3=new Tiger3(); //Tiger3�� Animal3��  ��ĳ����
		Animal3 c3=new  Cat3(); //Cat3�� Animal3�� ��ĳ����
		Animal3 d3=new Dog3();
		
		t3.cry(); //�θ� cry()�� ȣ���� ��� �������̵��� Tiger3�� cry()�� ȣ��
		c3.cry(); //�θ� cry()�� ȣ���� ��� �������̵��� Cat�� cry()�� ȣ��
		d3.cry(); //�θ� cry()�� ȣ���� ��� �������̵��� Dog�� cry()�� ȣ��
		
		System.out.println("========================");
		
		Animal3[] arr= {t3,c3,d3};
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("========================");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		System.out.println("=======================");
		
		Animal3 aa3=new Tiger3("ȣ����",5);
		Animal3 cc3=new Cat3("�����",3);
		Animal3 dd3=new Dog3("��",10);
		
		System.out.println(aa3); //��ü ��ü�� ��� �� �⺻�����δ� ��ü�� �޸� �ؽ��ڵ尡 ���
		System.out.println(cc3); //Object �� toString() �޼ҵ带 ������
		System.out.println(dd3);
		
		Animal3[] arr2= {aa3,cc3,dd3};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=========================");
		
		for (Animal3 k : arr2) {
			System.out.println(k);
		}
		
	}
}
