package ch17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//�̸��� ���̸� �Է� �� �̸� �������� �������� ���� �� ���. TreeSet ���
//1 Comparable<E> �� compareTo() ������
	//������ ��ü ���� �ʿ�
//2 Comparator<E> �� compare() ����
	//������ ��ü �������� ����
class Abc{
	String name;  //������ �÷�. �������� ����  ȫ�浿,�̼���,������ ==> ������,�̼���,ȫ�浿
	int age;  	
	
	public Abc(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public String toString() {

		return name+" "+age;
	}
	
}

class AbcT implements Comparable<AbcT>{
	String name;
	int age;
	
	public AbcT(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(AbcT o) {
		if ((this.name).compareTo(o.name)<0) {
			return -1;
		}else if ((this.name).equals(o.name)) {
			return 0;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {

		return name+" "+age;
	}
}

public class ExTreeSetMethod3 {
	public static void main(String[] args) {
		TreeSet<Abc> aSet1=new TreeSet<>(new Comparator<Abc>() {
			public int compare(Abc o1, Abc o2) {
				if ((o1.name).compareTo(o2.name)<0) {
					return -1;
				}else if ((o1.name).equals(o2.name)) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		Abc abc1=new Abc("�̼���", 50);
		Abc abc2=new Abc("ȫ�浿", 30);
		Abc abc3=new Abc("������", 40);
		
		aSet1.add(abc1);
		aSet1.add(abc2);
		aSet1.add(abc3);
		
		System.out.println(aSet1);
		
		TreeSet<AbcT> aSet2=new TreeSet<>();
		
		AbcT abcT1=new AbcT("�̼���", 50);
		AbcT abcT2=new AbcT("ȫ�浿", 30);
		AbcT abcT3=new AbcT("������", 40);
		
		aSet2.add(abcT1);
		aSet2.add(abcT2);
		aSet2.add(abcT3);
		
		System.out.println(aSet2);
		
		
		
		
	}
}
