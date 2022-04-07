package ch14.Ex08;
//1 ID�� ���� ���� ���� ���(null) Exception �߻�
//2 UserID�� 8�� �̻� 20�� ���ϰ� �ƴ� ��� Exception �߻�

//-�Ϲ� ���� ����-
class IDFormatException extends Exception{
	public IDFormatException() {
		super();
	}
	public IDFormatException(String message) { //���� �߻� �ä� ���� �޼��� ���
		super(message);
	}
}


public class IDFormatTest {
	private String userID; //üũ�ؼ� null�̳� 8�� ���ϰų� 20�� �̻��� ��� Exception
	//userID�� ĸ��ȭ��  private: �ٸ� Ŭ�������� ���� �Ұ�
	//������, setter�� ��� ���� �Ҵ��� �� ����
	
	public String getUserID() { //getter   �޼ҵ� ȣ�� �� �޸��� userID�� �Ѱ���
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException { //setter   �޸��� ���� �Ҵ�
		if (userID==null) {
			throw new IDFormatException("���̵�� ��� �� �����ϴ�.");
		}else if (userID.length()<8||userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� �Է����ּ���.");
		}else {
			System.out.println("���� �Էµ�");
		}
		
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test=new IDFormatTest();
		//userID�� null�� ���
		String userID=null;
		try {
			test.setUserID(userID); //setter ȣ�� �� null���� �Է� �� ȣ��
			
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID�� 8�� �̸��� ���
		userID="1234567";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID�� 8�� �̻�, 20�� ������ ���
		userID="abcd12345678";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID�� 20�� �ʰ��� ���
		userID="1234567890abcdefghijklmnop";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
	}
}
