package ch0607.Ex02;

public class EffectOfPrimaryDataArgument {
	int abc; //�ʵ� (heap ������ �����). ��üȭ �ʿ�
	static int twice(int a) {
		a=a*2;
		return a;
	}
	
	public static void main(String[] args) {
		int a=3; // ��������(stack ������ ������� ���� �����)
		int result1=twice(3);
		System.out.println(result1);
		System.out.println(a);
	}
}
