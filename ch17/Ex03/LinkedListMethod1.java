package ch17.Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod1 {
	public static void main(String[] args) {
		//list�Ǥ� �޼ҵ� (13�� ����)
		//
		List<Integer>ll1=new LinkedList<>();
		//add(element): �������� �� �߰�
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		System.out.println(ll1);
		System.out.println(ll1.size());
		//add(index,element)
		ll1.add(1, 6);
		System.out.println(ll1);
		//addAll(�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>ll2=new LinkedList<Integer>();
		ll2.add(1);
		ll2.add(2);
		ll2.addAll(ll1); //al2�� al1�� �߰���
		System.out.println(ll2); 
		
		//addAll(index,��ü)
		List<Integer>ll3=new LinkedList<>();
		ll3.add(1);
		ll3.add(2);
		ll3.addAll(1, ll3);
		System.out.println(ll3);
		ll3.addAll(1, ll2);
		System.out.println(ll3);

		//set(index,element): Ư�� �� ��ȣ�� �� ����
		ll3.set(1, 5);
		ll3.set(3, 6);
		ll3.set(4, 7);
		//���� ���� ���� �����Ϸ��� �ϸ� ���� �߻� 
		System.out.println(ll3);
		
		//remove(index) Ư�� ��ȣ�� ���� ����
		ll3.remove(1);
		System.out.println(ll3);
		
		//remove(object): ������ �� ����
		ll3.remove(new Integer(2)); //��Ҽ�: ���������� �𸣴� ���
		System.out.println(ll3);
		
		//clear(): ��� ����
		ll3.clear();
		System.out.println(ll3);
		
		//isEmpty(): ���� ��������� true, ������ false
		System.out.println(ll3.isEmpty());
		
		//size(): ���� ��
		System.out.println(ll3.size());
		ll3.add(1);
		ll3.add(2);
		ll3.add(3);
		System.out.println(ll3);
		System.out.println(ll3.size());
		
		//get(index): Ư�� �� ��ȣ�� ���� ���
		System.out.println(ll3.get(0));
		System.out.println(ll3.get(2));
		System.out.println(ll3.get(1));
		
		//toArray(): ����Ʈ�� �迭�� �ٲٱ�  List>>Array
		Object[] objects=ll3.toArray(); //�⺻������ ����� �޼ҵ�� object Ÿ������ ���ϵ�
		//�ٿ�ĳ���� �ʿ�
		System.out.println(Arrays.toString(objects)); //�迭�� ���� arrays.tostring() ���
		
		//toArray(T[] t)  t{}: integer�� ĳ����
		Integer[] integers1=ll3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2=ll3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
	}
}