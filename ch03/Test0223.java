package ch03;

import java.util.Scanner;

public class Test0223 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���.");
		int a=sc.nextInt();
//		if(a%3==0) {
//			System.out.println("3�� ����Դϴ�.");
//		}else {
//			System.out.println("3�� ����� �ƴմϴ�.");
//		}
		System.out.println((a%3==0)?"3�� ����Դϴ�.":"3�� ����� �ƴմϴ�.");
	}

}
