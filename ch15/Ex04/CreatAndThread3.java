package ch15.Ex04;

//Runnable �������̽� ����Ͽ� run()�� �����ϴ� Ŭ���� ����
class SMIFileRunnalble implements Runnable { //�������̽�
	@Override
	public void run() {
		//�ڸ� ��ȣ �ϳ�~�ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		//�ڸ���ȣ ���
		for (int i=0; i<strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) "+strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//���������� 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		//���� ������ ���
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(����������) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}			
	}
}

public class CreatAndThread3 {
	public static void main(String[] args) {
		//SMIRunnable ��ü ����
		Runnable smi = new SMIFileRunnalble();
		//smiFileRunnable.start(); //start()�� runnable �������̽� ���� �������� �ʴ´�(����)
		Thread thread1 = new Thread(smi);//runnable ��ü�� thread ������ ���ο� �ִ´�
		thread1.start();
		
		//VideoFileRunnable ��ü ����
		Runnable video = new VideoFileRunnable();
		//videoFileRunnable.start(); //����
		Thread thread2 = new Thread(video);
		thread2.start();
		
		
	}
}
