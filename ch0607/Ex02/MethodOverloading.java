package ch0607.Ex02;

import java.security.PublicKey;

import kosmo.Print;

//�޼ҵ� �����ε�: �ϳ��� �޼ҵ� ������ �Ű������� Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� (Java)
//�޼ҵ� �������̵�: ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������ؼ� ���

class B{
	static String name="BTS"; //static �� ������ ��ü �������� ȣ�� ����
	static void print() {
		System.out.println(name);
		System.out.println("static�� ���� �޼���");
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		//static: ��ü ���� ���� �ٷ� ȣ���ؼ� ��� �����ϵ��� ��
		//��ü �̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��� ����
		
		System.out.println(B.name); //��ü �̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print(); 					//Ŭ���� �̸����ε� ȣ��
		
		 print1(); //static�̰� ������ Ŭ������ ������ �޼���� �ٷ� ȣ�� ����
		
		 print1(2); //�Ű������� 1���̰� ���� Ÿ���� �޼ҵ带 ȣ��
		 print1(5.5); //�Ű������� 1���̰� �Ǽ� Ÿ���� �޼ҵ带 ȣ��
		 print1(2,8); //�Ű������� 2���̰� ���� Ÿ���� �޼ҵ带 ȣ��
		 
		}
		
	//�޼ҵ� �������̵�: �޼ҵ� �̸��� ����. �Ű����� Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ� ȣ��
	//JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
	//����! �Ű������� Ÿ�԰� ������ ������ ���� �߻�
	public static void print1() {
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print1(int a) {
		System.out.println("����: "+a);
	}
	public static void print1(double b) {
		System.out.println("�Ǽ�: "+b);
	}
//	public static void print1(double k) { //������ ������ Ÿ�԰� ������� ���� �߻�
//		System.out.println("�Ǽ�: "+k);
//	}
	public static void print1(int a, int b) {
		System.out.println("a: "+a+", b: "+b);
	}
	

}
