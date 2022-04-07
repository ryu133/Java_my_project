package ch14.Ex08;
// 1 Exception�� ��ӹ޴� ����� ���� - �Ϲݿ���
//  1-1 ������ ������ ��� ����
//  1-2 ������ 100���� �ʰ��ϴ� ��� ����

class MinusException extends Exception{ //������ ���� ��� ���� �߻�
	public MinusException(){
		super(); //������ ������ ȣ��
	}
	public MinusException(String message) { //���� �޼��� ���.    e.getMessage();
		super(message);
	}
}

class OverException extends Exception{ //100�̻��� ���� ������ ȣ��
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
class AAA{
	int score;
	void checkScore(int score) throws MinusException, OverException {
		if (score<0) {
			throw new MinusException("���� �߻� : ������ ���� �� �����ϴ�.");
		} else if (score>100) {
			throw new OverException("���� �߻� : 100�� �Ѵ� ���� ���� �� �����ϴ�.");
		} else {
			System.out.println("���������� �ԷµǾ����ϴ�.");
			this.score=score;
			System.out.println("������ : "+this.score);
		}
	}
}

public class UserException {
	public static void main(String[] args) {
		AAA aaa=new AAA();
		
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
//			e.printStackTrace(); //�ý��� ���� ������ ����
			System.out.println(e.getMessage()); //sysout���� e.message�� ��� ����
		}
		
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage()); //sysout���� e.message�� ��� ����
		}
		
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
