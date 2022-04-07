package ch17.Ex10;

//Map<K,V> : K <= key, V <= value �������� �����͸� ����
	//key�� �ߺ��� �� ����. <=set���� ���� (index �ƴ�. index�� 0���� �����Ϸ�(jvm)�� �Ҵ���)
	//value�� �ߺ��� ���� ���� �� �ִ�.

	//hashmap: �����ϰ� ��µ�
	//hashTable: ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 ������
				//��� �޼ҵ�� hashMap�� ����

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
	public static void main(String[] args) {
		Map<Integer, String>hashTable1=new Hashtable<>();
		
		//1 put(K key,V value): ���� ���� �� 
		hashTable1.put(2, "���ٶ�");
		hashTable1.put(1, "������");
		hashTable1.put(3, "�ٶ�");
		hashTable1.put(3, "��"); //Ű�� �ߺ� ����� �� ����. �ߺ����� ���� ��� ������ ���� ������
		System.out.println(hashTable1);
		
		//2 putAll(�ٸ� �� ��ü) : �ٸ� ������ �����ؼ� ����
		Map<Integer, String> hashTable2=new Hashtable<>();
		hashTable2.putAll(hashTable1);
		System.out.println(hashTable2);
		
		//3 replace(K key,V value): ������ key�� ����� value�� ����
		hashTable2.replace(1, "������");
		hashTable2.replace(4, "����");//key 4�� �������� ����. ���ܴ� �߻����� ����
		System.out.println(hashTable2);
		
		//4 replace(K key, V oldValue, V newValue): oldValue�� newValue�� ����
		hashTable2.replace(1, "������", "������"); //key�� oldValue���� �ٸ��� �������� ����(���� �߻����� ����)
		hashTable2.replace(2, "�ٴٴ�", "����"); //��Ȯ�� ��ġ�ؾ� ������. �̵���
		System.out.println(hashTable2);
		
		//5 get(Object key): Map�� ���� ������ �� ���. key�� �־�� key�� �Ҵ�� value�� ������
		System.out.println(hashTable2.get(1)); //����! index�� �ƴ϶� key
		System.out.println(hashTable2.get(2));
		System.out.println(hashTable2.get(3));
		
		//6 containsKey(Object key): �ʿ� �ش� Ű�� �����ϴ��� Ȯ�� true or false ����
		System.out.println(hashTable2.containsKey(1)); //true
		System.out.println(hashTable2.containsKey(4)); //false
		
		//7 containsValue(Object value): �ʿ� �ش� ���� �����ϴ��� Ȯ��. true or false
		System.out.println(hashTable2.containsValue("������")); //true
		System.out.println(hashTable2.containsValue("������")); //false
		
		//8 Set<K> keySet(): Ű�� ����
		Set<Integer> keySet=hashTable2.keySet(); //hashMap2�� ����� key���� ����
		System.out.println(keySet);
		
		//9 Set<Map.Entry<K,V>> entrySet(): ��Ʈ��(set)�� ����(��Ʈ��: Ű�� ���� ����)
		Set<Map.Entry<Integer, String>> entrySet=hashTable2.entrySet();
		System.out.println(entrySet);
		
		//10 size() : �� ����
		System.out.println(hashTable2.size());
		
		//11 remove(Object key) : key�� �־ value�� ����
		hashTable2.remove(1);
		hashTable2.remove(4); //�̵���
		System.out.println(hashTable2);
		
		//12 remove(Object key, Object value): key�� value�� ��Ȯ�� ��ġ�� �� ����
		hashTable2.remove(2, "���ٶ�");
		hashTable2.remove(3, "�ٴٴ�"); //�̵���. 
		System.out.println(hashTable2);
		
		//13 clear(): ��� ����
		hashTable2.clear();
		System.out.println(hashTable2);
		
	}
}

