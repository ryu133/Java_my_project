package ch0607.Ex02;

import java.util.Iterator;
import java.util.Scanner;

public class Q2 {
	
	static void method(String...valuse){
		int sum=0; //���� ������ ���ϴ� ����
		double avg; //��հ��� �����ϴ� ����
		
		for (int i = 0; i < valuse.length; i++) {
			//sum=sum+valuse[i]; //valuse�� �� ���� ���� String Ÿ���̹Ƿ� ���� Ÿ������ ��ȯ
//			sum=sum+Integer.parseInt(valuse[i]);
			//Integer.parseInt(String):������ String Ÿ���� ������ ����
			sum+=Integer.parseInt(valuse[i]);
		}
		avg=(double)sum/valuse.length; //����ȯ �ݵ�� �ʿ�
		System.out.println("������ ���� �հ�: "+sum);
		System.out.println("������ ���� ���: "+avg);
	}

	public static void main(String[] args) {
		//scanner�� ������ ���� ���� �޾Ƽ� �հ�� ����� ���
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� ���� �Է��Ͻÿ�.");
		
		String num=scanner.nextLine(); //������ ���Ƿ� ��ü ���� ���� String ���� ����
		String[] array1=num.split(" "); //split: �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		
		System.out.println("����� �Է��� ������ ");
		for (int i = 0; i < array1.length; i++) { //�Է� ���� ���
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		method(array1); //�������� �޼ҵ� method�� ȣ���ϸ鼭 �Ű������� array1�� �־��ش�
		
	}

}
