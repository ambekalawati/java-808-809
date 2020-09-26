package BasicJava;

public class Program {
	int x = 013;

	void go(final int i) {
		System.out.println(i / x);
	}

	public static void main(String[] args) {
		Program pr = new Program();
		pr.go(22);

	}

}
