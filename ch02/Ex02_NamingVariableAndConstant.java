package ch02;

public class Ex02_NamingVariableAndConstant {

	public static void main(String[] args) {
		//<������>
		boolean aaB=true; //�������� ù ���ڴ� �ҹ��ڷ� ����. �빮�ڴ� �����. �ܾ ������ ��� ù �ܾ�� �빮��.
		byte ����=3; //�ѱ� ����(�����). -125 ~ +127 
		short a_b=55;//Ư�� �����_ ����
		char $a='q'; //Ư�� �޷�$ ����
		//�ٸ� Ư���� �Ұ���
		long ab1=3546; //���� ����. ù ���ڿ��� �Ұ���
		//�ڹ��� ������ �Ұ��� ex)class, public ��
		
		final double PI=155.02235; //����� �տ� final ���. ���: ���� ����(���Ҵ�)�� �� ����. ��ü �빮��. �ҹ��� �����.
		final int MY_DATA=66;
		final float my_Data=88;//�ҹ��� �����
		
		//long�� ���� ���� �� �ڿ� l(�ҹ���)�̳� L(�빮��)�� �ٿ���� ��
		
		System.out.println(aaB+"\n"+����+"\n"+a_b+"\n"+$a+"\n"+ab1+"\n"+PI+"\n"+MY_DATA+"\n"+my_Data);
	}

}
