package ch04;
import java.util.Scanner;
public class If_Ex06 {
	public static void main(String[] args) {
		//Scanner scanner=new Scanner(System.in);
		int num1=10;
		int num2=2;
		char operator='0';
		
		int result=0;
		
		if (operator=='+') {
			result=num1+num2;
		}else if (operator=='-') {
			result=num1-num2;
		}else if (operator=='*') {
			result=num1*num2;
		}else if(operator=='/'){
			result=num1/num2;
		}else {
			System.out.println("������ ���� �Դϴ�.");
			return; //����
		}
		System.out.println("��� ���� "+result+"�Դϴ�.");
		
	}

}
