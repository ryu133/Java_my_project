package ch05;

import java.util.Arrays;

public class TestCheck0228 {

	public static void main(String[] args) {
		int[] arr1=new int[100];
		//for���� ����ؼ� arr1�迭�� �� �濡 ���� �Է�
		for (int i = 0; i < arr1.length; i++) { //for���� ����ؼ� �迭 �濡 ���� �Ҵ�
			arr1[i]=i+1; //arr1[0~99]=i+1; �迭 ������ ���� �־��ش�
		}
		//��±��� for
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i+"��° ���� ��: "+arr1[i]);
		}
		System.out.println("=================");
		//for each
		for (int i : arr1) {
			System.out.println(i);
		}
		//Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
		
	}

}
