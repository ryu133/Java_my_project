package ch16.Ex07;
//���׸� �޼ҵ� ���ο��� ��� ������ �޼ҵ�: objectŬ������ �޼ҵ常 ��� ����

class A{
	public <T> void method(T t) {
//		System.out.println(t.length()); //t.length(): string Ŭ�������� ���ڼ��� ������  //�ٸ� �ڷ����� �� �� �ֱ� ������ ���Ұ�
		System.out.println(t.equals("�ȳ�")); //t.equals()�� object Ŭ������ �޼ҵ�� ��� ����
	}
	public <T extends Object>void method2(T t){ //extends Object �� �����Ǿ��ִ�
		System.out.println(t.equals("�ݰ����ϴ�.")); //objectŬ������ �޼ҵ常 ��� ����
	}
	public <T extends String> void method3(T t) {
		System.out.println(t.length());
//		System.out.println(t.);
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a=new A();
		a.<String>method("�ȳ�");
		
	}

}
