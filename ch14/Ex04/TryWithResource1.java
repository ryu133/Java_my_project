package ch14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource1 {
	public static void main(String[] args) {
		//���� ���ҽ� ����(���� ���α׷� ���) �ڵ尡 ���
		System.out.println("���ڸ� �Է��ϼ���");
//		InputStreamReader isr2=null;//scanner�� ���. ��� �� �ݵ�� �޸𸮿��� ��ü�� �����ؾ��� >> isr2.close()
//		//system.in: �ֿܼ��� �Է� �޵��� ó��. 1���� ��ǲ���� �� ����(��ü�� ����Ǹ� �ٽ� ��ǲ���� ����)
//		
//		try {
//			isr2=new InputStreamReader(System.in);
//			char input=(char)isr2.read(); //�Ϲݿ���(checked ����): IOException: 
//			System.out.println("�Է±���= "+input);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			//���ҽ� ����: isr2.close()
//			if (isr2 != null) {
//				try { //���ҽ� ����
//					isr2.close(); //�Ϲݿ���: IOExeption (try catch �ʿ�)
//				} catch (IOException e) {					
//					e.printStackTrace();
//				} 
//			}
//		}
		
		//�ڵ� ���ҽ� ����(java 1.7) �ڵ尡 ������, �ʿ� ���� ����
		//����ϴ� ��ü�� AutoCloseable �������̽��� �����ϴ� ��ü���� �� & �ݵ�� ��ü ���ο� close()�� �ݵ�� �����ؾ� ��
		//try(�ڵ� ���ҽ� ������ �ʿ��� ��ü ����){} catch{} finally{}
		
		//InputStreamReader�� AutoCloseable �������̽��� ������. close() ��������
		//try with resource: try(with resource: ��ü �޸� �ε�){}
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input=(char)isr1.read();
			System.out.println("�Է� ����= "+input);
		}catch (IOException e) {
			e.printStackTrace();
		}//finally {} �� �����ص� ��ü�� �ڵ����� isr1.close()�� �� ����
		
	}
}
