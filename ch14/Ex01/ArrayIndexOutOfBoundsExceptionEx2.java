package ch14.Ex01;

//Exception�� ������ �ֻ��� Ŭ����
//ArrayIndexOutOfBoundsException�� Exception�� �ڽ�

public class ArrayIndexOutOfBoundsExceptionEx2 {
	public static void main(String[] args) {
		int[] arr=new int[5]; // arr�迭�� �� 5�� ����, index: 0,1,2,3,4
		
		
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace(); //���ܿ� ���� ���� ���
				System.out.println("�迭�� �ε��� �� ��ȣ�� �Ѱ���ϴ�.");
		
		}finally {
			System.out.println("finally() ���α׷� ����");
			
		}
		
		
	}
}
