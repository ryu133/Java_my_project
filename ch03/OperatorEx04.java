package ch03;

public class OperatorEx04 {
	//<���Կ����ڿ� ��� ǥ��>
	public static void main(String[] args) {
		//#1. ���Կ����� �� ��� ǥ��
        //@���Կ����� (=, +=, -=, *=, >>=, <<=, >>>=). ���Ŀ��� �켱������ ���� ����
        int value1 = 3;
        value1 = value1+3;
        System.out.println(value1);		//6
        System.out.println();
        
        //@���ǥ��
        int value2; //�⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�
        //���� �ڷ����� ��� ������ ���� �Ҵ����� ���� ��� �⺻������ null
        value2 = 5; System.out.println(value2+=2);		//7
        value2 = 5; System.out.println(value2-=2);		//3
        value2 = 5; System.out.println(value2*=2);		//10
        value2 = 5; System.out.println(value2/=2);		//2
        value2 = 5; System.out.println(value2%=2);		//1
        value2 = 5; System.out.println(value2|=2);		//7
        value2 = 5; System.out.println(value2<<=2);		//20
        value2 = 5; System.out.println(value2>>=2);		//1
        value2 = 5; System.out.println(value2>>>=2);	//1
        
        byte value3;
        value3=-128; System.out.println(value3>>>=2);
	}

}
