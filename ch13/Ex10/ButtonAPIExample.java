package ch13.Ex10;
class Button{ 
	//OnClickListener: ��üŸ��, ocl: ��������
	OnClickListener ocl;  //ocl �⺻������ null
	
	//setter�� ���ؼ� OnClickListener�� �������� ocl�� ��ü �ּҸ� ��´�
	void setOnClickListener(OnClickListener ocl) {
		this.ocl=ocl;
	}
	//�������̽��� �����ϰ� �����ϴ� �ڽ� Ŭ������ �������� �ʴ´�
	//ȣ���ϴ� ������ onClick()�޼ҵ带 �������ؼ� ȣ��
	interface OnClickListener{ //InnerInterface, static, Button.OnClickListener:
		void onClick(); 	//�޼ҵ� ���𸸵�. �������� �������̵��ؼ� ������
	}
	void click() { //�������� �� ocl.onClick() ȣ��
		ocl.onClick(); //ocl: �������� : null ==>>setOnClickListener(OnClickListener ocl)
		System.out.println(ocl);
	}
}
public class ButtonAPIExample {
	public static void main(String[] args) {
		//Ŭ�� �� ���� ���
		Button button1=new Button(); //button1 ��ü ����
		
		//A.B=new A.B(){�̳��������̽� B�� �޼ҵ带 �����ϴ� �ڵ�};
		button1.setOnClickListener( new Button.OnClickListener() { //OnClickListener ��ü Ÿ������ ��ü ���� �Ű������� ���� 
			@Override
			public void onClick() {
				System.out.println("������1. ���� ���");
			}
		}); 
		button1.click();
		
		//Ŭ�� �� ���̹� ����
		Button button2=new Button();
		//setOnClickListener �޼ҵ��� �Ű������� setOnClickListener�� ���� �͸�ü�� ���� �� setOnClickListener         �� ������ ���ٸ���.>?
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
			}
		});
		button2.click();
	}
}
