package ch0607.Ex06;

import ch0607.Ex05.C; //ctrl+shift+o >>import ����Ű

public class ExC {

	public static void main(String[] args) {
		//�ٸ� Ŭ������ ������/ public�� ����/ model, color �޸𸮷� ���� �Ұ�
		//company, model�� color�� setter�� public���� �Ҵ��� ���
		C c=new C();

		c.maxSpeed=300; //�ٸ� ��Ű���� Ŭ���������� public,protected(���)
		c.setCompany("������");
		c.setModel("����");
		c.setColor("black");
		c.setMaxSpeed(300);
		
		c.print();
	}

}
