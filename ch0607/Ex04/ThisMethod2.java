package ch0607.Ex04;
//Aaa Ŭ����: �������� �����ڸ� this(); ���� ������ ��� �ߺ��� ���� �Ź� �Է��ؾ���
class Aaa{
	int m1,m2,m3,m4; //�ʵ� 4�� ����
	Aaa(){ //�Ű������� ���� ������
		m1=1; m2=2; m3=3; m4=4; //�ʱⰪ �Ҵ�
	}
	Aaa(int a){
		m1=a; m2=2; m3=3; m4=4;
	}
	Aaa(int a, int b){
		m1=a; m2=b; m3=3; m4=4;
	}
	void print() {//�� �޸��� ���� ���
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}
}
//Bbb Ŭ����: �������� �����ڸ� this();�� ����Ͽ� ������ ��� �ߺ��� �� ���� ����
class Bbb{
	int m1,m2,m3,m4; //�ʵ� 4�� ����
	Bbb(){
		m1=1; m2=2; m3=3; m4=4;
	}
	Bbb(int a){
		this(); //�Ű������� ���� ������ ȣ��
		m1=a;
	}
	Bbb(int a,int b){
		this(a);
		m2=b;
	}
	void print() {//�� �޸��� ���� ���
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}
}

public class ThisMethod2 {
	public static void main(String[] args) {
		//��ü ���� (this �̻��)
		Aaa aaa1=new Aaa(); //�Ű������� ���� ������ ȣ��
		Aaa aaa2=new Aaa(10); //�Ű������� 1���� ������ ȣ��
		Aaa aaa3=new Aaa(10,20); //�Ű������� 2���� ������ ȣ��
		aaa1.print();
		aaa2.print();
		aaa3.print();
		
		System.out.println("==========");
		
		//��ü ���� (this ���)
		Bbb bbb1=new Bbb();
		Bbb bbb2=new Bbb(10);
		Bbb bbb3=new Bbb(10,20);
		bbb1.print();
		bbb2.print();
		bbb3.print();
		
	}
}
