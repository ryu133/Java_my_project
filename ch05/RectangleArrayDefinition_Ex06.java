package ch05;

public class RectangleArrayDefinition_Ex06 {

	public static void main(String[] args) {
		//2���� �迭 �����ϱ�
//		����&�� �Ҵ�
		int[][] array1=new int[3][4]; //��3 ��4
//		���� �� �� �Ҵ�
		int[][] array2;
		array2=new int[3][4];
		
//		���� ������ �ʱⰪ int : 0
		System.out.println(array1[0][2]);
		
		int array3[][]=new int[3][4];
		int array4[][]; 
		array4=new int[3][4];
		
		int[] array5[]=new int[3][4];
		int[] array6[];
		array6=new int[3][4];
		
//		�پ��� �ڷ����� �迭 ����(�⺻ �ڷ��� �迭, ���� �ڷ��� �迭)
		boolean[][] array7=new boolean[3][4]; //false
		int[][] array8=new int[2][4]; //0
		double[][] array9=new double[3][5]; //0.0
		String[][] array10=new String[2][6]; //���� �ڷ��� �⺻��: null
		
	}

}
