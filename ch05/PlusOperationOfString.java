package ch05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1 ���ڿ� + ���ڿ�
		String str1="HI"+"HELLO"+"!";
		System.out.println(str1);
		
		String str2="BOOO";
		str2+="i'm hungry"; 
		str2+="!"; 
		System.out.println(str2);
		
		//2 ���ڿ� + �⺻�ڷ��� (�⺻�ڷ����� ���ڿ��� ��ȯ��)
		String str3="HI"+1;
		String str4="HI"+String.valueOf(1);
		String str5="HI"+"1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//3 ���ڿ��� �⺻�ڷ����� ȥ���Ͽ� ����ϴ� ���
		System.out.println(1+"HI");
		System.out.println(1+"HI"+2);
		System.out.println("HI"+1+2);
		System.out.println(1+2+"HI");
	}

}
