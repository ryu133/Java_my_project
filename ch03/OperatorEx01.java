package ch03;

public class OperatorEx01 {

	public static void main(String[] args) {
		//���� ��ȯ&~
		int data=13;
		
		System.out.println(Integer.toBinaryString(data));//2���� ��ȯ
		System.out.println(Integer.toOctalString(data));//8���� ��ȯ
		System.out.println(Integer.toHexString(data));//16���� ��ȯ
		
		System.out.println(Integer.parseInt("1101",2));//2����(1101)�� 10������ ��ȯ
		System.out.println(Integer.parseInt("15",8));//8����(15)�� 10������ ��ȯ
		System.out.println(Integer.parseInt("0D",16));
		
		System.out.println(~3);
		System.out.println(~7);
	}

}
