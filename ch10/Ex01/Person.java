package ch10.Ex01;

class StudentSub extends Student{
	//studentsub�� student�� �ʵ�� �޼ҵ带 ��ӹ޴´�.
	//student�� person�� �ʵ�� �޼ҵ带 ��ӹ޴´�.
	//studentsub�� person�� student�� �ʵ�� �޼ҵ带 ��� ��ӹ޴´�.
	String sub1;
	
	void sub1() {
		System.out.println("studentsub Ŭ������ sub1 �޼ҵ� ȣ��");
	}
}

class Student extends Person{ //�ڽ� extends �θ�
	//�ڽ� Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ���
	int studentID;
	void goToSchool() {
		System.out.println("�ڽ� Ŭ������ Student �޼ҵ� goToSchool ȣ��");
	}
}

class Worker extends Person{ //������ Ŭ����
	int workerID;
	void goToWork () {
		System.out.println("�ڽ� Ŭ������ Worker �޼ҵ� goToWork ȣ��");
	}
}

public class Person { //���: �θ� Ŭ������ �ʵ�, �޼ҵ�, ����Ŭ������ �ڽ� Ŭ�������� ���
	String name; //����� ���� 1. �ߺ��� �ڵ� ����(�ڵ� ����) 2. ������ �ڵ� 3. ������(�޼ҵ� �������̵�): �ϳ��� �޼ҵ���� ������ 
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat() �޼ҵ�");
	}
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");
	}

	public static void main(String[] args) {
		//#1. Person ��ü (�ʵ�2��, �޼���2��)
		Person p = new Person();
		p.name="ȫ�浿";
		p.age=12;
		p.eat();
		p.sleep();
		
		//#2. Student ��ü
		Student s = new Student(); //Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ���
		//�ڽ� Ŭ������ �θ� Ŭ������ ����� �ʵ�� �޼ҵ带 ���
		//Person class Field
		s.name="�̼���";
		s.age=50;
		
		//Student class Field
		s.studentID=20220310;
		
		//Person class method
		s.eat();
		s.sleep();
		
		//Student class method
		s.goToSchool();

		//#3. Worker ��ü 
		Worker w = new Worker(); //Person Ŭ������ ����Ѵ�. Person Ŭ������ �ʵ�� �޼ҵ� ���
		
		//�θ� Ŭ������ �ʵ�
		w.name="�������";
		w.age=60;
		
		//�ڽ� Ŭ������ �ʵ�
		w.workerID=20220311;
		
		//Person class method
		w.eat();
		w.sleep();
		
		//Student class method
		w.goToWork();
		
		System.out.println("======��ü ���� �� Ÿ�� ��ȯ=====");
		
		Person p1=new Person(); //Person�� Person�̴�. (�ڽ��� �θ��)
		Person ps=new Student(); //��ĳ����, student�� person�̴�.
//		Student sp=new Person(); //Person�� student�̴�. (x) ����
		Person pw=new Worker();//��ĳ���� worker�� person�̴�(o)
//		Worker wp=new Person();//person�� worker�̴�(x)
		
			System.out.println("====Person < Student < StudentSub====");
			StudentSub sub1=new StudentSub(); //����
			//Ŭ���� Ÿ��  ��ü�� = new  �ڽ� Ŭ����
			
			//person Ŭ������ �ʵ�� �޼ҵ� ��� ����
			sub1.name="�Ż��Ӵ�";
			sub1.age=50;
			sub1.eat();
			sub1.sleep();
			//student Ŭ������ �ִ� �ʵ�� �޼ҵ�
			sub1.studentID=20220310;
			sub1.goToSchool();
			//studentSub�� �ʵ�� �޼ҵ�
			sub1.sub1="�ڽ��� �ڽ� Ŭ����";
			sub1.sub1();
		
			
		Person ps1=new StudentSub(); // ��ĳ����  studentsub ��ü�� ���� �� �θ� ������ Ÿ������ ����ȯ
		//studentsub�� person ������ Ÿ������ ��ĳ����, person Ŭ������ ����� ��� ����
		ps1.name="bts"; //personŬ������ �ʵ�� �޼ҵ常 ���� 
		ps1.age=30;
		ps1.eat();
		ps1.sleep();
		
		Student ss1=new StudentSub(); // ��ĳ����: studentsub�� student Ÿ������ ��ĳ����
		//person�� student �� �ʵ�� �޼ҵ带 ��� ����
		//person�� �ʵ�� �޼ҵ�
		ss1.name="ses";
		ss1.age=30;
		ss1.eat();
		ss1.sleep();
		//student �� �ʵ�� �޼ҵ�
		ss1.studentID=20220310;
		ss1.goToSchool();
		
		StudentSub ss2=new StudentSub(); //person, student, studentsub�� �ʵ�� �޼ҵ� ��� ��� ����
		//personŬ������ �ʵ�� �޼ҵ�
		ss2.name="�����������ܿ�";
		ss2.age=40;
		ss2.eat();
		ss2.sleep();
		//studentŬ������ �ʵ�� �޼ҵ�
		ss2.studentID=20220310;
		ss2.goToSchool();
		//studentsub Ŭ������ �ʵ�� �޼ҵ�
		ss2.sub1="�ڽ��ڽ�";
		ss2.sub1();
		
		
		//��� ���迡�� ��ü ���� �� �θ� ������ Ÿ������ ���J���� ����
		//�θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ� ���� ����
		
		//person <== student <== studentsub
		Person ps4=new Student();
		//studentsub ��ü ���� �� person Ÿ������ ��ĳ����(�ڵ� ��ȯ)
		//studentsub�� person�� student�� studentsub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		//�� �� person Ŭ������ �ʵ�� �޼ҵ常 ���� ����
		
		Student ss4=new StudentSub();
		//studentsub ��ü ���� �� student Ÿ������ ��ĳ����
		//studentsub�� person�� student�� studentsub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		//�� �� person,student Ŭ������ �ʵ�� �޼ҵ� ���� ����
		
		StudentSub ss5=new StudentSub();
		//studentsub�� studentsub�� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
		//�� �� person,student, studentsub Ŭ������ �ʵ�� �޼ҵ� ���� ����
		
		//�ٿ� ĳ����: �θ� ������ Ÿ������ ��ĳ���� �� ���� �ڽ� ������ Ÿ������ ��ȯ�ϴ� ��(���� ��ȯ)
		
		Student ps5=(Student)ps4; //ps4(person, student, studentsub) �� ������ Ÿ��: person
		//ps5�� person, student�� �ʵ�� �޼ҵ� ���� ����
		ps5.name="�ٿ�ĳ����";
		ps5.age=30;
		ps5.studentID=20220310; //student �ʵ�� �޼ҵ� ��� ����
		ps5.goToSchool(); //student�� �޼ҵ�
		
		StudentSub ps6=(StudentSub)ps4;// ps4�� person ������ Ÿ�Կ��� studentsub�� �ٿ�ĳ����
		//studentsub�� �ٿ�ĳ���õ�(person,student,studentsub�� �ʵ�� �޼��� ��� ����)
		ps6.name="�̿��";
		ps6.age=30;
		ps6.studentID=20220310; //student
		ps6.sub1="�ڽ��� �ڽ�"; //student
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
