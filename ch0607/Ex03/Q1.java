package ch0607.Ex03;

class Car{
	String company; //�ʵ�(�ν��Ͻ� �ʵ�)�� company�� �˷��ִ� this. heap �޸𸮿� ����
	String model; //�ν��Ͻ�: ��üȭ ���� �� ��� ������ �ʵ�
	String color; //�ʵ��� �ʵ尪�� �� ������ ����
	double maxSpeed;
	Car(){} //�⺻ ������
	Car(String company, String model, String color,double maxSpeed){
		this.company=company; //this�� ��ü�� �ʵ��� ������ ����
		this.model=model; //3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ����
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void work() { //�޼ҵ�(�ν��Ͻ� �޼ҵ�): �޼ҵ��� �����͸� �� ������ ����
				//�޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.println("ȸ��: "+company+", ��: "+model+", ��: "+color+", �ִ�ӷ�: "+maxSpeed);
	}
}
public class Q1 {

	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻���� �Ҵ� �� �޸��� ������ work() �޼ҵ带 ����ؼ� ���
		Car c1=new Car("A","a","blue",200);
		c1.work();
		Car c2=new Car();
		c2.work();
		
		
	}

}
