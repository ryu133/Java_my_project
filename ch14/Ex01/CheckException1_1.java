package ch14.Ex01;

public class CheckException1_1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			//try{}���� ������ �߻��� ��쿡 �۵�
//			e.printStackTrace();//������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
			//catch{}�� ������ ��� ����ó���� �� 
		}finally {
			//try{}�� ������ ���, �־ �۵���
			//try{}�� �۵��Ǹ� finally{} �׻� �۵�
			//��ü�� ��� �� ��ü�� �޸𸮸� ������ �� �����  ex)sc.close();
			System.out.println("finally{} �׻� ȣ���");
		}
		System.out.println("���α׷��� ���� �����մϴ�.");
	}
}
