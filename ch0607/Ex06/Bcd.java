package ch0607.Ex06;

import ch0607.Ex05.ExternalAbc;

public class Bcd { //�θ� Ŭ����
	public int a=10;
	protected int b=20; //�ڽ� Ŭ�������� ������ �ʵ�
	int c=30;
	private int d=40;
	
	//Bcd(){ } //<==�⺻ ������: �ʵ��� �ʱⰪ�� �Ҵ��Ͽ� ��ü�� ����
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ����: public");
	}
	protected void print2() {
		System.out.println("�ٸ� ��Ű������ ���� ����: protected(��Ӱ����� ��)");
	}
	void print3() {
		System.out.println("���� ��Ű������ ���� ����: default");
	}
	private void print4() {
		System.out.println("���� Ŭ�������� ���� ����: private");
	}
}
