package ch0607.Ex02;

class Abc{
	int m=3; //�ʵ�(���� ����), ��üȭ ������ �� ��� ����
	int n=4;
	
	void work1() { //�޼ҵ�(��ǲ���� ���� �޼ҵ�)
		int k=5; //��������(���ÿ����� ����). �޼ҵ尡 ����� ��������.
		System.out.println(k);
		work2(3); //�ٸ� �޼ҵ� ȣ��
	}
	void work2(int i){
		int j=4; //�������� ��������� ������ ���� ����
		System.out.println(i+j);
	}
}
public class FieldComponent {
	public static void main(String[] args) {
		//Ŭ������ Ȱ���ؼ� ��ü(abc) ����
		Abc abc=new Abc(); //abc ��ü ����
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		abc.work1();
		
		
	}

}
