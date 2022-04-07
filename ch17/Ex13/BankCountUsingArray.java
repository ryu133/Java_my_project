package ch17.Ex13;

import java.util.Objects;
import java.util.Scanner;


//arrayEx �Ϸ� �ð�: ���� ��ħ 9�� 30�б��� ���� �ۼ�

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
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Account)
//			if (this.ano==((Account)obj).ano) {
//				return true;
//			}
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(ano);
//	}
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
	public String toString() {
		return ano+"-"+owner+"-"+balance;
	}
	
}
public class BankCountUsingArray {
	//�迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray=new Account[100]; //�迭�� ��ü ����
	//Account[] : �迭 Ÿ��. �迭�� ����Ÿ��,�迭�� �� �濡 ���� �������� ���� ��� �⺻������ null 
	//�迭 ���� �� ��(index)�� ũ�⸦ �����ؾ� ��. index�� 0���� 99����. length()�� �迭 ���� ����
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
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. ��������: ��� �޼ҵ忡�� ��� ����
		//��ü�� �迭�� ����(����ִ� �濡 ����) for���� ����ؼ� null�� ���� ã�Ƽ� null�� ��� ��ü�� ����
		for (int i = 0; i < accountArray.length; i++) { //accountArray�迭 ���� 0~99���� ��ȸ
			if (accountArray[i]==null) { //0������� null�� ���� ã�Ƽ� null�� ��� ��ü�� �迭�� ����
				accountArray[i]=newAccount; //null�� �濡 ��ü�� ����
				System.out.println("���� ���� �Ϸ�");
				break;//���¸� �����ϰ� for���� �������´�
			}
			
		}
		
//		System.out.println("���¹�ȣ, �̸�, ���� �ݾ��� �Է��Ͻÿ�.");
//		Account a=new Account(scanner.next(), scanner.next(), scanner.nextInt());
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i]==null) {
//				accountArray[i]=a;
//				break;
//			}
//		}
	}
			
	private static void accountList() {
		//���� ��� ��� - �迭�� ����� ��ü�� �����ͼ� ��ü ���� ���(���¹�ȣ,�̸�,�ݾ�)
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü���� ������ �ʵ��� ������ ���
		System.out.println("2. ���� ���");
		for (int i = 0; i < accountArray.length; i++) {
			//�� ���� ��ü�� ��� ������ ����
			Account account=accountArray[i]; //0~99 ���� ��ü�� account ���������� ��´�
			if (account!=null) { //�� ���� ���� null�� �ƴ� ��� ��ü ���� ���
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
		
		
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i]!=null) {
//				System.out.println(accountArray[i]);
//				
//			}
//		}
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
		
		//�ش� ���¸� �迭���� ã�Ƽ� ��ü�� �޾ƿ�
		Account account=findAccount(ano); //findAccount(���¹�ȣ)
		
		if (account==null) {
			System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");
			return; //�޼ҵ� ����
		}
		account.setBalance(account.getBalance()+balance); //setter�� ����ؼ� ������ �ݾ׿� �Ա� �ݾ��� ���Ѵ�
		System.out.println("���: ������ ���������� �ԱݵǾ����ϴ�. ");
		
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
		
		//�ش� ���¸� �迭���� ã�Ƽ� ��ü�� �޾ƿ�
		Account account=findAccount(ano); //findAccount(���¹�ȣ)
		
		if (account==null) {
			System.out.println("���: �ش� ���°� �������� �ʽ��ϴ�. ");
			return; //�޼ҵ� ����
		}
		account.setBalance(account.getBalance()-balance); //setter�� ����ؼ� ������ �ݾ׿� �Ա� �ݾ��� ����Ѵ�
		System.out.println("���: ����� ���������� �ԱݵǾ����ϴ�. ");
		System.out.println("���� �ݾ�: "+account.getBalance());
		
		
//		String ano=scanner.next();
//		for (int i = 0; i < accountArray.length; i++) {
//			if((accountArray[i].getAno()).equals(ano)) {
//				System.out.println("����� �ݾ�: ");
//				int b=scanner.nextInt();
//				accountArray[i].setBalance(accountArray[i].getBalance()+b);
//			}
//		}
	}
	//�迭���� Account ��ü ���� ano(���¹�ȣ)�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������
	//����, ����� �� ���Ǵ� ���� �ڵ�, ���� �޼ҵ忡�� �ߺ� ���� �� ������ �޼ҵ带 �����ؼ� �ߺ� �ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) { 
		Account account=null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null) { //�迭 ���� ���� null�� �ƴ� ��� ��ü�� ano(����)�� Ȯ��
				//�� ��ü�� �濡 ano�� ��� ���� ����
				String dbAno=accountArray[i].getAno(); //�迭�� �� �濡 ����� ��ü�� ano�� dbAno�� �Ҵ�
				if (dbAno.equals(ano)) {
					account=accountArray[i];
					break;
				}
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
