package ch03;

public class OperatorEx02 {

	public static void main(String[] args) {
		//#1. ũ��� (<, >, <=, >=) : true, false
        System.out.println(5<2); //false
        System.out.println(5>2); //true
        System.out.println(5<5); //false
        System.out.println(5<=5); //true
        System.out.println(5>=5); //true
        System.out.println();
        
        //#2. ���(==, !=) : true, false
        //@ �⺻�ڷ��� ��� (����)
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a==c); //true 
        System.out.println(a!=c); //false
        System.out.println();
        
        //@ �����ڷ��� ��� (������)
        String str1 = new String("�ȳ�");
        String str2 = new String("�ȳ�");
        System.out.println(str1 == str2); //false
	}
}