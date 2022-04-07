package ch15.Ex17;

//a.join(1000) : a ��ü���� cpu�� �Ҵ��ϰ� �ڽ��� TimedWaiting ���·� ���
class MyThread1 extends Thread{
	@Override
	public void run() {
		for (long i = 0; i < 100000000L; i++) { } //�ð� ���� 0.5��
		for (long i = 0; i < 100000000L; i++) { } //�ð� ���� 0.5��
		for (long i = 0; i < 100000000L; i++) { } //�ð� ���� 0.5��
		
		
	}
}
class MyThread2 extends Thread{
	MyThread1 myThread1; //Ŭ����Ÿ��  ��������;
	public MyThread2(MyThread1 myThread1) { //�����ڸ� ���ؼ� ���������� �� �Ҵ�
		this.myThread1=myThread1;
	}
	@Override
	public void run() {
		try{
			myThread1.join(3000); //MyThread2�� 3�� ����ϰ� mythread1���� cpu �Ҵ�
		}catch (InterruptedException e) {
			System.out.println("---join() ���� �� interrupt �߻�---");
			for (long i = 0; i < 100000000L; i++) {}
		}
	}
	
	
}


public class TimedWaitingJoin {
	public static void main(String[] args) {
		//��ü ����
		MyThread1 myThread1=new MyThread1();
		MyThread2 myThread2=new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} //������ ���� �غ� �ð� 0.1��
		System.out.println("MyThread State1: "+myThread1.getState());
		System.out.println("MyThread State2: "+myThread2.getState());
		
		myThread2.interrupt(); //3�� ���� ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� runnable�� �̵���
		try {Thread.sleep(1);} catch (InterruptedException e) {} //������ ���� �غ� �ð� 0.1��
		System.out.println("MyThread State1: "+myThread1.getState());
		System.out.println("MyThread State2: "+myThread2.getState());
	}
}
