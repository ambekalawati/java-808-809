package BasicJava;

public class WhizLab {
	static {
		System.out.println("static");
	}

	public static void main(String[] args) {
		System.out.println("main");
		{
			System.out.println("instance");
		}

	}

}
