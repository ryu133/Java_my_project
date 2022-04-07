package ch17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList
//���� ���ؼ� index ��ȣ�� ������ ����. �˻� �ӵ��� ����
//�߰��� ���� �߰�/���� �� ���ϰ� ���� �ɸ� �� ����

//LinkedList
//������ ���� �յ� ������� ������ ����. �˻� �� index ��ȣ�� �Ҵ��. ArrayList���� �ӵ� ����
//�߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� ����

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		//������ �߰� �ð� ��
		List<Integer>al1=new ArrayList<>();
		List<Integer>ll1=new LinkedList<>();
		long startTime=0,endTime=0;
		
		//arraylist���� ������ �߰� �ð�
		startTime=System.nanoTime();//System.nanoTime(): ���� �޼ҵ�, �յ� ��?
		for (int i = 0; i < 100000; i++) {
			al1.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist ������ �߰� �ð� "+(endTime-startTime)+"ns");
		
		//linkedlist���� ������ �߰� �ð�: arraylist���� ����
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist ������ �߰� �ð� "+(endTime-startTime)+"ns");
		
		//�˻� �� ��: arraylist�� linkedlist���� ������
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al1.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist ������ �˻� �ð� "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist ������ �˻� �ð� "+(endTime-startTime)+"ns");
		
		//������ ���� �� ���� �ð� �� : linkedlist�� ������
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al1.remove(0);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist ������ ���� �ð� "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.remove(0);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist ������ ���� �ð� "+(endTime-startTime)+"ns");
		
	}
}
