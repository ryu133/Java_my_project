package ch14.Ex03;
//�������� ���ܰ� ���ÿ� �߻��� ���
public class MultiCatch1 {
	public static void main(String[] args) {
		//try catch
		//1 ���� ���� ó��
		try {
			//ArithmeticException
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			//catch{}�� �ƹ� ������ ��� ����ó����
			System.out.println("���� ���(ArithmeticException)");
		}
		
		try {
			//NumberFormatException
			int num1=Integer.parseInt("10a");
			
		} catch (NumberFormatException e) {
			System.out.println("���� ���(NumberFormatException)");
		}
		
		System.out.println("=======================");
		
		//2 ���� ����ó�� 1
		try { //try{}���� ���� ���ܰ� �߻��� ��� 
			System.out.println(10/0);
			int num2=Integer.parseInt("10a");
			
		} catch (ArithmeticException e) {
			System.out.println("(ArithmeticException) �߻�");
		}catch (NumberFormatException e) {
			System.out.println("(NumberFormatException) �߻�");
		}
		
		//2 ���� ����ó�� 2
		try {
			System.out.println(10/0);
			int num2=Integer.parseInt("10a");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("���� ���� ó�Ӥ�");
		}
		
		
		System.out.println("end");
	}
}
