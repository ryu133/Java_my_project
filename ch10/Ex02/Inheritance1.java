package ch10.Ex02;
class Aa{
	int m;
	void abc() {
		System.out.println("�θ�");
	}
}
class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("�ڽ�");
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		//Ÿ��ĳ������ ���� �ʴ� ���
		Bb bb=new Bb(); //bb�� aa,bb ���� aa,bb�� �ʵ�� �޼ҵ� ���� ���� 
		bb.m=10;//�θ�
		bb.n=20;//�ڽ�
		bb.abc();//�θ�
		bb.bcd();//�ڽ�
		
		//��ĳ����:�ڽ�->�θ�  
		Aa aa=new Bb();
		aa.m=100;
//		aa.n=200;
		
		Bb bb1=(Bb)aa;//aa->bb �ٿ�ĳ����
	}
}
