package LambdaExpression;

public class SecondLeastValue {

	public static void main(String[] args) {
		int a[] = { 40, 30, 90, 10, 80, 70, 20 };
		int b;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
					// System.out.println(b);
				}
			}
		}
		System.out.println(a[0]);
		System.out.println("Second_smaller Value is:" + a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
	}
}
