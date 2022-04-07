package ch15.Ex16;
//Thread.sleep(1000) ==> TimedWaiting ���·� �̵� ==> Ư�� �ð�(1��)�� ����Ǹ� Runnable ���·� �̵���
															//	==> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable ���°� ��
//�ν��Ͻ���(��ü��).join(1000); ==> TimedWaiting ���·� �̵� ==> Ư�� �ð�(1��)�� ����Ǹ� Runnable ���·� �̵���
//a.join(1000); : �ڽ��� ������� 1�ʸ� ��ٸ��� a ��ü���� cpu�� �Ҵ�(Runnable), 1�� �ڿ��� �ڽ��� �����嵵 Ȱ��ȭ
//����) a.join(); ==>Waiting ���·� �̵� ==> 
// �ڽ��� ������� ��� ���߰�(Waiting) a ��ü���� cpu�� (runnable)����ϵ��� �Ҵ�, a ��ü�� ��� �Ϸ�Ǹ� �ڽ��� �����尡 Runnable ���°���

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(3000); //3�� ���� TimedWaiting ���·� �̵�, 3�� �Ŀ��� Runnable ���·� �̵�
								//Interrupt �߻� �� ���ܸ� �߻���Ű�� Runnable ���·� �̵�
		} catch (InterruptedException e) {
			System.out.println("---sleep() ���� �� Interrupt �߻�---");
			for (long i = 0; i < 100000000L; i++) { }//�ð����� 0.5��
		}
		
	}
}



public class TimedWaitingSleep {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start(); //Runnable ����
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}//������ ���� �غ� �ð�
		System.out.println("MyThread State1: "+myThread.getState()); //TimedWaiting
		
		//3�� ������ interrupt(�ð�����) ���� �߻�
		myThread.interrupt(); //TimedWaiting
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State2: "+myThread.getState());
		
	}
}
