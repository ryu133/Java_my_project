package ch15.Ex01;

public class TheNeedForThread {
	public static void main(String[] args) {
		//���� ������ 1~5
		int[] intArray= {1,2,3,4,5};
		
		//�ڸ� ������ �ϳ�~�ټ�
		String[] strArray= {"�ϳ�","��","��","��","�ټ�"};
		
		//3 ���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(���� ������) "+intArray[i]);
			//0.2�� ���� �Ͻ����� ����
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
		
		//4 �ڸ� ������ ���
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("(�ڸ� ��ȣ) "+strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
		
	}
}
