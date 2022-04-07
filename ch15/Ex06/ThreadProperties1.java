package ch15.Ex06;

public class ThreadProperties1 {
	public static void main(String[] args) {
		//1 ��ü �������� (currentThread()) / ������ �� (activeCount())
		Thread curThread = Thread.currentThread(); //���� ������(main)
		//Ŭ����(������ Ÿ��) �������� = Ŭ������.�޼ҵ��
		System.out.println("���� �������� �̸� = " + curThread.getName());
		System.out.println("�����ϴ� ������ �� = " + Thread.activeCount());
		
		//2 ������ �̸� ���� (�ڵ�����) - JVM�� ������ �̸��� �ڵ� �Ҵ�( Thread-0 ~ Thread-n)
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); //������ �̸� ���
			thread.start();
		}
		
		//3 ������ �̸� ���� ���� : ��ü��.setName()
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			thread.setName(i+" ��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		
		//4 ������ �̸� ���� (�ڵ�����)
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}		
		
		//5 ������ �� 
		System.out.println("�����ϴ� ������ �� = " + Thread.activeCount());
		
		
		
	}
}
