package Ex;

class Student{
	//java�� ���� ��� �Ұ�, �ڹ��� ��� Ŭ������ object Ŭ������ �ڽ� Ŭ�����̴�.
	//object Ŭ�������� ������ �ʵ峪 �޼ҵ带 ����(�������̵�)�� �� �ִ�.
	String name;
	int studentID; //�й�
	int kor; //��������
	int eng; //��������
	int math;//��������
	int sum=0; //�����հ�
	double avg=0; //���
	
	void hobby() {
		System.out.println("�� �л��� ��� �Դϴ�.");
	}

	@Override
	public String toString() { //object clasas�� �޼ҵ�. ��ü ��ü�� ����� �� [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : "+name+", �й� : "+studentID+", ���� : "+kor+", ���� : "+eng+", ���� : "+math+", �հ� : "+sum+", ��� : "+avg;
	}
	
}
class Sö�� extends Student{
	Sö��(String name,int studentID,int kor,int eng,int math){ //������: Ŭ������� ����, ����Ÿ�� ����
		super.name=name; //super �θ� Ŭ����
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3; //double �� ĳ���� �ʿ�
	}
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
		
	}
}
class S���� extends Student{
	S����(String name,int studentID,int kor,int eng,int math){
		super.name=name;
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ��Դϴ�.");
	}
	
}
class S���� extends Student{
	S����(String name,int studentID,int kor,int eng,int math){
		super.name=name;
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� �丮�Դϴ�.");
	}
}
public class Quiz03 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.hobby();
		Student cs=new Sö��("aa", 1111, 80, 90, 85);
//		System.out.println(cs);
//		cs.hobby();
		Student yh=new S����("bb", 2222, 90, 95, 88);
//		System.out.println(yh);
//		yh.hobby();
		Student ys=new S����("cc", 3333, 68, 70, 85);
//		System.out.println(ys);
//		ys.hobby();
		
		
		Student[] arr= {cs,yh,ys};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		for (Student k : arr) { //������ Ÿ��  ��ü ���� : �迭
			System.out.println(k);
			k.hobby();
		}
	
	}
	
}
