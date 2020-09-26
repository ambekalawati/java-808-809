package inheritance;

public class Sub extends Sup {
	public final void method() {
		System.out.println("Sub");
	}

	public static void main(String[] args) {
		Sup s1 = new Sub();
		s1.method();
		
		

	}

}
