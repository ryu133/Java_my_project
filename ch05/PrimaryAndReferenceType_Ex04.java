package ch05;
public class PrimaryAndReferenceType_Ex04 {
	public static void main(String[] args) {
		//�⺻ ������ Ÿ���� ���� ����(stack �� ����)
		int value1=3;
		int value2=value1;
		
		value2=7;
		System.out.println(value1);
		System.out.println(value2);
		
		//���� �ڷ����� ���� ����(stack �ּ�-����- ����)
		int[]array1=new int[] {3,4,5,7};
		int[] array2=array1; //array2�� ���� �������� array1�� heap ������ �ּ� ����
		array2[0]=7;
		
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		System.out.println(array1);
		System.out.println(array2);
	}

}
