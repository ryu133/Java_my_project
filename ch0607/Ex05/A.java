package ch0607.Ex05;
	//���� ������(ĸ��ȭ: �����͸� �ܺηκ��� ��ȣ)
//		public, pritected, default(�⺻������ ����), private
//		Ŭ���� �̸�,�ǵ��, �޼ҵ��, �����ڸ� <<==���� �����ڰ� �ݵ�� �Ҵ��
//		Ŭ���� �̸�: public, default
public class A {
	int m=3; //�ʵ��� �⺻ ���� �����ڴ� default�� ������
	int n=4; //default: �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�
				
	public int k=10; //public�� �ٸ� ��Ű�� ������ ���� ����
	
	void print() { //default:���� ��Ű�� ���� Ŭ���������� ���
		System.out.println("����Ʈ ����");
	}
	public void print2() {
		System.out.println("�ܺ� ��Ű���� �ٸ� Ŭ�������� ���� ����"+k);
	}
	
	public static void main(String[] args) {
		
	}
}
