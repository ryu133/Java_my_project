package ch05;

import java.util.Arrays;

public class MethodOfString01 {
	public static void main(String[] args) {
		//1 ���ڿ� ���� (length): int Ÿ������ ��ȯ
		String str1="Hello Java!";
		String str2="�ȳ��ϼ���! �ݰ����ϴ�.";
		//str1: ��������, ��ü, �ν��Ͻ�
		System.out.println(str1.length());
		System.out.println(str2.length());
		//java���� length�� ���ڼ��� ����(�ѱ��� 2byte����)
		
		//2 ���ڿ� �˻�(charAt(), indexOf(), lastInexOf())
		System.out.println(str1.charAt(1)); //1�� ���� ���ڸ� ���
		System.out.println(str2.charAt(1));
		//indexOf(): 0��° ����� ������ ����� ������ �� ��ȣ(index) ���
		//lastIndexOf(): ������ ����� 0��° ������ ������ �� ��ȣ�� ���
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a')); //9
		System.out.println(str1.indexOf('a',8)); //8�� ����� �˻� ����-> 
		System.out.println(str1.lastIndexOf('a',8)); //8�� ����� �˻� ����<-
		System.out.println(str1.indexOf("Java")); //�˻� ����-> 
		System.out.println(str1.lastIndexOf("Java")); //�˻� ����<-
		System.out.println(str2.indexOf("�ϼ���")); //�˻� ����-> 
		System.out.println(str2.lastIndexOf("�ϼ���")); //�˻� ����<-
		System.out.println(str1.lastIndexOf("Bye")); //�˻� ����<- <<�߿�!>>(�ش� ���� ���ٸ� -1 ���)
		
		//3 ���ڿ� ��ȯ �� ����(String.valueOf(), concat())
		//String.valueOf(�⺻�ڷ���): String���� ��ȯ
		String str3=String.valueOf(2.3); //�Ǽ� 2.3�� ���ڿ��� ��ȯ
		String str4=String.valueOf(false); //false�� ���ڿ��� ��ȯ
		System.out.println(str3);
		System.out.println(str4);
		
		//concat(): ���ڿ��� ���ڿ��� ���� (+������ ����)
		String str5=str3.concat(str4);
		System.out.println(str5);
		
		//concat() �޼ҵ忡�� String.valueOf ��� >> + (�ڵ����� Ÿ�� ��ȯ)
		String str6="�ȳ�"+3; //�����ڸ� ����� �� �ڵ����� ��ȯ��
		String str7="�ȳ�".concat(String.valueOf(3));
		//concat�� ����� �� String Ÿ������ ��ȯ �ʿ�
		System.out.println(str6);
		System.out.println(str7);
		
		//4 ���ڿ� ==> byte[] Ÿ������ ��ȯ (getBytes())
		//���ڿ� ==> char[] Ÿ������ ��ȯ (toCharArray())
		
		String str8="Hello Java!";
		String str9="�ȳ��ϼ���";
		
		byte[] array1=str8.getBytes(); 
		byte[] array2=str9.getBytes();
		System.out.println(Arrays.toString(array1)); //�ƽ�Ű �ڵ尡 ��µ�
		System.out.println(Arrays.toString(array2));
		
		char[] array3=str8.toCharArray();
		char[] array4=str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
	}
}
