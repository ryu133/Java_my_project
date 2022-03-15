package ch0607.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		//�迭�� ���̰� �������� �ʰ� ���������� ���
		//1 method1(int...values) <<--�������̸� ó���ϴ� input �Ű����� ����
		method1(); //�޼ҵ� �������̵�: �޼ҵ���� ��� ����. �Ű������� Ÿ��, ������ ���� �ش� �޼ҵ� ȣ��
		System.out.println();
		method1(1,2);
		System.out.println();
		method1(1,2,3);
		System.out.println();
		method1(1,2,3,4);
		System.out.println();
		method1(1,2,3,4,5);
		
		method2("�ȳ�","�氡");
		method2("��","ȭ","��","��","��","��","��");
		method2("�䳢","ȣ����","����","��");
		
	}
	
	static void method1(int...values) {
		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		for (int i : values) {
			System.out.println(i);
		}
	}
	
	static void method2(String...values) { //valuse�� �迭�� ��� ����
//		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		for (String a : values) {
			System.out.println(a);
		}
		
	}
	
//	static void method1() {
//		System.out.print("�Ť��������� ������ �޼ҵ� ȣ��");
//	}
//	static void method1(int a, int b) {
//		System.out.print(a+", "+b);
//	}
//	static void method1(int a, int b, int c) {
//		System.out.print(a+", "+b+", "+c);
//	}
//	static void method1(int a, int b, int c, int d) {
//		System.out.print(a+", "+b+", "+c+", "+d);
//	}
//	static void method1(int a, int b, int c, int d, int e) {
//		System.out.print(a+", "+b+", "+c+", "+d+", "+e);
//	}
}
