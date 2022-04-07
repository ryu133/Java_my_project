package ch17.Ex07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet
	//HashSet�� ������: HashSet�� ��� �޼ҵ� ������. �ߺ��� ���� �������� ����. �ε��� �� ����. for ��� �Ұ�(iterator,enhanced for ���)
	//HashSet�� ������: �Է´�� ��µ�(hastset�� �Է´�� ��µ��� ����)

//ctrl+shift+L : ����Ű ����Ʈ

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		Set<String>LinkedHashSet1=new LinkedHashSet<>(); //set�� �������̽��̹Ƿ� Ÿ�����θ� ������ �� �ִ�
		//set�� ���׸� Ÿ�Ժ����� wrapper Ŭ������ ����� ��� equals(),hashCode() �����ǵ�
		
		//add(element) : set�� �� �߰�
		LinkedHashSet1.add("��");
		LinkedHashSet1.add("��"); //�ߺ� ���� �ȵ�
		LinkedHashSet1.add("��");
		LinkedHashSet1.add("��"); //�ߺ� ������� �ʴ´�

		System.out.println(LinkedHashSet1);
		System.out.println(LinkedHashSet1.toString()); //tostring() �����ǵ�
		
		//addAll(�ٸ� set ��ü): �ڽ��� set�� �ٸ� set�� ����� ���� �߰�, �ߺ��� ���� ���ŵ�
		Set<String>LinkedHashSet2=new LinkedHashSet<>();
		LinkedHashSet2.add("��");
		LinkedHashSet2.add("��");
		LinkedHashSet2.addAll(LinkedHashSet1);
		
		System.out.println(LinkedHashSet2);
		
		//remove(Object o): ������ ����, (list�� ��� index�� ����)
		LinkedHashSet2.remove("��");
		System.out.println(LinkedHashSet2);
		
		//clear(): ��� ����
		LinkedHashSet2.clear();
		System.out.println(LinkedHashSet2);
		
		//isEmpty
		System.out.println(LinkedHashSet2.isEmpty());
		
		//contains(Object o): ���� set�� �����ϸ� true, �׷��� ������ false
		Set<String>LinkedHashSet3=new LinkedHashSet<>();
		LinkedHashSet3.add("��");
		LinkedHashSet3.add("��");
		LinkedHashSet3.add("��");
		System.out.println(LinkedHashSet3); //�Է°� ����� ����
		System.out.println(LinkedHashSet3.contains("��")); 
		System.out.println(LinkedHashSet3.contains("��")); 
		
		//size(): set�� ���Ե� ���� ����
		System.out.println(LinkedHashSet3.size());
		
		//iterator(): set�� index�� ����. for���� �� ��ȣ�� ���� ����ϹǷ� ��� �Ұ�, enhanced for���� ��� ����
		//��ȸ��, set�� ������ ��ȸ�ϸ鼭 ����
		//hasNext(): set�� ���� �����ϸ� ture, �ƴϸ� false
		//next(): ���� ������ ���������� �̵�
		Iterator<String>iterator=LinkedHashSet3.iterator();
		//Ŭ����<E> ������ü=set��ü.iterator();a
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		System.out.println("=== for each ===");
		for (String k : LinkedHashSet3) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
		//toArray():set�� �迭�� �����. objectŸ������ �����ϹǷ� �ٿ�ĳ���� �ʿ�
		Object[] objArray=LinkedHashSet3.toArray();
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
		String[] strArray1=LinkedHashSet3.toArray(new String[0]);// 0: ���� ũ�� ����. 
		//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ������. ���� ũ�⸦ �� �� ���� ��� 0���� ������ �ȴ�.
		System.out.println(Arrays.toString(strArray1)); //[��, ��, ��]
		
		//toArray(T[] t)  <set�� ������ ���� ũ�⸦ ũ�� �������� ��� null ���� ��)
		String[] strArray2=LinkedHashSet3.toArray(new String[5]);
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
