package ch02;

public class FloatVsDouble {

	public static void main(String[] args) {
		//float: �Ҽ��� ���� 7�ڸ�����
		// double: �Ҽ��� ���� 15�ڸ�����
		float f1=1.0000001f; //���� f�� F�� ���δ�.
		double d1=1.000000000000001; //
		System.out.println(f1+"\n"+d1);
	}

}
