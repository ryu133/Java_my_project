package ch04;

public class Break_Ex08 {

	public static void main(String[] args) {
		//���� loop���� break
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; //break�� ������ �ش� ������ ��������
		}
		
		//for if break
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		
		//���� loop���� break(�ϳ��� �ݺ����� ��������)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		
		//���� loop ������ Ż��. 1. label ��� 2. ���� false�� �����
		//1
POS1:		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break POS1;
				}
				System.out.println(i+", "+j);
			}
		}
		//2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					i=10;
					break;
				}
				System.out.println(i+", "+j);
			}
		}

		
	}

}
