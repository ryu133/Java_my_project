package ch15.Ex19;

//Waiting 
	//a.join(): �ڽ��� ������� waiting �����̰� a ��ü���� cpu �Ҵ�(runnable)
		//a ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 Ȱ��ȭ��(runnable)
		//�ڽ��� �����尡 ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ��� ��쿡 ���
	//wait(), notify(), notifyAll() <== ����ȭ ��Ͽ����� ����
	//wait(): ����ȭ ��� ������ wait() �޼ҵ带 ������ waiting ���°� ��
	//notify()&notifyAll(): wait() �޼ҵ带 ������ (�ݵ�� �ٸ� �����忡�� ������ �� ����)
	//

class DataBox {
	int data;
	synchronized void inputData(int data) { //����ȭ �޼ҵ�
		this.data = data;
		System.out.println("�Էµ����� : "+data);
	}
	synchronized void outputData() { //����ȭ �޼ҵ�
		System.out.println("��µ����� : "+data);
	}
}

public class WaitingWaitNotify1 {
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
