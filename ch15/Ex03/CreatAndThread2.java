package ch15.Ex03;
//2��° ������
class SMFileThread extends Thread{ //�ڸ� ���� ó�� ������
	@Override
	public void run() {
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) "+strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {} //0.2�� ������
		}
		
	}
}
//3��° ������
class VideoFileThread extends Thread{ //���� ������ ó�� ������
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(����������) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreatAndThread2 {
	//1��° ���ν�����
	public static void main(String[] args) {
		//SMIFileThread ��ü ���� �� ����
		Thread smi=new SMFileThread();
		smi.start();
		
		//VideoFileThread ��ü ���� �� ����
		Thread video=new VideoFileThread();
		video.start();
	}
}
