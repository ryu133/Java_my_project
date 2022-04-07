package ch17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set: �ߺ����� �ʴ� ���� ����(equals(),hashCode() �����ǵ�),Wrapper Ŭ������ ��� �����ǵ�
	//1 hashSet ��µǴ� ���� �����ϰ� ���
	//2 linkedHashSet �ԷµǴ´�� ���
	//3 treeSet  �Է°��� ������ ���������� ����. (��������)
public class SetSummary {
	public static void main(String[] args) {
		//HashSet
		Set<String>hashSet=new HashSet<>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");

		System.out.println(hashSet);
	
		//LinkedHashSet
		Set<String>linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");

		System.out.println(linkedHashSet);
		
		//TreeSet  <== �����ϱ� ���� Comparable<E> compareTo()������
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");

		System.out.println(treeSet);
	
	}
}
