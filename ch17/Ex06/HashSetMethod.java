package ch17.Ex06;

import java.util.Arrays;

//�������̽� Set<E>: �� ��ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
//-HashSet		: �ߺ��� ���� ���� �� ����. ���� ������� ���� �� ����.
//-LinkedHashSet: �ߺ��� ���� ���� �� ����. ��½� ������� ��µȴ�
//-TreeSet		: ����� �� ���� ���ĵǾ� �����. ascending(��������) 0->9, a->z,��->��
	//*descending(��������)

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String>hSet1=new HashSet<>(); //set�� �������̽��̹Ƿ� Ÿ�����θ� ������ �� �ִ�
		
		//add(element) : set�� �� �߰�
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��"); //�ߺ� ������� �ʴ´�

		System.out.println(hSet1);
		System.out.println(hSet1.toString()); //tostring() �����ǵ�
		
		//addAll(�ٸ� set ��ü): �ڽ��� set�� �ٸ� set�� ����� ���� �߰�, �ߺ��� ���� ���ŵ�
		Set<String>hSet2=new HashSet<>();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.addAll(hSet1);
		
		System.out.println(hSet2);
		
		//remove(Object o): ������ ����, (list�� ��� index�� ����)
		hSet2.remove("��");
		System.out.println(hSet2);
		
		//clear(): ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
		//isEmpty
		System.out.println(hSet2.isEmpty());
		
		//contains(Object o): ���� set�� �����ϸ� true, �׷��� ������ false
		Set<String>hSet3=new HashSet<>();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��")); 
		System.out.println(hSet3.contains("��")); 
		
		//size(): set�� ���Ե� ���� ����
		System.out.println(hSet3.size());
		
		//iterator(): set�� index�� ����. for���� �� ��ȣ�� ���� ����ϹǷ� ��� �Ұ�, enhanced for���� ��� ����
		//��ȸ��, set�� ������ ��ȸ�ϸ鼭 ����
		//hasNext(): set�� ���� �����ϸ� ture, �ƴϸ� false
		//next(): ���� ������ ���������� �̵�
		Iterator<String>iterator=hSet3.iterator();
		//Ŭ����<E> ������ü=set��ü.iterator();a
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		System.out.println("=== for each ===");
		for (String k : hSet3) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
		//toArray():set�� �迭�� �����. objectŸ������ �����ϹǷ� �ٿ�ĳ���� �ʿ�
		Object[] objArray=hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //�迭�� ����� �� arrays.tostring(�迭)
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i]+" ");
		}
		System.out.println();
		System.out.println("===========");
		for (Object k : objArray) { //�ٿ�ĳ������ �ʿ�
			System.out.print(k+" "); //�� �� �� 
		}
		System.out.println();
		
		//toArray(T[] t): �ٿ�ĳ���� ��   toArray(new Ÿ��[i])
		String[] strArray1=hSet3.toArray(new String[0]);// 0: ���� ũ�� ����. 
		//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ������. ���� ũ�⸦ �� �� ���� ��� 0���� ������ �ȴ�.
		System.out.println(Arrays.toString(strArray1)); //[��, ��, ��]
		
		//toArray(T[] t)  <set�� ������ ���� ũ�⸦ ũ�� �������� ��� null ���� ��)
		String[] strArray2=hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); //[��, ��, ��, null, null]
		
		Set<Integer>intSet1=new HashSet<>();
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10);
		//iterator ���, enhanced for ��� 
		
		Iterator<Integer>iterator1=intSet1.iterator();
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+"  ");
		}
		System.out.println();
		
		for (int k : intSet1) {
			System.out.print(k+"  ");
		}
		
		
		
		
		
		
		
		
		
	}

}
