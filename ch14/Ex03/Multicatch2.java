package ch14.Ex03;

public class Multicatch2 {
	public static void main(String[] args) {
		//1 Exception Ŭ����
		
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10a");
		} catch (Exception e) {
			//try{}���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("����ó�� Exception");
			
		}
		
		//2 catch{}�� ������ �߸��� ��� : Exception�� catch�� �������� ��ġ�ؾ���
//		try {
//			System.out.println(10/0);
//			int num=Integer.parseInt("10a");
//		} catch (Exception e) {
//			//try{}���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
//			System.out.println("����ó�� Exception");
//		} catch (ArithmeticException e) {
//			
//		} catch (NumberFormatException e) {
//			
//		}
		
		//3 catch{}�� �ùٸ� ����: �ֻ��� Exception�� catch{}�� �������� ��ġ
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10aaa");
		} catch (ArithmeticException e) {
			System.out.println("aa");
		} catch (NumberFormatException e) {
			System.out.println("nn");
		}catch (Exception e) {//�ֻ��� �θ��� Exception�� �������� ��ġ
			//try{}���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("����ó�� Exception");
		}
		
		//4 �������� exception�� �ѹ��� ����
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10aaa");
		} catch (ArithmeticException | NumberFormatException e) {
			
		} catch (Exception e) {
			
		}
		
		
		System.out.println("end");
	}
}
