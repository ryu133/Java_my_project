package ch17.Ex08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet
	//��� �� ���ĵǾ� ��µ�. (�������� ����(ascending) 1 -> 9, a -> z)
	//��� �� �˻� �޼ҵ� ����
	//������ ���� ������ set�� ���ĵǾ �����.
	//Set > SortedSet(���� �޼ҵ� ���ǵ�) > NavigableSet(�˻� �޼ҵ� ���ǵ�) > TreeSet
	//TreeSet<String> treeSet = new TreeSet<>();
	//set �������̽��� ��� �޼ҵ� ��� ����

public class TreeSetMethod {
	public static void main(String[] args) {
		//treeset�� ���� �־��� ��� �������� ���ĵǾ� ���� �����
		TreeSet<Integer>treeSet1=new TreeSet<>(); //type�� treeset���� �����ؾ� ���İ� �˻� �޼ҵ带 ����� �� �ִ�.
		
		for (int i = 50; i > 0; i-=2) {
			treeSet1.add(i);
		}
		System.out.println(treeSet1);
		
		//treeset������ ��� ������ �޼ҵ� (1~15)
		System.out.println("=====������ �˻�(��������)======");
		//first() : ���� ó������ ����
		System.out.println(treeSet1.first()); //2
		//last() : ���� ���������� �ⷱ
		System.out.println(treeSet1.last()); //50
		//lower(E element) : element�� ���� ����� ���� �� ����
		System.out.println(treeSet1.lower(26)); 
		//higher(E element) : element�� ���� ����� ū �� ����
		System.out.println(treeSet1.higher(26)); 
		//floor(E element): element�� ���� ����� ���� ��(element�� ����)
		System.out.println(treeSet1.floor(25));
		//ceiling(E element): element�� ���� ����� ū ��(element�� ����)
		System.out.println(treeSet1.ceiling(25));
		System.out.println("======������ ������======");
		//pollFirst(): ���� ó���� ������(�����)
		System.out.println(treeSet1.size());
		int treesetSize=treeSet1.size();
		for (int i = 0; i < treesetSize ; i++) {
			System.out.println(treeSet1.pollFirst());
		}
		System.out.println(treeSet1.size());
		//pollLast(): ���� ������ �� ������
		for (int i = 50; i >0; i-=2) {
			treeSet1.add(i);
		}
		treesetSize=treeSet1.size();
		System.out.println(treesetSize);
		for (int i = 0; i < treesetSize ; i++) {
			System.out.println(treeSet1.pollLast());
		}
		System.out.println(treeSet1.size());
		
		System.out.println("=======����=========");
		//SortedSet<E> headSet(E element): 
		//������ ����ϱ� ���� SortedSet<E> Ÿ������ ����
		//SortedSet<E> : ���ĵ� �����͸� �����ϴ� set
		//headSet(E element): element�� head(��)�����κ��� ���� ����(element�� ������)
		for (int i = 50; i >0; i-=2) {
			treeSet1.add(i);
		}
		System.out.println(treeSet1);
		SortedSet<Integer>sortedSet =treeSet1.headSet(20);
//		Set<Integer>sortedSet =treeSet1.headSet(20); //sorted ���� ����
		System.out.println(sortedSet);
		//NavigableSet<E> headSet(E element,boolean inclusive): element�� �������κ��� ���� ����
		//true: element�� ���� / false: element�� ������
		NavigableSet<Integer> navigableSet=treeSet1.headSet(20, true);
//		Set<Integer> navigableSet=treeSet1.headSet(20, true); //Navigable���� ����
		System.out.println(navigableSet);
		//SortedSet<E> tailSet(E element): element(����)���� ����
		SortedSet<Integer> sortedSet2=treeSet1.tailSet(20);
		System.out.println(sortedSet2);
		//NavigableSet<E> tailSet(E element,boolean inclusive): element�� �������κ��� ���� ����
		//true: element�� ���� / false: element�� ������
		NavigableSet<Integer> navigableSet2=treeSet1.tailSet(20, false);
//		Set<Integer>navigableSet2=treeSet1.tailSet(20, false); //Navigable ���� ����
		System.out.println(navigableSet2);
		System.out.println("=========");
		//SortedSet<E> subSet(E element,E element): Ư�� ������ ���� set���� ���� ��
		SortedSet<Integer> sortedSet3=treeSet1.subSet(10, 20); //���۰��� ����, ������ ������(�⺻)
		System.out.println(sortedSet3);
		//NabigableSet<E> subSet(E element, boolean inclusive,E element, boolean inclusive)
		//
		NavigableSet<Integer> navigableSet3=treeSet1.subSet(10, false, 20, false);
		System.out.println(navigableSet3);
		System.out.println("========");
		//NavigableSet<E> descendingSet(): ���� ������ �������� �ݴ� ������ 
		NavigableSet<Integer> navigableSet4=treeSet1.descendingSet();
//		Set<Integer> navigableSet4=treeSet1.descendingSet(); //navigable ���� ����
		System.out.println(treeSet1);//�������� ����
		System.out.println(navigableSet4); //�������� ����
		NavigableSet<Integer> navigableSet5=navigableSet4.descendingSet();
		System.out.println(navigableSet5);//�������� ����
		
		
	}
}
