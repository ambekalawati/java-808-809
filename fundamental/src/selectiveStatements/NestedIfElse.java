package selectiveStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int per1 = 50;
		int per2 = 60;
		int per3 = 70;
		int per4 = 80;
		if (per1 <= per2) {
			if (per1 == per2)
				System.out.println("50=60");
			else if (per1 < per2)
				System.out.println("50 less than 60");
			else {
				System.out.println("none of the above");
			}
		} else if (per3 < per4) {
			System.out.println("true");
		}
	}

}
