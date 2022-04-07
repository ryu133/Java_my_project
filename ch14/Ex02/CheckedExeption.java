package ch14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//checked exception (�Ϲݿ���): ������ �ܰ迡�� ���ܰ� �߻�
//�������ϱ�(����) *.java  ==> *.class  ���� ����ó��
//unChecked Exception (���࿹��), Runtime Exception : ���� �� ���ܰ� �߻��� �� �ִ�.
//����ó�� �ʼ��� �ƴ����� �ϴ� ���� ����

class A{
	B b;
	
	A(){}
	A(B b){
		this.b=b;
	}
	interface B{
		void cry();
	}
	void abc() {
		b.cry();
	}
}

public class CheckedExeption {
	public static void main(String[] args) {
		//1 �Ϲ� ����: ������ �ܰ迡�� ����ó���� �ʿ�
		//InterruptedException: ������ �߰��� Ű���Ⱑ �߻��ϸ� ���ܰ� �߻�
		//Thread.sleep(1000);
		
		//ClassNotFoundException: Ŭ������ ã�� ���ϴ� ����
		//Class cls = Class.forName("java.lang.Object");
		
		//IOException: ��Ʈ��ũ���� ����(����) ���о�� �� �ִ� ����
		InputStreamReader in=new InputStreamReader(System.in);
//		in.read();
		
		//FileNotFoundException: ������ ã�� ���ϴ� ���ܰ� �߻��� �� �մ�
//		FileInputStream flStream =new FileInputStream("text.txt");
		
		//NullPointerException : ��ü�� null�� ���¿��� ��ü�� �ʵ峪 �޼ҵ带 ȣ���� ��
		//���࿹��(unchecked Exeption): ���� �� �߻��Ǵ� ����'
		A a1=new A();
//		a1.abc(); //������ �ܰ迡�� ���ܰ� �߻����� �ʰ� ���� �� �߻�
		
		
	}}