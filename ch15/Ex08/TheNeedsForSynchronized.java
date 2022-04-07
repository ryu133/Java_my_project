package ch15.Ex08;
//����ȭ(synchronized): ���� �����尡 �ϳ��� ������ �ʵ带 ������ ��� �ϳ��� �۾��� ������ �Ϸ�� �� �ٸ� �۾� ����
//���� �۾��� �� lock�� �ɰ� �۾��� ��ġ�� lock�� �����Ѵ�


//����ȭ�� ���� �ʾ��� ��
class MyData{ //�����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;
	
	public void plusData() {
		int mydata = data; //�����͸� ��������
		try { Thread.sleep(2000);} catch (InterruptedException e) {}		
		data = mydata+1;
	}
}

//������ü�� ����ϴ� ������ 
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "������ : " + myData.data);
	}
}


public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		//#������ü ����
		MyData myData = new MyData();
				
		//#1.  plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//#2.  plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
	
}
