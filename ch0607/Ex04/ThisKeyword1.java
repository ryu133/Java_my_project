package ch0607.Ex04;
//������ this Ű���� �ڵ� �߰�
//1. Ŭ�������ο��� �ʵ�, �޼��忡 �տ� �ٴ� �ڵ����� �ٴ� this Ű����
//this Ű�� �ڱ� �ڽ��� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī. 
class A{
	int m;
	int n;
//	A(){} //�⺻ ������ ������
	void init(int a,int b) {
		int c; //a,b,c�� �������� (stack ������ ������� ���� ����). init() �޼ҵ尡 ���۵Ǹ� ���� ������ �����ǰ� �޼ҵ尡 ������ �����
		c=3;
		this.m=a; //this. ���� �� �����Ϸ��� �ڵ����� �߰�
		this.n=b; //this. ���� �� �����Ϸ��� �ڵ����� �߰�
	}
	void work() {
		this.init(2,3); //this. ���� �� �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m+" "+this.n); //this.�� ���� ����
	}
}
		
public class ThisKeyword1 {

	public static void main(String[] args) {
		//2 ��ü ����
		A a=new A();
		//3 �޼ҵ� ȣ��
		a.work();
	}

}
