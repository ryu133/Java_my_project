package ch01;

import java.util.Scanner;

public class Scanner_Ex01 {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ������ ��ĭ���� �и��Ͽ� �Է��� �ּ���.");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("�̸��� "+name+", ");
		String city=sc.next();
		System.out.println("���ô� "+city+", ");
		int age=sc.nextInt();//�������� �Է¹���
		System.out.println("���̴� "+age+", ");
		double vision=sc.nextDouble();//�Ǽ����� �Է¹���
		System.out.println("�÷��� "+vision+", ");
		boolean glasses=sc.nextBoolean();//true or false
		System.out.println("�Ȱ� ���δ� "+glasses+" �Դϴ�.");
		sc.close();
	}

}
