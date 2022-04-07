package ch15.Ex05;
//��ü �������� �͸�ü�� ������ ���� <== ���� �����
public class CreateAndStartThread4 {
	public static void main(String[] args) {
		//�ڸ���ȣ�� ����ϴ� �������� �͸��̳�Ŭ���� ����
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//#2. �ڸ� ��ȣ �ϳ�~�ټ�
				String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
				try { Thread.sleep(10);} catch (InterruptedException e) {}
				//#4. �ڸ���ȣ ���
				for (int i=0; i<strArray.length; i++) {
					System.out.println(" - (�ڸ���ȣ) "+strArray[i]);
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}	
			}
		});
		
		//���� ������ ��ȣ�� ����ϴ� �������� �͸��̳�Ŭ���� ����
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				//#1 ���������� 1~5
				int[] intArray = {1, 2, 3, 4, 5};
				
				//#3. ���� ������ ���
				for (int i=0; i<intArray.length; i++) {
					System.out.print("(����������) "+intArray[i]);
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}					
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
