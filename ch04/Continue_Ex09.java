package ch04;

public class Continue_Ex09 {

	public static void main(String[] args) {
		//���� loop���� continue
		for (int i = 0; i < 10; i++) {
			continue;
//			System.out.println("��±�������");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			continue; //continue�� ���Ǿ��� ������ ���๮�� ����ϸ� ����
//			System.out.println();
		}
		
		//���� ��� continue
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		//���� ��� break
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		//���� loop���� continue
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					continue;
				}
				System.out.println(i+", "+j);
			}
		}
		//���� loop���� break
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		
		//continue���� label ���
POS2:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					continue POS2;
				}
				System.out.println(i+", "+j);
			}
		}
		//break���� label ���
System.out.println("\n break���� label ���");
POS3:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					break POS3;
				}
				System.out.println(i+", "+j);
			}
}

		
	}

}
