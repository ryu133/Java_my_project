package ch04;

import java.util.Iterator;

public class For_Ex03 {

	public static void main(String[] args) {
		int a; //��� �ۿ��� ����� ����(��������), ����(0), �ʱⰪ(x)
		for (a = 0; a < 5; a++) {
			System.out.print(a+" ");
		}
		System.out.println("\n��� �ۿ��� ����� �� "+a);
		System.out.println("=======");
		for (int b = 0; b <= 10; b++) {
			System.out.println(b);
		}
		System.out.println("==========");
		int c;
		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		
		//2�� ���
		for (int i = 0; i < 100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("");
		//for�� �ȿ��� �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�.
		for (int i = 0, j=0; i < 10; i++,j++) {
			System.out.println(i+"*"+j+": "+(i*j));
		}
		
		//for���� ����Ͽ� 1���� 10���� ���� �� ����ϱ�
		for (int i = 1,j=1; i <= 10; i++) {
			j*=i;
			System.out.println(j);
		}
		//for���� ����Ͽ� 1���� 100���� ���� �� ����ϱ�
		for (int i = 1,j=0; i <= 100; i++) {
			j+=i;
			System.out.println(j);
		}
		
		//���� for���� ����Ͽ� ������ ���
		for (int i = 1; i < 10; i++) { //i�� ��
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+" = "+(i*j));
			}System.out.println("=========");
		}
		
		//for������ ���ѷ���. ������ ���� ���, �ʱⰪ�� �������� ���� ���
//		for (int i = 0;  ; i++) {
//			System.out.print(i+" ");
//		}
//		for ( ; ; ) {
//			System.out.println("���ѷ���");	
//		}
		
		//���ѷ��� Ż��
		for (int i = 0; ; i++) {
			if(i>100)break;
			System.out.println(i);
		}
		
		//for���� ����Ͽ� 1���� 1000���� 4�� ����� ���� �� ���ϱ�.  ��հ�:double
		double j=0;
		for (int i = 1; i<=1000; i++) {
			if(i%4==0)j+=i;
		}
		System.out.println("����: "+j);
		System.out.println("��հ�: "+(j/(1000/4)));
		
	}

}
