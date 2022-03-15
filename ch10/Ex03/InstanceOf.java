package ch10.Ex03;
//instanceof: ��ü ������ ĳ������ ���� ���θ� �� �� �ֵ��� �ϴ� Ű����
//��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ� �� true, false�� ����
//�ٿ�ĳ���� �� ��Ÿ�� ������ �߻��� �� �ִ�, ��Ÿ�� ������ ���������ش�
//�ٿ�ĳ���� �� �ش� Ÿ���� ��ü�� ������ ���� �ٿ�ĳ���� �ϵ��� �����ϴ� ���ǹ��� �� �� �ֵ�

class A{
	int m;
	void a() {
		System.out.println(m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {
	public static void main(String[] args) {
		//1 instanceof : ��ü�� instanceof Ÿ��(Ŭ����)
		A aa=new A();//aa�� aŸ�Ը� ������
		A ab=new B();//ab�� ab ���� a�� ��밡��
		
		System.out.println(aa instanceof A);//true
		System.out.println(ab instanceof A );//true
		System.out.println(aa instanceof B);//false
		System.out.println(ab instanceof B );//true
		
		if (aa instanceof B) {//aa��ü�� BŸ���� ���ԵǾ����� ��쿡�� ĳ������
			B b=(B)aa;//��Ÿ�� ������ �����ϱ� ����
			System.out.println("aa�� b�� ĳ���� ��");
		}else {
			System.out.println("aa�� bŸ������ ĳ���� �Ұ�");
		}
		if (ab instanceof B) {//ab��ü�� BŸ���� �����ϴ� ��쿡�� ĳ������
			B b=(B)ab;
			System.out.println("ab�� bŸ������ ĳ���� ��");
		}else {
			System.out.println("ab�� bŸ������ ĳ���� �Ұ�");
		}
		if ("�ȳ�" instanceof String) {//��ü�� ������ Ÿ���� Ȯ��
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");
		}else {
			System.out.println("\"�ȳ�\"�� String Ŭ������ �ƴմϴ�.");
		}
	}
}
