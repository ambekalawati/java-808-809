package BasicJava;

public class SameName {

	public static void main(String[] args) {
		// int[] args = { 1, 2, 3 };// same name variable in same scope causes
		// compilation fail.
		int a[] = { 1, 2, 3 };
		System.out.println(a[3]);//arrayIndexOutOfBound Exception
	}

}
