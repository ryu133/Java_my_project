package ch12.Ex02;
/*
interface�� �����ϴ� Ŭ����
overriding : ������ �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� ������
implements : �̿ϼ� �޼ҵ带 �ϼ���Ŵ
extends : �θ� Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� �߰��ؼ� Ȯ��
*/
interface AA{
	void cry(); //�߻� �޼ҵ�, public abstract ������
	void run();
}
class BB implements AA{ //BB class�� AA interface�� �̿ϼ��� �޼ҵ带 ������
	@Override
	public void cry() {
		System.out.println("�߿�");
	}
	@Override
	public void run() {
		System.out.println("��½");
	}
}
public class Interface2 {
	public static void main(String[] args) {
		AA aa=new BB(); //BB: �������̽��� �̿ϼ� �޼ҵ带 ������ Ŭ����
		aa.cry();
		aa.run();
	}
}
