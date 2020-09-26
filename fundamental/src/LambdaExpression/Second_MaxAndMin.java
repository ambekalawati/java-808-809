package LambdaExpression;

public class Second_MaxAndMin {

	public static void main(String[] args) {
		int a[] = { 40, 30, 90, 10, 80, 70, 20 };
		int largest_value = a[0];
		int second_largestV = a[0];
		int smallest_value = a[0];
		int second_smallestV = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest_value) {
				second_largestV = largest_value;
				largest_value = a[i];
			} else if (a[i] > second_largestV) {
				second_largestV = a[i];
			}
		}
		System.out.println("Largest Number is:" + largest_value);
		System.out.println("Second Largest Number is:" + second_largestV);
		for (int j = 0; j < a.length; j++) {
			if (a[j] < smallest_value) {
				second_smallestV = smallest_value;
				smallest_value = a[j];
			} else if (a[j] < second_smallestV) {
				second_smallestV = a[j];
			}
		}
		System.out.println("Smallest Number is:" + smallest_value);
		System.out.println("Second Smallest Number is:" + second_smallestV);
	}

}
