package ch05;

import java.util.Arrays;

public class Test0228_2 {

	public static void main(String[] args) {
//		�迭 ������ arr2[300]
//			0��° ��: 3, 1��° ��: 6, 2��° ��: 9 ~
//				for ���� ����ؼ� 3�� ����� ����
//				���: for, foreach, Arrays.toString, Ȧ�������� ���� ��� ����:100~300
		int[] arr2=new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=(3*i)+3; //(i+1)*3
			System.out.println(i+"��° ���� ��:"+arr2[i]);
		}
		
		System.out.println();
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 100; i < arr2.length; i++) {
			if (i%2==1) { //i%2!=0
				System.out.println(arr2[i]);
			}
		}

	}

}
