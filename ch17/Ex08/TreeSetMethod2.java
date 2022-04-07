package ch17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet�� ����: 1 �ߺ� ������� �ʴ´�(set) 2 �������� ���ĵʾ� �Է� 3 �������� ���ĵǾ� ��� 4 �˻� ����� ���
				//5 Ư�� ������ �� ���� 6 asc(�������� ����,desc(�������� ����)

//TreeSet�� �Ϲ� ��ü�� ������ ��� Ư�� �ʵ带 ũ�� �� ���� �ʵ尡 �����ؾ� ��. 
//ó�� ��� 3����
//1 Comparable<E> �������̽��� compareTo() ������: TreeSet�� �Ϲݰ�ü�� ������ �� �Ϲݰ�ü�� Ư�� �ʵ带 �������ؾ���
	//������ Ŭ������ �����ؼ� ���
//2 Comparable<E> �������̽��� compare() ������ �ؾ� ��. �͸� ���� ��ü�� ���
	//������ ��ü�� �������� �ʰ� ����� �� comparator<E>�������̽� ��� �� compare() ������
	//TreeSet<E> ��ü�� ������ �� �����ڿ� Comparator<E> �������̽��� ������ �͸� ��ü�� ����


class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {

		return data1+" "+data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { //��ü�� ũ�� �� ������ �����ϴ� �޼ҵ�, ((TreeSet���� ���))
		//����,0,��� �� ����              
		//�������� ó�� ���
//		if (this.data1<o.data1) { //this.data1 ���� ���� ���� ���: -1(����)
//			return -1;
//		}else if (this.data1==o.data1) { //this.data1 ���� ���� ���� ���: 0
//			return 0;
//		}else {						//this.data1 ���� ���� Ŭ ���: 1(���)
//			return 1;
//		}
		//�������� ó�� ���
		if (this.data1<o.data1) { //this.data1 ���� ���� ���� ���: 1(���)
			return 1;
		}else if (this.data1==o.data1) { //this.data1 ���� ���� ���� ���: 0
			return 0;
		}else {						//this.data1 ���� ���� Ŭ ���: -1(����)
			return -1;
		}
	}
	@Override
	public String toString() {

		return data1+" "+data2;
	}
}


public class TreeSetMethod2 {
	public static void main(String[] args) {
		//wrapper Ŭ������ comparable<E> �������̽��� compareTo() �������ϰ� ����
			//wrapper Ŭ������ ���� treeSer�� ������ ���ĵǾ� ����
		
		//1 Integer wrapper Ŭ������ ũ�� ��
		TreeSet<Integer>treeSet1=new TreeSet<>();
		Integer intValue1=new Integer(20);//ū��
		Integer intValue2=new Integer(10); //������
		int intValue=3;
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); //�������� ����
		
		//2 String wrapper Ŭ������ ũ�� ��
		TreeSet<String>treeSet2=new TreeSet<>();
		String str1=new String("����"); //������
//		String str1="����";
		String str2=new String("�ٶ�"); //ū��
		
		treeSet2.add(str1); //treeSet2.add()�� ����ؼ� ��ü�� ������ ���
									//���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� ��
		treeSet2.add(str2);		//Comparable<E> �������̽��� compareTo() ������ �Ǿ�����
		
		System.out.println(treeSet2);
		
//		//3MyClass�� compareTo() ������ �Ǿ����� �ʱ� ������ treeSet �÷��ǿ� ������ �� ����.
//		TreeSet<MyClass>treeSet3=new TreeSet<>();
//		MyClass myClass1=new MyClass(2, 5);
//		MyClass myClass2=new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);//TreeSet���� Comparable<E> �������̽��� compareTo() ������ �� Ŭ������ ���� �� �ִ�
//		treeSet3.add(myClass2); //���� �� ���� �߻�
//		
//		System.out.println(treeSet3);
		
		//TreeSet�� �Ϲ� ��ü�� ������ ���
		//1 MyComparableClass ��ü ũ�� �� - Comparable<E>�������̽��� compareTo() ������
			//���� ��ü�� ���� �ʿ�. �ٽ� ������
		TreeSet<MyComparableClass> treeSet4=new TreeSet<>();
		
		MyComparableClass mcc1=new MyComparableClass(2, 5); //TreeSet�� ����� �� Comparable<E>�������̽��� compareTo() ������
		MyComparableClass mcc2=new MyComparableClass(5, 3);
		MyComparableClass mcc3=new MyComparableClass(4, 3);
		
		treeSet4.add(mcc1);
		treeSet4.add(mcc2);
		treeSet4.add(mcc3);
		
		System.out.println(treeSet4);
		
		//2 ���� ��ü�� �������� �ʰ� TreeSet�� ������ ���
		//TreeSet ������ ���ο� Comparator<E> �������̽��� �����ؼ� �͸� ��ü�� ����
		TreeSet<MyClass> treeSet5=new TreeSet<>(new Comparator<MyClass>() {
			//Comparator<MyClass>�� ������ �͸� �ڽ� Ŭ���� ���
			@Override
			public int compare(MyClass o1, MyClass o2) { //�������� ���� ó��(data1)
				if (o1.data1<o2.data1) {
					return -1;
				}else if (o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass myClass1=new MyClass(2, 5);
		MyClass myClass2=new MyClass(3, 3);
//		MyClass myClass3=new MyClass(4, 1);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);
		
		
		
	}

}
