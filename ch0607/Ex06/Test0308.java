package ch0607.Ex06;

import java.util.Scanner;

//������ ��� �̸��� �ְ� �ش� ��� ������(���)�� �־
//����ϴ� ���α׷����� �ۼ� �� ��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ���
public class Test0308 {

	static void method(String...valuse){
		int sum=0; 
		double avg;
		for (int i = 0; i < valuse.length; i++) {
			if (i%2==0) {

				
			}else {
				sum+=Integer.parseInt(valuse[i]);
			}
			
		}
		avg=(double)sum/valuse.length*2; 
		System.out.println("� ���� �������� �� �հ�: "+sum);
		System.out.println("� ������ ��� ������ ��: "+avg);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("�Է�>>");
			
			String exrecise=scanner.nextLine(); 
			String[] array1=exrecise.split(" ");
			
			if (exrecise.equals("�׸�")) {
				System.out.println("����");
				scanner.close();
				break;
			}
			else {
				System.out.println("���>>");
				for (int i = 0; i < array1.length; i++) { 
					if (i%2==0) {
						System.out.print(array1[i]+" : ");
					
					}else if (i==array1.length-1) {
						System.out.print(array1[i]);
					}
					else{
						System.out.print(array1[i]+", ");
					}
				}
					System.out.println();
					method(array1);
			}
		}
	
	}
}


