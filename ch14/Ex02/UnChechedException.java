package ch14.Ex02;
//���࿹��(unchecked exception,runtime exception): ������ �ܰ迡���� ���ܰ� �߻����� ����
//���� �� �߻��� �� �ִ�

class AA{}
class BB extends AA{}
public class UnChechedException {
	public static void main(String[] args) {
		//���� ����
		
		//ArithmeticException: 0���� � ���� ������ ���� �߻�
//		System.out.println(10/0);
		
		//ClassCastException: Ŭ������ Ÿ���� ��ȯ�� �� ��ȯ���� �ʴ� ����
		AA aa=new AA();
//		BB bb=(BB)aa;//������ �ܰ迡���� ������ �߻����� ����
		
		//ArrayIndexOutOfBoundsException: �迭���� �������� �ʴ� ���ȣ�� ����� ��� �߻�
		int[] array= {1,2,3};
//		System.out.println(array[3]); 
		
		//NumberFormatException: ������ ���ڸ� ���� Ÿ������ ��ȯ�� �� ���� ����
		int num=Integer.parseInt("10!"); //������ ���ڿ� 10�� ������ ��ȯ
		System.out.println(num);
		
		//NumberFormatException: 
		String string=null;
		System.out.println(string.charAt(4));
		
		
	}
}
