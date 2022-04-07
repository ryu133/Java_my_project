package ch15.Ex18;

//blocked ����: ����ȭ �޼ҵ峪 ����ȭ ��Ͽ��� �� �����尡 Ű�� �����ؼ� ��� ������ ������ 

class MyBlockTest{
	//���� ��ü(����ȭ �ޤļҵ�, ����ȭ ��Ͽ��� ó���ϱ� ������ �ʿ���)
	MyClass mc=new MyClass();
	//�� ���� ������ �ʵ� ����
	Thread t1=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t2=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t3=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	
	class MyClass{
		synchronized void syncMethod() { //����ȭ �޼ҵ� : Ű�� ���� �����常 ���� ����
			try {Thread.sleep(100);} catch (InterruptedException e) {} //������ �غ�ð� 0.1��
			System.out.println("==="+Thread.currentThread().getName()+"====");
			System.out.println("thread1 -> "+t1.getState());
			System.out.println("thread1 -> "+t2.getState());
			System.out.println("thread1 -> "+t3.getState());
			
		}
	}
}

public class BlockedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();	
	}
}
