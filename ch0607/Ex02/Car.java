package ch0607.Ex02;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) { //ram�� ���� �ο��� �� setter ���
		this.company = company; //this: �ڽ��� ��ü
	}
	public String getModel() { ////�޼ҵ忡 ��ǲ�Ǵ� ������, ��ǲ�� ������ �޴� ������, �޸𸮿� �ε��� ������(this.)
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		//model=mo; //����(String mo)�� �ʵ��� �̸��� �ٸ� �� this ���� ����
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
	
}
