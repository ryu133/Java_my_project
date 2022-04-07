package ch17.Ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//HashSet���� ��ȯ
//Member Ŭ������ memberID�� equals(),hashCode() �������̵�

//set�� �ߺ��� ���� ������ �� �ִ�
//wrapperŬ������ equals(), hashCpde()������ �Ǿ�����(�ߺ��� ���� �ĺ�)
//wrapper Ŭ������ Integer,Long, Double, Float, Character, Byte, Short, Boolean (�⺻�ڷ��� 8��)
 
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

	@Override
	public int hashCode() { //memberID �ʵ��� ���� ������ �� ������ �ؽ��ڵ带 �������
		return Objects.hash(memberID); //,�� �������� ����(��� ������ ���)���� hashCode�� ������ �� �ִ�.
//		return this.memberID; //return memberID; //�ϳ��� �ʵ常�� �������� hashCode ����
	}

	@Override
	public boolean equals(Object obj) {//��ü�� ������ object�� ��ĳ����
		if (obj instanceof Member)
//			Member mb=(Member)obj; //�ٿ�ĳ����
			if (this.memberID==((Member)obj).memberID) {
				return true;
			}
		return false;
	}
	
}

class MemberHashSet{ //MemberHashSet�� ��üȭ�ϸ� hashSet ��ü�� �����ȴ�.
	private Set<Member>hashSet;
	public MemberHashSet() { //�⺻ ������
		hashSet=new HashSet<Member>();
	}
	
	public void addMember1(Member member){
		//member ��ü�� �߰��ϴ� �޼ҵ�
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		//iterator ����Ͽ� remove
		Iterator<Member>iterator=hashSet.iterator();
		
		while (iterator.hasNext()) {
//			if (hashSet.contains(memberId)) {
//				iterator.remove();
//				return true;
//			}
			Member member=iterator.next();
			int tempid=member.getMemberID();
			if (tempid==memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		//iterator�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		Iterator<Member>iterator=hashSet.iterator();
		
		while (iterator.hasNext()) {
//			Member member=iterator.next();
//			System.out.print(member+" ");
			System.out.println(iterator.next());
		}
		System.out.println();
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class ExMemberHashSet {
	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet(); //��ü�� �����ϴ� ���� hashset �ʵ尡 Ȱ��ȭ
		//�޼ҵ带 ȣ���ϱ� ���ؼ� ��ü ����
		//addMember1(),addMember2(),removeMember(),showAllMember()
		Member memberlee=new Member(1001, "������");
		Member memberlee2=new Member(1001, "������");
		Member memberkim=new Member(1002, "������");
		Member memberpark=new Member(1003, "������");
		Member memberhong=new Member(1004, "ȫ����");
		
		memberHashSet.addMember1(memberlee);
		memberHashSet.addMember1(memberlee2);
		memberHashSet.addMember1(memberkim);
		memberHashSet.addMember1(memberpark);
		memberHashSet.addMember1(memberhong);//�� ��ü�� hashSet�� ����
		
		memberHashSet.showSize(); //�� 4������ ��
		
		//��� ����� ���
		memberHashSet.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1003);
		
		memberHashSet.showAllMember();
		
	}
}
