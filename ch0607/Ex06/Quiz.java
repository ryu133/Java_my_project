package ch0607.Ex06;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
//		������ � �̸��� �ְ� �ش� ��� �������� �־ ����ϴ� ���α׷��� �ۼ� ��,
//		��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
//		��)
//		�Է�>>
//		Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
//		���>>
//		Ź�� : 2 , �߱� : 9 , �౸ : 11 , �� : 6 , ���� : 2
//		������� ������ �� �հ�:
//		������� ��� ������ ��:
//			
//		"�׸�"�̶�� �Է��ϸ� ���α׷� ����
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ ���������� ������ �̿��ؼ� �Է��ϼ���.");
		System.out.println("�Է�>>\nŹ�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");

		String str; //��ü string���� ��ǲ�޴� ����
		String[] arr; //������ �������� �߶� �迭�� �����ϴ� ����
		
		int sum; //� �������� ����� ���� �����ϴ� ����
		int memberCount=0;
		double avg; //����� ���ϴ� ����: (double)��ü �������� ��/������ ��
		int b; //�� ������ �������� ��� ����
		do {
			sum=0;
			avg=0;
			memberCount=0;
			b=0;
			
			str=scanner.nextLine(); //.next(): ������� String�� ���� / .nextLine(): ���ͱ��� String�� ����
			if (str.equals("�׸�")) {break;} //str�� �����ڷ����̹Ƿ� .equals() �޼ҵ� ���
			arr = str.split(" "); //str�� ���� �������� �߶� arr�� ����
			for (int i = 0; i < arr.length; i++) { //.lenth : �迭�� index 0 ~ ������ �����
				if (i%2!=0) { //i: ���� ��ȣ. ���ڸ� ������ ����
					b=Integer.parseInt(arr[i]); //�� ���� String Ÿ���� ������ ��ȯ
					sum+=b; //arr ���� ���� b�� sum�� ���ϱ�
					memberCount++; //avg=sum/memberCount
				}
			}
			
			avg=(double)sum/memberCount; //���
			System.out.println(str);
			System.out.println("�������� ����: "+sum);
			System.out.println("�������� ���: "+avg);
			
		} while (true);
		
		
		
		
	}
}
