package ch0607.Ex01;

class AA{
	String name; //�ʵ�(���). �ν��Ͻ�ȭ ���Ѿ� ��� ���� (heap ������ ����)
	int age;
	String email;
	
	AA(){} //�⺻ ������, ���� ����. �ٸ� �����ڰ� ������ ��� ���� �Ұ�(���� �߻�)
	
	public String getName() { //�޼���(���). �ν��Ͻ�ȭ ���Ѿ� ��� ���� (heap ���� �ּҸ� ����. �ٸ� �� Ŭ���� ���� ���� �޼��� ������ ����)
		return name; //return: �޼��带 ȣ���ϴ� ������ ������ ���� ��ȯ�Ѵ�
	}
	public void setName(String name) { //void�� ���ϰ��� ���ٴ� ���� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class CreatObject {

	public static void main(String[] args) {
		AA aa=new AA(); 
		//AA: Ŭ���� �̸�. aa: ��ü��(�ν��Ͻ���). new: heap ������ �ʵ�� �޼���
		//AA(): ������, ��ü�� �ʵ尪�� �ʱ�ȭ. �����ڵ� �ϳ��� �޼���
		//������ �̸��� Ŭ���� �̸��� ���� �޼���
		//����Ÿ���� ����
		//�������� �� ���Ű������� ���� �����ڸ� �⺻ ������
		//�⺻�� ���ڴ� ���� ����
		//��ü�� ������ �� �ݤ��ѵ�� ������ ȣ��
		
		
		//��ü�� �޼��� ȣ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//setters: ��ü�� �޸𸮿� ���� �Ҵ��� �� 
		//getters: ��ü�� �޸��� ���� ������ ��
		aa.setName("ȫ�浿"); //��ü�� ������ ���� �Ҵ�
		aa.setAge(323);
		aa.setEmail("wwerd@asdfc.com");
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		AA bb=new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bb@bbb.com");
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		AA cc=new AA();
		cc.setName("�Ż��Ӵ�");
		cc.setAge(40);
		cc.setEmail("ccc@cc.com");
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
	}

}
