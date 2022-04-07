package ch17.Ex16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Account ��ü�� TreeSet�� ����. ano[���¹�ȣ],owner[�̸�], balance[���� �ݾ�]
//TreeSet�� �Ϲ� ��ü�� ���� �� � �÷��� �������� ����. Comparable<E>, Comparator<E>
//Account ��ü�� �������� �ʰ� balance ���� ū�ͺ��� ��µǵ��� ����. ��������
//compare()�� ����� ���� �ٲٱ� or descendingSet()

public class BankCountUsingTreeSet {
	private static TreeSet<Account>accounts=new TreeSet<>(new Comparator<Account>() {
		public int compare(Account o1, Account o2) {
			if ((o1.getBalance())<(o2.getBalance())) {
				return 1;
			}else if (o1.getBalance()==(o2.getBalance())) {
				return 0;
			}else {
				return -1;
			}
		}
	});
	//�÷����� �濡 ���� ���� ��� add():���� ������ �濡 ���� �߰�, size()<==�÷����� ����
	//�� ���� ���� ���� �� remove(i)
	private static Scanner scanner=new Scanner(System.in);
	
	private static void creatAccount() {
		//���� ���� - ��ĳ�ʷ� ���¹�ȣ,�̸�,�ʱ� ����ݾ� �Է¹���
		//�迭 ��ü�� ����
		System.out.println("1. ���� ����");
		System.out.println("���� ��ȣ�� �Է��ϼ��� >>");
		String ano=scanner.next(); //���� ��ȣ�� �Է¹޾Ƽ� ano ������ �Ҵ�(�޼ҵ� �������� ����ϴ� ��������)
		System.out.println("�̸��� �Է��ϼ��� >>");
		String owner=scanner.next();
		System.out.println("���� ���� �� �ʱ� �ݾ��� �Է��ϼ��� >>");
		int balance=scanner.nextInt();
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ�޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ尪�� ����
		Account newAccount=new Account(ano, owner, balance); //�����ڸ� ���ؼ� ��ü�� �ʵ尪 ���� �� ��ü ����
		
		accounts.add(newAccount);
		System.out.println("���� ���� �Ϸ�");
	}
			
	private static void accountList() {
		//���� ��� ��� - �迭�� ����� ��ü�� �����ͼ� ��ü ���� ���(���¹�ȣ,�̸�,�ݾ�)
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü���� ������ �ʵ��� ������ ���
		System.out.println("2. ���� ���");
		
//		NavigableSet<Account>navigableSet=accounts.descendingSet();
//		Iterator<Account>iterator=navigableSet.iterator();
		Iterator<Account>iterator=accounts.iterator();
		
		while (iterator.hasNext()) {
			Account account = iterator.next();
			if (account !=null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
		//���� - ���¹�ȣ�� �Է¹޾Ƽ� ��ü���� �ش� ���¸� ã�� �Աݱݾ��� �Է¹޾� �ش� ���¿� ���� (for ���)
		//1 ����ڷκ��� �Ա��� ���¸� �޾ƾ� ��
		//2 ����ڷκ��� ���� ���¹�ȣ�� �迭�� ����� ��ü���� ���� ��ȣ�� Ȯ�� �� �ش� ���¿� �Ա�
		
		System.out.println("3. �����ϱ�");
		System.out.println("������ ���¸� �Է����ּ��� >>");
		String ano=scanner.next();
		System.out.println("������ �ݾ��� �Է��ϼ��� >>");
		int balance=scanner.nextInt();
		
		Account account=findAccount(ano);
		
		if (account==null) {
			System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");
			return;
		}
	
		account.setBalance(account.getBalance()+balance);
		System.out.println("���: �Ա��� ���������� �Ǿ����ϴ�. ");


	}
	private static void withdraw() {
		//��� - ���¹�ȣ�� �Է¹޾� �ش� ���¸� ��ü���� ã�Ƽ� ��� (for ���)
		
		System.out.println("4. ����ϱ�");
		System.out.println("����� ���¸� �Է����ּ��� >>");
		String ano=scanner.next();
		System.out.println("����� �ݾ��� �Է��ϼ��� >>");
		int balance=scanner.nextInt();
		
		Account account=findAccount(ano);
		
		if (account==null) {
			System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("���: ����� ���������� �Ǿ����ϴ�. ");


	}
	//�迭���� Account ��ü ���� ano(���¹�ȣ)�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������
	//����, ����� �� ���Ǵ� ���� �ڵ�, ���� �޼ҵ忡�� �ߺ� ���� �� ������ �޼ҵ带 �����ؼ� �ߺ� �ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) { 
		Account account=null;
		Iterator<Account>iterator=accounts.iterator();
		while (iterator.hasNext()) {
			Account a1 = (Account) iterator.next();
			String dbAno=a1.getAno();
			if (dbAno.equals(ano)) {
				account=a1;
				return account;
			}
		}
		return account;
	}
	
	public static void main(String[] args) {
		boolean run=true;
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("����>>");
			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				creatAccount(); 
			}else if (selectNo==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
			}else if (selectNo==4) {
				withdraw();
			}else if (selectNo==5) {
				run=false;
				//break;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
	}

}
