package ch04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {
		//while���� do while�� ��
		System.out.println("====�ݺ� Ƚ���� 0���� ���====");
		int a=0;
		while (a<0) {
			System.out.print(a+" "); //������ true�� ���� �����
			a++;
		}
		a=0;
		do {
			System.out.print(a+" ");
			a++; 
		} while (a<0); //do while������ ������ 1���� �����
		System.out.println("\n====�ݺ� Ƚ���� 1�� ���======");
		
		//�ݺ� Ƚ���� 1�� ���
		a=0;
		while (a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("");
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while (a<1);
		System.out.println("\n====�ݺ� Ƚ���� 10���� ���====");
		
		//�ݺ� Ƚ���� 10���� ���
		a=0;
		while (a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while (a<10);
		
		
	}

}
