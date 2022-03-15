package ch05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		int[] array=new int[] {3,4,5,6,7};
		//�迭 ��(index)�� ���� �ӱ��ϱ�
		System.out.println(array.length); //���� ������ ���. 5
		
		//����ϱ�1. �� ��ȣ�� ���� �� ���. Ư�� �� ��ȣ�� ���� ���
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
//		System.out.println(array[5]); //ArrayIndexOytOfBoundsException, �� ��ȣ�� �ʰ��� ��� ��� �� ����
		
		System.out.println();
		
		//����ϱ�2. for���� ����Ͽ� Ư�� ������ �����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		for (int i = 1; i < 3 ; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//����ϱ�3. ���� for��. ó�� ����� ������ ����� ��ȯ�ϸ鼭 ���. ������ �����ؼ� ����� �� ����.
		for (int i : array) { //for(����� �ڷ��� ���� : �迭){���౸��}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//����ϱ�4. Arrays.toString(�迭������) �迭 ������ ��� ���� ���
		System.out.println(Arrays.toString(array));
		
	}

}
