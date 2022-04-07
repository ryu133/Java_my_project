package ch14.Ex07;
//Exception - Checked Exception : ������ ����, �ݵ�� ����ó��
//			- unChecked Exception, RunTime Exception - ���� �� ����

//���� ó�� ��� 2����
//1 try catch : �ڽ��� ���� ���ܸ� ó��
//2 thows : ���� ó��ň �̷��(����), �޼ҵ� ��� ���� ���ܸ� �޼ҵ� ȣ�� �� ȣ���ϴ� ������ �̷��
//		throw : ���ܸ� ������ �߻���Ŵ

//Exception�� �߻��Ǵ� �޼ҵ� ���ο��� �ڽ��� ���� ���ܸ� ó���ϴ� ���
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls=Class.forName("java.lang.Object"); //�Ϲݿ��� ClassNotFoundException
			Thread.sleep(1000); //ms(�̸�������)  1000ms=1s   //�Ϲݿ���
		} catch (ClassNotFoundException | InterruptedException e) {
		} 
		//Class.forName : �����ε� (������ �� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��
			//���� �� Ŭ���� ������ ������ ���� �հ� �ƴҼ��� �ֱ⶧���� ����ó���� �ؾ���
	}
}
class B{ //Throws�� ����ؼ� Exception�� �̷�� 
	void abc() {
		
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			
		}
	}
	//bcd()�� ȣ���ϴ� ���� ���ܸ� �̷��
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls=Class.forName("java.lang.Object"); //�Ϲݿ��� ClassNotFoundException
		Thread.sleep(1000);
	}
}
public class ThrowsException3 {
	public static void main(String[] args) {
		
	}
}
