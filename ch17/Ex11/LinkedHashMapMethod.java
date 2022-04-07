package ch17.Ex11;

//Map<K,V> : K <= key, V <= value �������� �����͸� ����
	//key�� �ߺ��� �� ����. <=set���� ���� (index �ƴ�. index�� 0���� �����Ϸ�(jvm)�� �Ҵ���)
	//value�� �ߺ��� ���� ���� �� �ִ�.

	//HashMap: �����ϰ� ��µ�
	//HashTable: ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 ������
				//��� �޼ҵ�� hashMap�� ����

//HashMap VS LinkedHashMap
	//hashMap<K,V> : �Է°� ����� �ٸ� �� �ִ�. �����ϰ� ��µ�
	//LinkedHashMap<K,V> : key�� ��ũ�Ǿ��ִ�. ���� ���� ���� ���� ������ ������. �Է� ������� ��µ�


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String>linkedhashMap1=new LinkedHashMap<>();
		
		//1 put(K key,V value): ���� ���� �� 
		linkedhashMap1.put(2, "���ٶ�");
		linkedhashMap1.put(1, "������");
		linkedhashMap1.put(3, "�ٶ�");
		linkedhashMap1.put(3, "��"); //Ű�� �ߺ� ����� �� ����. �ߺ����� ���� ��� ������ ���� ������
		System.out.println(linkedhashMap1);
		
		//2 putAll(�ٸ� �� ��ü) : �ٸ� ������ �����ؼ� ����
		Map<Integer, String> linkedHashMap2=new LinkedHashMap<>();
		linkedHashMap2.putAll(linkedhashMap1);
		System.out.println(linkedHashMap2);
		
		//3 replace(K key,V value): ������ key�� ����� value�� ����
		linkedHashMap2.replace(1, "������");
		linkedHashMap2.replace(4, "����");//key 4�� �������� ����. ���ܴ� �߻����� ����
		System.out.println(linkedHashMap2);
		
		//4 replace(K key, V oldValue, V newValue): oldValue�� newValue�� ����
		linkedHashMap2.replace(1, "������", "������"); //key�� oldValue���� �ٸ��� �������� ����(���� �߻����� ����)
		linkedHashMap2.replace(2, "�ٴٴ�", "����"); //��Ȯ�� ��ġ�ؾ� ������. �̵���
		System.out.println(linkedHashMap2);
		
		//5 get(Object key): Map�� ���� ������ �� ���. key�� �־�� key�� �Ҵ�� value�� ������
		System.out.println(linkedHashMap2.get(1)); //����! index�� �ƴ϶� key
		System.out.println(linkedHashMap2.get(2));
		System.out.println(linkedHashMap2.get(3));
		
		//6 containsKey(Object key): �ʿ� �ش� Ű�� �����ϴ��� Ȯ�� true or false ����
		System.out.println(linkedHashMap2.containsKey(1)); //true
		System.out.println(linkedHashMap2.containsKey(4)); //false
		
		//7 containsValue(Object value): �ʿ� �ش� ���� �����ϴ��� Ȯ��. true or false
		System.out.println(linkedHashMap2.containsValue("������")); //true
		System.out.println(linkedHashMap2.containsValue("������")); //false
		
		//8 Set<K> keySet(): Ű�� ����
		Set<Integer> keySet=linkedHashMap2.keySet(); //hashMap2�� ����� key���� ����
		System.out.println(keySet);
		
		//9 Set<Map.Entry<K,V>> entrySet(): ��Ʈ��(set)�� ����(��Ʈ��: Ű�� ���� ����)
		Set<Map.Entry<Integer, String>> entrySet=linkedHashMap2.entrySet();
		System.out.println(entrySet);
		
		//10 size() : �� ����
		System.out.println(linkedHashMap2.size());
		
		//11 remove(Object key) : key�� �־ value�� ����
		linkedHashMap2.remove(1);
		linkedHashMap2.remove(4); //�̵���
		System.out.println(linkedHashMap2);
		
		//12 remove(Object key, Object value): key�� value�� ��Ȯ�� ��ġ�� �� ����
		linkedHashMap2.remove(2, "���ٶ�");
		linkedHashMap2.remove(3, "�ٴٴ�"); //�̵���. 
		System.out.println(linkedHashMap2);
		
		//13 clear(): ��� ����
		linkedHashMap2.clear();
		System.out.println(linkedHashMap2);
		
	}
}

