package certification.practice;

public class StaticImport {
	public static final String NAME = "myName";
	public static final int VALUE = 10;

	public static void method() {
		System.out.println("Name= " + NAME + " " + "Value= " + VALUE);
	}

	public void method1() {
		System.out.println("Name= " + NAME);
	}

	public static void main(String[] args) {
		StaticImport s = new StaticImport();
		s.method1();
	}

}
