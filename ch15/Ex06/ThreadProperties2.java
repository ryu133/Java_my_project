package ch15.Ex06;

//������ �켱 ����
class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000 ; i++) { } //�ð� ������
		System.out.println(getName() + "  �켱���� : "+ getPriority());		
	}
}


public class ThreadProperties2 {
	public static void main(String[] args) {
		//����: CPU core
		System.out.println("�ھ�� : "+ Runtime.getRuntime().availableProcessors()); //
		
		//1 �⺻(default: 5) �켱����
			//0(����)~5(default)~10(����)
		for(int i=0; i<3; i++) {
			Thread thread = new MyThread();
//			System.out.print(thread.getName()+"\t");
//			System.out.println(thread.getPriority());
			thread.start();
		}
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		//2 �켱������ ���� ����
		for(int i=0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+"��° ������");
//			System.out.print(thread.getName()+"\t");
//			System.out.println(thread.getPriority());
			if(i==9) thread.setPriority(10);
			thread.start();
		}	
	}
}
