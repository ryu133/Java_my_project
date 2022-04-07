package ch16.Ex06.Ex1;

//generic class : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter<T extends Material> { //�پ��� ��¼���� �ϴ� ������
	//Ÿ�� ����: material�� ���� Ŭ������ �������̽�(�������̽��� extends ���)�� T�� �� �� �ִ�.
	private T material;  //material: ��������.  ��ü(�ν��Ͻ�)

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString(); //�ش� ��ü�� toString() �޼ҵ� ȣ��
	}
	public void printing() { //�޼ҵ常 ����
		material.doPrinting();
	}
	
	
}
