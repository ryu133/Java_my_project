package ch12.Ex01;

//�߻� Ŭ������ ��üȭ�ϴ� ���2 (�͸� Ŭ���� Ȱ��)
// �ӽ÷� ����� ��(�̺�Ʈ)
// ����: �ڽ� Ŭ������ �������� �ʴ´�. �ӽ÷� ����ϱ⿡ ����
// ����: ���� ���� ��ü�� �����ؾ��� ��� �ڵ尡 ����� 
abstract class AAA{
	abstract void abc();
}
public class AbstractClass2 {
	public static void main(String[] args) {
		//�͸� Ŭ���� ����
		AAA aaa=new AAA() {
			void abc() {
				System.out.println("���2: ��ü �������� �͸� Ŭ������ �߻� �޼ҵ� ����");
			}
		};
		AAA aaa1=new AAA() { //�߻�Ŭ������ ��ü ���� �Ұ�, �͸� Ŭ���� ���� �� �޼ҵ� �������ؼ� ���
			void abc() {
				System.out.println("���2: ��ü �������� �͸� Ŭ������ �߻� �޼ҵ� ����");
			}
		};
		AAA aaa2=new AAA() {
			void abc() {
				System.out.println("���2: ��ü �������� �͸� Ŭ������ �߻� �޼ҵ� ����");
			}
		};
		aaa.abc(); //�޼ҵ� ȣ��
		aaa1.abc();
	}
}
