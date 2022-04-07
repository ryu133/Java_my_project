package ch15.Ex20;

class DataBox {
	boolean isEmpty=true;
	int data;
	synchronized void inputData(int data) { //����ȭ �޼ҵ�
		if (!isEmpty) { //false�� ��  
			try {
				wait(); //����ȭ ����̳� ����ȭ �޼ҵ忡�� WAITING ���·� ��ȯ
						//wait(i); //t2 �����尡 ó���ϵ��� ��� ��� 
			} catch (InterruptedException e) {}
		}
		isEmpty=false; //data �ʵ忡 ���� �ְ� �ڽ��� t2�� ���� ���� �� �ֵ��� false�� ���� 
		this.data = data;
		System.out.println("�Էµ����� : "+data); //�Ű����� ������ ���� ������
		notify();
	}
	synchronized void outputData() { //����ȭ �޼ҵ�
		if (isEmpty) { //true�� ��  
			try {wait();} catch (InterruptedException e) {} //WAITING ���·� ��ȯ
			}
		isEmpty=true;
		System.out.println("��µ����� : "+data); //data: �޸��� data , this ������
		notify(); //inputData() �޼ҵ��� wait()�� �����带 �����ش�
	}
}

public class WaitingWaitNotify2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		//ù��° ������ : ���� ��ü�� ���� �ִ� ������
		Thread t1 = new Thread() { //�͸� ����Ŭ����
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		//�ι�° ������ : ���� ��ü�κ��� ���� �о���� �޼ҵ�
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}