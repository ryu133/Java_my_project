package ch04;

public class IF_Ex02 {

	public static void main(String[] args) {
		int value1=2;
		//break�� ���� ��: �ش� case�� �̵� �� ������ case�� ��� ����
		switch (value1) {
		case 1: 
			System.out.println("A ����");
		case 2: 
			System.out.println("B ����");
		case 3: 
			System.out.println("C ����");
		default:
			System.out.println("F ����");
		}
		//break ����
		int value2=3;
		switch (value2) {
		case 1: 
			System.out.println("A ����");
			break;
		case 2: 
			System.out.println("B ����");
			break;
		case 3: 
			System.out.println("C ����");
			break;
		default:
			System.out.println("F ����"); //switch�� �������� break ���� ����
		}
		
		value2=2;
		if(value2==1) {
			System.out.println("A(if)");
		}else if(value2==2) {
			System.out.println("B(if)");
		}else if(value2==3) {
			System.out.println("C(if)");
		}else {
			System.out.println("F(if)");
		}
		//switch�� ����ؼ� ������ 7�� �̻��� pass, 7�� ���ϴ� fail�� ���(������ 1~10)
		int a=10;
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default:
			System.out.println("fail");
			break;
		}
		
	}

}
