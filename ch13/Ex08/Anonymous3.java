package ch13.Ex08;
//Ŭ���� ���� �� ���������� ��� / �̻���� ��� �Ű������� ��ü ����
interface A{
	public abstract void abc();
}
//1 �ڽ� Ŭ������ ���� ���� 
class B implements A{
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}
class C{ //cde()�� ��ǲ������ aŸ���� ��ü a�� ����
	void cde(A a) { //cde()�� ȣ���ϸ鼭 �Ű����� ������ A Ÿ���� ��ü�� ����  
		a.abc();
	}
}


public class Anonymous3 {
	public static void main(String[] args) {
		
		//1 ���: Ŭ������o + ����������0
		C c=new C(); 
		A a=new B();  //Ŭ������(A), ������������(a)  <=ù��° ���
		c.cde(a); //�Ű������� ��ü a�� �����ؼ� ����
		
		System.out.println("===============");
		
		//2 ���: Ŭ������o + ����������x
		c.cde(new B());
		
	}
}
