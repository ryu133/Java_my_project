package ch05;

public class ArgumentOfMainMethod_02 {
	public static void main(String[] args) {
		//main�޼ҵ��� ��ǲ �Ű������� ������ �迭�� ���̸� ���ϱ�
		System.out.println(args.length);
		
		//�Է� �Ű������� for������ ���
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//�Է� �Ű������� ���� for��(enhances for)���� ���
		for (String k : args) {
			System.out.println(k);
		}
		
	}
}
