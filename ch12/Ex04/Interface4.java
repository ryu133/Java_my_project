package ch12.Ex04;
//�������̽� ��� �� �ڽ� Ŭ���� ���� ������ ���� !�߿�
//�������̽��� �޼ҵ带 ������ �� �ݵ�� public ���
interface A{
	public abstract void abc();
}
interface B{
	void abc(); //public abstract ������
}
class C implements A{
	public void abc() { //A �������̽��� abc()�� �������̵��ؼ� ������ �޼ҵ�
					//�ڽ��� �θ𺸴� ���� �����ڰ� ���ų� �� �о�� ��
	}
}
class D implements B{
	public void abc() { //�������̽��� �޼ҵ带 ������ ���� �ݵ�� public �־�� ��
		
	}
}
class E implements B{
	@Override
	public void abc() {
		
	}
}
//class F implements A{ //F class�� �ϼ��� �޼ҵ� ���� �ʿ�
//	
//}
public class Interface4 {
	public static void main(String[] args) {
		
	}
}
