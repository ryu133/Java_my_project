package ch12.Ex09;

public class PhoneEx {
	public static void main(String[] args) {
		//samsungphone Ÿ������ ����
		SamsungPhone s1=new SamsungPhone();
		s1.printLogo(); //�������̽����� ��ӵǾ� ������ ���
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("===============");
		
		//phone Ÿ������ ��ĳ����
		Phone s2=new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss=(SamsungPhone)s2; //�ٿ�ĳ����
		ss.flash();
		
	}

}
