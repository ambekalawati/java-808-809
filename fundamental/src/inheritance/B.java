package inheritance;

public class B extends A {
	protected static void method() {
		System.out.println("CD");
	}

	public static void main(String[] args) {
		A a = new B();
		a.method();
		

	}

}
