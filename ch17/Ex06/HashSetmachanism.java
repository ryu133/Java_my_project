package ch17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set: �ߺ��� ���� ���� �� ����.
	//equals(),hashCode() ���ǵǾ� �־���
	//String,Integer Ŭ�������� ���� �޼ҵ尡 ������ �Ǿ��ִ�
	//Ư�� ��ü�� set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals(),hashCode()�޼ҵ带 ������ �ؾ� �� 
	//Object Ŭ������ equals(),hashCode()
		//Object Ŭ������ equals() �� ==�� ����. 
			//==�� Stack �޸� ���� ����

class A{
//equals(),hashCode()�� ������ ���� ���� ����
	int data;
	public A(int data) {
		this.data=data;
	}
}

class B{ //�� ���� ��ü�� data �ʵ��� ���� ���� ��, �����ϴٰ� �ĺ��ڸ� �־�� ��->equals(),hashCode()
	//equals()�� ������, hashCode()�� ������ ���� ���� ����
	int data;
	public B(int data) {
		this.data=data;
	}
	
	@Override
	public boolean equals(Object obj) { //��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ���� Ư�� �ʵ��� ���� ���ϵ��� ����
		if (obj instanceof B) { //obj�� BŸ���� �����ϰ� ���� ���� �ٿ�ĳ����
			if(this.data==((B)obj).data) //����: �߸��� �ٿ�ĳ������ �� ��� ���� �߻�  
				return true;
		}
		return false;
		
//		if (this == obj) //�ڵ� �Է��� �־��� �ڵ�
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		B other = (B) obj;
//		return data == other.data;
	}
}

class C{
	int data;
	public C(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C)
			if (this.data==((C)obj).data) {
				return true;
			}
		return false;
	}
	@Override
	public int hashCode() { //Objects.hash(�ʵ��,�ʵ��,�ʵ��) �������� �ʵ��� �ؽ��ڵ带 ���ÿ� ������ ����
		return Objects.hash(data);
		//return data; //data �ʵ��� ���� ������ hashCode�� �����ϰ� ����
	}
	
}

public class HashSetmachanism {
	public static void main(String[] args) {
		//1 equals(),hashCode()�� ������ ���� ���� ����
		Set<A>hashSet1=new HashSet<>();
		A a1=new A(3);
		A a2=new A(3);
		System.out.println(a1==a2); //false
			//==�� Stack �޸��� ���� ����
		System.out.println(a1);//��ü�� ���: ��Ű����.Ŭ������@�ؽ��ڵ�(�� �޸� �ȿ� �ּҰ��� �ؽ��ڵ�)(16����)
		System.out.println(a2);
		System.out.println(a1.equals(a2)); //false ,Object equals()�� ==�� ����
		System.out.println(a1.hashCode()+", "+a2.hashCode()); //(10����)
		
		hashSet1.add(a1); //set�� �ߺ��� ���� ���� ����
		hashSet1.add(a2);
		System.out.println(hashSet1.size()); //2  //equals(),hashCode()�� ������ ���� ���� ����
		
		//equals()�� ������(��ü�� data �ʵ��� ���� ��)   , hashCode()�� ������ ���� ���� ����
		Set<B>hashSet2=new HashSet<>();
		B b1=new B(3);
		B b2=new B(3);
		System.out.println(b1==b2); //stack �޸��� �� ��   false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode()+" "+b2.hashCode());
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size()); //equals()�� ������, hashCode()�� ������ ���� ���� ����
		
		//equals()�� ������, hashCode()�� ������ �� ����
		Set<C>hashSet3=new HashSet<>();
		C c1=new C(3);
		C c2=new C(3);
		System.out.println(c1==c2); //false, stack�� ��ü �ּҸ� ��
		System.out.println(c1.equals(c2)); //true, ��ü�� data �ʵ��� ���� ��(������)
		System.out.println(c1.hashCode()+" "+c2.hashCode()); //data �ʵ带 �������� hashCode�� ����
			//�� ��ü�� ������ ��ü��
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //1 //equals(),hashCode() ������.  (data �ʵ忡 ���ؼ�)
		
		
		
		
		
	}
}
