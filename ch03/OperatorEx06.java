package ch03;

public class OperatorEx06 {
//�� ����Ʈ�� �̿��Ͽ� �� ��Ʈ�� ��ġ �� �˾Ƴ���
	public static void main(String[] args) {
		int flags=010110110;
		System.out.println(flags>>>0&1); //0��° ��Ʈ���� ��� 0
		System.out.println(flags>>>1&1); //1��° ��Ʈ���� ��� 1
		System.out.println(flags>>>2&1); //2��° ��Ʈ���� ��� 1
		System.out.println(flags>>>3&1); //3��° ��Ʈ���� ��� 0
		System.out.println(flags>>>4&1); //4��° ��Ʈ���� ��� 1
		System.out.println(flags>>>5&1); //5��° ��Ʈ���� ��� 1
		System.out.println(flags>>>6&1); //6��° ��Ʈ���� ��� 0
		
	}

}
