package ch03;

public class OperatorEx03 {
	/*�������ڿ� ��Ʈ�����ڸ� �̿��� ������*/
	public static void main(String[] args) {
		//#1.��������(&&, ||, ^, !)
        //@AND (&&) false �ϳ��� ������ false
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(true && (5<3)); //false
        System.out.println((5<=5) && (7>2)); //true
        System.out.println(false && true); //false ����Ŷo
        System.out.println();
        
        //@OR (||)true �ϳ��� ������ true 
        System.out.println(true || true); //true ����Ŷo
        System.out.println(true || false); //true
        System.out.println(false || (5<3)); //false
        System.out.println((5<=5) || (7>2)); //true
        System.out.println();
        
        //@XOR (^)�� ���� ���� �� false. �� ���� �ٸ� �� true. ����Ŷ �߻�x
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ (5<3)); //false
        System.out.println((5<=5) ^ (7>2)); //false
        System.out.println();
        
        //@NOT (!) �ݴ�
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(false || !(5<3)); //true
        System.out.println((5<=5) || !(7>2)); //true
        
        //#2. ��Ʈ�����ڷ� ������ ����(&, |, ^, ~)
        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(true | (5<3)); //true
        System.out.println((5<=5) | (7>2)); //true
        System.out.println();
        
        //@�� ��Ŷ ��� ���� (�������ڴ� O, ��Ʈ������ X) �պκ��� ���� ����� ������ �� ���� �� �޺κ��� ������ ����
        int value1 = 3;
        System.out.println(false && ++value1>6); //false
        System.out.println(value1); //3
        
        int value2 = 3;
        System.out.println(false & ++value2>6); //false
        System.out.println(value2); //4
        
        int value3 = 3;
        System.out.println(true || ++value3>6); //true
        System.out.println(value3); //3
        
        int value4 = 3;
        System.out.println(true | ++value4>6); //true
        System.out.println(value4); //4
	}

}
