package ch12.Ex03;

interface A {}
interface B {}

//1 ���� �������̽� ���
class C implements A {} //C Ŭ������ A �������̽��� ����(���)
//2 ���� �������̽� ���
class D implements A,B {} //D Ŭ������ ���� ����(���) ����
//3 Ŭ������ �������̽� ��� (extends�� implements�� ������ ����)
	//extends: ������ Ÿ�� ��� / implements: �ٸ� Ÿ�� ���
	//Ŭ���� ���� ��� �Ұ� , �������̽� ���� ��� ����
class E extends C implements A,B {} 
public class Interface3 {
	public static void main(String[] args) {
		
	}
}
