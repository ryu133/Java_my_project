package ch14.Ex01;

import java.util.Scanner;

//Error: ���α׷��Ӱ� ������ �� ���� �κ�. (os���� �߻��ϴ� ����,h/w ���� ���)
//Exception(����): ���α׷��Ӱ� ������ �� �ִ� �κ� 
	//���ܰ� �߻��Ǹ� ���α׷��� �����
	//���ܰ� �߻��Ǵ��� ���α׷��� ������� �ʵ��� ó��(����ó��)

//ArithmeticException: � ���� 0���� ������ �߻��ϴ� ����
	//��ǻ�ʹ� � ���� 0���� ���� ��� ��� �Ұ�

public class CheckException1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է�>>");
		int a=scanner.nextInt();
		int b=10;
		
		try {
			System.out.println(b/a); //0�� �Է½� ����
		} catch (ArithmeticException e) {
			//catch ���: try ������� ������ �߻��� ��� �۵���
			System.out.println("���� �߻�. 0���� ���� �� �����ϴ�. �ٸ� ���� �Է��ϼ���.");
		}finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
		
	}
}
