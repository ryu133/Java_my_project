package ch15.Ex02;
//���ο� ������ ����
//1 thread Ŭ���� ��� �� run() �������̵��ؼ� ����(�ϼ��� �޼ҵ�)
//2 runnable �������̽��� run() ����(�̿ϼ� �޼ҵ�)
class SMFileThread extends Thread{
	@Override
	public void run() {//������ �����忡�� �۾��� ������ ����
		//2��° �����忡�� �۾��� ����
		//�ڸ��� ����ϴ� ������
		String[] strArray= {"�ϳ�", "��","��","��","�ټ�"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		//�ڸ� ��� ����
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ� ��ȣ) "+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class CreatAndStartThread {
	public static void main(String[] args) {
		//������ �۵�
		Thread sm=new SMFileThread();
		sm.start(); //run() �޼ҵ� ���� - ������ ����
		//����: run() ���� ȣ���ϸ� �����尡 �۵��Ǵ� ���� �ƴϰ� �޼ҵ常 ��µ�
		//start(): �����带 �۵��ϱ� ���� �޸� �Ҵ� �� run() ȣ�� : ������� �۾���
		
		//ù��° ������ - ���� ������ ���
		int[] intArray= {1,2,3,4,5};
		
		//���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������) "+ intArray[i]);
			
			//�۾� ����(0.2��)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		
		
		
		
		
	}
}
