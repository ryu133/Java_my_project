package ch16.Ex06.Ex1;

public class PrintTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter =new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder=powderPrinter.getMaterial(); //��ü�� �����ͼ� powder�� �Ҵ�
		powder.doPrinting();
		System.out.println(powder);
		
		
		GenericPrinter<Plastic> plasticPrinter =new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic=plasticPrinter.getMaterial();
		plastic.doPrinting();
		System.out.println(plastic);
		plasticPrinter.printing();
		
		//water�� material�� ����Ŭ������ �������̽��� �ƴϹǷ� Ÿ�Կ� ������ �� ����
//		GenericPrinter<Water> waterPrinter =new GenericPrinter<>();
//		waterPrinter.setMaterial(new Water());
//		Water water=waterPrinter.getMaterial();
//		water.doPrinting();
//		System.out.println(water);
	}

}
