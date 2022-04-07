package ch15.Ex10;

//����ȭ: ���� �����尡 ������ �ʵ忡 ������ �� �ϳ��� ������ �۾� �� �ٸ� �����尡 �������� ���ϵ��� ��
//1 �޼ҵ� ����ȭ: �޼ҵ� �ȿ� synchronized(this){}
//2 ��� ����ȭ
//��� ����ȭ: <<�޼ҵ� ������ �Ϻκи� ����ȭ��>>
	//-���� ����: synchronized(this or ������ ��ü){}

class A{}
class B{}
class C{}

class MyData {
	int data = 3;
	
	public void plusData() {
							//new A() //new Object() //this
		synchronized (new SynchronizedBlock()) { 
			//��� ����ȭ: �޼ҵ��� �Ϻκи� ����ȭ, (this)(new ������ ��ü) 
			//this: �ڽ��� ��ü�� ���ϰ� ����ȭ ��Ͽ� �����ϴ� Ű�̴�
			//��� ������� key�� ������ ����ȭ ���� ������ �� �ִ�
			//key�� ������ ��ü�� Ű�� ����� �� �ִ�
			int mydata = data; //�����͸� ��������
			try { Thread.sleep(2000);} catch (InterruptedException e) {}		
			data = mydata+1;
		}
	}
}

//#������ü�� ����ϴ� ������ 
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
public class SynchronizedBlock {
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
