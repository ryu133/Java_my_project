package ch17.Ex12;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : ���� �� key�� �������� �������� ���ĵǾ� �����
	//��� �� ���j���� ���ĵǾ� ��µ�.
	//key�� �Ϲ� ��ü�� ������ �� Comparable<E> compareTo()((��ü ����)) �̳�
							//Comparator<E> compare()((��ü �̼���))  ������ �ʿ�
//Map<K,V> <==SortedMap<K,V>(���� �޼ҵ� ���ǵ�) <=NavigableMap<K,V>(�˻� �޼ҵ� ���ǵ�) <=TreeMap<K,V>
	//TreeMap�� ����� �� Ÿ���� TreeMap���� �����ؾ� �˻�, ���� �޼ҵ� ��� ����

public class TreeMapMethod1 {
	public static void main(String[] args) {
//		TreeMap<K, V>�� Map<K, V>�� �޼ҵ� ��� ���, +SortedMap<K, V>,NavigableMap<K, V>�� �޼ҵ� ���
		TreeMap<Integer, String>treeMap=new TreeMap<>(); //������������ ���ĵ�
		
		for (int i = 20; i > 0; i-=2) {
			treeMap.put(i, i+"��° ������");
		}
		System.out.println(treeMap); //key�� �������� �������� ���ĵ�
		
		//1 firstKey() : ���� ù ��° �� ��������
		System.out.println(treeMap.firstKey());
		
		//2 firstEntry(): ù��° ��Ʈ��(entry=key&value ����)
		System.out.println(treeMap.firstEntry());
		
		//3 lastKey(): ������ ��
		System.out.println(treeMap.lastKey());
		
		//4 lastEntry(): ������ ��Ʈ��
		System.out.println(treeMap.lastEntry());
		
		//5 lowerKey(K key): �Է¹��� Ű���� ���� �� ���(key �� ����)
		System.out.println(treeMap.lowerKey(10)); //8
		
		//6 higherKey(K key): �Է¹��� Ű���� ���� ����� ���� �� ���
		System.out.println(treeMap.higherKey(10)); //12
		
		//7 pollFirstEntry(): ù��°�� Ű�� ���� ���´� (�����)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8 pollLastEntry(): �������� Ű�� ���� ���´� (�����)
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);

		//9 SortedMap<K,V> headMap(K toKey): �Է¹��� Ű�� ����(head)���κ��� Ű���� �ٷ� �ձ��� ��������(Ű�� ����)
		SortedMap<Integer, String>sortedMap=treeMap.headMap(8);
		System.out.println(sortedMap);
		
		//10 NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap=treeMap.headMap(8, true); //key 8�� �����ϸ鼭 head������ ���
		System.out.println(navigableMap);
		
		//11 SortedMap<K,V> tailMap(K toKey): key�� ���� 
		SortedMap<Integer, String>sortedMap2=treeMap.tailMap(14);
		System.out.println(sortedMap2);
		
		//12 NavigableMap<K,V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap2=treeMap.tailMap(14, false); //������ ����, ���� �������� �⺻
		System.out.println(navigableMap2);
		
		//13 SortedMap<K, V> subMap(K fromKey,K toKey): Ư�� ������ ���� ����
		SortedMap<Integer, String> sortedMap3=treeMap.subMap(6, 10);
		System.out.println(sortedMap3);
		
		//14 NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap3=treeMap.subMap(6, true, 10, true);
		System.out.println(navigableMap3);
		
		//15 NavigableSet<E> descendingKeySet(): ���� Ű�� ������ �ݴ�� 
		NavigableSet<Integer> navigableSet =treeMap.descendingKeySet();
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingSet());
		
		//16 NavigableMap<K,V> descendingMap(): ���� ������ �ݴ�� 
		NavigableMap<Integer, String>navigableMap4=treeMap.descendingMap();
		System.out.println(navigableMap4);
		System.out.println(navigableMap4.descendingMap());
		
	}
}
