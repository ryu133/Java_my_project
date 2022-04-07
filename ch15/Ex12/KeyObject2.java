package ch15.Ex12;
class A{}
class B{}
class C{}
class MyData{
	//����ȭ�� �޼ҵ�� key���� ��� this�� �ڵ����� ��ϵ�, ���� �Ұ�
	//����ȭ �޼ҵ�� key���� ���� �� ����
	//�ϳ��� �����尡 ������ �� key�� ������ ����ȭ�� �޼ҵ� ���� ����
	//key�� ��ü�� Ű�� ����� �� �ִ�
	//����ȭ ����� key���� ���Ƿ� �Ҵ� �����ϴ�
	synchronized void abc() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
				try {Thread.sleep(10);} catch (InterruptedException e) {} 
				for (int i = 0; i < 3; i++) {
				System.out.println(i+" sec");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
		}
	}
	synchronized void bcd() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		try {Thread.sleep(20);} catch (InterruptedException e) {} 
		for (int i = 0; i < 3; i++) {
			System.out.println(i+" ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
		}
	}
	void cde() { //���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		synchronized (new Object()) { //������ Ű ����: ������ Ű,�����尡 �����ϴ� Ű,��ü ����
			try {Thread.sleep(30);} catch (InterruptedException e) {} 
			for (int i = 0; i < 3; i++) {
				System.out.println(i+" ��°");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} //1�� ����
			}
			
		}
	}
}


public class KeyObject2 {
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
