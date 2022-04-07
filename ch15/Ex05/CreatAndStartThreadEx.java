package ch15.Ex05;

//������ 4�� ����
//1 ������ ��� 2 runnable ���� 3 �͸� ����Ŭ���� ���� �� ����

//������ ����
// �̸�, ����, ����, ����, ����

class Abc1 extends Thread{
	@Override
	public void run() {
		String[] str1= {"ȫ�浿","40","100","70","50"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		for (int i=0; i<str1.length; i++) {
			System.out.print(str1[i]+" ");
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class Abc2 implements Runnable {
	@Override
	public void run() {
		String[] str2 = {"�̼���", "50", "90", "60", "70"};
		try { Thread.sleep(20);} catch (InterruptedException e) {}
		for (int i=0; i<str2.length; i++) {
			System.out.print(str2[i]+" ");
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}			
	}
}


public class CreatAndStartThreadEx {
	public static void main(String[] args) {
		 Thread abc1t=new Abc1();
//		 abc1t.start();
		 
		 
//		String[] str0= {"�̸�","����","����","����","����"};
//		for (int i = 0; i < str0.length; i++) {
//			System.out.print(str0[i]+" ");
//			try { Thread.sleep(200);} catch (InterruptedException e) {}
//		}
		
		Runnable abc2=new Abc2();
		Thread abc2t=new Thread(abc2);
//		abc2t.start();
		
		Thread abc3t = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] str3 = {"�Ż��Ӵ�","60","80","100","80"};
				try { Thread.sleep(30);} catch (InterruptedException e) {}
				for (int i=0; i<str3.length; i++) {
					System.out.println(str3[i]+" ");
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}	
			}
		});
//		abc3t.start();
		
				try { Thread.sleep(0);} catch (InterruptedException e) {}
				String[] str0= {"�̸�","����","����","����","����"};
				for (int i = 0; i < str0.length; i++) {
					System.out.print(str0[i]+" ");
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}
				
			
		abc1t.start();
		abc2t.start();
		abc3t.start();
	}
}
