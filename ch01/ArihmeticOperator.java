package ch01;

import java.util.Scanner;

public class ArihmeticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int time=sc.nextInt();
		int second=time%60;// % -> ��������
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�");
		System.out.println(minute+"��");
		System.out.println(second+"�� �Դϴ�.");
		
	}

}
