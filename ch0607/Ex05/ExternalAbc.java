package ch0607.Ex05;

import ch0607.Ex06.Bcd; //ctrl+shift+o : �ڵ� ����Ʈ

//import ch0607.Ex06.Abc; //AbcŬ������ ���� �����ڰ� default: �ܺ� ��Ű������ ���� �Ұ�

public class ExternalAbc extends Bcd{ //ExternalAbcŬ������ BcdŬ������ ��� ����
	//�θ� Ŭ����: Bcd . �ڽ� Ŭ����: ExternalAbc

	public static void main(String[] args) {
//		Abc abc2=new Abc(); //class ���� �����ڰ� default�̹Ƿ� ���� �Ұ�
		
		Bcd bcd1=new Bcd(); //�θ� Ŭ���� ��ü
		ExternalAbc ext=new ExternalAbc(); //�ڽ� Ŭ���� ��ü
		
		//�ٸ� ��Ű������ �ʵ� ȣ�� 1. import(public: Ŭ���� ���� ������) 2. ��ü ���� 3.���� ������ Ȯ�� �� ����(�ʵ�, �޼ҵ�)
		bcd1.a=1000; //public �ٸ� ��Ű������ ���� ����
//		bcd1.b=2000; //
		ext.b=2000; //protected �ٸ� ��Ű������ ��Ӱ��迡 ���� �� �ڽ�Ŭ�������� �θ�Ŭ������ ���� ����
//		bcd1.c=3000; 
//		bcd1.d=4000; 
//		
		
	}

}
