package ch14.Ex08;
//�޼ҵ��� throws�� �����ؼ� main()���� ���ܰ� ������ ���
//������ ���(����)â�� ���� ���α׷� �����
//main�޼ҵ�� ����ó���� ���� �ʴ´�
class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num=Integer.parseInt("10a");//Exception �߻� (NumberFormatException)
	}
}
public class ExceptionMethod {
	public static void main(String[] args) throws NumberFormatException{
		AA aa=new AA();
		
		
		try {
		aa.abc(); //���� ����(������ �ܰ迡���� ������ ����.)
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
