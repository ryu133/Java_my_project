package ch12.Ex09;

public class SamsungPhone implements Phone{
	//�������̽����� ������ �޼ҵ带 ������
	@Override
	public void sendCall() {
		System.out.println("ringring~");
	}
	@Override
	public void receiveCall() {
		System.out.println("receive call~");
	}
	
	//�߰����� samsungphone�� ��� �߰�
	public void flash() {
		System.out.println("light on");
	}
	
	
}
