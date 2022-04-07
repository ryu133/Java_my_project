package ch17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*�÷���: ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ
 * �迭: ������ �ڷ����� ����. ���� ũ�Ⱑ ������. �迭 ���� �� ���� ũ�⸦ ����. ���� ũ�� ���� �Ұ�
 * 
 * 
-List<E>: �������̽�,���ʸ� �������̽�: �پ��� ������ Ÿ���� ��� ����. ���ؽ�(index)�� ������ �ִ�(�˻� ����). ���� ũ��� �������� ��ȭ�Ѵ�
-ArrayList<E>:�̱� ������ ȯ�濡�� ���. �˻��� �������� ���� �߰��ϰų� ���� �� ������
-Vector<E>: ��Ƽ ������ ȯ�濡�� ���. ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�.
-LinkedList<E>: �˻��� �������� ���� �߰��ϰų� ���� �� ������
*/

public class ArratList1 {
	public static void main(String[] args) {
		String[] array=new String[] {"��","��","��","��","��","��","��"};
		System.out.println(array.length);
		array[2]=null;
		array[5]=null;
		System.out.println(array.length);
		
		//1 arrays.tostring(�迭����)
		System.out.println(Arrays.toString(array));
		
		//2 for
		for (int i = 0; i < array.length; i++) {
			if (i==array.length-1) {
				System.out.println(array[i]); //�������� ,�� ������� �ʴ� ����
			}else {
				System.out.print(array[i]+", ");
			}
		}
		
		//3 enhanced for
		for (String k : array) {
			System.out.print(k+", ");
		}
		System.out.println();
		
		//2 list : �������̽�, ��ü ������ �� �� ����, Ÿ���� ���� ����
		List<String> aList1=new ArrayList<String>();
		List<String> aList2=new ArrayList<String>();
		List<String> aList3=new ArrayList<String>();
		
		//List���� ���� ���� ���: aList.size();   ����Ʈ�� ������, �迭�� ���� .length
		System.out.println(aList1.size());
		
		//list�� �� �Ҵ� aList.add("��");  ���� �������� ���� �߰���
		aList1.add("��"); aList1.add("��"); aList1.add("��"); aList1.add("��");
		aList1.add("��"); aList1.add("��"); aList1.add("��");
		
		//list�� ����� �������� ���� ���ϱ� alist.size()
		System.out.println(aList1.size());
		
		//����Ʈ�� ����� �� ����: alist.remove("����");
		aList1.remove("��");
		aList1.remove("��");
		System.out.println(aList1.size());
		
		//list�� �ε����� ������ �ִ�
		for (int i = 0; i < aList1.size(); i++) { //alist1.size(): ���� ���� ���
			System.out.print(aList1.get(i)+",");
		}
		System.out.println();
		
		//��ü�� tostring()�� ȣ���ؼ� ���
		System.out.println(aList1); //�÷��� ��� tostring() �����ǵ�
		
		
		
	}

}
