package ch05;

public class Array_Definition_Ex01 {

	public static void main(String[] args) {
//		�迭 ���� ���� ���
//		�迭�� �ϳ��� �迭 ������ ���� �����͸� ����.
//		�迭�� ���� �� ������ �ڷ����� ���� ����.(�÷����� ���� ������ Ÿ���� ����)
//		�迭�� �迭�� ���� ������ �� ũ�⸦ �����ϸ� �� ũ�⸦ ������ �� ����.
//		(�÷����� �� ũ�Ⱑ �ڵ����� �þ)
		
		//�迭 ���� ���
		
		int[] array1=new int[3]; //����� ���ÿ� �� ũ�� �Ҵ�
		int[] array2; //����
		array2=new int[3]; //ũ�� �Ҵ�
		
		//�迭 ���� ���� ���
		
		int array3[]=new int[3]; //����� ���ÿ� �� ũ�� �Ҵ�: �ڷ���[]
		int array4[];
		array4=new int[3];
		
		//�迭 ���� ���� ���
		int[] array5[] = new int[3][4]; //����� ���ÿ� �� ũ�� �Ҵ�: ������[]
		int[] array6[];
		array6 = new int[3][4];
		
		// �پ��� �迭 ���� (�⺻�ڷ��� �迭, �����ڷ��� �迭)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; //�����ڷ��� �迭	
	}

}
