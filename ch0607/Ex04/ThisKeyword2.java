package ch0607.Ex04;
//����� this Ű���� �߰� : �ݵ�� this Ű���� ����ؾ� �Ǵ� ���
class Aa{ //this Ű���带 ������� �ʴ� ���: ���������� �ν�
	int m;
	int n;
	void init(int m,int n) {
		m=m; //this Ű�� ������� �ʴ� ��� m�� ��������
		n=n; //this Ű�� ������� �ʴ� ��� n�� ��������
	}
}
class Bb{ //this Ű�� ����ϴ� ���
	int m;
	int n;
	void init(int m,int n) {
		this.m=m; //this Ű�� ��������� �ݵ�� ����ؼ� m�� �ʵ��� m�̰� �˷������
		this.n=n;
	}
}

public class ThisKeyword2 {
	public static void main(String[] args) {
		//1�ʵ��� ������������ ���� ���(this�� ������� �ʴ� ���:��������)
		Aa aa=new Aa();
		aa.init(2, 3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		//2�ʵ��� ������������ ���� ���(this�� ����ϴ� ���:�ʵ�)
		Bb bb=new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
		
	}

}
