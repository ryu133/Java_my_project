package ch10.Ex04;
class Human{ //�θ� Ŭ����
	String name; //�ν��Ͻ� �ʵ�: ��üȭ ���Ѿ� ��� ����, �� ������ ����
	int age;
	
	void eat() { //�ν��Ͻ� �޼ҵ�: ��üȭ ���Ѿ� ��� ����, ���� �ּҰ�(pointer) ����, 
									//Ŭ������ �ν��Ͻ� �޼ҵ� ������ ���� �޼ҵ��� �ڵ� ����
		System.out.println("����� �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
}
class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("student go to school");
	}
}
class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("worker go to company");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Human h=new Human(); //�θ�Ŭ����
		h.name="hong gil dong";
		h.age=30;
		h.eat();
		h.sleep();
		
		Student s=new Student(); //�ڽ�Ŭ����: �θ�Ŭ������ �ʵ�� �޼ҵ带 ��ӹ���
		s.name="�Ż��Ӵ�"; //�θ�
		s.age=40; //�θ�
		s.eat(); //�θ�
		s.sleep(); //�θ�
		s.studentID=1111; //�ڽ�
		s.goToSchool(); //�ڽ�
		
		Worker w=new Worker();
		w.name="bts"; //�θ�
		w.eat(); //�θ�
		w.workerID=2222; //�ڽ�
		w.goToCompany(); //�ڽ�
		
		Human h1=new Student(); //��ĳ���� : �ڽ� => �θ� Ÿ������ ����ȯ
		
		h.name="�̼���";
		h.eat();
		
		System.out.println(h1 instanceof Human); //true
		System.out.println(h1 instanceof Student); //true
		
		Student s1=(Student)h1; //�ٿ�ĳ����; ��Ÿ�� ������ �����ϱ� ���� if (��ü instanceof Ŭ����)�� �����
		
		if (h1 instanceof Student) {
			Student s2=(Student)h1;
			s2.studentID=3333;
			s2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker w1=(Worker)h1; //instanceof�� ���� �ʴ´ٸ� ������ ������ �ƴ����� ��Ÿ�� ���� �߻���
			
		}
		
		
		
		
		
	}
}
