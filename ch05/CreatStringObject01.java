package ch05;

public class CreatStringObject01 {

	public static void main(String[] args) {
		//String ��ü ���� 1: newŰ�� ����ؼ� ��ü ����. Heap������ ������ ������ ����
		//RAM(�޸�)�� ���� ���� �������� �ʴ´�.
		String str1=new String("�ȳ�"); //new ��ü�� ����(Heap �޸𸮿� ����)
		System.out.println(str1); //String�� ��ü�� ������� �� ��ü�� ���� ���.
									//String�� ������ Ư���� ���. ���� ��ü ��ü�� ����ϸ� Heap�޸��� ���� ���
									//��ü�� ���� ����� ���� ��ü��.toString() ������ ��ü�� ���� ���� �� ����
		
		String str11=new String("�ȳ�"); //str1�� str11�� ������ �޸� ������ ����(Heap�� ���� �����)
		
		if (str1==str11) { //���� �ڷ����� ��� ==�� �ּҸ� ��
			System.out.println(true);
		}else {
			System.out.println(false); //������ �ּ���
		}
		
		//2 ���ͷ��� ���� �ٷ� �Ҵ�: ���� ���� ��� RAM(�޸�)�� ���� �����ϰ� �� (Heap)
		String str2="�ȳ��ϼ���."; 
		String str22="�ȳ��ϼ���."; //������ �޸� ������ �����ϰ� �� 
		
		if (str2==str22) { //���� �ڷ����� ��� ==�� �ּҸ� ��
			System.out.println(true); //���� �ּ���
		}else {
			System.out.println(false);
		}
		
	}

}
