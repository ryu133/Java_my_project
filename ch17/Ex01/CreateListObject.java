package ch17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		//����Ʈ ���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		//list�� �������̽��̹Ƿ� new�� �ڿ� �� �� ����. 
		//capacity: �޸𸮿� ���� ũ�⸦ �Ҵ�. �⺻���� 10
		//size(): �濡 ����� ���� ����
		
		List<Integer>al1=new ArrayList<>(); //capacity = 10
		List<Integer>al2=new ArrayList<>(30); //capacity = 30 �޸� ���� Ȯ��
		List<Integer>al3=new Vector<>();
		List<Integer>al4=new Vector<>(30);
		List<Integer>al5=new LinkedList<>();
//		List<Integer>al6=new LinkedList<>(30);//linkedlist�� capacity ���� �Ұ�
		
//		Arrays Ŭ������ ���� �޼ҵ带 �̿��� ���: ������ ũ�⸦ �ٲ� �� ����
			//����,���� �� ������ ���� ������ �� ����
		List<Integer>al7=Arrays.asList(1,2,3,4); //
		List<String>al8=Arrays.asList("��","ȭ","��","��","��","��","��");
		
		al7.set(1, 7); //���� �� ����. index 1�� 7�� �����Ѵ�
//		al7.add(5);//����. ��(������)�� �߰��� �� ����.
		al8.set(0, "��");
//		al8.add("��");
		
		System.out.println(al7);
		System.out.println(al8);
		
	}
}
