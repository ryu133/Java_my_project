package ch14.Ex06;
//�Ϲ� ���� (checked exception):������ �ܰ迡�� ����
// 1 ���� ó��
// 2 throws ����(�̷��)

//main �޼ҵ忡 throws�� ������Ű�� ��� >>exception �߻� �� exception�� ������ ����ϰ� ������

public class ThrowsException2 {
	public static void main(String[] args) throws ClassNotFoundException{
		
		//���������� ������ ������ 
		Class cls1=Class.forName("java.lang.Object");
		
		//������ �������� ����.  ClassNotFoundException �߻�
//		Class cls2=Class.forName("java.lang.Object00");
		
	}
}
