package ch12.Ex09;

public interface Phone {
	int TIMEOUT=10000; //���  (public static final ������)
	void sendCall(); //(public abstract)
	void receiveCall(); //(public abstract)
	default void printLogo() {
		System.out.println("print Logo");
	}
}
