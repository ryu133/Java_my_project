package ch10.Ex04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		int num=0; //��ĵ ���� ����
		
		do {
			System.out.println("=====================================================");
			System.out.println("1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ����");
			System.out.println("=====================================================");
			System.out.println("��ȣ�� �Է����ּ��� >>> ");
			num=scanner.nextInt();
			if (num==1) { //���� for ��� 19�� ���
				for (int i = 1; i < 20; i++) {
					for (int j = 1; j < 20; j++) {
						System.out.println(i+"*"+j+"="+(i*j));
					}
				}
			}else if(num==2){ //Ȧ����
				for (int i = 1; i < 20; i++) {
					if (i%2==1) {
						for (int j = 1; j < 20; j++) {
							System.out.println(i+"*"+j+"="+(i*j));
						}	
					}
				}
				
			}else if (num==3) {//3�� ���
				for (int i = 1; i < 20; i++) {
					if (i%3==0) {
						for (int j = 1; j < 20; j++) {
							System.out.println(i+"*"+j+"="+(i*j));
						}	
					}
				}
			}else if (num==4) {//���α׷� ����
				run=false;
//				break;
			}
		} while (run);
		scanner.close();
		System.out.println("���α׷� ����");
	}
}
	
