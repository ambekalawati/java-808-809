package LambdaExpression;

public class ArrayQuestion {
	public static int getMax(int[] a) {
		int maxValue = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] b) {
		int minValue = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i] < minValue) {
				minValue = b[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		int[] arr = { 40, 30, 90, 10, 80, 70, 20 };
		int max = getMax(arr);
		System.out.println("Maximum Value is: " + max);
		int min = getMin(arr);
		System.out.println("Minimum Value is: " + min);

	}

}
