package ch17.Ex15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class Account{ //���������� �����ϴ� ��ü, �߿��� �ʵ�, private(ĸ��ȭ)
				//DTO,VO <==�� �������� �ʵ��� ���� �����ϰ� ����
				//��ü�� �ʵ�����(x), ������(o), getter(o), setter(o)
	private String ano; //���� ��ȣ
	private String owner; //���� ��, �̸�
	private int balance; //���� �ݾ�
	
	public Account(String ano,String owner,int balance) { //��ü ���� �� �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account)
			if ((this.ano).equals(((Account)obj).ano)) {
				return true;
			}
		return false;
	}
	@Override
		public int hashCode() {
			return Objects.hash(ano);
		}
}
public class BankCountUsingHashSet {
	//�÷���(ArrayList<E>)�� ����ؼ� Account ��ü ���
	//�迭�� ���� ũ�Ⱑ ������
	//�÷����� ���� ũ�Ⱑ ������.������ ������ �� ����
	private static Set<Account>accounts=new HashSet<>();
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
		Iterator<Account>iterator=accounts.iterator();
		while (iterator.hasNext()) {
			Account account = (Account) iterator.next();
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
		System.out.println("���: �Ա��� ���������� �ԱݵǾ����ϴ�. ");

		
//		Iterator<Account>iterator=accounts.iterator();
//		while (iterator.hasNext()) {
//			Account account=iterator.next();
//			if ((account.getAno()).equals(ano)) {
//				account.setBalance(account.getBalance()+balance);
//				accounts.add(account);
//				System.out.println("���: �Ա��� ���������� �ԱݵǾ����ϴ�. ");
//				return;
//			}
//		}
//		System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");

//		String ano=scanner.next();
//		for (int i = 0; i < accountArray.length; i++) {
//			if((accountArray[i].getAno()).equals(ano)) {
//				System.out.println("������ �ݾ�: ");
//				int b=scanner.nextInt();
////				accountArray[i].setBalance(accountArray[i].getBalance()+b);
////				accountArray[i]=new Account(accountArray[i].getAno(),accountArray[i].getOwner() , b+accountArray[i].getBalance());
//			}
//		}
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

		
//		Iterator<Account>iterator=accounts.iterator();
//		while (iterator.hasNext()) {
//			Account account=iterator.next();
//			if ((account.getAno()).equals(ano)) {
//				account.setBalance(account.getBalance()-balance);
//				accounts.add(account);
//				System.out.println("���: ����� ���������� �ԱݵǾ����ϴ�. ");
//				return;
//			}
//		}
//		System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");
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
//		for (int i = 0; i < accounts.size(); i++) {
//			if (accounts.iterator()!=null) { //�迭 ���� ���� null�� �ƴ� ���
//				//�� ��ü�� ���� ano�� ��� ���� ����
//				String dbAno; //�迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�
//				if (dbAno.equals(ano)) {
//					account=accounts.iterator(); //account ���� ������ ��ü�� �ּ� ������ ��´�
//					break;
//				}
//			}
//		}
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
