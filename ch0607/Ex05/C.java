package ch0607.Ex05;

public class C { //�ٸ� ��Ű������ import ����
	//�ʵ忡 �ο��Ǵ� ���� ������
	private String company="�����ڵ���";
	String model;
	protected String color;
	public int maxSpeed;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) { //public �ܺ� ��Ű���� Ŭ�������� ���� ����
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void print() {
		System.out.println("company: "+company+" model: "+model+" color: "+color+" maxSpeed: "+maxSpeed);
	}

}
