package ch05;

public class SharingStringObject {
	public static void main(String[] args) {
		//1 ���ڿ� ��ü ����(���ͷ��� ������ ���, new�� ������ ���:������ ������ ����)
		
		String str1=new String("HI"); //new�� �����ϸ� �޸� �������� ����
		String str2="HI";
		String str3="HI";
		String str4=new String("HI");
		
		//�� ������ �޸� �ּ� ��(==)
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str1==str4);
		
		//�� ������ �޸��� ���� ��: ������.equals(������) <== ���� �ڷ����� �� ���� ����
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str1));
		
	}
}
