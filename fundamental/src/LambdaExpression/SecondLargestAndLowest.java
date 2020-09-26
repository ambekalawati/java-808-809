package LambdaExpression;

public class SecondLargestAndLowest {

	public static void main(String[] args) {
		int a[] = { 40, 30, 90, 10, 80, 70, 20 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}
		}
		System.out.println("Second_largest Value is:" + secondLargest);
	}

}
