package selectiveStatements;

public class Switch {

	public static void main(String[] args) {
		int num = 2;
		switch (num + 2) {
		case 1:
			System.out.println("value is one");
		case 2:
			System.out.println("value is two");
		case 3:
			System.out.println("value is three");
		default:
			System.out.println("none of the above");
		}
	}

}
