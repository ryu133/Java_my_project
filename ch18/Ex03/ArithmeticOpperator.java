package ch18.Ex03;

import java.util.Scanner;

//1��ĳ�� ��� double �Ű����� �Է� �� �� ���� +,-,*,/ (��Ģ����) �����ؼ� ���
//2 ���1 ���ٽ�
//3 ���2 �������̽��� ������ �ڽ� ��ü�� ���
//4 ���3 �͸� �̳�Ŭ����
//5 arithmeticexception ó��: 0���� ������ ���� �߻�

@FunctionalInterface
interface ArithMetic{
	void arithMeticOpr(double a,double b);
}
class A implements ArithMetic{
	@Override
	public void arithMeticOpr(double a, double b) {
		System.out.println("�ڽ� Ŭ���� ��ü ���\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
	}
}

public class ArithmeticOpperator {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("ù ��° ���� �Է�: ");
			double aa=scanner.nextDouble();
			System.out.println("�� ��° ���� �Է�: ");
			double bb=scanner.nextDouble();
			
			try {
				if (aa==0||bb==0) {
					throw new ArithmeticException();
				} 
				ArithMetic am= (a,b)-> System.out.println("���ٽ� ���\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
				am.arithMeticOpr(aa, bb);
				
				
				System.out.println();
				
				ArithMetic a=new A();
				a.arithMeticOpr(aa, bb);
				
				System.out.println();
				
				ArithMetic amc=new ArithMetic() {
					@Override
					public void arithMeticOpr(double a, double b) {
						System.out.println("�͸� �̳�Ŭ���� ���\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
					}
				};
				amc.arithMeticOpr(aa, bb);
			} catch (ArithmeticException e) {
				System.err.println("0�� ���� �� �����ϴ�.");
			}
			
			
			
		}
}
