package selectiveStatements;

public class IfElseLader {

	public static void main(String[] args) {
		double a1 = 10d;
		double a2 = 20d;
		double a3 = 30d;
		if ((a1 + a2) < a3) {
			System.out.println("wrong!!!");
		} else if (a1 + a2 == a3) {
			System.out.println("yup a1+a2==a3");
		} else if (a1 + a2 == a3) {
			System.out.println("same as above");
		} else {
			System.out.println("none of the above!!!");
		}
	}

}
