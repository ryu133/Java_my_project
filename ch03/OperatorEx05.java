package ch03;

public class OperatorEx05 {
	//���� ������ (����)?��:����  ������ ���̸� ?�� ��. �����̸� :�� ��
	public static void main(String[] args) {
		//#1. ���׿�����
        int value1 = (3>5)? 6: 9;
        System.out.println(value1); //9
        
        int value2 = (5>3)? 10: 20;
        System.out.println(value2); //10
        
        int value3 = 3;
        System.out.println((value3%2==0)?"¦��":"Ȧ��");
        		
        //cf. if - else �������� ��ȯ
        if(value3%2==0) {
            System.out.println("¦��");
        } else {
            System.out.println("Ȧ��");
        }
	}

}
