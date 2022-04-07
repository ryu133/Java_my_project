package ch15.Ex07;

//�Ϲ� ������ : setDeamon(false) default off: ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� �����Ѵ�

//���� ������: setDeamon(true) , �����带 start�� �� �����̳� ���� �Ұ�
//������ �����尡 ����Ǵ� ������ �����. �ٸ� �������� �۾��� ���� ���� ������ ������
//�������(������ �Ϲݽ����尡 ����� ��) �ܿ��� �Ϲ� ������� ������
//������ �÷���(�޸��� ������ �ʴ� ��ü�� ������ �÷��Ͱ� �ڵ����� ��ü�� ����)
//-���μ����� ��������� �ڵ� ����, ȭ�� �ڵ� ����
//-���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����ϸ� �۾��� �����ϰ� �ٽ� �����·� ��



class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" : "+(isDaemon()?"���󽺷���":"�Ϲݽ�����"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName()+" : "+i+"��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {	}
		}
		
	}
}

public class ThreadProperties3 {
	public static void main(String[] args) {
		//�Ϲ� ������
		Thread thread1=new MyThread();
		thread1.setDaemon(false);//����Ʈ
		thread1.setName("thread1");
		thread1.start();
		
		//���� ������: ������ �����尡 ����Ǵ� ������ ����
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);//���󾲷���� ����
		thread2.setName("thread2");
		thread2.start();
		
		//# 3.5�� �� main Thread ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread ����");
		
	}
}
