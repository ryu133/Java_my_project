package ch12.Ex05;
//1 ��ü ����
//2 �͸� Ŭ����

//interface ���� : ����� �ְ� ���α׷��Ӱ� ��(PM)
interface A{
	double PI=3.14; //public static final
	void run(); //public abstract
}
class B implements A{
	@Override
	public void run() { //public �ʼ�
		System.out.println("�޸���");
	}
}
public class Interface5 {
	public static void main(String[] args) {
		//1 ��ü ����
		A a1=new B();
		a1.run();
		
		//2 �͸� Ŭ����
		A a2=new A() {
			@Override
			public void run() {
				System.out.println("����");
			}
		};
		a2.run();
	}
}
