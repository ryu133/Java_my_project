package ch05;

public class IntialValue_Ex03 {

	public static void main(String[] args) {
		//�޸��� �ʱⰪ
		int value1; //�⺻ �ڷ����� �ʱⰪ�� �Ҵ����� ����
//		System.out.println(value1);
		
		int[] value2; //�迭: ���� �ڷ���
//		System.out.println(value2);
		
		int value3=0; //�⺻ �ڷ����� 0 ������ �ʱⰪ�� �Ҵ���
		System.out.println(value3);
		
		int[] value4=null; //���� �ڷ����� �⺻ �ʱⰪ���� null-�� �� ����, �� ����-���� �ο���
		System.out.println(value4);
		
		//heap �޸��� �ʱⰪ(���� �ʱ�ȭ), heap���� ���� �ڷ����� ���� �Ҵ�
		//�⺻ �ڷ��� �迭�� ���  �⺻���� boolean: false / ������ Ÿ��(int, long, short ��): 0 / �Ǽ��� Ÿ��(double, float ��): 0.0
		boolean[] array1=new boolean[3]; //�⺻�� false �Ҵ�
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		System.out.println();
		System.out.println("========for���� ����Ͽ� �迭 ���� ���� ���========");
		for (int i = 0; i < 3; i++) {
			System.out.println(array1[i]);
		}
		System.out.println();
		System.out.println("��ü�� �޸� �ּ�: "+array1);
		System.out.println("��ü�� ���� ������ ���: "+array1.length);
		System.out.println("=====for���� array1.lenth ���=====");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1["+i+"] ���� �� "+array1[i]);
		}
		
		int[] array2=new int[3]; //0�� �⺻������ �Ҵ�
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		double[] array3=new double[3]; //0.0 �⺻��
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		//���� �ڷ��� �迭�� ��� �⺻���� null
		String[] array4=new String[3]; //null �⺻��
		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i]);
		}
	}

}
