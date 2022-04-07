package ch17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> ���� : K�� �ߺ��� �� ����. V�� �ߺ� ����
	//1 HashMap		: key�� �������� �����ϰ� ���. �޼ҵ� ����ȭ���� ���� ����. �̱� ������ ȯ�濡 ���
	//2 HashTable	: ��� �޼ҵ尡 ����ȭ �Ǿ�����. ��Ƽ ������ ȯ�濡�� ���
	//3 LinkedHashMap: �Է� ������� ���. 
	//4 TreeMap		: �������� ���ĵǾ� �����. Comparable<E>�̳� Comparator<E> ������ �ʿ�


public class MapSummary {
	public static void main(String[] args) {
		//1 HashMap : �Է� ������ ��� ������ �ٸ���.
		Map<String, Integer>hashMap=new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		//2 HashTable : �Է� ������ ��� ������ �ٸ���. �޼ҵ尡 ����ȭ ��, ��Ƽ ������ ȯ��
		Map<String, Integer>hashTable=new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		//3 LinkedHashMap : �Է� ������ ��� ������ ����.
		Map<String, Integer>linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(linkedHashMap);
		
		//4 TreeMap : �������� ���ĵǾ� ���� (Map <K,V> : key�� �������� �������� ����)
		Map<String, Integer>treeMap=new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap);
		
		
	}
}
