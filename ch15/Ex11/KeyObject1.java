package ch15.Ex11;
// ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ���� �߻� ===>> ����ȭ�� ���ü� ������ �ذ���
// ����ȭ: ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ���� �����ϰ� ��
// �ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ���  lock ����
// ��� ��ȭ�� �޼ҵ�� this��� Ű�� ������
//���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ��� : �ϳ��� �����常 ���� ����

class MyData{
	//����ȭ�� �޼ҵ�� key���� ��� this�� �ڵ����� ��ϵ�, ���� �Ұ�
	//����ȭ �޼ҵ�� key���� ���� �� ����
	//�ϳ��� �����尡 ������ �� key�� ������ ����ȭ�� �޼ҵ� ���� ����
	//key�� ��ü�� Ű�� ����� �� �ִ�
	//����ȭ ����� key���� ���Ƿ� �Ҵ� �����ϴ�
	synchronized void abc() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {} 
			System.out.println(i+" sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
		}
	}
	synchronized void bcd() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(20);} catch (InterruptedException e) {} 
			System.out.println(i+" ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
		}
	}
	synchronized                                                 void cde() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e) {} 
			System.out.println(i+" ��°");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
		}
	}
}


public class KeyObject1 {
	public static void main(String[] args) {
		MyData myData=new MyData(); //������ü: ���� �����尡 ���� ��ü�� ����
		
		
		//3���� �����尡 ������ �޼ҵ� ȣ��
		new Thread() { //�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() { //�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() { //�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
