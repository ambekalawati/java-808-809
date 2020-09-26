package Switch;

public class Switch3 {

	public static void main(String[] args) {
		final int x = 10;
		final byte y = 20;
		switch ((y + x) / 3) {
		case 1:
			System.out.println("A");
			break;
		default:
			System.out.println("ohk");

		case (x + y + x) / 4:
			System.out.println("s");
		//case 10:
		//	System.out.println("true");
		//	System.out.println("ak");

		}
	}

}
