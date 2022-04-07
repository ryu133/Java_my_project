package ch14.Ex09;

class A{
	//private : ĸ��ȭ, ��ü ���� �� �ٷ� �������� ���ϵ��� ����
		//������, setter �� ����ؼ� �ʵ忡 ���� �Ҵ��� �� ����
	
	private String season; //��, ����, ����, �ܿ� (�̿��� ���� ���� "���� �߻� : ��, ����, ����, �ܿ︸ �Է��ϼ���)
	private String week; //��, ȭ, ��, ��, ��, ��, ��(�̿��� ���� ����  "���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	private int scoreKor; //0~100 ���� �Է�( "���� �W�� : 0~100���� ������ �Է��ϼ���)
	private int scoreEng; //0~100 ���� �Է�( "���� �W�� : 0~100���� ������ �Է��ϼ���)
	private String userID;//12�� �̻� 20 ������ ���� �Ǵ� ���� (���� �߻�: 12�� �̻� 20 ������ ���� �Ǵ� ���ڸ� �Է��ϼ���)
	
	void checkSeason(String season) throws StringMissException{
		if ((season.equals("��")||season.equals("����")||season.equals("����")||season.equals("�ܿ�"))==false) {
			throw new StringMissException("���� �߻� :  ��, ����, ����, �ܿ︸ �Է��ϼ���");
		}
		else {
			this.season=season;
			System.out.println("������ : "+this.season);
		}
	}
	void checkWeek(String week) throws StringMissException{
		if ((week.equals("��")||week.equals("ȭ")||week.equals("��")||week.equals("��")||week.equals("��")||week.equals("��")||week.equals("��"))==false) {
			throw new StringMissException("���� �߻� : ��, ȭ, ��, ��, ��, ��, �ϸ� �Է��ϼ���");
		}else {
			this.week=week;
			System.out.println("������ : "+this.week);
		}
	}
	void checkScoreKor(int scoreKor) throws OverException{
		if (scoreKor>100||scoreKor<0) {
			throw new OverException("���� �W�� : 0 ~ 100 ���� ������ �Է��ϼ���");
		}else {
			this.scoreKor=scoreKor;
			System.out.println("���� ������ : "+this.scoreKor);
		}
	}
	void checkScoreEng(int scoreEng) throws OverException{
		if (scoreEng>100||scoreEng<0) {
			throw new OverException("���� �W�� : 0 ~ 100 ���� ������ �Է��ϼ���");
		}else {
			this.scoreEng=scoreEng;
			System.out.println("���� ������ : "+this.scoreEng);
		}
	}
	void checkUserID(String userID) throws StringMissException{
		if (userID.length()<12||userID.length()>20) {
			throw new StringMissException("���� �߻�: 12�� �̻� 20 ������ ���� �Ǵ� ���ڸ� �Է��ϼ���");
		} else {
			this.userID= userID;
			System.out.println("userID : "+this.userID);
		}
	}
	
}

class StringMissException extends Exception{
	public StringMissException() {
		super();
	}
	public StringMissException(String message) {
		super(message);
	}
}
class OverException extends Exception{ 
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
public class UserExceptionEx {
	public static void main(String[] args) {
		A a=new A();
		try {
			a.checkSeason("��");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkSeason("����");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkWeek("��");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkScoreKor(-200);
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkScoreEng(22);
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("abcdefg123456");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
	}
}
