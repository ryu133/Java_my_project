package ch17.Ex05;

import java.util.ArrayList;

class Member{ //DTO,VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberID;
	private String memberName;
	
	public Member(int memberID,String memberName) { //�����ڸ� ���� �ʵ� �� �Ҵ�
		this.memberID=memberID;
		this.memberName=memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
 
	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberID +" �Դϴ�.";
	}
	
	
}

class MemberArrayList{ //MemberArrayist�� ��üȭ�ϸ� arraylist ��ü�� �����ȴ�.
	private ArrayList<Member>arrayList;
	public MemberArrayList() { //�⺻ ������
		arrayList=new ArrayList<Member>();
	}
	
	public void addMember1(Member member){
		//member ��ü�� �޾Ƽ� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		arrayList.add(member);
	}
	public void addMember2(int i,Member member) {
		//Ư�� index�� ���� �߰�(����)
		try {
			arrayList.add(i, member);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. index�� ��Ȯ�ϰ� �Է��ϼ���.");
		}
	}
	public boolean removeMember(int memberId) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Member member=arrayList.get(i); //�� �濡 ����� Member ��ü�� member ���������� �Ҵ�
			int id=member.getMemberID(); //��ü�� getMemberID()�� ��ü ������ memberID ���� ������ 
			//?arrayList�� �� �濡 �ִ� Member ��ü 
			if (id==memberId) {
				arrayList.remove(i);
				System.out.println("ȸ������ ID("+memberId+")�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		//arraylist�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); //�� ���� Member ��ü�� �����ͼ� ���
		}
		System.out.println(arrayList);
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
}

public class ExMemberArrayList {
	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList(); //��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
		//�޼ҵ带 ȣ���ϱ� ���ؼ� ��ü ����
		//addMember1(),addMember2(),removeMember(),showAllMember()
		Member memberlee=new Member(1001, "������");
		Member memberkim=new Member(1002, "������");
		Member memberpark=new Member(1003, "������");
		Member memberhong=new Member(1004, "ȫ����");
		
		memberArrayList.addMember1(memberlee);
		memberArrayList.addMember1(memberkim);
		memberArrayList.addMember1(memberpark);
		memberArrayList.addMember1(memberhong);//�� ��ü�� arraylist�� ����
		
		memberArrayList.showAllMember();
		memberArrayList.showSize();

		//Ư�� index�濡 �߰��� ����� �߰�
		memberArrayList.addMember2(3, memberhong);
		memberArrayList.addMember2(6, memberhong); //����ó��
		
		memberArrayList.showSize();
		
		//��� ����� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1002);
		
		memberArrayList.showSize();
		
	}
}
