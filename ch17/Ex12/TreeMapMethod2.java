package ch17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap<K,V> : key�� �������� ���ĵǾ ó��
	//key�� �Ϲݰ�ü�� ����� ��� Comparable<E>�� compareTo(), Comparator<E>�� compare() ������ �ʿ�

//�Ϲ� Ŭ����
class MyClass{
	int data1;
	int data2;
	public MyClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" �� ���";
	}
}
//comparable<E> �������̽��� compareTo() �������� Ŭ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" �� ���";
	}
	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1<o.data1) {
			return -1;
		}else if (this.data1==o.data1) {
			return 0;
		}else {
			return 1;
		}
	}
}

public class TreeMapMethod2 {
	public static void main(String[] args) {
		//1 MyClass�� TreeMap�� Key�� �Է��� ��� ���� ���� �߻�
//		TreeMap<MyClass, String>treeMap1=new TreeMap<>();
//		MyClass m1=new MyClass(2, 5);
//		MyClass m2=new MyClass(3, 3);
//		
//		treeMap1.put(m1, "first"); //
//		treeMap1.put(m2, "second");
//		
//		System.out.println(treeMap1);
		
		//2 Comparable�� ������ Ŭ������ ���
		TreeMap<MyComparableClass, String> treeMap2=new TreeMap<>();
		
		MyComparableClass my1=new MyComparableClass(2, 5);
		MyComparableClass my3=new MyComparableClass(10, 5);
		MyComparableClass my2=new MyComparableClass(3, 3);
		
		treeMap2.put(my1, "1��");
		treeMap2.put(my3, "3��");
		treeMap2.put(my2, "2��");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		//3 Comparator<E> ���� : ���� ��ü ���. ���� ���ʿ�
		TreeMap<MyClass, String> treeMap3=new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1;
				}else if (o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass m3=new MyClass(2, 5);
		MyClass m5=new MyClass(20, 20);
		MyClass m4=new MyClass(3, 3);
		
		treeMap3.put(m5, "3��");
		treeMap3.put(m3, "1��");
		treeMap3.put(m4, "2��");
		
		System.out.println(treeMap3);
		System.out.println(treeMap3.size());
		
		
	}
}
