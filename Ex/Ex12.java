package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String myTurn = null;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��! >> ");
			int n = (int)(Math.random()*3);
			myTurn=scanner.next();
			
			if (myTurn.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				scanner.close();
				break;
			}
			else {
				if(str[n].equals("����")) {
					if (myTurn.equals(str[0])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �̰���ϴ�.");
					}
					else {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
				}
				else if(str[n].equals("����")) {
					if (myTurn.equals(str[0])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
					else {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �̰���ϴ�.");
					}
				}
				else{
					if (myTurn.equals(str[0])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �̰���ϴ�.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
					else {
						System.out.println("�����= "+myTurn+", ��ǻ��= "+str[n]+" ����ڰ� �����ϴ�.");
					}
				}
			}
			
			
		
			
		}
			
	}
}

