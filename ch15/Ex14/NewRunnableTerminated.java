package ch15.Ex14;
//������ ����
//1 New			:������ ��ü ���� �� .start() �޼ҵ尡 ȣ��Ǳ� �� ����
//2 Runnable	:.start()�޼ҵ尡 ȣ��Ǹ� run() �޼ҵ� ������ �ڵ尡 cpu���� ����ǰ��ִ� ����
//3 Terminated	:run()�� ��� �ڵ尡 ����Ǹ� ������ ����
//4 Timed_waiting: Ư�� �ð����ȸ� ������ thread.sleep()  Ư�� �ð��� ����Ǹ� ������·� �ٲ�. ���ͷ�Ʈ(�����)�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� �ٲ�
					//a.join(1000) ���� �ڽ��� ������� 1�� ������, a ��ü�� ������·� ���� �ٲ�
//5 Blocked		:����ȭ ó������ LOCK�� �ɷ��� ������ ��� ���ܵ� ����, �ٸ� �����尡 Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ���� ���·� ���Ҽ��մ�
//6 Waiting		:������ ��� ����. ������ �������� ����. �ٸ� �����尡 �������� 
public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		Thread.State state; //�������� ���¸� �����ϴ� Ŭ����(6 ����)
		//state �������� 6���� ����� �� 
		
		//1 ��ü ���� - �͸� ���� Ŭ���� ����
		//new: ������ ��ü ���� �� start() ȣ��Ǳ� �������� ����
		Thread myThread=new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 1000000000L; i++) {} //0.5�� ���� (cpu���� ������)
				//��ü ���� �� �ణ�� �ð��� �ʿ�
				//�޸��� �Ҵ�ð��� �ʿ�
			}
		};
		state =myThread.getState(); //�������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state: "+state); //NEW
		
		//2 myThread ����
		myThread.start(); //�����带 ���� �� cpu���� ����
		state=myThread.getState();
		System.out.println("myThread state: "+state); //RUNNABLE
		
		//3 ������ ����
//		myThread.join(); �� ������(����)�� ����ϰ� mythread�� ó���ϰ� �� 
		try {myThread.join();} catch (InterruptedException e) {}
		state=myThread.getState();
		System.out.println("myThread state: "+state);
		
		
		
		
	}
}
