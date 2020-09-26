package exceptionhandling;

public class Exception {
	public static void print() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("it will not produce zero");
		}
	}

	public static void main(String[] args) {
		print();
	}

}
