package ch04;

public class IF_Ex01 {

	public static void main(String[] args) {
		int value=5;
		if(value>3) {
			System.out.println("����1: ������ ���� �� ����");
		}
		
		boolean bool1=true;
		boolean bool2= false;
		if(bool1) {
			System.out.println("����2");
		}else {
			System.out.println("����3");
		}
		if(bool2) {
			System.out.println("����4");
		}else {
			System.out.println("����5");
		}
		
		System.out.println((bool1)?"����6":"����7");
		System.out.println((bool2)?"����6":"����7");
		
		int value3=85;
		if(value3>=90) {
			System.out.println("A����, ������: "+value3);
		}else if(value3>=80) {
			System.out.println("B, ������: "+value3);
		}else if(value3>=70) {
			System.out.println("C, ������: "+value3);
		}else{
			System.out.println("D, ������: "+value3);
		}
		
		if(value3>=90) {
			System.out.println("A����, ������: "+value3);
		}else if(value3>=70) {
			System.out.println("C, ������: "+value3);
		}else if(value3>=80) {
			System.out.println("B, ������: "+value3);
		}else{
			System.out.println("D, ������: "+value3);
		}
		System.out.println("===========");
		//������ �ο��� �� �����ϰ� ����
		
		//value3=69;
		if(value3<=100&&value3>=90) 
			{
				System.out.println("A����");
			}
		else if(value3<80&&value3>=70) 
			{
				System.out.println("C����");
			}
		else if(value3<90&&value3>=80) 
			{
				System.out.println("B����");
			}
		else
			{
				System.out.println("D����");
			}
		
		//if������ ���๮�� �ϳ��� �� {�߰�ȣ} ���� ����
		if(3<5)System.out.println("�ȳ�\n");
		if(3>5)System.out.println("hi2");
		if(3<5)System.out.println("Hi4\n");
	}

}
