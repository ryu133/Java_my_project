package ch02;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		//<char �ڷ����� ���� �Ҵ��ϴ� ���>
		//���ڷ� �����ϴ� ���
		char value1='A';
		char value2='��';
		char value3='3';
		
		//������ �����ϴ� ���
		char value4=65; //65�� �빮�� A(�ƽ�Ű �ڵ�)
		char value5 = 0xac00; //16������ ���� �Ҵ�
        char value6 = 51;
        System.out.println(value4); //A
        System.out.println(value5); //��
        System.out.println(value6); //3
        System.out.println();
				
        //#4-3. �����ڵ�� ���� �Է�
        char value7 = '\u0041';
        char value8 = '\uac00';
        char value9 = '\u0033';
        System.out.println(value7); //A
        System.out.println(value8); //��
        System.out.println(value9); //3	
	}

}
