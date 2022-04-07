package ch16.Ex13;

//�� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ�.
//���׸� �޼ҵ� ���

class Point<T,V>{ //�� ���� ��ǥ�� �����ϴ� Ŭ����
	T x; //�� ���� x ��ǥ
	V y; //�� ���� y ��ǥ
	
	Point(T x,V y){ //������. setter ��� �����ڸ� ���ؼ� ���� �ʱ�ȭ(�Ҵ�)
		this.x=x;
		this.y=y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}

class GenericMethod{
	public static <T,V> double makeRectangle(Point<T,V>p1,Point<T,V>p2) {
		
		double height=(double)p2.getY()-(double)p1.getY();
//		double width=(double)(p2.getX()-p1.getX());//??
		double width=(double)p2.getX()-(double)p1.getX();
		
//		double left=((Number)p1.getX()).doubleValue();
//		double right=((Number)p2.getX()).doubleValue();
//		double top=((Number)p1.getY()).doubleValue();
//		double bottom=((Number)p2.getY()).doubleValue();
//		
//		double width=right-left;
//		double height=bottom-top;
		
		return width*height; //���� * ����=���� �� ����
	}
}
public class ExMakeRectangle {
	public static void main(String[] args) {
		Point<Double,Double>p1=new Point<Double,Double>(1.0, 2.0);
		Point<Double,Double>p2=new Point<Double,Double>(10.0, 50.0);
		
		double rect=GenericMethod.<Double,Double> makeRectangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� "+rect+" �Դϴ�.");
		
		
	}

}
