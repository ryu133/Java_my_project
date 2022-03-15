package ch0607.Ex02;

import java.util.Arrays;

	
public class ArrayArgumentMethod {
	//static �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ�: �޼ҵ� �̸����� ȣ�� ����
	//�ٸ� ��Ű������ ���� �����ϵ��� ����: ���� ������(public, protected, default, private)
	//���� �����ڰ� �����Ǿ������� default ���� ����(���� ��Ű�� �ȿ��� ���� ����)
	
	static void printArray(int[] a) { 
		
		System.out.println(Arrays.toString(a));
		//for��, for each ����� ���
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//�迭�� �Ű������� ������ �޼ҵ� ȣ��
		int[] a=new int[] {1,2,3}; //�迭������ �����ϰ� ���� ���� ��
		
		printArray(a); //�迭������ �޼ҵ� ȣ�� �� �迭���� �Է�
		
		printArray(new int[] {4,5,6,7,8});
		
//		printArray(1,2,3); //���� �߻�
	}
}
