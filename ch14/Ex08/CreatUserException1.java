package ch14.Ex08;
//����� ���� ����
// 1 Exception�� ����ϴ� ���� : Checked Exception - ������ �ܰ迡�� ����ó�� �ʿ�
// 2 RunTime Exception�� ����ϴ� ���� : unChecked Exception - ���� �� ���� �߻��� �� ����

class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String message){//���� �޼��� ���
		super(message);
	}
}
class MyRTException extends RuntimeException{
	public MyRTException (){
		super();
	}
	public MyRTException(String message) {//���� �޼��� ���
		super(message);
	}
}
class A{
	//����� ���� ���� ��ü ����
	MyException me1=new MyException();
	MyException me2=new MyException("���� �޼��� : MyException"); //���� �߻� �� ���� �޼����� ����ϴ� ������
	
	MyRTException mre1=new MyRTException();
	MyRTException mre2=new MyRTException("���� �޼��� : MyRTException");
	
	//���ܸ� ������ �߻���Ű��(throw)
	void abc1(int num) {
		try {
			if (num>70) { //abc1()
				System.out.println("���� �۵�");
			} else {
				throw me1; //���ܸ� ������ �߻���Ŵ
			}
			
		} catch (Exception e) { //me1�� throw�� ������ ���ܸ� �߻���Ŵ
			System.out.println("70 ���� ���� �־����ϴ�. 70 �̻��� ���� ��������");
			System.out.println(e.getMessage());
		}
	}
	
	//������ ����(throws): abc2()�޼ҵ带 ȣ���ϴ� ������ ���� ó��
	void abc2(int num) throws MyException {
		if (num>70) {
			System.out.println("�����۵�");
		}else {
			throw me2; //throw�� ���� ���� �߻���Ŵ
		}
	}
	
	
	void bcd1() {
		abc1(65);//���� �߻���
	}
	void bcd2() {
		try {
			abc2(65);
		} catch (MyException e) {
			System.out.println("70 ���� ���� �־����ϴ�. 70 �̻��� ���� ��������");
			System.out.println(e.getMessage());
		}
	}
}
public class CreatUserException1 {
	public static void main(String[] args) {
		A a=new A();
		a.bcd1(); //���� ���� ó��
		a.bcd2(); //���� �̷Ｍ ó��
		
	}
}
