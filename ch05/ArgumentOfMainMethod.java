package ch05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) { //���� �޼ҵ�(�Լ�)
/*		�޼ҵ��� �⺻ ����
//		void main(String[] args) { void: ���ϰ��� ������ ����. main: �޼ҵ� �̸�. (): �Է°�. �Ű�����. ����
//			�޼ҵ� ȣ�� �� ������ �ڵ�;
//		
//		
//		}
	*/	String a=ar[0]; //�ȳ��ϼ���: ���ڿ� ����
		String b=ar[1]; //3: ����
		String c=ar[2]; //3.8: �Ǽ�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ��� �� String���� ��ȯ
		System.out.println(b+1);
		System.out.println(c+1);
		System.out.println(a+b+c);
		//String�� ������ ���������� ��ȯ�ؼ� ����
		
		int d=Integer.parseInt(b); //b(String)===> Integer Ÿ������ ��ȯ
		double e=Double.parseDouble(c); //c(String)===> Double ������ ��ȯ
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}
}
