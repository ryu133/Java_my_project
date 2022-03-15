package ch05;

import java.util.Arrays;

public class MethodOfString02 {

	public static void main(String[] args) {
		//5 ���ڿ� ���� 
		//toLowerCase(): �ҹ��ڷ� ��ȯ
		//toUpperCase(): �빮�ڷ� ��ȯ
		
		String str1="Java Study";
		System.out.println(str1.toLowerCase()); //
		System.out.println(str1.toUpperCase());
		
		//replace(old,new): old�� new�� �ٲ�
		System.out.println(str1.replace("Study", "����"));
		
		//substring(���� index, �ڸ� ������ index �ձ���): ���ڿ��� �߶� ���
		System.out.println(str1.substring(0, 6));
		System.out.println(str1.substring(6, 8));
		
		//split(): Ư�� ���ڸ� �������� �߶� String[](���ڿ� �迭)�� ����
		String str11="abc/def-ghi jkl";
		String[] strArray=str11.split("/|-| "); // '/' �Ǵ� '-' �Ǵ� ' ' �������� �ڸ�
		System.out.println(Arrays.toString(strArray));
		String str111="������ ������ �帳�ϴ�.";
		String[] strArray2=str111.split(" "); //������ �������� �߶� strArray2 �迭�� ����
		System.out.println(Arrays.toString(strArray2));
		String str1111="�̸�,����,����,��ȭ��ȣ,�����ּ�";
		String[] strArray3=str1111.split(",");
		System.out.println(Arrays.toString(strArray3));
		for (int i = 0; i < strArray3.length; i++) {
			System.out.println(strArray3[i]);
		}
		
		//trim(): �յ��� ������ ������
		System.out.println("               abc        ");
		System.out.println("               abc        ".trim());
		
		//6 ���ڿ��� ���� �� equals(): ��ҹ��� ������, equalsIgnoCase(): ��ҹ��� ���� ����
		String str2=new String("Java");
		String str3=new String("Java");
		String str4=new String("java");
		//�޸��� �ּҰ� ��(==)
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		//���� ��(equals(),equalsIgnoCase())
		System.out.println(str2.equals(str3)); //true
		System.out.println(str3.equals(str4)); //false
//		System.out.println(str4.equals(str2)); //false
		System.out.println(str3.equalsIgnoreCase(str4)); //true
		
		
		
	}

}
