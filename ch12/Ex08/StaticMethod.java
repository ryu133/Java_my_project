package ch12.Ex08;
//�������̽� ���ο� static Ű�� �� �޼ҵ� : ���� �ڽĿ��� �������� �ٷ� ȣ��
/* �������̽� ���� ���� ���
 * 1. �ʵ� : [public static final]
 * 2. �޼ҵ� : [public abstract] �߻� �޼ҵ�(������ ����) 
 * 			 [public] default �����ΰ� ����(java 1.8 ����) 
 * 			 [public] static �����ΰ� �ְ� ��ü �������� ȣ�� ����(java 1.8 ����)
 */
interface A{
	static void abc() { //�ڹ� 1.8 ���� ���Ӱ� �߰��� ���
		System.out.println("A �������̽��� ���� �޼ҵ� abc()");
	}
	
}
public class StaticMethod {
	public static void main(String[] args) {
		//1 ���� �޼ҵ� ȣ��
		A.abc(); //interface �̸����� �ٷ� ȣ�� ����
		
	}
}
