package ch17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue: FIFO(First In First Out): ó�� �� ���� ó������ ����

public class QueueMethod {
	public static void main(String[] args) {
		Queue<Integer>queue1=new LinkedList<Integer>();
		
		//1 ���� ó���� �������� �޼ҵ�(add(),element(),remove())
			//1-1 add(): queue�� ���� �߰��� ��
//			System.out.println(queue1.element()); //���� �� ���� �߻�, ����ó���� �Ǿ����� ����
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			//1-2 element(): ���� ó�� �� �� Ȯ��
			System.out.println(queue1.element());
		
			//1-3 E remove():ť�� ���� ���´�
			System.out.println(queue1.remove());//3
			System.out.println(queue1.remove());//4
			System.out.println(queue1.remove());//5
//			System.out.println(queue1.remove());//���� ���� ���� ��� ���� �߻�
			
			System.out.println("============");
		
		
		//2 ���� ó���� ������ �޼ҵ�(offer(),peek(),poll()) <==�������
			Queue<Integer>queue2=new LinkedList<>();
			
			System.out.println(queue2.peek()); //null , ���� ó���Ǿ� ������ �߻����� ����
			
			//2-1 offer(E item): ���� �߰��� �� ���
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
		
			//2-2 E peek(): ���� �� �̸�����
			System.out.println(queue2.peek());
			
			//2-3 poll(): �� ������
			System.out.println(queue2.poll());//3
			System.out.println(queue2.poll());//4
			System.out.println(queue2.poll());//5
			System.out.println(queue2.poll());//null
	}
}
