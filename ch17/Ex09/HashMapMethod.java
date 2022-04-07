package ch17.Ex09;

//Map<K,V> : K <= key, V <= value �������� �����͸� ����
	//key�� �ߺ��� �� ����. <=set���� ���� (index �ƴ�. index�� 0���� �����Ϸ�(jvm)�� �Ҵ���)
	//value�� �ߺ��� ���� ���� �� �ִ�.

	//hashmap: �����ϰ� ��µ�

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String>hashMap1=new HashMap<>();
		
		//1 put(K key,V value): ���� ���� �� 
		hashMap1.put(2, "���ٶ�");
		hashMap1.put(1, "������");
		hashMap1.put(3, "�ٶ�");
		hashMap1.put(3, "��"); //Ű�� �ߺ� ����� �� ����. �ߺ����� ���� ��� ������ ���� ������
		System.out.println(hashMap1);
		
		//2 putAll(�ٸ� �� ��ü) : �ٸ� ������ �����ؼ� ����
		Map<Integer, String> hashMap2=new HashMap<>();
		hashMap2.putAll(hashMap1);
		System.out.println(hashMap2);
		
		//3 replace(K key,V value): ������ key�� ����� value�� ����
		hashMap2.replace(1, "������");
		hashMap2.replace(4, "����");//key 4�� �������� ����. ���ܴ� �߻����� ����
		System.out.println(hashMap2);
		
		//4 replace(K key, V oldValue, V newValue): oldValue�� newValue�� ����
		hashMap2.replace(1, "������", "������"); //key�� oldValue���� �ٸ��� �������� ����(���� �߻����� ����)
		hashMap2.replace(2, "�ٴٴ�", "����"); //��Ȯ�� ��ġ�ؾ� ������. �̵���
		System.out.println(hashMap2);
		
		//5 get(Object key): Map�� ���� ������ �� ���. key�� �־�� key�� �Ҵ�� value�� ������
		System.out.println(hashMap2.get(1)); //����! index�� �ƴ϶� key
		System.out.println(hashMap2.get(2));
		System.out.println(hashMap2.get(3));
		
		//6 containsKey(Object key): �ʿ� �ش� Ű�� �����ϴ��� Ȯ�� true or false ����
		System.out.println(hashMap2.containsKey(1)); //true
		System.out.println(hashMap2.containsKey(4)); //false
		
		//7 containsValue(Object value): �ʿ� �ش� ���� �����ϴ��� Ȯ��. true or false
		System.out.println(hashMap2.containsValue("������")); //true
		System.out.println(hashMap2.containsValue("������")); //false
		
		//8 Set<K> keySet(): Ű�� ����
		Set<Integer> keySet=hashMap2.keySet(); //hashMap2�� ����� key���� ����
		System.out.println(keySet);
		
		//9 Set<Map.Entry<K,V>> entrySet(): ��Ʈ��(set)�� ����(��Ʈ��: Ű�� ���� ����)
		Set<Map.Entry<Integer, String>> entrySet=hashMap2.entrySet();
		System.out.println(entrySet);
		
		//10 size() : �� ����
		System.out.println(hashMap2.size());
		
		//11 remove(Object key) : key�� �־ value�� ����
		hashMap2.remove(1);
		hashMap2.remove(4); //�̵���
		System.out.println(hashMap2);
		
		//12 remove(Object key, Object value): key�� value�� ��Ȯ�� ��ġ�� �� ����
		hashMap2.remove(2, "���ٶ�");
		hashMap2.remove(3, "�ٴٴ�"); //�̵���. 
		System.out.println(hashMap2);
		
		//13 clear(): ��� ����
		hashMap2.clear();
		System.out.println(hashMap2);
		
	}
}
