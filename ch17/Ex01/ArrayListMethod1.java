package ch17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod1 {
	public static void main(String[] args) {
		//list�Ǥ� �޼ҵ� (13�� ����)
		//
		List<Integer>al1=new ArrayList<>();
		//add(element): �������� �� �߰�
		al1.add(3);
		al1.add(4);
		al1.add(5);
		System.out.println(al1);
		System.out.println(al1.size());
		//add(index,element)
		al1.add(1, 6);
		System.out.println(al1);
		//addAll(�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.addAll(al1); //al2�� al1�� �߰���
		System.out.println(al2); 
		
		//addAll(index,��ü)
		List<Integer>al3=new ArrayList<>();
		al3.add(1);
		al3.add(2);
		al3.addAll(1, al3);
		System.out.println(al3);
		al3.addAll(1, al2);
		System.out.println(al3);

		//set(index,element): Ư�� �� ��ȣ�� �� ����
		al3.set(1, 5);
		al3.set(3, 6);
		al3.set(4, 7);
		//���� ���� ���� �����Ϸ��� �ϸ� ���� �߻� 
		System.out.println(al3);
		
		//remove(index) Ư�� ��ȣ�� ���� ����
		al3.remove(1);
		System.out.println(al3);
		
		//remove(object): ������ �� ����
		al3.remove(new Integer(2)); //��Ҽ�: ���������� �𸣴� ���
		System.out.println(al3);
		
		//clear(): ��� ����
		al3.clear();
		System.out.println(al3);
		
		//isEmpty(): ���� ��������� true, ������ false
		System.out.println(al3.isEmpty());
		
		//size(): ���� ��
		System.out.println(al3.size());
		al3.add(1);
		al3.add(2);
		al3.add(3);
		System.out.println(al3);
		System.out.println(al3.size());
		
		//get(index): Ư�� �� ��ȣ�� ���� ���
		System.out.println(al3.get(0));
		System.out.println(al3.get(2));
		System.out.println(al3.get(1));
		
		//toArray(): ����Ʈ�� �迭�� �ٲٱ�  List>>Array
		Object[] objects=al3.toArray(); //�⺻������ ����� �޼ҵ�� object Ÿ������ ���ϵ�
		//�ٿ�ĳ���� �ʿ�
		System.out.println(Arrays.toString(objects)); //�迭�� ���� arrays.tostring() ���
		
		//toArray(T[] t)  t{}: integer�� ĳ����
		Integer[] integers1=al3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2=al3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
	}
}
