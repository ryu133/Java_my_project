package ch04;

public class Test0225 {

	public static void main(String[] args) {
//		1. continue ���. 1��~19�� �� Ȧ���� �ܸ� ���

POS1:	for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i%2==0) {
					System.out.println("==========");
					continue POS1;
				}
				System.out.println(i+"*"+j+"= "+(i*j));
			}
		}

//		2. continue ���. 1��~19�� �� 3�� ����� �ܸ� ���
POS3:		for (int i = 0; i < 20; i++) {
	POS2:		for (int j = 0; j < 20; j++) {
					if (i%3==0) {
						System.out.println(i+"*"+j+"= "+(i*j));
						continue POS2;
					}
				}
				System.out.println("===========");
				continue POS3;
			}
	}

}
