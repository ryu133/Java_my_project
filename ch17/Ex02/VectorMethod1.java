package ch17.Ex02;

//vector�� arraylist�� ��� �޼ҵ带  �����ϰ� ���
//vector�� ��� �޼���� ����ȭ ó���� �Ǿ��̤���. ��Ƽ ������ ȯ�濡�� ����

//arraylist�� �̱� ������ ȯ�濡�� ���

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod1 {
	public static void main(String[] args) {
		//list�� �޼ҵ� (13�� ����)
		//
		List<Integer>vl1=new Vector<>();
		//add(element): �������� �� �߰�
		vl1.add(3);
		vl1.add(4);
		vl1.add(5);
		System.out.println(vl1);
		System.out.println(vl1.size());
		//add(index,element)
		vl1.add(1, 6);
		System.out.println(vl1);
		//addAll(�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>vl2=new Vector<Integer>();
		vl2.add(1);
		vl2.add(2);
		vl2.addAll(vl1); //al2�� al1�� �߰���
		System.out.println(vl2); 
		
		//addAll(index,��ü)
		List<Integer>vl3=new Vector<>();
		vl3.add(1);
		vl3.add(2);
		vl3.addAll(1, vl3);
		System.out.println(vl3);
		vl3.addAll(1, vl2);
		System.out.println(vl3);

		//set(index,element): Ư�� �� ��ȣ�� �� ����
		vl3.set(1, 5);
		vl3.set(3, 6);
		vl3.set(4, 7);
		//���� ���� ���� �����Ϸ��� �ϸ� ���� �߻� 
		System.out.println(vl3);
		
		//remove(index) Ư�� ��ȣ�� ���� ����
		vl3.remove(1);
		System.out.println(vl3);
		
		//remove(object): ������ �� ����
		vl3.remove(new Integer(2)); //��Ҽ�: ���������� �𸣴� ���
		System.out.println(vl3);
		
		//clear(): ��� ����
		vl3.clear();
		System.out.println(vl3);
		
		//isEmpty(): ���� ��������� true, ������ false
		System.out.println(vl3.isEmpty());
		
		//size(): ���� ��
		System.out.println(vl3.size());
		vl3.add(1);
		vl3.add(2);
		vl3.add(3);
		System.out.println(vl3);
		System.out.println(vl3.size());
		
		//get(index): Ư�� �� ��ȣ�� ���� ���
		System.out.println(vl3.get(0));
		System.out.println(vl3.get(2));
		System.out.println(vl3.get(1));
		
		//toArray(): ����Ʈ�� �迭�� �ٲٱ�  List>>Array
		Object[] objects=vl3.toArray(); //�⺻������ ����� �޼ҵ�� object Ÿ������ ���ϵ�
		//�ٿ�ĳ���� �ʿ�
		System.out.println(Arrays.toString(objects)); //�迭�� ���� arrays.tostring() ���
		
		//toArray(T[] t)  t{}: integer�� ĳ����
		Integer[] integers1=vl3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2=vl3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
	}
}
