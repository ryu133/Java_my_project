package ch14.Ex05;
//���� ������ ��ü���� autocloseable ���
//try(��ü ���� ����){} catch{} >> �ڵ����� close()�� //try(with resource(�޸�))
//autocloseable �������̽��� close()�޼ҵ带 �������̵��ؾ���

//java.lang.AutoCloseable: java.lang << ����Ʈ�� �ʿ� ����
//java.lang.Object

//���� ó�� ���
//1 try catch ���: �ڽ��� ���� ���ܸ� ó��
//2 throws ���: ���ܸ� �ٸ�(ȣ��) ������ ó���ϵ��� �̷�(�޼ҵ� ���� ����)
		//throw: ���� ���� �߻�
		//throws: ���� ó�� �̷��

class A implements AutoCloseable{
	String resource; //resource=null
	A(String resource){//�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource=resource;
	}
	@Override
	public void close() throws Exception { //close() �ڵ� ȣ���
		System.out.println(resource);
		if (resource!=null) {
			resource=null;
			System.out.println("resource ����");
			System.out.println(resource);
		}
	}
}

public class TryWithResource2 {
	public static void main(String[] args) {
		//�ڵ� ���ҽ� ���� ���
		try (A a1=new A("Ư�� ����");){
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
		}//finally{} a1.close() �ڵ� ȣ���
		
		System.out.println("==============");
		
		//���� ���ҽ� ���� ���
		A a2=null;
		try {
			a2=new A("������ �ʱⰪ �Ҵ�");
		} catch (Exception e) {
			
		} finally {
			if (a2.resource !=null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
