package ch14.Ex05;
//�ڵ� ���ҽ�(��ü) ����
//1 autocloseable �������̽� ��� �� ����
//2 close() ������
//�ʵ忡 �� �Ҵ�.  ������ ȣ�� �� ���� �ο���. 
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;
	
	Abc (String name,int studentID, int kor, int eng, int math){
		this.name=name;
		this.studentID=studentID;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.avg=(kor+eng+math)/3;
	}
	@Override
	public void close() throws Exception {
		if (name!=null||studentID!=0||kor!=0||eng!=0||math!=0||avg!=0.0) {
			name=null;
			studentID=0;
			kor=0;
			eng=0;
			math=0;
			avg=0;
			System.out.println(name+", "+studentID+", "+kor+", "+eng+", "+math+", "+avg);
		}
	}
}

public class TryWithResource3 {
	public static void main(String[] args) {
		//��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ� close()
		try (Abc abc1=new Abc("abc1", 1111, 70, 90, 80);){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//���� close(). finally ��Ͽ��� close()ȣ��
		Abc abc2=null;
		try {
			abc2=new Abc("abc2", 2222, 50, 70, 60);
		} catch (Exception e) {

		} finally {
			if (abc2.name !=null||abc2.studentID!=0||abc2.kor!=0||abc2.eng!=0||abc2.math!=0||abc2.avg!=0.0) {
				try {
					abc2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}
}
